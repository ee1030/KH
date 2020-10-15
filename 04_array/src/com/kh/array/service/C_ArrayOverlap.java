package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArrayOverlap {
	// 중복 제거
	// [1, 3, 3, 4, 5]
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번 인덱스 값 입력 : ");
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("이미 입력된 값입니다.");
					i--;
					break;
				}
			}
			
			// 이미 입력된 값이 또 입력된경우
			// "이미 입력된 값입니다." 출력 후
			// 재입력 받기
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void example2() {
		// 1 ~ 10 사이 중복되지 않은 난수 5개 생성
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void createLottoNumber() {
		// 1 ~ 45까지 중복되지 않은 수 7개
		// 입력 받은 금액 만큼 로또번호 생성
		// 1000원 당 1줄
		
		Scanner sc = new Scanner(System.in);
		int money;
		
		while(true) {
			System.out.print("금액 : ");
			money = sc.nextInt();
			
			if(money/1000 > 0) {
				break;
			} else {
				System.out.println("로또는 1000원 이상부터 살 수 있습니다.");
			}
		}
		
		for(int k = 1; k <= money/1000; k++) {
			int[] lotto = new int[7];
			
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			for(int i = 0; i < lotto.length-1; i++) {
				for(int j = 0; j < lotto.length-i-1; j++) {
					if(lotto[j+1] < lotto[j]) {
						int tmp = lotto[j+1];
						lotto[j+1] = lotto[j];
						lotto[j] = tmp;					
					}
				}
			} // 버블 정렬로 정렬까지
	
//			for(int i = 1; i < lotto.length; i++) {
//				for(int j = i-1; j >= 0; j--) {
//					if(lotto[j+1] < lotto[j]) {
//						int tmp = lotto[j];
//						lotto[j] = lotto[j+1];
//						lotto[j+1] = tmp;
//					}
//				}
//			} // 삽입 정렬로 정렬까지
			
			System.out.println("이번주 로또 번호는 이것이다 : " + Arrays.toString(lotto));
		}
	}
}
