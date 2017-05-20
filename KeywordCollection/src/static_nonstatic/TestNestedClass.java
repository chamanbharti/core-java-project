package static_nonstatic;

import staticKeyword.NestedClass;

public class TestNestedClass {
	public static void main(String[] args) {
		NestedClass.Inner obj=new NestedClass.Inner();
		obj.msg();
	}

}
