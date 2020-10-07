package com.kh.variable.service;

public class A_Variable {

	public void noVariable() {
		System.out.println("----- 변수사용 X -----");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	}
	
	public void usingVariable() {
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		System.out.println("----- 변수사용 O -----");
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}
	
	public void declareVariable() {
		// 1. 논리형
		boolean isTrue;
		
		// 2. 정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte, 정수 기본형
		long lNum; // 8byte
		
		// 3. 실수형
		float fNum; // 4byte
		double dNum; // 8byte, 실수 기본형
		
		// 4. 문자형
		char ch;
		
		// 5. 문자열
		String str;
		// 실제 데이터를 저장하지 않고 데이터가 저장된 주소를 저장한다.
	}
}
