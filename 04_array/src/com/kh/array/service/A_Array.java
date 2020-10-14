package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * �迭
	 * - ���� �ڷ����� �������� �ϳ��� �������� �ٷ�°�.
	 * - �迭���� �̸��� �ϳ��� �ο��Ǳ� ������
	 * 	 ������ ���� �迭�� ����(index)�� ����
	 * 	 (index�� 0���� ����)
	 */
	
	public void example1() {
		// 1. �迭 ����
		// �ڷ���[] �迭��;
		// �ڷ��� �迭��[];
		// [] ��ȣ�� 1���� �迭�� �ǹ��� []�� 2���� 2����
		
		int[] arr; // int�� �迭 ����
		// �迭 ������ �迭�� �ڷ����� �̸��� �����ϴ� ���� ��
		// ���� �����͸� ������ ������ ����� ���� �ƴϴ�.
		
		// 2. �迭 �Ҵ�
		// �迭�� = new �ڷ���[�迭ũ��];
		arr = new int[5];
		
		// 3. �迭 �ʱ�ȭ
		// 3-1. �ε����� �̿��Ͽ� �ϳ��� �ʱ�ȭ
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		// 3-2. for���� �̿��� �ʱ�ȭ
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
	}
	
	public void example2() {
		// ����ڷκ��� ���� 5���� �Է¹ް�
		// �Է� ���� ������ �Ųٷ� ���
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "�ε��� �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("==========���==========");
		
		for(int i = (arr.length)-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void example3() {
		// �迭 ����, �Ҵ�, �ʱ�ȭ
		
		double[] darr = { 1.1, 2.2, 3.2 };
		// �迭 ���� �� �Ҵ�, �ʱ�ȭ�� {}�� �̿��Ͽ� �����ϴ� ���
		// new ������ ���� �ۼ��� �� ������
		// {} ���� �������� ���� ��ŭ �迭 ũ�Ⱑ �Ҵ�ȴ�.
		
		String[] sArr = {"�θ���", "�ƺ�ī��", "���θӽ���", "���", "�м��ĸ���"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 4 ���� ���� �Է� : ");
		int sel = sc.nextInt();
		
		System.out.println("������ ���� : " + sArr[sel]);
		// ArrayIndexOutOfBoundException
		// --> ���� �Ϸ��� �迭 index ���� �ش� �迭�� ������ �Ѿ.
	}
	
	public void example4() {
		// ����ڷκ��� 4���� Ű�� �Է¹޾�
		// �Է¹��� Ű, �հ�, ����� ����ϼ���.
		
		// �Է� 1 : 170.5
		// �Է� 2 : 185.5
		// �Է� 3 : 190.0
		// �Է� 4 : 160.0
		
		// 170.5 185.5 190.0 160.0
		// �հ� : 
		// ��� : 
		Scanner sc = new Scanner(System.in);
		
		double[] group = new double[4];
		double sum = 0;
		
		for(int i = 0; i < group.length; i++) {
			System.out.print("�Է� " + (i+1) + " : ");
			group[i] = sc.nextDouble();
			sum  += group[i];
		}
		
		for(int i = 0; i < group.length; i++) {
			System.out.print(group[i] + " ");
		}
		System.out.println("\n�հ� : " + sum);
		System.out.println("��� : " + sum/4);
	}
	
	public void example5() {
		// �Է¹��� ����� ���� ���� �Է��ϰ�
		// Ű �Է¹޾� Ű, �հ�, ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� �Է� : ");
		double[] height = new double[sc.nextInt()];
		
		double sum = 0.0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print("�Է� " + (i+1) + " : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.println(Arrays.toString(height));
		// Arrays Ŭ���� : java���� �����ϴ� �迭 ���� ������ ����� ��Ƴ��� Ŭ����
		// Arrays.toString(�迭��) : 
		// �迭�� ����� ���� �� �ٷ� ���, ��µǴ� �� ���̿� ','�� �����
		// ex) (123, 123, 123, 123)
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/height.length);
	}
}
