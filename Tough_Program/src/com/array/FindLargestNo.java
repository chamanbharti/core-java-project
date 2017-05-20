package com.array;

public class FindLargestNo {
	public static void main(String[] args) {
		
		int[] no = {1,2,3,4,5,5,60,7,7,8};
		//Arrays.sort(no);
		//System.out.println(no);
		
		int big = no[0];
		
		for(int i =1;i<no.length;i++){
			//if(big<no[i]){
			if(no[i] > big){
				big = no[i];
				
			}
			
		}
		System.out.println("Bigest No: "+big);
	}

}
