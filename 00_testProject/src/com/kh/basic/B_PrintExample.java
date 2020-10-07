package com.kh.basic;

public class B_PrintExample {
	
	public void printEx1() {
		//print(), println() 사용법
		System.out.print("문자열 출력");
		System.out.println("오늘도 화이팅 입니다^^");
		System.out.print("배고파요");
		System.out.println("점심 뭐먹죠?");
		System.out.println();
		System.out.println("쌀국수 먹을까요?");
	}
	
	public void printEx2() {
		// 숫자, 숫자 연산 출력
		System.out.println("----- 숫자 123 출력 -----");
		System.out.println("123"); // 문자열 123
		System.out.println(123); // 숫자 123
		
		System.out.println("----- 숫자 연산 -----");
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		System.out.println(10 - 100); // -90
		System.out.println(7 * 7); // 49
		System.out.println(7 / 7); // 1
		System.out.println(3 % 2); // 1
		System.out.println(100 == 90); // false
	}
	
	public void printEx3() {
		// 문자열 + 문자열
		// 숫자  + 문자열
		
		System.out.println("----- 문자열 + 문자열 -----");
		System.out.println("안녕? " + "반가워!"); // 안녕? 반가워?
	}
}
