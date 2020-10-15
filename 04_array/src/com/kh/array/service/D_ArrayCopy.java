package com.kh.array.service;

import java.util.Arrays;

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
		
		
	}
}
