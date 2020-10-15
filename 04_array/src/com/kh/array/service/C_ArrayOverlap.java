package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArrayOverlap {
	// �ߺ� ����
	// [1, 3, 3, 4, 5]
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "�� �ε��� �� �Է� : ");
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("�̹� �Էµ� ���Դϴ�.");
					i--;
					break;
				}
			}
			
			// �̹� �Էµ� ���� �� �ԷµȰ��
			// "�̹� �Էµ� ���Դϴ�." ��� ��
			// ���Է� �ޱ�
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void example2() {
		// 1 ~ 10 ���� �ߺ����� ���� ���� 5�� ����
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
