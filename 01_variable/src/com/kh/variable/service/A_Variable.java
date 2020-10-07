package com.kh.variable.service;

public class A_Variable {

	public void noVariable() {
		System.out.println("----- ������� X -----");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	}
	
	public void usingVariable() {
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		System.out.println("----- ������� O -----");
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}
	
	public void declareVariable() {
		
		// 1. ����
		boolean isTrue; // 1byte
		isTrue = true;
		// isTrue : ������
		// '=' : ���� �����ڷμ� ������ data�� ���� ������ �����Ѵٴ� �ǹ�
		// true : ���ͷ�
		
		// 2. ������
		byte bNum; // 1byte
		bNum = 100;
		short sNum; // 2byte
		sNum = 10000;
		// byte, short�� int�� ���ͷ� ǥ����� �����.
		// ��? byte, short�� �ٸ� ���α׷��� ������ ȣȯ�� ���� �ʿ��� �ڷ���
		// Java������ �ڵ� �ۼ��� ����� ���� ���� �ڷ����̴�. --> ������ ���ͷ� ǥ����� �������� �ʴ´�.
		
		int iNum; // 4byte, ���� �⺻��
		iNum = 1000000000; // 10��
		iNum = 1_000_000_000; // '_'�� �̿��Ͽ� �ڸ� �� ���� ����
		
		long lNum; // 8byte
		lNum = 10000000000L; // 100��
		// (���ڵ�)L �Ǵ� l : long�� ���ͷ� ǥ���
		// ������ �ڷ����� ���� ���ͷ� ǥ����� ������
		
		
		// 3. �Ǽ���
		float fNum; // 4byte
		fNum = 3.141592f;
		double dNum; // 8byte, �Ǽ� �⺻��
		dNum = 3.141592;
		
		// 4. ������
		char ch;
		ch = 'A';
		ch = 65;
		ch = '\u0041';
		// char�� ���ͷ� ǥ��� : ''
		
		// 5. ���ڿ�
		String str;
		str = "�ȳ��ϼ���?";
		// ���� �����͸� �������� �ʰ� �����Ͱ� ����� �ּҸ� �����Ѵ�.
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		int iNum2 = 200;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		System.out.println("iNum2 : " + iNum2);
		
		// ��� ���� �� �ʱ�ȭ
		System.out.println("----- ��� -----");
		
		int age = 28;
		System.out.println("age : " + age); // 28
		
		age = 29;
		System.out.println("age : " + age); // 29
		
		// ������� ��� �빮��, ����� �ܾ�� '_'�� ����
		final int AGE = 28;
		System.out.println("age : " + age); // 28
		
		// AGE = 29; // ����� �ʱ�ȭ �� ���� ������ �� ���� ������ �����߻�
	}
}
