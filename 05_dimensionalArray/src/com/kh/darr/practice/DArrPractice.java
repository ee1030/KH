package com.kh.darr.practice;

import java.util.Scanner;

public class DArrPractice {

	public void pratice1() {
		String[][] arr = new String[3][3]; // 3�� 3�� �迭 ����
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		} // �ٱ��� for���� �� ���� for���� �����ٰ� ���ڿ��� �ִ´�
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		} // ���
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}  // count ������ �����ؼ� �ݺ��� �ȿ��� �ʱ�ȭ ���� �ʰ� �Ͽ� 1���� ������� 16���� ���� �� �ֵ��� �Ѵ�.
		
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
			} // count ������ 16���� 1�� ���ҽ��� �Ųٷ� ����
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
			if(i == arr.length-1) { // i ���� arr.length - 1�̸� ������ ���̶�� ���̹Ƿ� ���������϶�
				for(int j = 0; j < arr.length; j++) {
					arr[i][j] = arr[0][j] + arr[1][j] + arr[2][j];
				} // j���� ����, �����ν� ������ ���� ���� ���� ���� �ش� ���� �������࿡ �ִ´�.
			} else {
				for(int j = 0; j < arr[0].length; j++) { // ������ ���� �ƴҰ��
					if(j == arr[0].length-1) {
						arr[i][j] = arr[i][0] + arr[i][1] + arr[i][2]; // i���� ������ �������� i�� �� ���� ���� ���� ���� �ְ�
					} else {
						arr[i][j] = (int)(Math.random()*10+1); // ���������� �ƴ� ��� 1 ~~ 10 ���� ������ �ִ´�.
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		} // ���
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr;
		
		while(true) { // ���ѷ��� �̿�
			System.out.print("�� ũ�� : ");
			int row = sc.nextInt();
			
			System.out.print("�� ũ�� : ");
			int col = sc.nextInt();
			
			if(row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("�ݵ�� 1 ~ 10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			} // �Է� ������ �ٷ� ���� �Է����� �˻��ϰ� �ƴҰ�� continue�� �̿��Ͽ� �ٽ� �ݺ��� ó������ ���ư���.
			
			arr = new char[row][col]; // �Է¹��� ��� �� ��ŭ�� ������ �迭�� �Ҵ�
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					int randNum = (int)(Math.random()*90+1); // ������ ���� randNum�� 1 ~ 90 ������ ������ �߻���Ű�� 
					arr[i][j] = (char)randNum; // �迭�� ������� randNum ������ ���������� ���� ����ȯ�� �ִ´�.
					if(randNum < 65) {
						j--;
					} // �� randNum�� 65�����̸� j�� 1 ���ҽ��� �ٽ� ������ �Է��ϰ� �Ѵ�. �빮�� A�� ���� 65�̹Ƿ� 
					  // ���Ϸ� �������� �ٸ� ���ڰ� ������ ����
				}
			}
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			} // ���
			
			break; // ����� ������ ���ѷ����� �������´�.
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
			"��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			// �迭 ����
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " "); // j�� i���� �������� ����ϸ� ���� ���� ����ѵ� ���� ���� ����ϰ� �ȴ�.
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		// ���� �迭 ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] chArr = new char[row][]; // �Է¹��� ���� ũ�⸸ŭ�� ���� �������迭 ���� �� �Ҵ�.
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "���� ũ�� : ");
			int col = sc.nextInt();
			chArr[i] = new char[col];
		} // �տ��� ���� ũ��� �Ҵ����� �ʾ����Ƿ� �ݺ����� ���� ���� ũ�⸸ŭ ���� ũ�⸦ �Է¹ް� �� �࿡ ���� ũ�⸸ŭ�� �Ҵ�.
		
		char firstCh = 'a'; // a���� ������� �־�� �ϱ⶧���� ���� ó�� ������ 'a'�� �ʱ�ȭ�� firstCh ������ ���� ����.
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) { // chArr[i].length �� ���ǽ��� ���� ������
													   // �����迭�̶� �� �ึ�� ���� ũ�Ⱑ �ٸ��� ����
				chArr[i][j] = firstCh;
				firstCh++; // firstCh ������ 1�� ������Ű�Ƿν� a ���� ���ڵ��� ������ �� �ֵ��� ��
			}
		}
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		} // ���
	}
	
	public void practice8() {
		String[] students =  {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"}; // �л� �̸��� ��� �迭 �ʱ�ȭ
		
		String[][] group1 = new String[3][2]; 
		String[][] group2 = new String[3][2]; // 2���� �迭�� 2�� ���� 
		
		int count = 0; // 1���� �迭�� �����ϴ� �л��� ������� �������� ���� 0���� �ʱ�ȭ�� count ������ ����
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[count];
				count++; // ù��° 2���� �迭�� 1���� �迭�� �ִ� �л��� ���������� count���� ������Ų��.
			}
		}
	
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[count];
				count++; // ù��° 2���� �迭�� �� ������ �ݺ����� �ѹ� �� �����Ͽ� �ι�° 2���� �迭�� ������ �л����� �ִ´�.
			}
		}
		
		System.out.println("== 1�д� ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		} // ù��° 2���� �迭 ���
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		} // �ι�° 2���� �迭 ���
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
		} // ������� 8�� ������ ����
		
		System.out.println("============================");
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String stdName = sc.nextLine(); // �˻��� �л� �̸��� �Է¹޾� stdName ������ ����
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				if(stdName.equals(group1[i][j])) {
					if(j == 0) {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 1�д�" + (i+1) + "��° �� ���ʿ� �ֽ��ϴ�.");
					} else {
						System.out.println("�˻��Ͻ� " + stdName + " �л��� 1�д�" + (i+1) + "��° �� �����ʿ� �ֽ��ϴ�.");
					}
				} // ù��° 2���� �迭�� ���鼭 �Է¹��� �̸��� ���� �л��� ���� ���� ���� �ε����� �ִ��� �˻��ϰ�
				  // �������� ���� �ε����� ������ ��� j���� 0�� ��� �����̰� 1�� ��� �������̱� ������ 
				  // ���ǹ��� �̿��Ͽ� j���� �˻� �� �� ���
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
				} // ���������� ù��° 2���� �迭�� ���� ���� ��쿡�� �ι�° 2���� �迭���� �˻��ؼ� ã�´�.
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
					// 0��° �࿡�� �� �ε����� ���� �ϰ� �迭�� 0�� 0������ ������ ���� �ϹǷ�
					// i���� 0�̰�  j���� 0�� �ƴҰ�쿡 j-1���� ���ڿ��� ��ȯ�Ͽ� �ִ´�.
				} else if(i != 0 && j == 0) { 
					strArr[i][j] = Integer.toString(i-1);
					// 0��° ������ �� �ε����� ���� �ϰ� �迭�� 0�� 0������ ������ ���� �ϹǷ�
					// j���� 0�̰�  i���� 0�� �ƴҰ�쿡 i-1���� ���ڿ��� ��ȯ�Ͽ� �ִ´�.
				} else {
					strArr[i][j] = " "; // �������� ��� �������� ä���.
				}
			}
		}
		
		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� �Է� : ");
		int col = sc.nextInt();
		
		strArr[row+1][col+1] = "X"; // �Է¹��� ��� ���� �ε��� ���� X�� �ٲ��ش�. ��, 0��° ��� ���� �ε����� ��Ÿ���� �ϹǷ�
									// �Է¹��� ���� 1�� ���� �ε����� ���� �ٲ��ش�.
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		} // ���
	}
	
	public void practice11() {
		// 10�� ������ ���ѷ����� �߰��ؼ� 99�� �Է¹��� �� ���� ���ѷ��� ������ �ȴ�.
		
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
	
	public void Bingo() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ĭ�� ������ �Է��ϼ��� : ");
		int bingoSize = sc.nextInt();
		sc.nextLine();
		
		String[][] bingoArr = new String[bingoSize][bingoSize];
		
		for(int i = 0; i < bingoArr.length; i++) {
			for(int j = 0; j < bingoArr[i].length; j++) {
				System.out.print(i + "�� " + j + "���� ���� ���ڸ� �Է��ϼ��� : ");
				bingoArr[i][j] = sc.nextLine();
			}
		}
		
		while(true) {
			System.out.println("�����Ͻ� ĭ�� ���ٸ� '99'�� �Է��ϼ���.");
			System.out.print("������ ĭ�� ���� �Է��ϼ��� : ");
			int modifyRow = sc.nextInt();
			sc.nextLine();
			
			if(modifyRow == 99) {
				break;
			}
			
			System.out.print("������ ĭ�� ���� �Է��ϼ��� : ");
			int modifyCol = sc.nextInt();
			sc.nextLine();
			
			if(modifyRow >= bingoArr.length || modifyCol >= bingoArr.length) {
				System.out.println("��� ���� �ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.print("�����ϰ� ���� ���ڸ� �Է��ϼ��� : ");
			String modifyNum = sc.nextLine();
			
			bingoArr[modifyRow][modifyCol] = modifyNum; 
		}
		
		while(true) {
			int bingoCount = 0;
			
			System.out.println("\n\n=============�Է��Ͻ� ������=============");
			for(int i = 0; i < bingoArr.length; i++) {
				for(int j = 0; j < bingoArr[i].length; j++) {
					System.out.print(bingoArr[i][j] + "\t");
				}
				System.out.println("\n");
			}

			System.out.print("���ڸ� �����ϼ��� : ");
			String selNum = sc.nextLine();			
			
			for(int i = 0; i < bingoArr.length; i++) {
				for(int j = 0; j < bingoArr[i].length; j++) {
					if(selNum.equals(bingoArr[i][j])) {
						bingoArr[i][j] = "X";
					}
				}
			}
			
			int checkCnt3 = 0;
			
			for(int i = 0; i < bingoArr.length; i++) {
				
				int checkCnt1 = 0;
				int checkCnt2 = 0;
				
				
				for(int j = 0; j < bingoArr[i].length; j++) {
					if(bingoArr[i][j] == "X") {
						checkCnt1++;
						if(checkCnt1 >= bingoArr.length) {
							bingoCount++;
						}
					}
					
					if(bingoArr[j][i] == "X") {
						checkCnt2++;
						if(checkCnt2 >= bingoArr.length) {
							bingoCount++;
						}
					}
					
					if(i == j && bingoArr[i][j] == "X") {
						checkCnt3++;
						if(checkCnt3 >= bingoArr.length) {
							bingoCount++;
						}
					}
				}		
			}
			
			int tmp = bingoArr.length - 1;
			int checkCnt4 = 0;
			
			for(int i = 0; i < bingoArr.length; i++) {
				if(bingoArr[i][tmp] == "X") {
					checkCnt4++;
					if(checkCnt4 >= bingoArr.length) {
						bingoCount++;
					}
				}
				tmp--;
			}
			System.out.println("������ : " + bingoCount);
			
			if(bingoCount >= 3) {
				System.out.println("\n\n=============�Է��Ͻ� ������=============");
				for(int i = 0; i < bingoArr.length; i++) {
					for(int j = 0; j < bingoArr[i].length; j++) {
						System.out.print(bingoArr[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("���� �ϼ�!");
				break;
			}	
		}
	}
}
