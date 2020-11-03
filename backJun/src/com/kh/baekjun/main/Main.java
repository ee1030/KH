package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int input = sc.nextInt();
    	
    	int[][] arr = new int[input][input];
    	int count = 1;
    	
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[i].length; j++) {
    			arr[j][i] = count++;
    		}
    	}
    	
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    			
    }
}
