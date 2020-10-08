package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int p = num1 + num2;
		int m = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("더하기 결과 : " + p + "\n빼기 결과 : " + m
				+ "\n곱하기 결과 : " + mul + "\n나누기 몫 결과 : " + div);
		
		sc.close();
	}
}
