package com.kh.darr.service;

import java.util.Arrays;

public class DarrService {

	public void example1() {
		// 2차원 배열
		// - 1차원 배열의 묶음
		
		// 2차원 배열 선언
		int[][] iArr;
		
		// 2차원 배열 할당
		iArr = new int[2][3];
		// 2차원 배열 2행 3열을 할당하여
		// 시작 주소값을 iArr 참조 변수에 대입
		
		// 배열의 각 요소에 1부터 6까지를 저장
		int count = 1;
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = count++;
			}
		}
		
		for(int i = 0; i< iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		// System.out.println(Arrays.deepToString(iArr));
	}
	
	public void example2() {
		// 2차원 배열 선언, 할당, 초기화를 한번에! 2차원 배열 올인원 패키지!
		int[][] arr = {{10, 20, 30}, {4, 5, 6}, {19, 17, 21}};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println("배열의 값들의 합계 : " + sum +
				"\n배열의 값들의 평균 : " + (double)sum/(arr.length*arr[0].length));
		System.out.println(Arrays.deepToString(arr));
	}
}
