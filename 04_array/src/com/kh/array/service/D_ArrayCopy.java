package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class D_ArrayCopy {
	
	public void shallowCopy() {
		// 얕은 복사
		// - 배열(객체) 전체를 복사하는 것이 아닌
		// 참조하는 주소 만을 복사하여
		// 동일 배역(객체)를 여러 변수가 참조하게 하는 것.
		
		int[] arr = {1, 1, 2, 3, 5, 8, 13};
		int[] copyArr = arr;
		
		System.out.println("변경전 arr : " + Arrays.toString(arr));
		System.out.println("변경전 copyArr : " + Arrays.toString(copyArr));
		
		System.out.println("======================================================");
		
		arr[arr.length-1] = 100; // arr이 참조하고 있는 마지막 인덱스 값을 100으로 변경
		
		System.out.println("변경 후 arr : " + Arrays.toString(arr));
		System.out.println("변경 후 copyArr : " + Arrays.toString(copyArr));
		
		System.out.println("======================================================");
		
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		System.out.println("arr : " + arr.hashCode());
		System.out.println("copyArr : " + copyArr.hashCode());
	}
	
	public void deepCopy() {
		// 깊은 복사
		// - 새로운 배열을 생성하여
		//   기존 배열의 데이터를 그대로 복사하는 것
		// - 깊은 복사를 위한 배열 생성 시
		//   해당 배열의 크기는 기존 배열의 크기보다 크거나 같아야 함.
		
		int[] arr = {2, 5, 9, 1, 11};
		
		//기존 배열과 똑같은 크기의 새로운 배열을 생성하여 copyArr 변수로 참조
		int[] copyArr = new int[arr.length]; 
		
//		// for문을 이용한 깊은 복사
//		for(int i = 0; i < arr.length; i++) {
//			copyArr[i] = arr[i];
//		}
		
//		// System.arraycopy(원본배열명, 원본복사시작인덱스, 복사배열명, 복사배열시작인덱스, 복사길이)
//		System.arraycopy(arr, 0, copyArr, 0, arr.length);
		
//		// Arrays.copyOf(원본 배열명, 복사 길이)
//		copyArr = Arrays.copyOf(arr, arr.length);
		
		// 기본적으로 배열에 제공되는 clone() 메서드 사용
		copyArr = arr.clone();
		
		
		System.out.println("============================변경 전============================");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		copyArr[0] = 999;
		
		System.out.println("============================변경 후============================");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	}
	
	public void example1() {
		// 얕은 복사 + 깊은 복사
		
		// 배열의 단점 
		// 1. 한가지 자료형밖에 저장할 수 없다.
		// 2. 배열의 크기를 변경할 수 없다.
		
		// 초기에 3칸짜리 int형 배열을 선언 후
		// 정수를 입력받아 배열요소에 각각 저장
		// 단, 기존 배열크기 이상의 값을 입력 할 경우
		// 배열의 크기를 2배 늘려서 값을 저장
		// (0 입력 시 값저장 종료 후 출력)
		
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			System.out.print("arr[" + i + "] 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			if(i >= arr.length) { // 현재 i값이 기존 배열보다 크거나 같은경우
				int[] copyArr = new int[arr.length*2];
				System.arraycopy(arr, 0, copyArr, 0, arr.length);
				arr = copyArr;
				arr[i] = input;
			} else {
				arr[i] = input;
			}
				
			i++;
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != 0) {
				System.out.print(arr[j] + " ");
			} else {
				break;
			}
		}
	}
}
