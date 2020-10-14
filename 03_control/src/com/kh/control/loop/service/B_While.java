package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {

	/*
	 * while문
	 * 
	 * - for문과 달리 종료 조건이 불확실한 경우에 사용하는 반복문
	 * 
	 * while(조건식) {
	 * 		수행코드;
	 * 		[증감식]
	 * }
	 */
	
	public void example1() {
		// 1~5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void example2() {
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// 입력되는 모든 수 더하기
		// 단, 0 입력 시 더해진 합을 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = -1;
		
		while(input != 0) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			
			if(a == 0) {
				input = 0;
			}
			
			sum += a;			
		}		
		System.out.println("합계 : " + sum);
	}
	
	public void example4() {
		// 입력 되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료
		// (-1 입력시 sum에 더해지지 않게 하시오)
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		boolean flag = true;
		while(flag) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			
			if(a == -1) {
				flag = false;
			} else {				
				sum += a;			
			}
			
		}
		System.out.println("합계 : " + sum);
	}
	
	public void example5() {
		// 입력되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료 
		// (-1 입력 시 sum에 더해지지 않게 하시오)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 저장용 변수 
		int input = 0; // 입력받은 수를 저장할 임시 변수
		
		
		while(input != -1) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void example6() {
		// while + switch를 이용한 메뉴 구성
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0; // 입력받은 정수를 저장할 임시 변수
		
		while(sel != 9) {
			System.out.println("1. 예제1");
			System.out.println("2. 예제2");
			System.out.println("3. 예제3");
			System.out.println("4. 예제4");
			System.out.println("5. 예제5");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 입력 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			
			switch(sel) {
			case 1 : example1(); break;
			case 2 : example2(); break;
			case 3 : example3(); break;
			case 4 : example4(); break;
			case 5 : example5(); break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}
	
	public void example7() {
		// do ~ while + switch를 이용한 메뉴 구성
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 9; // 입력받은 정수를 저장할 임시 변수
		
		do {
			System.out.println("1. 예제1");
			System.out.println("2. 예제2");
			System.out.println("3. 예제3");
			System.out.println("4. 예제4");
			System.out.println("5. 예제5");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 입력 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1 : example1(); break;
			case 2 : example2(); break;
			case 3 : example3(); break;
			case 4 : example4(); break;
			case 5 : example5(); break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(sel != 9);
		
		sc.close();
	}
	
	public void example8() {
		// 입력된 문자열을 모두 연결해서 출력하기
		// 단, "exit" 입력 시 연결 종료
		
		// ex) 
		// 입력 : Hello
		// 입력 : World
		// 입력 : exit
		// 입력된 문자열 HelloWordl
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		String tmp = null;
		
		do {
			System.out.print("입력 : ");
			tmp = sc.nextLine();
			if(!tmp.equals("exit")) {
				str += tmp;
			}
		} while(!tmp.equals("exit"));
		
		System.out.println(str);
	}
}
