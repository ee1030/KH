package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void InputTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �˷��ּ��� : ");
		String name = sc.nextLine(); // ���ڿ� ���� ����� ���ÿ� Ű���� �Է¹޾Ƽ� �ʱ�ȭ
		
		System.out.println("���� �̸���..." + name);
		sc.close();
	}
	
	public void InputTest2() {
		// ����� ������ �Է¹޾� �ѹ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� ���̴� " + age + "���̰�, Ű�� " + height + "cm�Դϴ�.");
		
		sc.close();
	}
	
	public void InputTest3() {
		// ������� �̸�, ����, �ּҸ� �Է¹޾� �� �ٷ� ����ϱ�
		// �̸� : ������
		// ���� : 28
		// �ּ� : �����ν� �ɰ�� 70
		// ��������� 28���̰�, �����ν� �ɰ�� 70�� ��� �ֽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		// �Է� ���ۿ� �����ִ� ���๮�� �����ϱ�
		sc.nextLine(); // ���ۿ� �����ִ� ���๮�ڸ� �о�� ������ ȿ��
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.println(name + "���� " + age + "���̰�, " + address + "�� ��� �ֽ��ϴ�.");
		
		sc.close();
	}
}
