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

		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		System.out.println("나머지연산 결과 : " + (num1 % num2));

		sc.close();
	}

	public void comparisonOp() {
		// Comparison : 비교

		// 비교 연산자(관계 연산자)
		// 두 피연산자를 비교하여 논리 값(true, false)을 반환하는 연산자

		// * 반환 : 결과를 돌려(전달)받음
		// a < b : a가 b 미만? / b가 a 초과?
		// a > b : a가 b 초과? / b가 a 미만?

		// a<= b : a가 b 이하? / b가 a 이상?
		// a >= b : a가 b 이상? / b가 a 이하?

		// a == b : a가 b와 같은가?
		// a != b : a와 b가 다른가?

		int num1 = 10;
		int num2 = 25;
		int num3 = 25;
		
		boolean result1, result2;
		// 같은 자료형 변수 선언시 한줄에 연달아 선언 할 수 있다.
		// --> 관례 상 사용하지 않음
		// 한 줄에는 하나의 의미만을 갖도록 작성 하는 것이 좋기 때문
		
		result1 = num1 == num2; // false
 		result2 = num2 != num3; // false 

		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));

		System.out.println("num2 >= num3 : " + (num2 >= num3));
		System.out.println("num2 <= num3 : " + (num2 <= num3));
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result1 == result2 : " + (result1 == result2));
		
		// %, ==, != 이용하여, 홀수, 짝수, 배수 판별
		num1 = 5;
		
		System.out.println("num1은 짝수인가? : " + (num1 % 2 == 0));
		System.out.println("num1은 홀수인가? : " + (num1 % 2 == 1));
		System.out.println("num1은 홀수인가? : " + (num1 % 2 != 0));
		
		System.out.println("num1은 5의 배수인가? : " + (num1 % 5 == 0));
	}
	
	public void logicalOp1() {
		// 논리 연산자
		// - 논리값 두개를 비교하는 연산자
		
		// &&(AND) : 둘 다 true일 때만 true
		// -> 그리고, ~~면서, ~~이면서, ~부터, ~까지, ~사이
		
		// ||(OR) : 둘 다 false일 때만 false
		// -> 또는, ~거나, ~이거나
		
		// 입력받은 정수가 1 ~ 100 사이 숫자인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		boolean result = input >= 1 && input <= 100;
		
		System.out.println(input + "은/는 1~100 수 인가? : " + result);
		
		sc.close();
	}
	
	public void logicalOp2() {
		// 입력받은 알파벳이 대문자(A~Z)인지 검사
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 : ");
		char ch = sc.nextLine().charAt(0);
	
		boolean result = (ch >= 'A') && (ch <= 'Z');
		// char 자료형에 실제로 저장 되는 값은 정수형이므로
		// 문자끼리의 범위 비교가 가능하다
		
		System.out.println(ch + "은/는 대문자 인가? : " + result);
		
		sc.close();
	}
}
