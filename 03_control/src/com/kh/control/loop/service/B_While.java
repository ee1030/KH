package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {

	/*
	 * while��
	 * 
	 * - for���� �޸� ���� ������ ��Ȯ���� ��쿡 ����ϴ� �ݺ���
	 * 
	 * while(���ǽ�) {
	 * 		�����ڵ�;
	 * 		[������]
	 * }
	 */
	
	public void example1() {
		// 1~5���� ���
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void example2() {
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, 0 �Է� �� ������ ���� ����ϰ� ����
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = -1;
		
		while(input != 0) {
			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			
			if(a == 0) {
				input = 0;
			}
			
			sum += a;			
		}
		
		sc.close();
		
		System.out.println("�հ� : " + sum);
	}
	
	public void example4() {
		// �Է� �Ǵ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ����
		// (-1 �Է½� sum�� �������� �ʰ� �Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		boolean flag = true;
		while(flag) {
			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			
			if(a == -1) {
				flag = false;
			} else {				
				sum += a;			
			}
			
		}
		
		sc.close();
		
		System.out.println("�հ� : " + sum);
	}
	
	public void example5() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ���� 
		// (-1 �Է� �� sum�� �������� �ʰ� �Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �հ� ����� ���� 
		int input = 0; // �Է¹��� ���� ������ �ӽ� ����
		
		
		while(input != -1) {
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		sc.close();
		
		System.out.println("�հ� : " + sum);
	}
}
