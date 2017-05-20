package sorting;

public class BubbleSort1 {

	public static void main(String[] args) {
		int [] arr1={10,34,256,7,67,88,42};
		int [] arr2=doBubbleSort(arr1);
		/*for(int i:arr2){
			System.out.print(i);
			System.out.print(" , ");
		}*/
		/*for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(" , ");
		}*/
		int i=0;
		while(i!=0){
			System.out.print(arr2[i]);
			System.out.print(" , ");
			i++;
		}
		
		
	}

	public static int[] doBubbleSort(int[] input) {
		 int temp;
		 for(int i=0;i<input.length-1;i++){
			 for(int j=0;j<input.length-i-1;j++){
				 if(input[j]>input[j+1]){
					 temp=input[j];
					 input[j]=input[j+1];
					 input[j+1]=temp;
				 }
			 }
		 }
		 return input;
	}
}
