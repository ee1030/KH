package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int p = num1 + num2;
		int m = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("���ϱ� ��� : " + p + "\n���� ��� : " + m
				+ "\n���ϱ� ��� : " + mul + "\n������ �� ��� : " + div);
		
		sc.close();
	}
}
