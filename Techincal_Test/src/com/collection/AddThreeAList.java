package com.collection;

import java.util.ArrayList;

public class AddThreeAList {

		public static void main(String[] args) {
			ArrayList<Integer>al1=new ArrayList<Integer>();
			al1.add(20);
			al1.add(30);
			ArrayList<Integer>al2=new ArrayList<Integer>();
			al2.add(40);
			al2.add(50);
			ArrayList<Integer>al3=new ArrayList<Integer>();
			//al3.add(al1);
			//al3.add(al2);
			al3.addAll(al1);
			al3.addAll(al2);
			System.out.println(al3);
			//al3.remove(0);
			//System.out.println(al3);
			al3.removeAll(al1);
			System.out.println(al3);
			System.out.println(al1);//[20,30]
			al1.clear();//[]
			System.out.println(al1);
			//Integer[] al4= (Integer[]) al3.toArray();//java.lang.ClassCastException:
			/*Object[] al4= al3.toArray();
			System.out.println(al4);
			for (int i = 0; i < al4.length; i++) {
				System.out.println(al4[i]);
			}*/
			
		}
}
