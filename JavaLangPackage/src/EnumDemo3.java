// Use an enum constructor, instance variable, and method.
 enum Apple3 
{
	Jonathan (10), GoldenDel (9), RedDel (12), Winesap (15), Cortland (8);
	
	private int price; // price of each apple
	// Constructor
	Apple3(int p) { price = p; }
	// Overloaded constructor
	Apple3() { price = -1; }
	int getPrice() { return price; }
}

class EnumDemo3
{
	public static void main(String[] args) 
	{
		Apple3 ap;
		//Display price of Winesap
		System.out.println("Winesab costs "+Apple3.Winesap.getPrice()+"cents.\n");
		//Display all apples and prices
		System.out.println("All Apple prices:");
		for(Apple3 a:Apple3.values())
			System.out.println(a+" costs "+a.getPrice()+"cents");
	}
}