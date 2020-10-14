package com.kh.control.branch.service;

public class BranchService {

	/*
	 * 분기문
	 * - 반복문의 흐름을 제어하는 구문
	 * - 분기문을 감싸고 있는 가장 가까운 반복문에 적용됨.
	 * 
	 */
	
	public void example1() {
		for(int i = 1; ; i++) {
			System.out.println(i + " 출력");
			
			if(i >= 100) {
				break;
			}
		}
	}
	
	public void example2() {
		// 1부터 100까지 모든 정수의 합 구하기
		// 단, 4의 배수는 제외한다.
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%4 == 0) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void example3() {
		// 구구단 2~9단 모두 출력
		// 단, 곱해지는 수가 홀수인 경우를 제외하고 출력
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("======"+i+"단======");
			for(int j = 1; j <= 9; j++) {
				if(j%2 == 1) {
					continue;
				}
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
}
