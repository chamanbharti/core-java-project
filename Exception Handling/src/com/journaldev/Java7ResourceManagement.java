package com.journaldev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7ResourceManagement {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\journaldev.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
