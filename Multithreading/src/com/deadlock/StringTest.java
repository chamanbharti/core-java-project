package com.deadlock;

public class StringTest {
	public static void main(String[] args) {
		String s="hello chaman";
		char[] ch=s.toCharArray();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
				vowel++;
			}else{
				consonant++;
			}
			System.out.print(ch[i]);
		}
		System.out.print(" vowel="+vowel+" consonant="+consonant);
	}

}
