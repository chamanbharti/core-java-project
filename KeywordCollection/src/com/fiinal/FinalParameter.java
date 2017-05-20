package com.fiinal;

public class FinalParameter {
	int cube(final int n){
		n=n+2;//can't be changed as n final
		n*n*n;
	}
	public static void main(String[] args) {
		FinalParameter obj=new FinalParameter();
		obj.cube(5);
	}

}
