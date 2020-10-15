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
}
