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
	
	public void example2() {
		// if - else문
		/*
		 * if(조건식) {
		 * 	true일 때 수행
		 * } else {
		 * 	false일 때 수행
		 * }
		 */
		
		// 정수 하나를 입력 받아 짝수, 홀수 검사
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다.");
		}
		
		sc.close();
	}
	
	public void example3() {
		// 1 ~ 12 사이의 숫자를 입력 받아 
		// 해당 월의 계절을 출력하세요
		// 단, 1 ~ 12사이 숫자가 아닌 경우 "잘못 입력하셨습니다" 출력하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이 숫자를 입력해 주세요 : ");
		int month = sc.nextInt();
		String season = null;
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
		} else if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "잘못 입력 하셨습니다.";
		}
		
		System.out.println(season);
		
		sc.close();
	}
	
	public void example4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = null;
		
		if(age <= 13) {
			result = "어린이";
		} else if(age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		// 위쪽 조건문이 만족하지 못하는 경우
		// 아래쪽 조건문 검사 범위에서 제외됨
		
		System.out.println(result);
		sc.close();
	}
	
	public void example5() {
		// 나이 입력 어린이, 청소년, 성인 구분하고 나이 범위는 0~120사이
		// 범위 외엔 잘못 입력하셨습니다 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = null;
		
		if(age >= 0 && age <= 120) {
			if(age <= 13) {
				result = "어린이";
			} else if(age <= 19) {
				result = "청소년";
			} else {
				result = "성인";
			}
		} else {
			result = "잘못 입력 하셨습니다.";
		}

		System.out.println(result);
		sc.close();
	}
	
	public void example6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = null;
		
		if( age < 0 || age > 120) {
			result = "잘못 입력 하셨습니다.";
		} else if(age <= 13) {
			result = "어린이";
		} else if(age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		// 위쪽 조건문이 만족하지 못하는 경우
		// 아래쪽 조건문 검사 범위에서 제외됨
		
		System.out.println(result);
		sc.close();
	}
	
	public void example7() {
		// 이름을 입력하여 본인인지 확인하기
		
		// 이름을 입력하세요 : 유현재
		// 본인입니다.
		
		// 이름을 입력하세요 : 홍길동
		// 본인이 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		sc.close();
		
		if(name.equals("유현재")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}
}
