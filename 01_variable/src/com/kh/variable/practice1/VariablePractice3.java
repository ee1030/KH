package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		double H = sc.nextDouble();
		
		System.out.print("���� : ");
		double V = sc.nextDouble();
		
		double area = H * V;
		double round = (H + V) * 2;
		
		System.out.println("���� : " + area + "\n�ѷ� : " + round);
		
		sc.close();
	}
}
