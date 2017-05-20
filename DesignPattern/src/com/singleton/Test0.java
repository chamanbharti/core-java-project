package com.singleton;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

public class Test0{

	//Approach - I
	private static final Test0 t = new Test0();//eager loading
	
	private Test0(){}
	
	public static Test0 getInstance(){
		return t;
	}
	
	
	//Approach - II
	/*private static Test0 t = null;//lazy loading
	private Test0(){}
	
	public static Test0 getInstance(){
		
		if(t == null){
			t = new Test0();
		}
		return t;
	}
	//prevent destroing singleton class object by serialization
	protected Object readResolve(){
		return getInstance();
	}*/
	
	//Approach -III
	/*private static Test0 t = null;
	private Test0(){}//construnctor
	static{
		//static block initialization for exception handling
		try{
				t = new Test0();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static Test0 getInstance(){
		return t;
	}*/
	
	/*public Object readResolve(){
		//return getInstance();
		return t;
	}*/
	
}
