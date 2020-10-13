package com.kh.control.loop.service;

import java.util.Scanner;

public class A_For {
//	1. for��(���� for��)
//	
//	for(�ʱ��; ���ǽ�; ������) {
//		����� �ڵ�;
//	}
//	
//	- �ʱ�� : for�� ���ο��� ����� ������ ������ �� �ִ� �κ�
//				-> ���� �ݺ��� ��� ���� ������ ������.
//				
//	- ���ǽ� : �� ���� ��ȯ�Ǵ� ���� �ۼ�.
//	true�� ��� : �ݺ�����
//	false�� ��� : �ݺ��� ����
//	
//	- ������ : 1ȸ �ݺ� ���� �� ���� ����� ������ �ۼ�.
//				-> ���� �ʱ���� ���� �Ǵ� ���ҽ��� ���� ������ ����� �뵵�� ���.
	
	public void example1() {
		// 1���� 5���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void example2() {
		// 5���� 1���� ���
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public void example3() {
		// 1 ~ 10���� 0.5�� �����ϸ鼭 ���
		for(double i = 1; i <= 10; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void example4() {
		// A ~ Z���� ���
		for(char ch = 'A'; ch <= 'Z';  ch++) {
			System.out.print(ch);
		}
	}
	
	public void example5() {
		// 1 ~ 10 ������ ���� �� Ȧ���� ���
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n======================");
		
		for(int i=0; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void example6() {
		// �Ǽ��� 3�� �Է¹޾� �հ�, ����� ���
		Scanner sc = new Scanner(System.in);
		
		// �հ� ���ϱ�
		double sum = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.print(i + "��° �Ǽ��� �Է��ϼ��� : ");
			sum += sc.nextDouble();
		}
		
		System.out.println("�հ� : " + sum + "\n��� : " + (sum/3));
		sc.close();
	}
	
	public void example7() {
		// ���� �ϳ��� �Է� �޾�
		// �ش� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		sc.close();
		
		if(dan > 1 && dan <= 9) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void example8() {
		// 1 ~ 10���� ������ ��(����) 5���� ����ϰ�, �հ� ����ϱ�
		
		/*
		 * java.lang.math.random()
		 * - �ڹٿ��� ���� ���� ����� �����ϴ� Math Ŭ������ �޼ҵ� �� �ϳ�
		 * - ���� �߻� ���� : 0.0 <= random <= 1.0(double)
		 */
		
		// java.lang ��Ű���� �ڹ��� �⺻��Ű��
		// �����Ͻ� �ڵ����� import�� �߰���
		// -> java.lang�� �����ִ� Ŭ������ ������ import�� �ۼ����� �ʾƵ� �ȴ�.
		
		int randNum;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			randNum = (int)(Math.random() * 10 + 1);
			sum += randNum;
			System.out.println(i + "��° ���� : " + randNum);
		}
		
		System.out.println("�հ� : " + sum);
	}
}
