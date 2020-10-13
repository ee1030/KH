package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {

	/*
	 * while문
	 * 
	 * - for문과 달리 종료 조건이 불확실한 경우에 사용하는 반복문
	 * 
	 * while(조건식) {
	 * 		수행코드;
	 * 		[증감식]
	 * }
	 */
	
	public void example1() {
		// 1~5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void example2() {
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// 입력되는 모든 수 더하기
		// 단, 0 입력 시 더해진 합을 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = -1;
		
		while(input != 0) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			
			if(a == 0) {
				input = 0;
			}
			
			sum += a;			
		}
		
		sc.close();
		
		System.out.println("합계 : " + sum);
	}
	
	public void example4() {
		// 입력 되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료
		// (-1 입력시 sum에 더해지지 않게 하시오)
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		boolean flag = true;
		while(flag) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			
			if(a == -1) {
				flag = false;
			} else {				
				sum += a;			
			}
			
		}
		
		sc.close();
		
		System.out.println("합계 : " + sum);
	}
	
	public void example5() {
		// 입력되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료 
		// (-1 입력 시 sum에 더해지지 않게 하시오)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 저장용 변수 
		int input = 0; // 입력받은 수를 저장할 임시 변수
		
		
		while(input != -1) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		sc.close();
		
		System.out.println("합계 : " + sum);
	}
}
