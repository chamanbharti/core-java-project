package bitwise;

public class BitWiseOperator2 {
	// &,|,^ is apllicable for both integeral and boolean type
	// ~ is applicable only for integral type
	// ! is applicable only for boolean type
	public static void main(String[] args) {
		
		System.out.println( 4 & 5);//4 ------- 100
								   /*          101
								               ---
								               100 using And
								   */
		
		System.out.println( 4 | 5);//5 ------- 100
								   /*          101
						        			   ---
						                       101 using OR
		    							*/
		
		System.out.println( 4 ^ 5);//1 ------- 100
								   /*          101
										       ---
										       001 using X-OR
						*/
		//System.out.println(~true);//CE
		//System.out.println(!4);//CE
		System.out.println(!true);//false
		System.out.println(~4);//-5
		/* 4 ----- 00 00 00 00 00 00 00 00 00 00 00 00 00 00 100   32 bit size
		  ~4 ----- 11 11 11 11 11 11 11 11 11 11 11 11 11 11 011   32 bit size
		           00 00 00 00 00 00 00 00 00 00 00 00 00 00 100   1's compliment
		                                                      +1   2's compliment
		          ----------------------------------------------
		           00 00 00 00 00 00 00 00 00 00 00 00 00 00 101  -5                                          
		                                                    
							*/
								
	}

}
