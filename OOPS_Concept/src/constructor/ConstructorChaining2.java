package constructor;

class Cube2 {
	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	Cube2(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
}

public class ConstructorChaining2 extends Cube2 {

	int weight;
	ConstructorChaining2() {
		super(10, 20, 30); //Will Give a Compilation Error without this line
		weight = 10;
	}
	public static void main(String[] args) {
		ConstructorChaining2 specialObj1 = new ConstructorChaining2();
		System.out.println("Volume of SpecialCube1 is : "+ specialObj1.getVolume());
	}

}
