package constructor;

class Cube {
	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	Cube() {
		this(10, 10);
		System.out.println("Finished with Default Constructor of Cube");
	}
	Cube(int l, int b) {
		this(l, b, 10);
		System.out.println("Finished with Parameterized Constructor having 2 params of Cube");
	}
	Cube(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
}

public class ConstructorChaining1 extends Cube {

	int weight;
	ConstructorChaining1() {
		super();
		weight = 10;
	}
	ConstructorChaining1(int l, int b) {
		this(l, b, 10);
		System.out.println("Finished with Parameterized Constructor having 2 params of SpecialCube");
	}
	ConstructorChaining1(int l, int b, int h) {
		super(l, b, h);
		weight = 20;
		System.out.println("Finished with Parameterized Constructor having 3 params of SpecialCube");
	}
	public static void main(String[] args) {
		ConstructorChaining1 specialObj1 = new ConstructorChaining1();
		ConstructorChaining1 specialObj2 = new ConstructorChaining1(10, 20);
		System.out.println("Volume of SpecialCube1 is : "+ specialObj1.getVolume());
		System.out.println("Weight of SpecialCube1 is : "+ specialObj1.weight);
		System.out.println("Volume of SpecialCube2 is : "+ specialObj2.getVolume());
		System.out.println("Weight of SpecialCube2 is : "+ specialObj2.weight);
	}

}
