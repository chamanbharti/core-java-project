package staticKeyword;

class Foo {
    // This static value belongs to the class Foo
    public static final String name = "Foo";

    // This non-static value will be unique for every instance
    private int value;

    public Foo(int value) {
         this.value = value;
    }

    public void sayValue() {
        System.out.println("Instance Value: " + value);
    }

    public static void sayName() {
        System.out.println("Static Value: " + name);
    }
    
    public static Foo Add(Foo foo1, Foo foo2) {
        return new Foo(foo1.value + foo2.value);
    }
    
    public static void main(String[] args) {
    	Foo foo1 = new Foo(10);
    	Foo foo2 = new Foo(20);
    	Foo foo3 = Foo.Add(foo1, foo2); // creates a new Foo with a value of 30
    	System.out.println(foo3);
    	foo1.sayValue(); // Prints "Instance Value: 10" - called on foo1
    	foo2.sayValue(); // Prints "Instance Value: 20" - called on foo2

    	//Foo.sayName(); // Prints "Static Value: Foo" - called on Foo (not foo1 or foo2)
    	sayName(); // Prints "Static Value: Foo" - called on Foo (not foo1 or foo2)
	}
}  