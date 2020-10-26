package com.kh.baekjun.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int input = sc.nextInt();
    	
    	int[] arr = new int[input];
    	String[] strArr = new String[input];
    	
    	for(int i = 0; i < input; i++) {
    		String strInput = sc.nextLine();
    		String[] tmpArr = new String[2];
    		
    		tmpArr = strInput.split(" ");
    		strArr[i] = tmpArr[0];
    		arr[i] = Integer.parseInt(tmpArr[1]);
    	}
    	
    	for(int i = 0; i < arr.length-1; i++) {
    		for(int j = 0; j < arr.length-i-1; j++) {
    			if(arr[j] > arr[j+1]) {
    				int tmp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = tmp;
    				
    				String strTmp = strArr[j];
    				strArr[j] = strArr[j+1];
    				strArr[j+1] = strTmp;
    			}
    		}
    	}
    	
    	System.out.println(strArr[2]);
    }
}
