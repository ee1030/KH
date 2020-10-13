package com.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// 1���� �Է¹��� ������ ��� ���� ��� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���."); // 1 �̸��� ���ڰ� �ԷµǸ� ���� �޽��� ���
		} else {
			for(int i=1; i<=input; i++) {			
				System.out.print(i + " "); // for �ݺ����� �̿��Ͽ� i�� 1���� input�� ���� ������ ������ �ݺ��Ͽ� i ���� ���
			}
		}
	}
	
	public void practice2() {
		// 1�� ������ �������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for(int i=input; i>=1; i--) {			
				System.out.print(i + " ");
				// for���� �̿��Ͽ� i�� input�� ���� 1�� ���� ������ �� ���� 1�� ���ҽ�Ű�� �ݺ��Ͽ� i���� ���
			}
		}
		
	}

	public void practice3() {
		// 1���� �Է� ���� �� ������ �������� ���� for���� �̿��Ͽ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close(); // �޸� ���� ������ ���Ͽ� ����ϴ� �޼����ε� ��� ����
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) { // for���� �̿��Ͽ� i�� 1���� input���� ������ ������ 1�� ������Ű�� �ݺ�
			if(i == input) {
				System.out.print(i);
				sum += i;				
				// i���� input���� �������� ������ ������� ���̹Ƿ�, �ڿ� '+' ���ڸ� �����ϰ� i���� ����Ѵ�.
			} else {				
				System.out.print(i + " + ");
				sum += i;				
				// i���� input���� ���� ���� ��쿡�� i���� ����ϰ� '+' ���ڸ� �ڿ� ����Ѵ�.
			}
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		// ����ڷκ��� �ΰ��� ���� �Է¹޾� �� ������ ���ڸ� ��� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		} // swap �޼��� ù ��° ���ڰ� �� ��° ���ں��� ���� ��� ���� �ٲ��ش�.
		
		for(int i=num1; i<=num2; i++) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
				break;
				// if���� �̿��Ͽ� num1�� 1 �̸��̰ų�, num2�� 1 �̸��� ��� ���� �޽����� ����ϰ�, �ݺ����� �������´�.
			} else {
				System.out.print(i + " ");
				// �� ���� ��쿡�� i���� ����ϰ� ���� ��ĭ�� ���
			}
		}
	}
	
	public void practice5() {
		// �Է¹��� ���� �������� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		System.out.println("===== " + input + "�� ====="); // �Է¹��� ���� ������ ���;� �ϹǷ� input ���� ���
		
		for(int i=1; i<=9; i++) {
			System.out.println(input + " * " + i + " = " + input * i); 
			// for���� �̿��Ͽ� 1���� 9���� ���� ���ڸ� ������Ű�� �������� ��� input���� ���� �ǹ��ϱ� ������ �ٲ��� �ʴ´�.
		}
	}
	
	public void practice6() {
		// �Է� ���� ���� �ܺ��� 9�ܱ����� ������ ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input > 9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���."); // if���� �̿��Ͽ� input���� 9�� �ʰ��� ��� ���� �޽��� ���
		} else {			
			for(int i = input; i <= 9; i++) { 
				System.out.println("===== " + i + "�� =====");
				// �ٱ��� for�������� �� �������� ����԰� ���ÿ� i���� input������ �ʱ�ȭ�����ν�
				// �Է¹��� ���� �ܺ��� 9�ܱ��� �ݺ��ϰ� �����.
				for(int j = 1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + i * i);
					// ���� for�������� 5�������� ������ ��°� ���������� ���� ���ڸ� 1~9���� ������Ű�� �������� ���
					// ���⼭ i���� ���� �ǹ��ϰ� j ���� ���ϴ� ���ڸ� �ǹ��Ѵ�.
				}
			}
		}
	}
	
	public void practice7() {
		// �⺻���� ����� ���� ��, ���� �ﰢ�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			// �ٱ��� for���� �̿��Ͽ� ���� ����Ѵ�. i ���� �����ϸ� 1���� �����ϴ°Ͱ� ����.
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				// ���� for�������� ���� ����ϰ� �Ǵµ� '*'���ڸ� ��� ������ �����ϰ� �ȴ�.
				// j���� 1���� i���� �������� ���� j�� 1�� ������Ű�� �ݺ��ϹǷ� i = 1 �� �� j�� �ѹ� ����ǰ�
				// i = 2�� �� j�� 2�� ����Ǵ� ��.
				// ���������� i�� input�� ��ŭ�� Ƚ���� �ݺ��ǰ� 
				// j�� i�� ����Ǳ� ������ ������ �ٿ��� input�� ����ŭ '*'���ڰ� ��µǰ� �ȴ�.
			}
			System.out.println(); // ���� for���� ����Ǹ� ���� ������ �Ѿ�� ���� println() �޼��带 ��� ���� �ٲ��ش�.
		}
	}
	
	public void practice8() {
		// ���� 7�� ������ �������� ����ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = input; i>=1; i--) {
			// �ٱ��� for�������� 7�� ������ �ʱ�İ� ���ǽ��� �ݴ�� �ٲ��ְ� 1�� ���ҽ�Ű�� ������ ����
			// input������ 1���� �����ϸ� �ݺ��ϰ� �����.
			for(int j=i; j>=1; j--) {
				System.out.print("*");
				// ���� for���� ���������� �ִ� ���� i�� ���� 1���ϰ� �� ������ j���� ���ҽ�Ű�� '*'���ڸ� ����Ѵ�.
				// �� i = 5�̸� j�� 5�� i = 4�̸� 4�� '*'���ڰ� ��µǰ� �ȴ�.
			}
			System.out.println(); // ���������� ���� �ٲ��ֱ� ���� ���
		}
	}
	
	public void practice9() {
		// 1���� ����ڰ� �Է��� ������ �� 2�� 3�� ����� ��� ����ϰ�, 2�� 3�� ����� ������ ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 0; // 2�� 3�� ������� ������ �����ϱ� ���� ����
		
		for(int i = 1; i <= input; i++) {
			if(i%2 == 0 || i%3 == 0) { 
				// ù��° ���ǹ������� '%'������ ���Ͽ� 2�� ����̰ų� 3�� ����� ���� ã�´�.
				if(i%2 == 0 && i%3 == 0) { 
					count++;
					// �ι�° ���ǹ������� 2�� ����̰ų� 3�� ����� �� �߿��� ������� ã�� ���� AND ������ �̿��Ͽ�
					// ���ǿ� �´� ���� ã�� ����� ������ �����ϱ� ���� ���� count�� ���� 1 �������� �ش�.
				}
				System.out.print(i + " "); // ù��° ���ǹ��� 2�� ����̰ų� 3�� ����� ���� ��� ����Ѵ�.
			}
		}
		System.out.println("\ncount : " + count); // �ݺ����� ����Ǹ� �ι�° ���ǹ����� ã�� ������� ������ ����Ѵ�.
	}
	
	public void practice10() {
		// ����� ���� ���� �ﰢ���� �ݴ�� ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= input; i++) {
			// �ٱ��� for�������� ���� ����ϱ� ���� i���� 1���� �Է¹��� input���� �ɶ����� �ݺ��Ѵ�.
			for(int j = 1; j <= (input-i); j++) {
				System.out.print(" ");
				// ��� ������ ���� '*'���ڸ� ����ϱ� ���� ���� ���ڸ� ���� ����ؾ� �Ѵ�.
				// ���� ���鹮�ڸ� ����ϱ� ���� �ݺ����� ����ؾ� �ϴµ� �װ��� ������ ù��° for��
				// j���� 1���� input-i ���� �� �� ���� �ݺ��ϰ� �Ǵµ� ����ؾ� �ϴ� ���� ������ ������
				// �׻� input ������ i���� �� ��ŭ�� �Ǳ� ����.
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				// ������ �ι��� for�������� ù��° for������ ���鹮�ڸ� ��� ��� �Ͽ����Ƿ�, '*'���ڸ� ����Ѵ�.
				// '*'������ ������ ���� ����, �� i�� ���� ���� ������ k���� 1���� i�� ������ �ݺ��Ͽ� '*'���ڸ� ����Ѵ�.
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		// ����¥�� ������ ��� ��� ����
		// �����ﰢ�� ��� ������ �� ������ �������� ����ϴ� ������ ���ƴٰ� �����ϸ� �����ϱⰡ ����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		
		for(int i = 1; i<=input; i++) {
				// �ٱ��� for���� ���� ����ϱ� ���� �ݺ����̴�. ����Ǹ� �ͼ����� �� �� �ƴ�. 
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				// ���� for�������� ���������� i��° �࿡ '*'�� ������� �ݺ���
				// j���� 1���� i�� ���� ������ �� ���� �ݺ��ϹǷ�, �ᱹ i�� '*'���ڸ� ����ϰ� �ȴ�.
			}
			System.out.println(); // �� �ٲٱ�
		}
		
		// ù ��° for�������� ����� ���� �ﰢ�� ���� ����. '*'���ڰ� i�� ��ŭ�� Ƚ���� ��µǴ°�.
		// �׷��� �Ǹ� �����ﰢ�� ����� ����Ⱑ �ϼ��ȴ�.
		
		for(int i = (input-1); i >= 1; i--) {
			// �ٱ��� for���� ���� ����ϱ� ���� �ݺ����̴�. ����Ǹ� �ͼ����� �� �� �ƴ�. ��¥�� ������.
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
				// ���������� �ι�° ������ for�������� i�� ��ŭ�� Ƚ���� '*'���ڸ� ����ϸ� ���� ������ ����
				// '*'���ڸ� ����ϴ� Ƚ���� 1�� ���ҽ��� �ش�.
			}
			System.out.println(); // ��ٲٱ�
		}
		// �ι�° for�������� i�� ��ŭ�� '*'�� ��µǴ� ���� �ʿ� �����Ƿ� input������ 1�� �� ������ �����Ͽ�
		// 1�� �������� ���� i���� ���ҽ�Ű�� �ݺ��Ѵ�.

	}
	
	public void practice12() {
		// �Ƕ�̵� ��� ����.
		// ������ ��� ���� �ϰ�, '*'���ڸ� ��� ���� �ϴ��� �����غ��� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			// �ٱ��� for�������� ���������� ���� ����Ѵ�.
			for(int j = 1; j<=input-i; j++) {
				System.out.print(" ");
				// ���� ù��° for�������� ���鹮�ڸ� ����ϱ� ���� ����� �Ѵ�.
				// ���鹮�ڴ� 10�� ������ ���������� input ������ i���� �� ��ŭ ����ؾ� �ϱ� ������
				// j�� 1�� �ʱ�ȭ�ϰ�, (input-i)�� ��ŭ ������ ����Ѵ�.
			}
			
			for(int j = 1; j<=(2*i)-1; j++) {
				System.out.print("*");
				// �ι�° for�������� '*'���ڸ� ����ϱ� ���� for���� ����Ѵ�.
				// �ι�° �ݺ������� �߿��Ѱ� ���ǽ�. 
				// ��� ������ ���캸�� �׻� �� �ϳ��� �þ �� ���� '*'���ڰ� 2���� �þ�ٴ� ���� �� �� �ִ�.
				// �� ���� �ｼ i���� 2�� ������ 1�� ���� ���� �� '*'�� ������ �ȴٴ� ���ε�
				// �����ϰ� �������ڸ� Ȧ���� ���ϴ� ����� ����. ex) i = 1�϶� j = (i*2)-1 = 1, i�� 2�϶� j = (i*2)-1 = 3
			}
			System.out.println(); // ��ٲٱ�
		}
	}
	
	public void practice13() {
		// '*' ���ڷ� �簢�� ������
		// ���ǹ��� �߾��� 12������ ����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i<input; i++) {
			// ���� �Ǹ� ��ġ�� �ƹ��� ��� ���� ����ϱ� ���� for���̶�� ���� ���� ������.
			if(i == 0 || i == (input-1)) {
				// ù��° ���ǹ������� i���� ù��° ���̰ų� ������ �������� �˻��Ѵ�.
				// i���� 0�̰ų�, input-1(�� input-1�̳ĸ� i�� 0���� �����߱� ����) �̶��
				// ù���� ���̰ų� ������ ���̶�� �ǹ��̴�.
				
				for(int j=0; j<input; j++) {
					System.out.print("*");
					// if�� ������ for���� ���ǹ��� �����ϴ� ���̶�� '*'���ڸ� input����ŭ ��� �Ҽ� �ֵ��� �Ѵ�.
				}
			} else {
				// ������ �������� �ʴ� �����, ù��°�� ������ ���� �ƴ϶�� ���̹Ƿ�, ���鹮�� �յڷ� '*'���ڸ� ����ϰ�,
				// '*'���� ���̴� ���鹮�ڷ� ä�쵵�� �Ѵ�.
				
				System.out.print("*"); // ���� ���� ���� '*' ����
				
				for(int j=0; j<input-2; j++) {
					System.out.print(" ");
					// else�� ������ for���� ���� ���ڸ� ����ϱ� ���� �ݺ����ε�
					// ���ǽ��� �� j < input-2 �̳ĸ� �� �տ��� �� �޿��� '*'���ڸ� ����Ͽ� �簢�� ����� ������ �ϱ� �����̴�.
					// ���� '*'���ڸ� ����� 2���� ������ ���ܵ� ������ ������
					// ���鹮�ڷ� ä��� ���� ���ǽ��� j < input-2�� �Ǵ°�.
				}
				
				System.out.print("*"); // ���� ���� ���� '*' ����
			}
			System.out.println(); // ��ٲٱ�
		}
	}
}
