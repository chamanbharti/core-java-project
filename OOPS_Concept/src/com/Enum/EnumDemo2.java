package com.Enum;
// Use the built-in enumeration methods.
// An enumeration of apple varieties.
enum Orange 
{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 
{
	public static void main(String args[])
	{
		Orange ap;
		System.out.println("Here are all Orange constants:");
		// use values()
		Orange allOrange[] = Orange.values();
		for(Orange a : allOrange)
		System.out.println(a);
		System.out.println();
		// use valueOf()
		ap = Orange.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}