package com.kh.array.service;

import java.util.Arrays;

public class B_ArraySort {
	// 배열 정렬
	// - 변수끼리 값을 바꾸는 방법을 익히고 있어야 됨
	// - for문을 이용한 배열 접근 방법을 잘 숙지하고 있어야 함
	
	// 1) 배열 요소끼리 값 바꾸기
	// 2) 삽입 정렬
	// 3) 버블 정렬
	
	public void example1() {
		int[] arr = {2, 1, 3};
		
		// 오름차순 : 작은거 -> 큰거
		// 내림차순 : 큰거 -> 작은거
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(arr[0]);
	}
	
	public void insertionSort() {
		// 삽입 정렬
		// - 정렬 알고리즘에서 가장 간단하고 기본적인 알고리즘
		// - 배열의 n번째 요소를
		// 0 ~ n - 1 요소와 비교하여 정렬을 진행
		
		int[] arr = {2, 5, 4, 1, 3};

		System.out.println("초기 값 : " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("비교 주체 : " + arr[i]);
		
			for(int j = i-1; j >= 0 ; j--) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				
				System.out.println("삽입 정렬된 배열 : " + Arrays.toString(arr));
			}
		}
		
		System.out.println("\n최종 정렬된 배열 : " + Arrays.toString(arr));
	}
	
	public void isEx1() {
		int[] arr = {5, 2, 6, 1, 8};
		
		System.out.println("초기값 : " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("기준 : " + arr[i]);
			for(int j = i-1; j >= 0; j--) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				System.out.println("삽입 정렬된 배열 : " + Arrays.toString(arr));
			}
		}
		System.out.println("최종 정렬된 배열 : " + Arrays.toString(arr));	
	}
	
	public void bubbleSort() {
		// 버블 정렬
		// 0번 인덱스부터 다음 인덱스와 비교하여 큰값이면 자리를 바꾸고 아니면 그대로 둔 상태에서
		// 다음 인덱스와 또 비교 그렇게 배열 끝까지 정렬하면 배열의 마지막 인덱스 값이 가장 큰 값이 되므로
		// 다음 회차에서는 반복 횟수를 1 줄여도 된다.
		
		int[] arr = {2, 5, 4, 1, 3};
		
		System.out.println("초기 값 : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++) { // 1. 회차 지정, 전체 데이터 수 - 1회만큼 반복
			System.out.println(i+1 + "회차");
			for(int j = 0; j < arr.length - i - 1; j++) { 
				// 0번 인덱스부터 끝에서 2번째 인덱스까지 반복(마지막 인덱스는 비교하지 않아도 되므로)
				
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					System.out.println(Arrays.toString(arr));
				}	
			}
		}
		
		System.out.println("최종 정렬된 배열 : " + Arrays.toString(arr));
	}
	
	public void bsEx1() {
		int[] arr = {5, 2, 6, 1, 8};
		
		System.out.println("초기 배열 : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println(i+1 + "회차");
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}	
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
