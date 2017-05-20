package encapsulation;
//Encapsulation = data hiding + abstraction

class A{ //tightly encapsulated class
	private int x=10;
}

class B extends A{ //This is not tightly encapsulated class
	int y=20;
}

class C extends A{ //tightly encapsulated class
	private int z=30;
}

public class Test0 {

}
