package com.array;

public class FindSmallestNo {
	public static void main(String[] args) {
		
		/*//int[] no = {1,2,3,4,5,5,6,7,7,8};
		int[] no = {8,9,2,3,4,1,5,6,7,10};
		//Arrays.sort(no);
		//System.out.println(no);
		
		int small = no[0];
		
		for(int i =1;i<no.length;i++){
			if(small > no[i]){
				small = no[i];
				
			}
			
		}
		System.out.println("smallest No: "+small);*/
		//int[] no = {1,2,3,4,5,5,6,7,7,8};
				int[] no = {8,9,2,3,4,1,5,6,7,10};
				//Arrays.sort(no);
				//System.out.println(no);
				
				int small = no[0];
				
				for(int i =1;i<no.length;i++){
					if(no[i] < small){
						small = no[i];
						
					}
					
				}
				System.out.println("smallest No: "+small);
	}

}
