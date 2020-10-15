package com.kh.array.service;

import java.util.Arrays;

public class D_ArrayCopy {
	
	public void shallowCopy() {
		// ���� ����
		// - �迭(��ü) ��ü�� �����ϴ� ���� �ƴ�
		// �����ϴ� �ּ� ���� �����Ͽ�
		// ���� �迪(��ü)�� ���� ������ �����ϰ� �ϴ� ��.
		
		int[] arr = {1, 1, 2, 3, 5, 8, 13};
		int[] copyArr = arr;
		
		System.out.println("������ arr : " + Arrays.toString(arr));
		System.out.println("������ copyArr : " + Arrays.toString(copyArr));
		
		System.out.println("======================================================");
		
		arr[arr.length-1] = 100; // arr�� �����ϰ� �ִ� ������ �ε��� ���� 100���� ����
		
		System.out.println("���� �� arr : " + Arrays.toString(arr));
		System.out.println("���� �� copyArr : " + Arrays.toString(copyArr));
		
		System.out.println("======================================================");
		
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		System.out.println("arr : " + arr.hashCode());
		System.out.println("copyArr : " + copyArr.hashCode());
	}
	
	public void deepCopy() {
		// ���� ����
		// - ���ο� �迭�� �����Ͽ�
		//   ���� �迭�� �����͸� �״�� �����ϴ� ��
		
		
	}
}
