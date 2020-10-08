package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public void CastingCharToInt() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¹®ÀÚ : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch + "unicode : " + (int)ch);
		
		sc.close();
	}
}
