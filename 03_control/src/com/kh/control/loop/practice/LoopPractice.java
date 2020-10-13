package com.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for(int i=1; i<=input; i++) {			
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for(int i=input; i>=1; i--) {			
				System.out.print(i + " ");
			}
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			if(i == input) {
				System.out.print(i);
				sum += i;				
			} else {				
				System.out.print(i + " + ");
				sum += i;				
			}
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		for(int i=num1; i<=num2; i++) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
				break;
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		System.out.println("===== " + input + "�� =====");
		
		for(int i=1; i<=9; i++) {
			System.out.println(input + " * " + i + " = " + input * i);
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input > 9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} else {			
			for(int i = input; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");
				for(int j = 1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + i * i);
				}
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = input; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i%2 == 0 || i%3 == 0) {
				if(i%2 == 0 && i%3 == 0) {
					count++;
				}
				System.out.print(i + " ");
			}
		}
		System.out.println("\ncount : " + count);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= (input-i); j++) {
				System.out.print(" ");
			}
			
			count++;
			
			for(int k = 0; k < count; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		
		if(count <= input) {
			for(int i = 1; i<=input; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
				count++;
			}
		}
		
		if(count >= 0){
			for(int i = (count-1); i >= 1; i--) {
				for(int j = i; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
				count--;
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			for(int j = 1; j<=input-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i<input; i++) {
			if(i == 0 || i == (input-1)) {
				for(int j=0; j<input; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for(int j=0; j<input-2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
