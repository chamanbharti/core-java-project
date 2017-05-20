package ReflectionAPI;

import java.lang.reflect.Method;

public class PrivateMethodCall2 {
	public static void main(String[] args) throws Exception{
		
		Class c=A2.class;
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("cube",new Class[]{int.class});
		m.setAccessible(true);
		m.invoke(o, 4);
	}

}
