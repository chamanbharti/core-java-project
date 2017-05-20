package com.singleton;

public class Satellite {
	//Approach 1
	private static final Satellite _instance=new Satellite();
	
	
	private Satellite(){
		
	}
	
	public static Satellite getSatellite(){
		
			return _instance;
		
		
	}
	
	//Approach 2
	/*private static Satellite _instance=null;
	
	private Satellite(){
		
	}
	
	//public static synchronized Satellite getSatellite(){ this is not recommended
	public static synchronized Satellite getSatellite(){	
		if(_instance==null){
			_instance=new Satellite();
		}
		return _instance;
	}*/
	//Approach 3
	/*private Satellite(){
			
		}
	//Inner class
	private static class SatelliteHelper{
		private static final Satellite _innerInstance=new Satellite();
		
	}

	protected static Satellite getSatellite(){	
		
		return SatelliteHelper._innerInstance;
	}*/
		
}
