package com.kh.oop.ch6_method.service;

import java.util.Arrays;
import java.util.Scanner;

public class MethodService {
	// �� ������ �Է¹ް�
	// ���� �޴� �� �ϳ��� �����ؼ� �ش� ����� ��ȯ�޾� ���

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. �� �� ������ ��� ���� �迭�� ��ȯ�ޱ�");
		
		System.out.print("��ȣ ���� : ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 : System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));break;
		case 2 : System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));break;
		case 3 : System.out.println(Arrays.toString(array(num1, num2)));break;
		}
	}
	
	// �� ���� ���� �޾� ���� ���� ��ȯ
	// [����������] [�����] [��ȯ��] �޼ҵ��([�Ű�����]){}
	public int add(int num1, int num2) {
		// �Ű������� ���� �ް��� �ϴ� �������� ������ �ڷ����� �߿��ϴ�!
		// �������� �߿����� �ʴ�.(�˾ƺ����� ������ ��)
		int result = num1 + num2;
		return result; // �ش� �޼��带 ȣ���� �κ����� ���ư��� �ϴ� ����
					   // ��ȯ���� void�� �ƴ� ��� ��ȯ���� ������ ���ư�
	}

	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public int[] array(int n1, int n2) {
		int[] result = new int[n2 - n1 +1];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = n1++;
		}
		return result;
	}
	
	public static int staticMethod(int[] arr) {
		// ���޹��� �迭 ���� �ִ� �������� �� ��ȯ
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
}
