package com.kh.control.condition.service;

import java.util.Scanner;

public class B_Switch {

	// switch��
	// - if���� ���� ���ǹ�������
	// if���� �޸� ���ǽ��� ������ ������ �� ����
	//	 (== ���ǽ��� ����� �� �������� ���̿����Ѵ�.)
	
	// - ���ǽ��� ����� �� ���� �ƴϾ ��� �� �� ����.
	
	// - ���� �� : ���� �������� ��
	// - case �������� break : ���� switch�� ���ӵǼ� �ؼ��Ǵ� ���� ����
	// switch(���� �� �����) {
	// 		case ��1 : �����ڵ�1; break;
	// 		case ��2 : �����ڵ�2; break;
	// 		default : ��� case�� ��ġ���� ���� ��� �����ϴ� �ڵ�;
	// } 
	
	public void example1() {
		// 1�� �Է��ϸ� "������" ���
		// 2�� �Է��ϸ� "�����" ���
		// 3�� �Է��ϸ� "�ʷϺ�" ���
		// �ٸ����� �Է��ϸ� "�߸� �Է� �ϼ̽��ϴ�." ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		String result = null;
		
		switch(input) {
		
		case 1: 
			result = "������";
			break;
			
		case 2:
			result = "�����";
			break;
			
		case 3:
			result = "�ʷϺ�";
			break;
			
		default:
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		System.out.println(result);
		sc.close();
	}
	
	public void example2() {
		// ���� �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է� : ");
		char operator = sc.nextLine().charAt(0);
		
		sc.close();
		
		int result = 0;
		
		switch(operator) {
		case '+' : 
			result = num1 + num2;
			break;
			
		case '-' :
			result = num1 - num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			result = num1 / num2;
			break;
			
		case '%' :
			result = num1 % num2;
			break;
			
		default :
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
	
	public void example3() {
		// ��޺� ���� �ο�
		// ������	: ��ȸ �ۼ� ����
		// ȸ��		: ��ȸ �ۼ�
		// ��ȸ��	: ��ȸ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� : ");
		String grade = sc.nextLine();
		
		sc.close();
		
		switch(grade) {
		case "������" : 
			System.out.println("����");
		case "ȸ��" :
			System.out.println("�ۼ�");
		case "��ȸ��" :
			System.out.println("��ȸ");
			break;
		default :
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
	}
}
