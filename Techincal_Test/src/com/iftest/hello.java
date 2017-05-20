package com.iftest;

public class hello {
	static int x=5;
	static int y=5;
	static int z=5;
	public static void main(String[] args) {
		/*int x=5;
		int y=5;
		int z=5;*/
		if(x>4)if(y>3)if(z>4)z+=1;else z+=2;else z+=4;
		System.out.println(z);
	}

}
