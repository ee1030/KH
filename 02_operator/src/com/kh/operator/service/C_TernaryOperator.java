package com.kh.operator.service;

import java.util.Scanner;

public class C_TernaryOperator {

	// 삼항 연산자
	// (조건식) ? 식1 : 식2
	// - 조건식 결과가 true일 경우 식1 수행 false일 경우 식2 수행
	
	public void example1() {
		// 정수 하나를 입력 받아 양수인지, 양수가 아닌지 검사
		// 양수일 경우 "양수입니다.", 양수가 아닐경우 "양수가 아닙니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수입니다." : "양수가 아닙니다.";
		System.out.println(input + "은/는 " + result);
		
		sc.close();
	}
}
