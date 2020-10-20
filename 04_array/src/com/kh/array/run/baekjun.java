package com.kh.array.run;

import java.util.Scanner;

public class baekjun {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] arr1 = new int[10];
    	
    	for(int i = 0; i < 10; i++) {
    		arr1[i] = sc.nextInt() % 42; 
    	}
    	
    	int count = 0;
    	
    	for(int i = 0; i < arr1.length; i++) {
    		for(int j = i+1; j < arr1.length; j++) {
    			if(arr1[i] == -1) {
    				break;
    			}
	
    			if(arr1[i] == arr1[j]) {
    				arr1[j] = -1;
    			} 
    		}
    	}
    	
    	for(int i = 0; i < arr1.length; i++) {
    		if(arr1[i] != -1) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}

