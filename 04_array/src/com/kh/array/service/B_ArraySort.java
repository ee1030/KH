package com.kh.array.service;

import java.util.Arrays;

public class B_ArraySort {
	// �迭 ����
	// - �������� ���� �ٲٴ� ����� ������ �־�� ��
	// - for���� �̿��� �迭 ���� ����� �� �����ϰ� �־�� ��
	
	// 1) �迭 ��ҳ��� �� �ٲٱ�
	// 2) ���� ����
	// 3) ���� ����
	
	public void example1() {
		int[] arr = {2, 1, 3};
		
		// �������� : ������ -> ū��
		// �������� : ū�� -> ������
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(arr[0]);
	}
	
	public void insertionSort() {
		// ���� ����
		// - ���� �˰��򿡼� ���� �����ϰ� �⺻���� �˰���
		// - �迭�� n��° ��Ҹ�
		// 0 ~ n - 1 ��ҿ� ���Ͽ� ������ ����
		
		int[] arr = {2, 5, 4, 1, 3};

		System.out.println("�ʱ� �� : " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("�� ��ü : " + arr[i]);
		
			for(int j = i-1; j >= 0 ; j--) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				
				System.out.println("���� ���ĵ� �迭 : " + Arrays.toString(arr));
			}
		}
		
		System.out.println("\n���� ���ĵ� �迭 : " + Arrays.toString(arr));
	}
	
	public void isEx1() {
		int[] arr = {5, 2, 6, 1, 8};
		
		System.out.println("�ʱⰪ : " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("���� : " + arr[i]);
			for(int j = i-1; j >= 0; j--) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				System.out.println("���� ���ĵ� �迭 : " + Arrays.toString(arr));
			}
		}
		System.out.println("���� ���ĵ� �迭 : " + Arrays.toString(arr));	
	}
	
	public void bubbleSort() {
		// ���� ����
		// 0�� �ε������� ���� �ε����� ���Ͽ� ū���̸� �ڸ��� �ٲٰ� �ƴϸ� �״�� �� ���¿���
		// ���� �ε����� �� �� �׷��� �迭 ������ �����ϸ� �迭�� ������ �ε��� ���� ���� ū ���� �ǹǷ�
		// ���� ȸ�������� �ݺ� Ƚ���� 1 �ٿ��� �ȴ�.
		
		int[] arr = {2, 5, 4, 1, 3};
		
		System.out.println("�ʱ� �� : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++) { // 1. ȸ�� ����, ��ü ������ �� - 1ȸ��ŭ �ݺ�
			System.out.println(i+1 + "ȸ��");
			for(int j = 0; j < arr.length - i - 1; j++) { 
				// 0�� �ε������� ������ 2��° �ε������� �ݺ�(������ �ε����� ������ �ʾƵ� �ǹǷ�)
				
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					System.out.println(Arrays.toString(arr));
				}	
			}
		}
		
		System.out.println("���� ���ĵ� �迭 : " + Arrays.toString(arr));
	}
	
	public void bsEx1() {
		int[] arr = {5, 2, 6, 1, 8};
		
		System.out.println("�ʱ� �迭 : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println(i+1 + "ȸ��");
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
