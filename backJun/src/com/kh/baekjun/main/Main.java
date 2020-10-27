package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int[] nArr = new int[N];
    	for(int i = 0; i < N; i++) {
    		nArr[i] = sc.nextInt();
    	}
    	
    	int M = sc.nextInt();
      	int[] mArr = new int[M];
    	for(int i = 0; i < M; i++) {
    		int result = 0;
    		mArr[i] = sc.nextInt();
    		for(int j = 0; j < nArr.length; j++) {
    			if(nArr[j] == mArr[i]) {
    				result = 1;
    			}
    		}
    		System.out.print(result + " ");
    	}
    }
}
