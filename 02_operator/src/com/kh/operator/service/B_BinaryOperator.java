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
		
		System.out.println("���ϱ� ��� : " + (num1+num2));
		System.out.println("���� ��� : " + (num1-num2));
		System.out.println("���ϱ� ��� : " + (num1*num2));
		System.out.println("������ ��� : " + (num1/num2));
		System.out.println("���������� ��� : " + (num1%num2));
		
		sc.close();
	}
}
