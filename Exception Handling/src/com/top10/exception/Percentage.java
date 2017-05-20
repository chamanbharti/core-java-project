package com.top10.exception;

public final class Percentage {
	private final int value;

	public Percentage(int value) {
		if(value <0 || value >100){
			throw new IllegalArgumentException(Integer.toString(value));
		}
		this.value = value;
	}
	public int getValue(){
		return value;
	}

}
