package com.kh.control.branch.practice;

import java.util.Scanner;

public class BranchPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(true) { // while ���ǽ��� true�� �����ν� ���ѷ��� ����
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			input = sc.nextInt();
			
			if(input < 1) { 
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				// ���ǹ����� input���� 1���� ������� �����޽��� ���
			} else {
				for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
					// 1���� ū ��� 1���� input���� �ݺ��Ͽ� ���
				}
				break; // �ݺ����� ������ ���̻� while���� �ݺ����� �ʵ��� break���� �̿��Ͽ� Ż���Ѵ�.
			}
		}	
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(true) { // ���������� while���� �̿� ���ѷ��� ����
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			input = sc.nextInt();
			
			if(input < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���."); // �����޽���
			} else {
				for(int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break; // 1������ �������� ����ϰ� �ݺ��� ����� while�� Ż��
			}
		}		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.print("ù ��° ���� : ");
			num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			num2 = sc.nextInt();
			
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			} // ù��° ���ڰ� �ι�° ���ں��� Ŭ ��� �� ���� swap
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				// �� ������ �ϳ��� 1 �̸��� ��� ���� �޽��� ���
			} else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					// �̿��� ��쿡�� num1 ���� num2���� 1�� ������Ű�� ���
				}
				break; // �ݺ��� ����� ���ѷ��� Ż��
			}
		}
	}
	
	public void practice4() {
		// ������ ��� with ���ѷ���
		Scanner sc = new Scanner(System.in);
		
		while(true) { // ����Ǹ� �˾ƾ���
			System.out.print("���� : ");
			int input = sc.nextInt();
			
			if(input > 9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���."); 
				// ���� �޽��� ���
			} else {			
				for(int i = input; i <= 9; i++) { 
					System.out.println("===== " + i + "�� =====");
					for(int j = 1; j<=9; j++) {
						System.out.println(i + " * " + j + " = " + i * i);
					}
					// �̿��� ��쿡�� �Է¹��� �ܺ��� 9�ܱ����� ��� �������� ���
				}
				break; // �ݺ��� ����� ���ѷ��� Ż��
			}
		}
	}
	
	public void practice5() {
		// ���� ���ں��� ������ ���ذ��� ���
		// �� 10���� ���ڸ� ��� �Ǿ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int startNum = sc.nextInt();
		System.out.print("���� : ");
		int bubbleTea = sc.nextInt();
		
		int count = 0; // ���� ������ ��� ���� ���ؼ� �ʿ��� �ӽ� ���� ����
		
		for(int i = startNum; ; i += bubbleTea) { 
			// i�� ���ۼ��ڷ� �ʱ�ȭ �ϰ�, ���ǽ� ���� ���ѷ����� ������ �ٸ� i���� ���� ����ŭ ����
			// ���ڰ� �پ�鶧�� �������� ������ �ֱ⶧���� += �����ڸ� ����ص� �������.
			System.out.print(i + " ");
			
			count++; // �ݺ����� �ɶ� ���� count���� 1�� ���� ��Ű��
			
			if(count == 10) { 
				break;
				// count���� 10�� �Ǹ� ������ ������ 10����� �ǹ� �̹Ƿ� for���� Ż���ϱ� ���� break;
			}
		}
	}
	
	public void practice6() {
		// ���ѷ��� ���� 
		// ���ǹ��� �߾��� �ڵ尡 �� ������������ ���� �ۼ��� �� ����.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // ������ while���� �̿��� ���ѷ���
			System.out.print("������(+, -, *, /, %) : ");
			String sOp = sc.nextLine();
			char op = sOp.charAt(0); 
			// exit�� �Է¹����� ���ᰡ �Ǿ�� �ϱ� ������ String�� ������ sOp��
			// �����ڸ� ������ char�� ���� op�� ���� �غ��Ѵ�.
			// op�� sOp�� charAt() �޼��带 �̿��Ͽ� ���Ѵ�.
			
			if(sOp.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} 
			// ������ �Է��� ���� �� �ٷ� equals �޼��带 �̿��Ͽ� exit�� �ԷµǾ�����
			// �˻��ϵ��� �Ѵ�. exit�� ���� ��� ���� �޽��� ��� �� ���ѷ��� Ż��
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			//������ �˻� ���� ������ �Է¹޴´�.
			
			int result = 0; // ��� ���� �����ϱ� ���� ����
			
			if(op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				continue;
				// ���ǽĿ� �ִ� �����ڰ� �ƴ� ��� �����޽����� ����ϰ�
				// continue�� �̿��Ͽ� �Ʒ��� �ڵ���� �ǳʶٰ� �ٽ� ���� ����
			} else if(op == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
				// ���������� '/'�����ڸ� �Է��ϰ� ����2�� 0�� �Է��Ͽ��� ���
				// ���� �� ���� ������ �����޽��� ��� �� continue�� �̿��Ͽ� �ڵ� �ǳʶٱ�
			} else {
				switch(op) {
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
				}
				// �� ���� ��쿡�� switch���� �̿��Ͽ� result���� ������ش�.
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);		
			// ���ǹ��� ������ �������Դٸ� ��� ���� ��� �� �ٽ� ���ѷ����� ���ư���.
		}
	}
}
