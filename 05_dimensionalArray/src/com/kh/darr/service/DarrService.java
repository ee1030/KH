package com.kh.darr.service;

import java.util.Arrays;

public class DarrService {

	public void example1() {
		// 2���� �迭
		// - 1���� �迭�� ����
		
		// 2���� �迭 ����
		int[][] iArr;
		
		// 2���� �迭 �Ҵ�
		iArr = new int[2][3];
		// 2���� �迭 2�� 3���� �Ҵ��Ͽ�
		// ���� �ּҰ��� iArr ���� ������ ����
		
		// �迭�� �� ��ҿ� 1���� 6������ ����
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
		// 2���� �迭 ����, �Ҵ�, �ʱ�ȭ�� �ѹ���! 2���� �迭 ���ο� ��Ű��!
		int[][] arr = {{10, 20, 30}, {4, 5, 6}, {19, 17, 21}};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println("�迭�� ������ �հ� : " + sum +
				"\n�迭�� ������ ��� : " + (double)sum/(arr.length*arr[0].length));
		System.out.println(Arrays.deepToString(arr));
	}
}
