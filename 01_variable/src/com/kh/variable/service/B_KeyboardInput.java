package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void InputTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �˷��ּ��� : ");
		String name = sc.nextLine(); // ���ڿ� ���� ����� ���ÿ� Ű���� �Է¹޾Ƽ� �ʱ�ȭ
		
		System.out.println("���� �̸���..." + name);
	}
	
}
