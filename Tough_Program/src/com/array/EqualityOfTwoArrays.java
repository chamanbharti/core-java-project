package com.array;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		
		boolean equalOrNot = true;
		
		if(array1.length == array2.length){
			for(int i=0;i<array1.length;i++){
				if(array1[i] != array2[i]){
					equalOrNot = false;
				}
			}
		}
		else{
			equalOrNot = false;
		}
		
		if(equalOrNot){
			System.out.println("Two Arrays Are Equals");
		}
		else{
			System.out.println("Two Arrays Are not Equals");
		}
	}

}
