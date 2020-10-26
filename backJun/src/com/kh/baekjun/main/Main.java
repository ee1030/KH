package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int input = sc.nextInt();
    	
    	int[] binNum = new int[1000];
    	int i = binNum.length-1;
    	
    	if(input == 0) {
    		System.out.println(0);
    		return;
    	}
    	
    	while(true) {   		
    		binNum[i] = input%2;
    		i--;
    		input /= 2;
    		if(input == 0)
    			break;
    	}
    	
    	for(int j = 0; j < binNum.length; j++) {
    		if(binNum[j] == 1) {
    			for(int k = j; k < binNum.length; k++) {
    				System.out.print(binNum[k]);
    			}
    			break;
    		}
    	
    	}
    }
}
