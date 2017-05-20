package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
			//br = new BufferedReader(new FileReader("output.txt"));
		}
	}

}
