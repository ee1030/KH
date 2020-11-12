package com.kh.eh.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.eh.model.exception.InputZeroException;

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
		
		// try{} : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ���{} ���� �ۼ��ϰ� �õ��ϴ� ����
		// catch{} : try �������� �߻��� ���ܸ� ��Ƴ��� ó���ϴ� ����
		
		try {
			System.out.println("��� : " + num1/num2);
		} catch(ArithmeticException e) {
			// try ���� ������ ArithmeticException�� �߻��� ���
			// catch�� �ۼ��� �Ű������� �ش� ���ܸ� ����.
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
	}
	
	public void example2() {
		// String �迭�� ����� �� ��ҵ��� ���� �ձ��ڸ� ����ϱ�
		String[] arr = new String[3];
		
		arr[0] = "���̽� �Ƹ޸�ī��";
		arr[1] = "ī�� ��";
		
		for(int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i].charAt(0));
			} catch(NullPointerException e) {
				// NullPointerException : �����ϰ� �ִ� ��, ��ü�� ���� ���� ��Ȳ
				System.out.println(i + "��° �ε����� ������ ���� �����ϴ�.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ���̸� �ʰ��Ͽ� �����߽��ϴ�.");
			}
			
		}
	}
	
	public void example3() {
		String[] arr = new String[3];
		
		arr[0] = "���̽� �Ƹ޸�ī��";
		arr[1] = "ī�� ��";
		
		for(int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i].charAt(0));
			} 
			
			catch(NullPointerException e) {
				System.out.println(i + "��° �ε����� ������ ���� �����ϴ�.");
			} 
			
			catch(Exception e) {
				// Exception : ��� ������ �ֻ��� �θ�
				System.out.println("���� ������ ���� �� �߻��޴�.");
			} 
			
			// catch ������ ������ �ۼ��� ���
			// try �������� �߻��� ���ܸ�
			// �ۼ��� catch�� ������� �񱳸� ������
			// --> �Ű������� �´� catch�� �ִ�!
			// --> �ش� catch���� ���� ����ó�� ����.
			
			// �߻��Ǵ� ���ܵ鵵 �ᱹ���� Ŭ�����̰� ��� ������ ����.
			// --> ����� �Ǹ�? �������� �ȴ�.
			// --> �θ� Ÿ���� ���� �������� = �ڽ� ���ܰ�ü ����
		}
	}
	
	public void example4() {
		// �޴� ��ȣ�� �Է� ���� �� ���ڸ� �Է��ϴ� ��� ó��
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		do {
			
			System.out.println("1. example1() ȣ��");
			System.out.println("2. example2() ȣ��");
			System.out.println("3. example3() ȣ��");
			System.out.println("0. ����");
			System.out.print("�޴����� >>");
			try {
				sel = sc.nextInt(); // ���� �߻� ����
				// ����ó�� ������ �ϴ� ���� �߿��� ����!
				// -> ���α׷��� ������ ���Ḧ ���� ��
				switch(sel) {
				case 1: example1(); break;
				case 2: example2(); break;
				case 3: example3(); break;
				case 0: System.out.println("���α׷� ����"); break;
				default : System.out.println("1,2,3,0 �� �Է����ּ���.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1;
				sc.nextLine();
			}
		} while(sel != 0);
	}

	public void example5() {
		// finally : try - catch ���� ���� �� ���������� �ݵ�� �����ؾ��ϴ� �ڵ带 �ۼ��ϴ� ����
		// try �������� ���ܰ� �߻� �ϵ� ���� ������������ �������� �����
		
		// ���� 2�븦 �Է� �޾� ������ ���� ����ϴ� ���α׷�
		
		// �߻��� �� �ִ� ���� : 0���� ������ ��, ������ �ƴ� ���� �Է����� ��
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("���� 1 �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("���� 2 �Է� : ");
			int num2 = sc.nextInt();
			
			System.out.println("������ ��� : " + num1/num2);
			
			throw new Exception();
		} 
		
		catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
			e.printStackTrace(); // ���ܰ� �߻��� ��� ����� �� ��ȣ�� ���
		} 
		
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	
		finally {
			System.out.println("���α׷� ����.");
		}
		
	}
	
	// -----------------------------------------------------------------------------------------
	
	/* throws : ���� �߻� �� �߻��� ���ܸ� ���� ó������ �ʰ�
	 * 			���ܰ� �߻��� �޼ҵ带 ȣ���� �κ����� ����
	 * 
	 */
	
	public void example6() {
		System.out.println("6 ȣ���.");
		try {
			example6_1();
		}
		
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		catch (NullPointerException e) {
			System.out.println("Null�� �����߽� ��");
		}
	}
	
	public void example6_1() throws ArithmeticException, NullPointerException {
		System.out.println("6_1 ȣ���.");
		example6_2();
	}
	
	public void example6_2() throws ArithmeticException, NullPointerException {
		System.out.println("6_2 ȣ���.");
		example6_3();
	}
	
	public void example6_3() throws ArithmeticException {
		System.out.println("6_3 ȣ���.");
		
		// int num = 2 / 0;
		// ArithmeticException : / by zero
		
		// ���ܸ� ������ �߻����� ������ ���� ������ ���� ������ ���� ������ ���� �������� ���� ����!
		throw new NullPointerException();
		// NullPointerException�� RuntimeException�� �ļ�����
		// UncheckedException �з��� ���ԵǾ�
		// ������ ����ó���� ��� �ȴ�.
		
		// throw new InputZeroException();
		// InputZeroException Ŭ����ó��
		// RuntimeException�� �ƴ� �ٸ� ���� Ŭ������ ����� Ŭ��������
		// ��� CheckedException �з��� ���ԵǾ�
		// �ݵ�� ���� ó���� �ʿ��ϴ�.
	}
	
	public void example7() {
		// ����� ���� ����
		// �ڹ� API���� �����ϴ� ���� Ŭ���������δ� ó���� �� ���� ���ܰ� ���� ���
		// ������� �ʿ信 ���� �����ϴ� ���� Ŭ����
		try {
			System.out.println("���α׷� ����");
			
			sumMethod();
			
			System.out.println("���α׷� ���� ����");
		} catch(InputZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("������ ����");
			//e.printStackTrace();
		}
	}

	public void sumMethod() throws InputZeroException {
		// ���� 3���� �Է¹޾� ���� ����ϴ� �޼ҵ�
		// ��, �߰��� 0�� �Է��ϸ� ���� ��µ��� �ʰ� ������ ����
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("�Է� " + i + " : ");		
			int num = sc.nextInt();
			if(num == 0) {
				throw new InputZeroException("0 �Է����� ����...�Է����� �����ߴ�...");
			}
			sum += num;
		}		
		System.out.println("�հ� : " + sum);
	}
}

