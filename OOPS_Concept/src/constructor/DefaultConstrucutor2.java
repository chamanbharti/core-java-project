package constructor;

public class DefaultConstrucutor2 {
	
	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	DefaultConstrucutor2() {
		length = 10;
		breadth = 10;
		height = 10;
	}
	DefaultConstrucutor2(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
	public static void main(String[] args) {
		DefaultConstrucutor2 cubeObj1, cubeObj2;
		cubeObj1 = new DefaultConstrucutor2();
		cubeObj2 = new DefaultConstrucutor2(10, 20, 30);
		System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
		System.out.println("Volume of Cube1 is : " + cubeObj2.getVolume());
	}
}
