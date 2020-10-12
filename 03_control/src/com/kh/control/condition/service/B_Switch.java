package com.kh.control.condition.service;

import java.util.Scanner;

public class B_Switch {

	// switch문
	// - if문과 같은 조건문이지만
	// if문과 달리 조건식을 범위로 지정할 수 없음
	//	 (== 조건식의 결과가 딱 떨어지는 값이여야한다.)
	
	// - 조건식의 결과가 논리 값이 아니어도 사용 할 수 있음.
	
	// - 동등 비교 : 값이 같은지를 비교
	// - case 구문에서 break : 현재 switch가 연속되서 해석되는 것을 멈춤
	// switch(동등 비교 대상자) {
	// 		case 값1 : 수행코드1; break;
	// 		case 값2 : 수행코드2; break;
	// 		default : 모든 case가 일치하지 않을 경우 수행하는 코드;
	// } 
	
	public void example1() {
		// 1을 입력하면 "빨간불" 출력
		// 2를 입력하면 "노란불" 출력
		// 3을 입력하면 "초록불" 출력
		// 다른숫자 입력하면 "잘못 입력 하셨습니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		String result = null;
		
		switch(input) {
		
		case 1: 
			result = "빨간불";
			break;
			
		case 2:
			result = "노란불";
			break;
			
		case 3:
			result = "초록불";
			break;
			
		default:
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
		sc.close();
	}
	
	public void example2() {
		// 간단 계산기맨
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자 입력 : ");
		char operator = sc.nextLine().charAt(0);
		
		sc.close();
		
		int result = 0;
		
		switch(operator) {
		case '+' : 
			result = num1 + num2;
			break;
			
		case '-' :
			result = num1 - num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			result = num1 / num2;
			break;
			
		case '%' :
			result = num1 % num2;
			break;
			
		default :
			System.out.println("연산자를 잘못 입력하였습니다.");
			return;
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
	
	public void example3() {
		// 등급별 권한 부여
		// 관리자	: 조회 작성 삭제
		// 회원		: 조회 작성
		// 비회원	: 조회
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급 지정 : ");
		String grade = sc.nextLine();
		
		sc.close();
		
		switch(grade) {
		case "관리자" : 
			System.out.println("삭제");
		case "회원" :
			System.out.println("작성");
		case "비회원" :
			System.out.println("조회");
			break;
		default :
			System.out.println("존재하지 않는 등급입니다.");
			return;
		}
	}
}
