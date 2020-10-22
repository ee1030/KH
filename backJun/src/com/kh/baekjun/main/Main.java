package com.kh.baekjun.main;

public class Main {
    public static void main(String[] args) {
    	//selfNum(1);
    }
    
    public void selfNum(int num) {
    	int i = num;
    	int ten = num/10;
    	int one = num - ten;
    	
    	int result = i + ten + one;
    	System.out.println(result);
    	selfNum(i);
    }
}
