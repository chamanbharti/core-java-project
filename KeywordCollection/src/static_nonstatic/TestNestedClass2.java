package static_nonstatic;

import staticKeyword.NestedClass2;


public class TestNestedClass2 {
	public static void main(String[] args) {
		//NestedClass2.Inner obj=new NestedClass2.Inner();
		//obj.msg();
		NestedClass2.Inner.msg();//no need to create the instance of static nested class  
	}

}
