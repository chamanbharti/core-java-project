package com.javatpoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	
	public static void main(String[] args) {
		//Before JDK7
		/*BufferedReader br=null;
		
		try{
			br=new BufferedReader(new FileReader("D:\\chaman.txt"));
			for(int i=0;i<=10;i++){
				System.out.println(br.readLine());
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
					try{
						if(br!=null){
							br.close();
						}
					}catch(IOException e){
						e.printStackTrace();
					}
		}*/
		
		//After JDK7
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\chaman.txt"))){
			for(int i=0;i<10;i++){
				System.out.println(br.readLine());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
