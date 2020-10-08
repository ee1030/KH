package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void SubjectSumAndAvg() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double korean = sc.nextDouble();
		
		System.out.print("¿µ¾î : ");
		double english = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		double math = sc.nextDouble();
		
		System.out.println("ÃÑÁ¡ : " + (int)(korean + english + math) +
				"\nÆò±Õ : " + (int)(korean + english + math)/3);
		
		sc.close();
	}
}
