package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void SubjectSumAndAvg() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double korean = sc.nextDouble();
		
		System.out.print("���� : ");
		double english = sc.nextDouble();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		System.out.println("���� : " + (int)(korean + english + math) +
				"\n��� : " + (int)(korean + english + math)/3);
		
		sc.close();
	}
}
