package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

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
		// - ���� ���縦 ���� �迭 ���� ��
		//   �ش� �迭�� ũ��� ���� �迭�� ũ�⺸�� ũ�ų� ���ƾ� ��.
		
		int[] arr = {2, 5, 9, 1, 11};
		
		//���� �迭�� �Ȱ��� ũ���� ���ο� �迭�� �����Ͽ� copyArr ������ ����
		int[] copyArr = new int[arr.length]; 
		
//		// for���� �̿��� ���� ����
//		for(int i = 0; i < arr.length; i++) {
//			copyArr[i] = arr[i];
//		}
		
//		// System.arraycopy(�����迭��, ������������ε���, ����迭��, ����迭�����ε���, �������)
//		System.arraycopy(arr, 0, copyArr, 0, arr.length);
		
//		// Arrays.copyOf(���� �迭��, ���� ����)
//		copyArr = Arrays.copyOf(arr, arr.length);
		
		// �⺻������ �迭�� �����Ǵ� clone() �޼��� ���
		copyArr = arr.clone();
		
		
		System.out.println("============================���� ��============================");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		copyArr[0] = 999;
		
		System.out.println("============================���� ��============================");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	}
	
	public void example1() {
		// ���� ���� + ���� ����
		
		// �迭�� ���� 
		// 1. �Ѱ��� �ڷ����ۿ� ������ �� ����.
		// 2. �迭�� ũ�⸦ ������ �� ����.
		
		// �ʱ⿡ 3ĭ¥�� int�� �迭�� ���� ��
		// ������ �Է¹޾� �迭��ҿ� ���� ����
		// ��, ���� �迭ũ�� �̻��� ���� �Է� �� ���
		// �迭�� ũ�⸦ 2�� �÷��� ���� ����
		// (0 �Է� �� ������ ���� �� ���)
		
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			System.out.print("arr[" + i + "] �Է� : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			if(i >= arr.length) { // ���� i���� ���� �迭���� ũ�ų� �������
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
