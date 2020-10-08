package com.kh.variable.service;

public class D_Overflow {

	public void OverflowEx1() {
		// 오버 플로우 : 데이터 연산 처리 시 자료형의 값의 범위를 초과하는 경우
		// 발생하는 현상. 최대값 초과 시 -> 최소값, 최소값 초과 시 -> 최대값
		// 초기화 연산 제외
		
		byte bNum1 = 127; // byte 최대값
		
		byte bNum2 = (byte)(bNum1 + 1);
		
		// 오버플로우 대처하기
		int iNum = bNum1 + 1;
		
		System.out.println("bNum1  : " + bNum1); // 127
		System.out.println("bNum2  : " + bNum2); // Overflow -128
		System.out.println("iNum : " + iNum); // 128
		
	}
}
