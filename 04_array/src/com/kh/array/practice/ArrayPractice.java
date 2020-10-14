package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + ch + "�� ���� : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] dow = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int input = sc.nextInt();
		
		if(input < 0 || input > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		for(int i = 0; i < dow.length; i++) {
			if(i == input) {
				System.out.println(dow[i] + "����");
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n�� �� : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int input = sc.nextInt();
			
			if(input%2 == 0 || input < 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			int[] arr = new int[input];
			int std = arr.length/2 + 1;
			
			for(int i = 0; i < std; i++) {
				arr[i] = i+1;
			}
			
			int count = std;
			
			for(int i = std; i < input; i++) {
				count--;
				arr[i] = count;
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(i != input-1) {
					System.out.print(arr[i] + ", ");
				} else {
					System.out.print(arr[i]);
				}
			}
			break;
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"���", "�Ķ��̵�", "������", "���߹ٻ��", "�Ѹ�Ŭ"};
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(name)) {
				System.out.println(chicken[i] + "ġŲ ��� ����");
				break;
			} else {
				System.out.println(name + "ġŲ�� ���� �޴� �Դϴ�.");
				break;
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String idNum = sc.nextLine();
		
		char[] idArr1 = new char[idNum.length()];
		
		for(int i = 0; i < idArr1.length; i++) {
			idArr1[i] = idNum.charAt(i);
		}
		
		char[] idArr2 = new char[idArr1.length];
		
		for(int i = 0; i < idArr2.length; i++) {
			if(i > 7) {
				idArr2[i] = '*';
			} else {
				idArr2[i] = idArr1[i];
			}
		}
		
		for(int i = 0; i < idArr2.length; i++) {
			System.out.print(idArr2[i]);
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}		
		System.out.println("\n�ִ밪 : " + max + "\n�ּҰ� : " + min);		
	}
	
	public void practice13() {
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
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					chArr[i] = ' ';
				}
			}
		}
		
		int count = 0;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != ' ') {
				if(i == chArr.length-1) {
					System.out.print(chArr[i]);
					count++;
					
				} else {
					System.out.print(chArr[i] + ", ");
					count++;
				}
			} 
		}
		System.out.println("\n���� ���� : " + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է� �ϼ��� : ");
		int arrSize = sc.nextInt();
		
		String[] strArr = new String[arrSize];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		}
		
		do {
			System.out.print("�� ���� �Է� �Ͻðڽ��ϱ�?(Y/N) : ");
			char extenedCheck = sc.nextLine().charAt(0);
			
			if(extenedCheck == 'y' || extenedCheck == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int extendedSize = sc.nextInt();
				
				String[] extendedArr = new String[strArr.length+extendedSize];
				
				for(int i = 0; i < strArr.length; i++) {
					extendedArr[i] = strArr[i];
				}
				
				for(int i = strArr.length + 1; i < extendedArr.length; i++) {
					System.out.print(i + "��° ���ڿ� : ");
					extendedArr[i] = sc.nextLine();
				}
			} 
			
		} while(true);
	}
}
