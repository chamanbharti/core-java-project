package com.Enum;
// Use an enum constructor, instance variable, and method.
enum Pineapple 
{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	private int price; // price of each apple
	// Constructor
	Pineapple(int p) 
	{ 
		price = p; 
	}
	int getPrice() 
	{ 
		return price; 
	}
}
class EnumDemo3 
{
	public static void main(String args[])
	{
		Pineapple ap;
		// Display price of Winesap.
		System.out.println("Winesap costs " +
		Pineapple.Winesap.getPrice() +
		" cents.\n");
		// Display all apples and prices.
		System.out.println("All Pineapple prices:");
		for(Pineapple a : Pineapple.values())
		System.out.println(a + " costs " + a.getPrice() +" cents.");
	}
}