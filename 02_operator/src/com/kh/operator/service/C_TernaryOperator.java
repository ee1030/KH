package com.kh.operator.service;

import java.util.Scanner;

public class C_TernaryOperator {

	// ���� ������
	// (���ǽ�) ? ��1 : ��2
	// - ���ǽ� ����� true�� ��� ��1 ���� false�� ��� ��2 ����
	
	public void example1() {
		// ���� �ϳ��� �Է� �޾� �������, ����� �ƴ��� �˻�
		// ����� ��� "����Դϴ�.", ����� �ƴҰ�� "����� �ƴմϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "����Դϴ�." : "����� �ƴմϴ�.";
		System.out.println(input + "��/�� " + result);
		
		sc.close();
	}
}
