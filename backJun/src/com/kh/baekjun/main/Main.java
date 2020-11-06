package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	String S1 = sc.nextLine();
    	String S2 = sc.nextLine();
    	String S3 = sc.nextLine();
    	
    	if(S1.charAt(S1.length()-1) == S2.charAt(0) && 
    	   S2.charAt(S2.length()-1) == S3.charAt(0) &&
    	   S3.charAt(S3.length()-1) == S1.charAt(0)) {
    		System.out.println("good");
    	} else {
    		System.out.println("bad");
    	}
    }
}
