package com.kh.control.condition.service;

import java.util.Scanner;

public class A_If {

	/*
	 * ���α׷��� ����� �ؼ��� �⺻������ �� -> �Ʒ�, ���� -> ���������� ���������� �ؼ��� ��. 
	 * �̷��� �ؼ� ������ �����ϴ� ���� ����̶�� �Ѵ�. 
	 * <���ǹ�>
	 *  - ���ǽ��� ���� �� �Ǵ� ������ �Ǵ��Ͽ� 
	 *    ������ �����ϴ� ��� �ش� �ڵ带 �����ϴ� ���
	 *    (���� �����ڵ� ����̴�)
	 *    
	 */
	
	public void example1() {
		// ���� �ϳ��� �Է� �޾� ���, ����, 0�� �Ǻ��Ͽ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("����Դϴ�.");
		}
		
		if(input == 0) {
			System.out.println("0�Դϴ�.");
		}
		
		if(input < 0) {
			System.out.println("�����Դϴ�.");
		}
		
		sc.close();
	}
	
	public void example2() {
		// if - else��
		/*
		 * if(���ǽ�) {
		 * 	true�� �� ����
		 * } else {
		 * 	false�� �� ����
		 * }
		 */
		
		// ���� �ϳ��� �Է� �޾� ¦��, Ȧ�� �˻�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input % 2 == 1) {
			System.out.println("Ȧ�� �Դϴ�.");
		} else {
			System.out.println("¦�� �Դϴ�.");
		}
		
		sc.close();
	}
	
	public void example3() {
		// 1 ~ 12 ������ ���ڸ� �Է� �޾� 
		// �ش� ���� ������ ����ϼ���
		// ��, 1 ~ 12���� ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ����ϱ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 ���� ���ڸ� �Է��� �ּ��� : ");
		int month = sc.nextInt();
		String season = null;
		
		if(month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
		} else if(month >= 3 && month <= 5) {
			season = "��";
		} else if(month >= 6 && month <= 8) {
			season = "����";
		} else if(month >= 9 && month <= 11) {
			season = "����";
		} else {
			season = "�߸� �Է� �ϼ̽��ϴ�.";
		}
		
		System.out.println(season);
		
		sc.close();
	}
	
	public void example4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		String result = null;
		
		if(age <= 13) {
			result = "���";
		} else if(age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		
		// ���� ���ǹ��� �������� ���ϴ� ���
		// �Ʒ��� ���ǹ� �˻� �������� ���ܵ�
		
		System.out.println(result);
		sc.close();
	}
	
	public void example5() {
		// ���� �Է� ���, û�ҳ�, ���� �����ϰ� ���� ������ 0~120����
		// ���� �ܿ� �߸� �Է��ϼ̽��ϴ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		String result = null;
		
		if(age >= 0 && age <= 120) {
			if(age <= 13) {
				result = "���";
			} else if(age <= 19) {
				result = "û�ҳ�";
			} else {
				result = "����";
			}
		} else {
			result = "�߸� �Է� �ϼ̽��ϴ�.";
		}

		System.out.println(result);
		sc.close();
	}
	
	public void example6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		String result = null;
		
		if( age < 0 || age > 120) {
			result = "�߸� �Է� �ϼ̽��ϴ�.";
		} else if(age <= 13) {
			result = "���";
		} else if(age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		
		// ���� ���ǹ��� �������� ���ϴ� ���
		// �Ʒ��� ���ǹ� �˻� �������� ���ܵ�
		
		System.out.println(result);
		sc.close();
	}
	
	public void example7() {
		// �̸��� �Է��Ͽ� �������� Ȯ���ϱ�
		
		// �̸��� �Է��ϼ��� : ������
		// �����Դϴ�.
		
		// �̸��� �Է��ϼ��� : ȫ�浿
		// ������ �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		sc.close();
		
		if(name.equals("������")) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}
