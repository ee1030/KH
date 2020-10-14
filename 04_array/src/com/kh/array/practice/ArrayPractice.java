package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// ���̰� 10�� �迭 ���� �� 1���� 10���� �ݺ����� �̿��Ͽ�
		// �迭 �ε����� �ְ� ���
		int[] arr = new int[10]; // ���� 10�� �迭 ���� �� �Ҵ� int[] arr������ �����̰� �޺κ��� �Ҵ��̴�.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			// �ݺ����� �̿��Ͽ� 0�� index���� 9�� index����(���ǽ��� arr.length �̸��̹Ƿ�)
			// i���� 1�� ������Ű�� �迭 �ε����� i+1���� �ִ´�.(i�� 0���� �����ϹǷ� 1~10�� �ֱ� ���ؼ� i+1 �ؾ���)
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// �ݺ����� �̿��Ͽ� �迭�� 0�� �ε������� 9�� �ε������� ���
		}
	}
	
	public void practice2() {
		// 1�������� ������ ������ �迭 �ε����� ���� ������
		// �������� ���� �־���� ex) 10 9 8 7 ... 1 ó�� �Ųٷ� ���� �ִ´ٴ� ��
		
		int[] arr = new int[10]; // �迭 ���� �� �Ҵ�
		
		for(int i = 0; i < arr.length; i++) { // ù��° for������ ���ǽ��� 1�������� ����. �ε����� 0���� 9���� �������
											  // ���� �ϱ� ����
			
			arr[i] = arr.length-i; // �̺κ��� 1�� ������ �ٸ���. i�� �ε����� �迭�� ���̿��� i���� �� ���� ����ְ� �Ǵµ�
								   // �迭�� ���̿��� i���� ���� 10���� 1���� ���� �� �ֱ� ����.
								   // ex) i = 0 �϶� arr.length = 10 �̰� 10 - 0 --> arr[0] = 10
								   //     i = 1 �϶� arr.length = 10 �̰� 10 - 1 --> arr[1] = 9
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // for���� �̿��Ͽ� 0�� �ε��� ���� 9�� �ε������� ���
	}
	
	public void practice3() {
		// ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		// 1���� �Է¹��� ������ �迭�� �ʱ�ȭ�� �� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int[] arr = new int[sc.nextInt()]; // arr �迭�� �����ϰ� �Է¹��� ���� ��ŭ�� ���̷� �Ҵ��Ѵ�.
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		} // arr.length�� �Է¹��� ���ڿ� �����Ƿ� arr.length�� ���ǽĿ� ����ϰ� �迭�� �ε����� ���� �־��ش�.
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // for���� �̿��Ͽ� 0�� �ε������� 9�� �ε������� ���
	}
	
	public void practice4() {
		// ���̰� 5�� String �迭 �����ϰ� ���ÿ� ���� �̸����� �ʱ�ȭ
		// ���� �迭 �ε����� �̿��� ���� ����Ѵ�.
		
		String[] arr = {"���", "��", "����", "������", "����"}; // String �迭 arr�� ����� ���ÿ� �ʱ�ȭ
		
		System.out.println(arr[1]); // ���� 1��° index�� ���̹Ƿ� arr[1]�� ����Ѵ�.
	}
	
	public void practice5() {
		// ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ�
		// ���ڿ��� �� ���� ����ִ��� ������ ���° �ε����� ��ġ�ϴ��� �ε����� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine(); // ���ڿ��� �Է¹޾� str ������ �����Ѵ�.
		
		char[] chArr = new char[str.length()]; // �ѱ��ھ� �߶� �迭�� �ְ� �˻��ؾ� �ϹǷ�
											   // char�� �迭 chArr�� �����ϰ� StringŬ������ length() �޼��带 �̿��Ͽ�
											   // ���ڿ� str�� ���̸�ŭ �迭�� ���̸� �Ҵ����ش�.
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		} // �ݺ����� �̿��Ͽ� str���� �ѱ��ھ� �̾Ƴ��� chArr �迭�� �ε����� ���� �־��ش�.
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0); // � ���ڸ� �˻��� ������ �Է� �޴´�.
		
		int count = 0; // ���ڰ� � �ִ��� ����ϱ� ���� count ������ ����Ѵ�.
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i < chArr.length; i++) { // for���� �̿��Ͽ� chArr �迭�� 0�� �ε��� ����
												// �迭�� ������ �˻��Ѵ�.
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
				// ���ǹ��� �̿��Ͽ� chArr�� i��° �ε����� ���� ������ �Է¹��� ������ ���� ch�� ���� ������
				// �ش� �ε����� ��ȣ�� ����ϰ� count ������ 1 ������Ų��.
			}
		}
		System.out.println("\n" + ch + "�� ���� : " + count); // �ݺ����� ����Ǹ�, ���������� ���ڰ� � �ִ��� ������ش�.
	}
	
	public void practice6() {
		// ���ڸ� �Է��ϸ� �ش� �ε����� �ִ� ���ڸ� ����ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		String[] dow = {"��", "ȭ", "��", "��", "��", "��", "��"}; // String �迭 dow�� �����԰� ���ÿ� ���Ϸ� �ʱ�ȭ
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int input = sc.nextInt(); // ���ڸ� �Է¹޾� input ������ �������ش�.
		
		if(input < 0 || input > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
			// �Է¹��� ���� 0���� �۰ų� 6���� ũ�� �����޽��� ���
		}
		
		for(int i = 0; i < dow.length; i++) {
			if(i == input) {
				System.out.println(dow[i] + "����");
			}
			// for���� �̿��Ͽ� 0�� �ε������� 5�� �ε������� ���鼭 
			// i���� �Է¹��� ���� ���� �� dow �迭�� i��° �ε��� ���� ����Ѵ�.
		}
	}
	
	public void practice7() {
		// �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ�� ������ �迭�� ���� �� �Ҵ�
		// �迭�� ũ�⸸ŭ �ε����� ���� ���� �Է��Ͽ� ���� �ְ� �迭 ��ü ���� ������ �� 
		// �ε����� ����� ������ �հ踦 ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int[] arr = new int[sc.nextInt()]; // �Է¹��� �� ��ŭ �迭�� ���� �Ҵ�
		int sum = 0; // �հ踦 �����ϱ� ���� ����
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			// ù��° for�������� �迭�� ���̸�ŭ �ε��� ���� ���� �Է¹ް�, �ε��� ���� �ٶ����� sum ������
			// �հ踦 ����Ѵ�.
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// �ι�° for�������� �ε��� ���� �����Ѵ�.
		}
		System.out.println("\n�� �� : " + sum); // �ε��� ������ �հ� ���
	}
	
	public void practice8() {
		// 3�̻��� Ȧ���� �Է� �޾� �ش��ϴ� ũ�⸸ŭ�� �迭�� ���ڰ� ��Ī�Ǵ�
		// ������� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		while(true) { // while���� �̿��Ͽ� Ư�� ������ �����Ǳ� ������ ���� �ݺ�
			System.out.print("���� : ");
			int input = sc.nextInt();
			
			if(input%2 == 0 || input < 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
				// �Է¹��� ���� 3���� �۰ų�, Ȧ���� �ƴϸ� ���� �޽����� ����ϰ� ���� �ڵ�� �������� �ʴ´�.
			}
			
			int[] arr = new int[input]; // if������ �ɸ��� �ʾҴٸ� �Է¹��� �� ��ŭ�� ���̸� ���� �迭 ���� �� �Ҵ�
			int std = arr.length/2 + 1; // �迭�� �߰��� ã�� ���� ���� Ȧ���̱� ������ �Է¹��� ���� 2�� ������ 1�� ���ϸ�
										// �߰� ���� �ȴ�.
			
			for(int i = 0; i < std; i++) {
				arr[i] = i+1;
			} // 0�� �ε������� std(������)���� �ε��������� 1�� �����ϸ� �ε��� ���� �־��ش�.
			
			int count = std; // 1�� �����ϴ� ����� ����� ���� count ������ �߰� ���� �־��ش�.
			
			for(int i = std; i < input; i++) {
				count--;
				arr[i] = count;
				// �迭�� �߰� ���ĺ��� �迭�� ������ ������ 1�� �����ؾ� �ϱ� ������ 
				// �ι�° for���� i ���� std(�迭�� �߰���)���� �����Ͽ� count���� 1�� ���ҽ�Ű��
				// �ش簪�� i�� �ε����� �־������ν� 1�� �����ϴ� ������� �ε��� ���� �־��ش�.
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(i != input-1) {
					System.out.print(arr[i] + ", "); 
					// i���� �迭�� �������� �ƴϸ� ��ǥ�� �Բ� ���
				} else {
					System.out.print(arr[i]);
					// i���� �迭�� �������̸� ��ǥ ���� ���
				}
			}
			break; // ���ѷ��� ���� ��� ������ ����Ǹ� ���ѷ��� Ż�� 
		}
	}
	
	public void practice9() {
		
		// 6�� ������ ����ϴ�. �ݺ����� ���� �迭�� �� �˻��ϸ� ���ڿ� ���� ���� ���� ����ϴ°�
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"���", "�Ķ��̵�", "������", "���߹ٻ��", "�Ѹ�Ŭ"}; // String �迭 ���� �� �ʱ�ȭ
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) { // �迭�� 0�� �ε������� ������ �ε������� �ݺ��Ѵ�.
			if(chicken[i].equals(name)) {
				System.out.println(chicken[i] + "ġŲ ��� ����");
				break;
				// �迭�� i��° �ε����� �Է¹��� ġŲ �̸��� ������ ��� ��� �����ϴٰ� ��� �� Ż��
			} else {
				System.out.println(name + "ġŲ�� ���� �޴� �Դϴ�.");
				break;
				// ġŲ �̸��� �������� ������ ���� �޴� ���
			}
		}
	}
	
	public void practice10() {
		
		// ������ ���� ���� ����
		// ���� ����� ���� ���� ���� ���ϹǷ� ��� X
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String idNum = sc.nextLine(); // �ֹι�ȣ �Է¹޾� ����
		
		char[] idArr1 = new char[idNum.length()]; // ������ �迭�� idNum�� ���̸�ŭ �Ҵ�
		
		for(int i = 0; i < idArr1.length; i++) {
			idArr1[i] = idNum.charAt(i);
			// ù��° for�������� �Է¹��� �ֹι�ȣ�� ���� �ϳ� ������ �ɰ��� �迭�� �ε��� ���� ����
		}
		
		char[] idArr2 = new char[idArr1.length]; // ������ �迭 ���� �� �Ҵ�
		
		for(int i = 0; i < idArr2.length; i++) {
			if(i > 7) {
				idArr2[i] = '*'; // 8��° ���ں��ʹ� �ε��� ���� �����ؿ��� ��� '*' ���ڸ� �ִ´�
			} else {
				idArr2[i] = idArr1[i]; // 7��° ���� ������ �״�� ���� ���縦 �ؿ´�.
			}
		}
		
		for(int i = 0; i < idArr2.length; i++) {
			System.out.print(idArr2[i]);
			// �����ؿͼ� ������ '*'���ڷ� ���� �迭 ��� 
		}
	}
	
	public void practice11() {
		// ���� �߻����� ���� 10¥�� ������ �迭�ȿ� ���� �ֱ�
		int[] arr = new int[10]; // �迭 ���� �Ҵ�
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		} // ���� �߻����� index�� �ʱ�ȭ�����ֱ�
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // arr ���
	}

	public void practice12() {
		// ���� �߻� ��Ű�� �迭�� �ʱ�ȭ ��
		// �迭 ��ü ���� �ּ�, �ִ밪 ���
		int[] arr = new int[10]; // �迭 ���� �Ҵ�
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		} // ���� �߻����� �迭�� �ʱ�ȭ
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // �迭 ��ü �� ���

		int min = arr[0];
		int max = arr[0];
		// min���� max�� ��� 0��° �ε��� ������ �ʱ�ȭ
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			// �迭�� ��ü���� ���鼭 min���� ���� ���� min ������ �����ϰ�, max���� ū ���� max ������ �����Ѵ�.
		}		
		System.out.println("\n�ִ밪 : " + max + "\n�ּҰ� : " + min);		// ���
	}
	
	public void practice13() {
		// ���� �߻� �� �迭�� �ʱ�ȭ
		// �ߺ� ���ű���
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); // arr�� �����޾Ƽ� �ʱ�ȭ
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					// ���ʿ� for���� �ѹ� �� ������ ���� i��° �ε����� ���� j��° �ε�����
					// ���� ������ i�� 1 ���ҽ��Ѽ� �ٸ� ������ �ʱ�ȭ �Ҽ� �ְ� �Ѵ�.
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		// �ζ� ��ȣ ������
		// 13�� ������ �����ϴ�.
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1); // ������ 45�� ���� �� 1�� ���� 1~45������ ������ �߻���Ų��.
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				} // 13�� ������ ���������� ���ʿ� for�� �־ �ߺ� ����
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		// ���ڿ� �Է¹޾Ƽ� �ߺ� �����ѵ� ���ڿ��� �ִ� ���ڸ� ����ϰ�,
		// ������ ������ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()]; // �Է¹��� ���ڿ��� ���� ��ŭ�� ũ�⸦ ���� ������ �迭 �Ҵ�
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i); // �Է¹��� ���ڿ��� ���� ������ �ɰ��� �迭�� �ε����� �־��ش�.
			
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					chArr[i] = ' ';
					// ���� for���� �ߺ������ε�, �����Ҷ��� �ٸ��� i��° �ε����� j��° �ε����� ����
					// ���� ��� i��° �ε����� ���鹮�ڷ� �ٲ��ش�.
				}
				
			}
		}
		
		int count = 0; // ���� ������ �����ϱ� ���� ����
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != ' ') {
				if(i == chArr.length-1) {
					System.out.print(chArr[i]);
					count++;
					// �迭�� ó������ ������ ��ȸ�ϸ� �ش� �ε��� ���� ���鹮�ڰ� �ƴ� ��� 
					// ������ �ε��� �̸� �ε��� ���� ��� �� count�� 1����
					
				} else {
					System.out.print(chArr[i] + ", ");
					count++;
					// ������ �ε����� �ƴҰ�� ��ǥ�� �Բ� ����ϰ� count�� 1����					
				}
			} 
		}
		System.out.println("\n���� ���� : " + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է� �ϼ��� : ");
		int arrSize = sc.nextInt();
		sc.nextLine();
		// �迭�� ũ�⸦ �Է��Ѵ�.
		
		String[] strArr = new String[arrSize]; // strArr �迭�� �����ϰ� ���� �Է�ũ�� ��ŭ�� ���̷� �Ҵ����ش�
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		} // strArr�� ���̸�ŭ ���ڿ��� �Է¹޾� �迭�� �ε����� ���� ���� �ʱ�ȭ ���ش�.
		
		while(true) { // ���ѷ����� ���� y�� Y���� �ٸ� ���ڸ� �Է��ϴ� ��� toString�޼��带 �̿��Ͽ� �迭�� ����ϰ�
					  // �ݺ����� Ż���Ѵ�.
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char loopCheck = sc.nextLine().charAt(0);
			// �迭�� ���̸� �ø��� ���θ� ���ڷ� �Է¹޾� loopCheck������ �������ش�.
			
			if(loopCheck == 'y' || loopCheck == 'Y') { // loopCheck ������ y�Ǵ� Y�� ���
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addCount = sc.nextInt();
				sc.nextLine(); // �迭�� ���̸� �󸶳� �ø��� ������ �Է¹޾� addCount ������ �����Ѵ�.
				
				String[] extendedArr = new String[strArr.length + addCount];
				// �迭�� ���̸� �ø��� ���ؼ� ���� ���縦 �ؾ��ϹǷ�
				// ���ο� �迭�� extendedArr�� �����ϰ�, ó�� �Է¹޾Ҵ� strArr�� ���̿� addCount���� ���� ��ŭ��  
				// ���̸� �Ҵ��� �ش�.
				
				for(int i = 0; i < strArr.length; i++) {
					extendedArr[i] = strArr[i];
				} // ������ �����ϴ� strArr�� �ε��� ������ extendedArr�� �������ش�(���� ����)
				
				for(int i = strArr.length+1; i <= extendedArr.length; i++) {
					System.out.print(i + "��° ���ڿ� : ");
					extendedArr[i-1] = sc.nextLine();
				} // ���簡 ����Ǹ� �߰��� ���ڿ��� �߰��� ���� ��ŭ�� Ƚ���� �Է¹ް� �ش� �ε��� ���� �ʱ�ȭ���ش�.
				
				strArr = extendedArr; // ���ο� �迭�� ���ڿ� �߰����� �����ٸ�, ������ �迭�� strArr�� extenedArr��
									  // �����Ͽ� �ݺ����� ��� �Ǵ��� ������ �� �ְ� �Ѵ�.
			} else {
				System.out.println(Arrays.toString(strArr));
				break;
				// loopCheck ������ y�� Y �̿��� �ٸ� ���ڰ� �ԷµǸ� strArr�� ����ϰ� �ݺ����� Ż���Ѵ�.
			}
		}
	}
}
