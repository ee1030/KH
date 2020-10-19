package com.kh.oop.ch6_method.service;

import java.util.Arrays;
import java.util.Scanner;

public class MethodService {
	// 두 정수를 입력받고
	// 다음 메뉴 중 하나를 선택해서 해당 결과를 반환받아 출력

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 두 수 사이의 모든 정수 배열로 반환받기");
		
		System.out.print("번호 선택 : ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 : System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));break;
		case 2 : System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));break;
		case 3 : System.out.println(Arrays.toString(array(num1, num2)));break;
		}
	}
	
	// 두 수를 전달 받아 더한 값을 반환
	// [접근제한자] [예약어] [반환형] 메소드명([매개변수]){}
	public int add(int num1, int num2) {
		// 매개변수는 전달 받고자 하는 데이터의 개수와 자료형이 중요하다!
		// 변수명은 중요하지 않다.(알아볼수만 있으면 됨)
		int result = num1 + num2;
		return result; // 해당 메서드를 호출한 부분으로 돌아가게 하는 구문
					   // 반환형이 void가 아닐 경우 반환값을 가지고 돌아감
	}

	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public int[] array(int n1, int n2) {
		int[] result = new int[n2 - n1 +1];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = n1++;
		}
		return result;
	}
	
	public static int staticMethod(int[] arr) {
		// 전달받은 배열 내에 있는 데이터의 합 반환
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
}
