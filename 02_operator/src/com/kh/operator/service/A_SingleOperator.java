package com.kh.operator.service;

public class A_SingleOperator {
	public void logicalNegationOp() {
		// 논리 부정 연산자 : !
		// 논리값(true / false)를 반대로 바꿔주는 연산자
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
	}
	
	public void increaseOp() {
		// 증가 연산자 : ++
		// 피연산자를 1씩 증가 시키는 연산자
		
		// ++(피연산자) : 전위 증가 연산자
		// 먼저 피연산자를 증가시킨 후 다음연산 진행
		
		// (피연산자)++ : 후위 증가 연산자
		// 다른 연산 진행 후 피연산자를 증가시킴
		
		int num1 = 10;
		
		// 전위 증가부터
		System.out.println("----- 전위 증가 연산자 -----");
		System.out.println("초기값 : " + num1); // 10
		System.out.println(" ++num1 1회 수행 : " + ++num1); // 11
		System.out.println(" ++num1 2회 수행 : " + ++num1); // 12
		System.out.println(" ++num1 3회 수행 : " + ++num1); // 13
		System.out.println(" ++num1 4회 수행 : " + ++num1); // 14
		System.out.println(" ++num1 5회 수행 : " + ++num1); // 15
		System.out.println(" 최종값 : " + num1); // 15
		
		// 후위 증가 끄악
		int num2 = 10;
		
		System.out.println("----- 후위 증가 연산자 -----");
		System.out.println("초기값 : " + num2); // 10
		System.out.println(" num2++ 1회 수행 : " + num2++); // 10
		System.out.println(" num2++ 2회 수행 : " + num2++); // 11
		System.out.println(" num2++ 3회 수행 : " + num2++); // 12
		System.out.println(" num2++ 4회 수행 : " + num2++); // 13
		System.out.println(" num2++ 5회 수행 : " + num2++); // 14
		System.out.println(" 최종값 : " + num2); // 15
	}
	
	public void practice1() {
		int num = 20;
		int result = num++ * 3 + ++num;
		System.out.println("result : " + result); // 82
		System.out.println("num : " + num); // 22
	}
	
	public void practice2() {
		// 문제 : 최종적으로 a, b, c 변수에 저장된 값과
		// 			result1, result2, result3에 저장된 값 예측하기
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result1 = a++;
		
		int result2 = ++a + ++b;
		
		int result3 = a++ + --b + --c;
		
		System.out.println(a); // 13
		System.out.println(b); // 20
		System.out.println(c); // 29
		System.out.println(result1); // 10
		System.out.println(result2); // 33
		System.out.println(result3); // 61
	}
}
