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
			
			if(i >= 10) {
				break;
			}
		}
	}
}
