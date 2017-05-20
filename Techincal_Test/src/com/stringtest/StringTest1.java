package com.stringtest;

public class StringTest1 {
	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		System.out.print("== operator ");
		//System.out.println("== operator"+a.hashCode()==b.hashCode());//give CE
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println("equal method "+a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		String c=new String("abc");
		String d="abc";
		System.out.print("== operator ");
		System.out.println(c.hashCode()==d.hashCode());
		System.out.println("equal method "+c.equals(d));
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		String e=new String("abc");
		String f=new String("abc");
		System.out.print("== operator ");
		System.out.println(e.hashCode()==f.hashCode());
		System.out.println("equal method "+e.equals(f));
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
	}

}
