package com.kh.operator.service;

import java.util.Scanner;

public class B_BinaryOperator {
	public void arithmeticOP() {
		// arithmetic : ���

		// ��� ������
		// ���� ��Ģ����(+, -, *, /)�� modulars ����(%)�� �߰��� ��
		// % : ������ ���� ������ �����κи�

		// �� ������ �Է� �޾� + - * / % ����� ����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
		System.out.println("���������� ��� : " + (num1 % num2));

		sc.close();
	}

	public void comparisonOp() {
		// Comparison : ��

		// �� ������(���� ������)
		// �� �ǿ����ڸ� ���Ͽ� �� ��(true, false)�� ��ȯ�ϴ� ������

		// * ��ȯ : ����� ����(����)����
		// a < b : a�� b �̸�? / b�� a �ʰ�?
		// a > b : a�� b �ʰ�? / b�� a �̸�?

		// a<= b : a�� b ����? / b�� a �̻�?
		// a >= b : a�� b �̻�? / b�� a ����?

		// a == b : a�� b�� ������?
		// a != b : a�� b�� �ٸ���?

		int num1 = 10;
		int num2 = 25;
		int num3 = 25;
		
		boolean result1, result2;
		// ���� �ڷ��� ���� ����� ���ٿ� ���޾� ���� �� �� �ִ�.
		// --> ���� �� ������� ����
		// �� �ٿ��� �ϳ��� �ǹ̸��� ������ �ۼ� �ϴ� ���� ���� ����
		
		result1 = num1 == num2; // false
 		result2 = num2 != num3; // false 

		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));

		System.out.println("num2 >= num3 : " + (num2 >= num3));
		System.out.println("num2 <= num3 : " + (num2 <= num3));
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result1 == result2 : " + (result1 == result2));
		
		// %, ==, != �̿��Ͽ�, Ȧ��, ¦��, ��� �Ǻ�
		num1 = 5;
		
		System.out.println("num1�� ¦���ΰ�? : " + (num1 % 2 == 0));
		System.out.println("num1�� Ȧ���ΰ�? : " + (num1 % 2 == 1));
		System.out.println("num1�� Ȧ���ΰ�? : " + (num1 % 2 != 0));
		
		System.out.println("num1�� 5�� ����ΰ�? : " + (num1 % 5 == 0));
	}
	
	public void logicalOp1() {
		// �� ������
		// - ���� �ΰ��� ���ϴ� ������
		
		// &&(AND) : �� �� true�� ���� true
		// -> �׸���, ~~�鼭, ~~�̸鼭, ~����, ~����, ~����
		
		// ||(OR) : �� �� false�� ���� false
		// -> �Ǵ�, ~�ų�, ~�̰ų�
		
		// �Է¹��� ������ 1 ~ 100 ���� �������� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		boolean result = input >= 1 && input <= 100;
		
		System.out.println(input + "��/�� 1~100 �� �ΰ�? : " + result);
		
		sc.close();
	}
	
	public void logicalOp2() {
		// �Է¹��� ���ĺ��� �빮��(A~Z)���� �˻�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
	
		boolean result = (ch >= 'A') && (ch <= 'Z');
		// char �ڷ����� ������ ���� �Ǵ� ���� �������̹Ƿ�
		// ���ڳ����� ���� �񱳰� �����ϴ�
		
		System.out.println(ch + "��/�� �빮�� �ΰ�? : " + result);
		
		sc.close();
	}
}
