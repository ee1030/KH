package com.kh.darr.practice;

import java.util.Scanner;

public class DArrPractice {

	public void pratice1() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int count = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				for(int j = 0; j < arr.length; j++) {
					arr[i][j] = arr[0][j] + arr[1][j] + arr[2][j];
				}
			} else {
				for(int j = 0; j < arr[0].length; j++) {
					if(j == arr[0].length-1) {
						arr[i][j] = arr[i][0] + arr[i][1] + arr[i][2];
					} else {
						arr[i][j] = (int)(Math.random()*10+1);
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void pratice5() {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr;
		
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			arr = new char[row][col];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					int randNum = (int)(Math.random()*80+1);
					arr[i][j] = (char)randNum;
					if(randNum < 65) {
						j--;
					}
						
				}
			}
			
		}
		// 65 ~ 81
		
	}
}
