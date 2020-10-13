package com.kh.control.loop.service;

import java.util.Scanner;

public class A_For {
//	1. for문(단일 for문)
//	
//	for(초기식; 조건식; 증감식) {
//		수행될 코드;
//	}
//	
//	- 초기식 : for문 내부에서 사용할 변수를 선언할 수 있는 부분
//				-> 보통 반복문 제어를 위한 변수를 선언함.
//				
//	- 조건식 : 논리 값이 반환되는 식을 작성.
//	true인 경우 : 반복수행
//	false인 경우 : 반복문 종료
//	
//	- 증감식 : 1회 반복 종료 시 마다 수행될 문장을 작성.
//				-> 보통 초기식을 증가 또는 감소시켜 종료 조건을 만드는 용도로 사용.
	
	public void example1() {
		// 1부터 5까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void example2() {
		// 5부터 1까지 출력
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public void example3() {
		// 1 ~ 10까지 0.5씩 증가하면서 출력
		for(double i = 1; i <= 10; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void example4() {
		// A ~ Z까지 출력
		for(char ch = 'A'; ch <= 'Z';  ch++) {
			System.out.print(ch);
		}
	}
	
	public void example5() {
		// 1 ~ 10 사이의 정수 중 홀수만 출력
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n======================");
		
		for(int i=0; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void example6() {
		// 실수를 3번 입력받아 합계, 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		// 합계 구하기
		double sum = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.print(i + "번째 실수를 입력하세요 : ");
			sum += sc.nextDouble();
		}
		
		System.out.println("합계 : " + sum + "\n평균 : " + (sum/3));
		sc.close();
	}
	
	public void example7() {
		// 정수 하나를 입력 받아
		// 해당 단을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		sc.close();
		
		if(dan > 1 && dan <= 9) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void example8() {
		// 1 ~ 10사이 임의의 수(난수) 5개를 출력하고, 합계 출력하기
		
		/*
		 * java.lang.math.random()
		 * - 자바에서 수학 관련 기능을 제공하는 Math 클래스의 메소드 중 하나
		 * - 난수 발생 범위 : 0.0 <= random <= 1.0(double)
		 */
		
		// java.lang 패키지는 자바의 기본패키지
		// 컴파일시 자동으로 import가 추가됨
		// -> java.lang에 속해있는 클래스는 별도의 import를 작성하지 않아도 된다.
		
		int randNum;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			randNum = (int)(Math.random() * 10 + 1);
			sum += randNum;
			System.out.println(i + "번째 난수 : " + randNum);
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void example9() {
		// 1 ~ 20 사이의 임의의 정수를 발생시켜
		// 1부터 발생한 임의의 수까지의 합을 출력
		
		int randNum;
		int sum = 0;
		
		randNum = (int)(Math.random() * 20 + 1);
		for(int i=1; i<=randNum; i++) {
			sum += i;
		}
		
		System.out.println("발생한 숫자 : " + randNum + "\n합계 : " + sum);
	}
	
	public void example10() {
		// 정수 두 개를 입력받아
		// 두 정수 사이의 모든 정수의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		if(num1 > num2) {
			int tmp;
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println(num1 + "과 " + num2 + "사이의 모든 정수의 합 : " + sum);
	}
	
	// ====================================================================================
	
	// 중첩 for문
	
	public void example11() {
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void example12() {
		// 분, 초 출력하기
		// 0분 0초 ~ 59분 59초
		for(int min = 0; min < 60; min++) {
			for(int sec=0; sec<60; sec++) {
				System.out.println(min + "분 " + sec + "초");
				try {
					Thread.sleep(1000);
				} catch(Exception e) {}
			}
		}
	}
	
	public void example13() {
		// 2단부터 9단까지 구구단 모두 출력
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void example14() {
		// 2단부터 9단까지 구구단 거꾸로 출력
		
		for(int i=9; i>=2; i--) {
			for(int j=9; j>=1; j--) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void example15() {
		// 정수 입력 : 5
		// 1
		// 12
		// 123
		// 1234
		// 12345
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void example16() {
		// 정수 입력 : 5
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 10 11 12 13 14
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 1;
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	public void example17() {
		// 한 줄에 별표문자를 입력된 줄 수와 칸 수만큼 출력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
}
