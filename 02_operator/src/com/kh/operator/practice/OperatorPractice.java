package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "�����" : "����� �ƴϴ�.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "�����" : (input == 0) ? "0�̴�." : "������";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (candy/people) + "\n���� ���� ����" + (candy%people));
		
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int studentNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� : ");
		double record = sc.nextDouble();
		
		String genderResult = (gender == 'M') ? "���л�" : "���л�"; 
		
		System.out.println(grade + "�г� " + group + "�� " + studentNum + "�� " + name + genderResult +
				"�� " + "������" + record + "�̴�."); 
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "���" : (age <= 19) ? "û�ҳ�" : "����";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String result = (kor >= 40 && eng >= 40 && math >=40 && avg >= 60.0) ? "�հ�" : "���հ�";
		
		System.out.println("�հ� : " + sum + "\n��� : " + avg + "\n" + result);
		
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ�� �Է��ϼ���(- ����) : ");
		char idNum = sc.nextLine().charAt(7);
		
		String result = (idNum == '1') ? "����" : "����";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num = sc.nextInt();
		
		boolean result = num <= num1 || num > num2;
		
		System.out.println(result);
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int A = sc.nextInt();
		System.out.print("B����� ���� : ");
		int B = sc.nextInt();
		System.out.print("C����� ���� : ");
		int C = sc.nextInt();
		
		double aResult = A + (A*0.4);
		double bResult = B;
		double cResult = C + (C*0.15);
		
		String aIncentiveResult = (aResult >= 3000) ? "3000 �̻�" : "3000 �̸�";
		String bIncentiveResult = (bResult >= 3000) ? "3000 �̻�" : "3000 �̸�";
		String cIncentiveResult = (cResult >= 3000) ? "3000 �̻�" : "3000 �̸�";
		
		System.out.println("A����� ����/����+a : " + A + "/" + aResult + "\n" + aIncentiveResult);
		System.out.println("B����� ����/����+a : " + B + "/" + bResult + "\n" + bIncentiveResult);
		System.out.println("C����� ����/����+a : " + C + "/" + cResult + "\n" + cIncentiveResult);
		
		sc.close();
	}
}
