package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void InputTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 알려주세요 : ");
		String name = sc.nextLine(); // 문자열 변수 선언과 동시에 키보드 입력받아서 초기화
		
		System.out.println("너의 이름은..." + name);
		sc.close();
	}
	
	public void InputTest2() {
		// 사용자 정보를 입력받아 한번에 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 나이는 " + age + "세이고, 키는 " + height + "cm입니다.");
		
		sc.close();
	}
	
	public void InputTest3() {
		// 사용자의 이름, 나이, 주소를 입력받아 한 줄로 출력하기
		// 이름 : 유현재
		// 나이 : 28
		// 주소 : 의정부시 능곡로 70
		// 유현재님은 28세이고, 의정부시 능곡로 70에 살고 있습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 입력 버퍼에 남아있는 개행문자 제거하기
		sc.nextLine(); // 버퍼에 남아있는 개행문자를 읽어와 버리는 효과
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.println(name + "님은 " + age + "세이고, " + address + "에 살고 있습니다.");
		
		sc.close();
	}
}
