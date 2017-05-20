package creational.prototype;

public class A implements Cloneable{//for deep copy
	int i;
	public A(int i){
		this.i = i;
	}
	//for deep copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
