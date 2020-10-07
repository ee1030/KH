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
		boolean isTrue;
		
		// 2. ������
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte, ���� �⺻��
		long lNum; // 8byte
		
		// 3. �Ǽ���
		float fNum; // 4byte
		double dNum; // 8byte, �Ǽ� �⺻��
		
		// 4. ������
		char ch;
		
		// 5. ���ڿ�
		String str;
		// ���� �����͸� �������� �ʰ� �����Ͱ� ����� �ּҸ� �����Ѵ�.
	}
}
