package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.nextLine();
    	
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) == 't')
    		System.out.print(i+1 + " ");
    	}
    	
    	
    }
}
