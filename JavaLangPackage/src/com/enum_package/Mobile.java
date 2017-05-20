package com.enum_package;

//enum showing Mobile Prices
public enum Mobile {
	
	Nokia(250),Motorola(325),Samsung(400);
	
	int price;
	
	Mobile(int p){
		price = p;
	}
	
	int showPrice(){
		return price;
	}

}
