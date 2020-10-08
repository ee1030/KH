package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice() {
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double H = sc.nextDouble();
		
		System.out.print("세로 : ");
		double V = sc.nextDouble();
		
		double area = H * V;
		double round = (H + V) * 2;
		
		System.out.println("면적 : " + area + "\n둘레 : " + round);
		
		sc.close();
	}
}
