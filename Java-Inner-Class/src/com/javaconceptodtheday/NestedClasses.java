package com.javaconceptodtheday;
/*
 //Nested classes in java can be defined as classes within the class. i.e A class can be a member of another class. For example,
 class OuterClass{
 	int i; // field as member
 
	 void methodOne(){
	 	//method as a member
	 }
 
	 class NestedClass{
	 	//class as a member
	 }
 }
 */
/*
 //If nested class is declared as static, then that nested class is called as static nested class.
class OuterClass{
	int i; // field as member

	 void methodOne(){
	 	//method as a member
	 }

	 static class NestedClass{
	 	//class as a member which is declared as static
	 }
}
*/
//Static nested classes can contain both static and non-static members.
/*class OuterClass{
	//some members of outerclass
	static class NestedClass{
		static int i; // static fiels
		int j; //non-static fields
		void methodOne(){
			//non-static method
		}
		static void methodTwo(){
			//static method
		}
	}
}*/
//We can access only static members of outer class inside a static nested class. We can’t access non-static members of outer class inside a static nested class.
/*class OuterClass{
	static int i; //static field of outerclass
	int j; //non-static field of outerclass
	
	void methodOne(){
		//non-static method of outerclass
	}
	
	static void methodTwo(){
		//static method of outerclass
	}
	
	static class NestedClass{
		void methodOfInnerClass(){
			System.out.println(i);//static field can accessed
			System.out.println(j);//non-static field can't be accessed and gives CT error
			methodTwo();//static method can accessed
			methodOne();//non-static method can't be accessed and gives CT error
		}
	}
}*/
//We have seen that static methods can’t be abstract but static nested classes can be abstract.
/*class OuterClass{
	//static and abstract inner class
	
	abstract static void methodOne(){
			//concrete method of NestedClass
		}
		abstract static class NestedClass{
			abstract void methodOne();//abstract method of nestedclass
		}
		void methodTwo(){
			//concrete method of NestedClass
		}
}*/
//static nestd class can be final
/*class OuterClass{
	//final and static nested class
	final static class NestedClass{
		void methodOne(){
			//concrete method of nestedclass
		}
	}
}*/
//Below example shows how to refer Objects of the static nested class
/*class OuterClass{
	 int i=0;//non-static field of outerclass
	static void methodOne()
    {
        System.out.println("Static method of OuterClass");
    }
	static class NestedClassOne
    {
		int i=20;//non-static field of NestedClassOne
		static void methodOne()
	    {
	        System.out.println("Static method of NestedClassOne");
	    }
    }
	
	static class NestedClassTwo{
		int i=30;//non-static field of NestedClassTwo
		static void methodOne()
        {
            System.out.println("static method of NestedClassTwo");
        }
	}
}
public class NestedClasses {
	public static void main(String[] args) {
		
		OuterClass.methodOne();//static member can be accessed directly through class name.
		OuterClass outer = new OuterClass();
		
		System.out.println(outer.i);//instance member must be accessed through object reference
		OuterClass.NestedClassOne.methodOne();//static member can be accessed directly through class name.
		OuterClass.NestedClassOne nestedOne = new OuterClass.NestedClassOne();
		System.out.println(nestedOne.i);//Instance member must be accessed through object reference
		
		OuterClass.NestedClassTwo.methodOne();//static member can be accessed directly through class name.
		OuterClass.NestedClassTwo nestedTwo = new OuterClass.NestedClassTwo();
		System.out.println(nestedTwo.i);
	}
	

}*/
//Constructors and methods of nested classes can be overloaded.
/*class OuterClass{
	
	static class NestedClass{
		NestedClass(){
			//first constructor
		}
		NestedClass(int i){
			//second constructor
		}
		NestedClass(int i,int j){
			//third constructor
		}
		void methodOne(){
			//overloaded method
		}
		void methodOne(int i){
			//overloaded method
		}
		void methodOne(int i,int j){
			//overloaded method
		}
	}
}*/
//Static Nested Classes can be chained. i.e. Nested Class may contain another nested class
//and that nested class may contain another nested class and so on.
class OuterClass{
	static class NestedClass{
		static class NestedClassOne{
			static class NestedClassTwo{
				static class NestedClassThree{
					static void methodOne(){
						System.out.println("Chain of Nested Classes");
					}
					
				}
			}
		}
	}
}
public class NestedClasses{
	public static void main(String[] args) {
		OuterClass.NestedClass.NestedClassOne.NestedClassTwo.NestedClassThree.methodOne();
	}
}
/*
 *If you compile the above program, for each class, .class file will be generated. The generated .class files are –  OuterClass.class, OuterClass$NestedClass.class, OuterClass$NestedClass$NestedClassOne.class, OuterClass$NestedClass$NestedClassOne$NestedClassTwo.class, OuterClass$NestedClass$NestedClassOne$NestedClassTwo$NestedclassThree.class.

If you observe names of generated .class files, you will come to know that name contains name of outer class and nested classes seperated by $.
 */