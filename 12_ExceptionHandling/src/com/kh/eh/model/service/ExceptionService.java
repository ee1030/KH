package com.kh.eh.model.service;

import java.util.Scanner;

public class ExceptionService {
	
	/* ��Ÿ�� ���� : ���α׷� ���� �� �߻��ϴ� ����
	 * 
	 * ����(Exception) : �ҽ� �ڵ� �������� �ذ� ������ ����
	 * -> ��Ÿ�� ������ ���ܿ� ����
	 * 
	 *  + ���� ��Ȳ�� �ڵ� �ۼ� �� ������ �����ϹǷ�
	 *    ���ܸ� "���� ������ ����" ��� ��.
	 *    
	 *  ex) �迭�� ������ ����� ��Ȳ, ������ ����(������ 0)
	 * 
	 */
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Էµ� ���� �� ���� ���� �� ���ϱ�");
		
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
		
//		if(num2 == 0) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} else {
//			System.out.println("��� : " + num1/num2);			
//		}
		
		// try : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ��ϴ� ����
		// catch : 
		
	}

}

