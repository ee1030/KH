package com.kh.basic;

public class B_PrintExample {
	
	public void printEx1() {
		//print(), println() ����
		System.out.print("���ڿ� ���");
		System.out.println("���õ� ȭ���� �Դϴ�^^");
		System.out.print("����Ŀ�");
		System.out.println("���� ������?");
		System.out.println();
		System.out.println("�ұ��� �������?");
	}
	
	public void printEx2() {
		// ����, ���� ���� ���
		System.out.println("----- ���� 123 ��� -----");
		System.out.println("123"); // ���ڿ� 123
		System.out.println(123); // ���� 123
		
		System.out.println("----- ���� ���� -----");
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		System.out.println(10 - 100); // -90
		System.out.println(7 * 7); // 49
		System.out.println(7 / 7); // 1
		System.out.println(3 % 2); // 1
		System.out.println(100 == 90); // false
	}
	
	public void printEx3() {
		// ���ڿ� + ���ڿ�
		// ����  + ���ڿ�
		
		System.out.println("----- ���ڿ� + ���ڿ� -----");
		System.out.println("�ȳ�? " + "�ݰ���!"); // �ȳ�? �ݰ���?
	}
}
