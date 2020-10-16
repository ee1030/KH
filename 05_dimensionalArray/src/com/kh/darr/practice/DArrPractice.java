package com.kh.darr.practice;

import java.util.Scanner;

public class DArrPractice {

	public void pratice1() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int count = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				for(int j = 0; j < arr.length; j++) {
					arr[i][j] = arr[0][j] + arr[1][j] + arr[2][j];
				}
			} else {
				for(int j = 0; j < arr[0].length; j++) {
					if(j == arr[0].length-1) {
						arr[i][j] = arr[i][0] + arr[i][1] + arr[i][2];
					} else {
						arr[i][j] = (int)(Math.random()*10+1);
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr;
		
		while(true) {
			System.out.print("�� ũ�� : ");
			int row = sc.nextInt();
			
			System.out.print("�� ũ�� : ");
			int col = sc.nextInt();
			
			if(row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("�ݵ�� 1 ~ 10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			arr = new char[row][col];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					int randNum = (int)(Math.random()*80+1);
					arr[i][j] = (char)randNum;
					if(randNum < 65) {
						j--;
					}	
				}
			}
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			}
			
			break;
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
			"��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] chArr = new char[row][];
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "���� ũ�� : ");
			int col = sc.nextInt();
			chArr[i] = new char[col];
		}
		
		char firstCh = 'a';
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = firstCh;
				firstCh++;
			}
		}
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] students =  {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int count = 0;
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[count];
				count++;
			}
		}
	
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[count];
				count++;
			}
		}
		
		System.out.println("== 1�д� ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] students =  {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int count = 0;
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[count];
				count++;
			}
		}
	
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[count];
				count++;
			}
		}
		
		System.out.println("== 1�д� ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String stdName = sc.nextLine();
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				if(stdName.equals(group1[i][j])) {
					if(j == 0) {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 1�д�" + (i+1) + "��° �� ���ʿ� �ֽ��ϴ�.");
					} else {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 1�д�" + (i+1) + "��° �� �����ʿ� �ֽ��ϴ�.");
					}
				}
			}
		}
		
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				if(stdName.equals(group2[i][j])) {
					if(j == 0) {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 2�д�" + (i+1) + "��° �� ���ʿ� �ֽ��ϴ�.");
					} else {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 2�д�" + (i+1) + "��° �� �����ʿ� �ֽ��ϴ�.");
					}
				}
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length ; j++) {
				if(i == 0 && j != 0) {
					strArr[i][j] = Integer.toString(j-1);
				} else if(i != 0 && j == 0) {
					strArr[i][j] = Integer.toString(i-1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}
		
		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� �Է� : ");
		int col = sc.nextInt();
		
		strArr[row+1][col+1] = "X";
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length ; j++) {
				if(i == 0 && j != 0) {
					strArr[i][j] = Integer.toString(j-1);
				} else if(i != 0 && j == 0) {
					strArr[i][j] = Integer.toString(i-1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}
		
		while(true) {
			System.out.print("�� �ε��� �Է� : ");
			int row = sc.nextInt();
			
			if(row == 99) {
				System.out.println("���α׷� ����");
				break;
			}
			
			System.out.print("�� �ε��� �Է� : ");
			int col = sc.nextInt();
			
			strArr[row+1][col+1] = "X";
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
