package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " 
		+ gender + "�� " + name + "�� �ݰ����ϴ� ^^");
		
		sc.close();
	}
}
