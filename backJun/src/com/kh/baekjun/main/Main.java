package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int testCase = sc.nextInt();
    	
    	double[] avgArr = new double[testCase];
    	
    	for(int i = 0; i < avgArr.length; i++) {
    		int students = sc.nextInt();
    		
    		double[] score = new double[students];
    		double sum = 0;
    		
    		for(int j = 0; j < students; j++) {
    			double score1 = sc.nextDouble();
    			score[j] = score1;
    			sum += score1;
    		}
    		
    		double testAvg = sum/students;
    		int count = 0;
    		
    		for(int j = 0; j < score.length; j++) {
    			if(score[j] > testAvg) {
    				count++;
    			}
    		}
    		
    		avgArr[i] = (double)count/students * 100;
    	}
    	
    	for(int i = 0; i < avgArr.length; i++) {
    		System.out.printf("%.3f", avgArr[i]);
    		System.out.println("%");
    	}
    }
}
