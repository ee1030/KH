package com.kh.operator.service;

public class A_SingleOperator {
	public void logicalNegationOp() {
		// �� ���� ������ : !
		// ����(true / false)�� �ݴ�� �ٲ��ִ� ������
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
	}
	
	public void increaseOp() {
		// ���� ������ : ++
		// �ǿ����ڸ� 1�� ���� ��Ű�� ������
		
		// ++(�ǿ�����) : ���� ���� ������
		// ���� �ǿ����ڸ� ������Ų �� �������� ����
		
		// (�ǿ�����)++ : ���� ���� ������
		// �ٸ� ���� ���� �� �ǿ����ڸ� ������Ŵ
		
		int num1 = 10;
		
		// ���� ��������
		System.out.println("----- ���� ���� ������ -----");
		System.out.println("�ʱⰪ : " + num1); // 10
		System.out.println(" ++num1 1ȸ ���� : " + ++num1); // 11
		System.out.println(" ++num1 2ȸ ���� : " + ++num1); // 12
		System.out.println(" ++num1 3ȸ ���� : " + ++num1); // 13
		System.out.println(" ++num1 4ȸ ���� : " + ++num1); // 14
		System.out.println(" ++num1 5ȸ ���� : " + ++num1); // 15
		System.out.println(" ������ : " + num1); // 15
		
		// ���� ����
		int num2 = 10;
		
		System.out.println("----- ���� ���� ������ -----");
		System.out.println("�ʱⰪ : " + num2); // 10
		System.out.println(" num2++ 1ȸ ���� : " + num2++); // 10
		System.out.println(" num2++ 2ȸ ���� : " + num2++); // 11
		System.out.println(" num2++ 3ȸ ���� : " + num2++); // 12
		System.out.println(" num2++ 4ȸ ���� : " + num2++); // 13
		System.out.println(" num2++ 5ȸ ���� : " + num2++); // 14
		System.out.println(" ������ : " + num2); // 15
	}
	
	public void practice1() {
		int num = 20;
		int result = num++ * 3 + ++num;
		System.out.println("result : " + result); // 82
		System.out.println("num : " + num); // 22
	}
}
