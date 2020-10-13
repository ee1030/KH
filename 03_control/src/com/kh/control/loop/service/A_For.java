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
	
	public void example9() {
		// 1 ~ 20 ������ ������ ������ �߻�����
		// 1���� �߻��� ������ �������� ���� ���
		
		int randNum;
		int sum = 0;
		
		randNum = (int)(Math.random() * 20 + 1);
		for(int i=1; i<=randNum; i++) {
			sum += i;
		}
		
		System.out.println("�߻��� ���� : " + randNum + "\n�հ� : " + sum);
	}
	
	public void example10() {
		// ���� �� ���� �Է¹޾�
		// �� ���� ������ ��� ������ ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		if(num1 > num2) {
			int tmp;
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println(num1 + "�� " + num2 + "������ ��� ������ �� : " + sum);
	}
	
	// ====================================================================================
	
	// ��ø for��
	
	public void example11() {
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void example12() {
		// ��, �� ����ϱ�
		// 0�� 0�� ~ 59�� 59��
		for(int min = 0; min < 60; min++) {
			for(int sec=0; sec<60; sec++) {
				System.out.println(min + "�� " + sec + "��");
				try {
					Thread.sleep(1000);
				} catch(Exception e) {}
			}
		}
	}
	
	public void example13() {
		// 2�ܺ��� 9�ܱ��� ������ ��� ���
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void example14() {
		// 2�ܺ��� 9�ܱ��� ������ �Ųٷ� ���
		
		for(int i=9; i>=2; i--) {
			for(int j=9; j>=1; j--) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void example15() {
		// ���� �Է� : 5
		// 1
		// 12
		// 123
		// 1234
		// 12345
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void example16() {
		// ���� �Է� : 5
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 10 11 12 13 14
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 1;
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	public void example17() {
		// �� �ٿ� ��ǥ���ڸ� �Էµ� �� ���� ĭ ����ŭ ���
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
}
