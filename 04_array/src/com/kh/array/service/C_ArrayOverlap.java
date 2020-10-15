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
	
	public void createLottoNumber() {
		// 1 ~ 45���� �ߺ����� ���� �� 7��
		// �Է� ���� �ݾ� ��ŭ �ζǹ�ȣ ����
		// 1000�� �� 1��
		
		Scanner sc = new Scanner(System.in);
		int money;
		
		while(true) {
			System.out.print("�ݾ� : ");
			money = sc.nextInt();
			
			if(money/1000 > 0) {
				break;
			} else {
				System.out.println("�ζǴ� 1000�� �̻���� �� �� �ֽ��ϴ�.");
			}
		}
		
		for(int k = 1; k <= money/1000; k++) {
			int[] lotto = new int[7];
			
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			for(int i = 0; i < lotto.length-1; i++) {
				for(int j = 0; j < lotto.length-i-1; j++) {
					if(lotto[j+1] < lotto[j]) {
						int tmp = lotto[j+1];
						lotto[j+1] = lotto[j];
						lotto[j] = tmp;					
					}
				}
			} // ���� ���ķ� ���ı���
	
//			for(int i = 1; i < lotto.length; i++) {
//				for(int j = i-1; j >= 0; j--) {
//					if(lotto[j+1] < lotto[j]) {
//						int tmp = lotto[j];
//						lotto[j] = lotto[j+1];
//						lotto[j+1] = tmp;
//					}
//				}
//			} // ���� ���ķ� ���ı���
			
			System.out.println("�̹��� �ζ� ��ȣ�� �̰��̴� : " + Arrays.toString(lotto));
		}
	}
}
