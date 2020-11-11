package com.kh.eh.model.service;

import java.util.Scanner;

public class ExceptionService {
	
	/* 런타임 에러 : 프로그램 실행 중 발생하는 에러
	 * 
	 * 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러
	 * -> 런타임 에러가 예외에 속함
	 * 
	 *  + 예외 상황은 코드 작성 시 예측이 가능하므로
	 *    예외를 "예측 가능한 에러" 라고도 함.
	 *    
	 *  ex) 배열의 범위를 벗어나는 상황, 계산식의 오류(나누기 0)
	 * 
	 */
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력된 정수 두 개를 나눈 몫 구하기");
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println("결과 : " + num1/num2);			
//		}
		
		// try : 예외가 발생할 가능성이 있는 코드를 작성하는 구문
		// catch : 
		
	}

}

