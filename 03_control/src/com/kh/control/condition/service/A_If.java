package com.kh.control.condition.service;

import java.util.Scanner;

public class A_If {

	/*
	 * 프로그래밍 언어의 해석은 기본적으로 위 -> 아래, 왼쪽 -> 오른쪽으로 순차적으로 해석이 됨. 
	 * 이러한 해석 순서를 제어하는 것을 제어문이라고 한다. 
	 * <조건문>
	 *  - 조건식을 통해 참 또는 거짓을 판단하여 
	 *    조건을 만족하는 경우 해당 코드를 수행하는 제어문
	 *    (삼항 연산자도 제어문이다)
	 *    
	 */
	
	public void example1() {
		// 정수 하나를 입력 받아 양수, 음수, 0을 판별하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다.");
		}
		
		if(input == 0) {
			System.out.println("0입니다.");
		}
		
		if(input < 0) {
			System.out.println("음수입니다.");
		}
		
		sc.close();
	}
	
}
