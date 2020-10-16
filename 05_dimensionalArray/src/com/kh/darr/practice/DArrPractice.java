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
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
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
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] chArr = new char[row][];
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기 : ");
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
		String[] students =  {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
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
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] students =  {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
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
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String stdName = sc.nextLine();
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				if(stdName.equals(group1[i][j])) {
					if(j == 0) {
						System.out.println("검색하신 " + stdName + " 학생은 1분단" + (i+1) + "번째 줄 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + stdName + " 학생은 1분단" + (i+1) + "번째 줄 오른쪽에 있습니다.");
					}
				}
			}
		}
		
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				if(stdName.equals(group2[i][j])) {
					if(j == 0) {
						System.out.println("검색하신 " + stdName + " 학생은 2분단" + (i+1) + "번째 줄 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + stdName + " 학생은 2분단" + (i+1) + "번째 줄 오른쪽에 있습니다.");
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
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
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
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			
			if(row == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
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
