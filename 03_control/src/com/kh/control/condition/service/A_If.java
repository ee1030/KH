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
	
}
