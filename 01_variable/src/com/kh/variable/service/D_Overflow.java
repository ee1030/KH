package com.kh.variable.service;

public class D_Overflow {

	public void OverflowEx1() {
		// ���� �÷ο� : ������ ���� ó�� �� �ڷ����� ���� ������ �ʰ��ϴ� ���
		// �߻��ϴ� ����. �ִ밪 �ʰ� �� -> �ּҰ�, �ּҰ� �ʰ� �� -> �ִ밪
		// �ʱ�ȭ ���� ����
		
		byte bNum1 = 127; // byte �ִ밪
		
		byte bNum2 = (byte)(bNum1 + 1);
		
		// �����÷ο� ��ó�ϱ�
		int iNum = bNum1 + 1;
		
		System.out.println("bNum1  : " + bNum1); // 127
		System.out.println("bNum2  : " + bNum2); // Overflow -128
		System.out.println("iNum : " + iNum); // 128
		
	}
}
