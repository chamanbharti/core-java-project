package ReflectionAPI;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception{
		
		//Class c=Class.forName("A");
		Class c=A.class;
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("Message",null);
		m.setAccessible(true);
		m.invoke(o, null);
	}

}
