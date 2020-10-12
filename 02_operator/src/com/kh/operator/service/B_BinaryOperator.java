package com.kh.operator.service;

import java.util.Scanner;

public class B_BinaryOperator {
	public void arithmeticOP() {
		// arithmetic : 산수
		
		// 산술 연산자
		// 기존 사칙연산(+, -, *, /)에 modulars 연산(%)이 추가된 것
		// % : 나눴을 때의 나머지 정수부분만
		
		// 두 정수를 입력 받아 + - * / % 결과를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : " + (num1-num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기 결과 : " + (num1/num2));
		System.out.println("나머지연산 결과 : " + (num1%num2));
		
		sc.close();
	}
}
