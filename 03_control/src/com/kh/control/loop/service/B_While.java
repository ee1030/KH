package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {

	/*
	 * while��
	 * 
	 * - for���� �޸� ���� ������ ��Ȯ���� ��쿡 ����ϴ� �ݺ���
	 * 
	 * while(���ǽ�) {
	 * 		�����ڵ�;
	 * 		[������]
	 * }
	 */
	
	public void example1() {
		// 1~5���� ���
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void example2() {
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, 0 �Է� �� ������ ���� ����ϰ� ����
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = -1;
		
		while(input != 0) {
			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			
			if(a == 0) {
				input = 0;
			}
			
			sum += a;			
		}		
		System.out.println("�հ� : " + sum);
	}
	
	public void example4() {
		// �Է� �Ǵ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ����
		// (-1 �Է½� sum�� �������� �ʰ� �Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		boolean flag = true;
		while(flag) {
			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			
			if(a == -1) {
				flag = false;
			} else {				
				sum += a;			
			}
			
		}
		System.out.println("�հ� : " + sum);
	}
	
	public void example5() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ���� 
		// (-1 �Է� �� sum�� �������� �ʰ� �Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �հ� ����� ���� 
		int input = 0; // �Է¹��� ���� ������ �ӽ� ����
		
		
		while(input != -1) {
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	public void example6() {
		// while + switch�� �̿��� �޴� ����
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0; // �Է¹��� ������ ������ �ӽ� ����
		
		while(sel != 9) {
			System.out.println("1. ����1");
			System.out.println("2. ����2");
			System.out.println("3. ����3");
			System.out.println("4. ����4");
			System.out.println("5. ����5");
			System.out.println("9. ����");
			
			System.out.print("�޴� �Է� : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			
			switch(sel) {
			case 1 : example1(); break;
			case 2 : example2(); break;
			case 3 : example3(); break;
			case 4 : example4(); break;
			case 5 : example5(); break;
			case 9 : System.out.println("���α׷� ����"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		sc.close();
	}
	
	public void example7() {
		// do ~ while + switch�� �̿��� �޴� ����
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 9; // �Է¹��� ������ ������ �ӽ� ����
		
		do {
			System.out.println("1. ����1");
			System.out.println("2. ����2");
			System.out.println("3. ����3");
			System.out.println("4. ����4");
			System.out.println("5. ����5");
			System.out.println("9. ����");
			
			System.out.print("�޴� �Է� : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1 : example1(); break;
			case 2 : example2(); break;
			case 3 : example3(); break;
			case 4 : example4(); break;
			case 5 : example5(); break;
			case 9 : System.out.println("���α׷� ����"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(sel != 9);
		
		sc.close();
	}
	
	public void example8() {
		// �Էµ� ���ڿ��� ��� �����ؼ� ����ϱ�
		// ��, "exit" �Է� �� ���� ����
		
		// ex) 
		// �Է� : Hello
		// �Է� : World
		// �Է� : exit
		// �Էµ� ���ڿ� HelloWordl
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		String tmp = null;
		
		do {
			System.out.print("�Է� : ");
			tmp = sc.nextLine();
			if(!tmp.equals("exit")) {
				str += tmp;
			}
		} while(!tmp.equals("exit"));
		
		System.out.println(str);
	}
}
