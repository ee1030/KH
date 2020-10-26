package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int input1 = sc.nextInt();
    	int input2 = sc.nextInt();
    	int input3 = sc.nextInt();
    	
    	int count = 0;
    	
    	for(int i = 0; i < input1; i++) {
    		for(int j = 0; j < input2; j++) {
    			for(int k = 0; k < input3; k++) {
	    			System.out.println(i + " " + j + " " + k);
	    			count++;
    			}
    		}
    	}
    	System.out.println(count);
    }  
}
