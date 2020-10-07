package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void InputTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 알려주세요 : ");
		String name = sc.nextLine(); // 문자열 변수 선언과 동시에 키보드 입력받아서 초기화
		
		System.out.println("너의 이름은..." + name);
	}
	
}
