package com.kh.darr.practice;

import java.util.Scanner;

public class DArrPractice {

	public void pratice1() {
		String[][] arr = new String[3][3]; // 3행 3열 배열 선언
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		} // 바깥쪽 for문은 행 안쪽 for문은 열에다가 문자열을 넣는다
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		} // 출력
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}  // count 변수를 선언해서 반복문 안에서 초기화 되지 않게 하여 1부터 순서대로 16까지 넣을 수 있도록 한다.
		
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
			} // count 변수를 16부터 1씩 감소시켜 거꾸로 저장
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
			if(i == arr.length-1) { // i 값이 arr.length - 1이면 마지막 행이라는 뜻이므로 마지막행일때
				for(int j = 0; j < arr.length; j++) {
					arr[i][j] = arr[0][j] + arr[1][j] + arr[2][j];
				} // j값은 고정, 함으로써 각행의 같은 열의 값을 더해 해당 열의 마지막행에 넣는다.
			} else {
				for(int j = 0; j < arr[0].length; j++) { // 마지막 행이 아닐경우
					if(j == arr[0].length-1) {
						arr[i][j] = arr[i][0] + arr[i][1] + arr[i][2]; // i행의 마지막 열에서는 i행 각 열의 값을 더한 값을 넣고
					} else {
						arr[i][j] = (int)(Math.random()*10+1); // 마지막열이 아닐 경우 1 ~~ 10 사이 난수를 넣는다.
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		} // 출력
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr;
		
		while(true) { // 무한루프 이용
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
				continue;
			} // 입력 받은뒤 바로 옳은 입력인지 검사하고 아닐경우 continue를 이용하여 다시 반복문 처음으로 돌아간다.
			
			arr = new char[row][col]; // 입력받은 행과 열 만큼의 이차원 배열을 할당
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					int randNum = (int)(Math.random()*90+1); // 정수형 변수 randNum에 1 ~ 90 사이의 난수를 발생시키고 
					arr[i][j] = (char)randNum; // 배열에 순서대로 randNum 변수를 문자형으로 강제 형변환해 넣는다.
					if(randNum < 65) {
						j--;
					} // 단 randNum이 65이하이면 j를 1 감소시켜 다시 난수를 입력하게 한다. 대문자 A의 값이 65이므로 
					  // 이하로 내려가면 다른 문자가 나오기 때문
				}
			}
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			} // 출력
			
			break; // 출력이 끝나면 무한루프를 빠져나온다.
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			// 배열 선언
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " "); // j행 i열이 나오도록 출력하면 행을 먼저 출력한뒤 다음 열을 출력하게 된다.
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		// 가변 배열 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] chArr = new char[row][]; // 입력받은 행의 크기만큼을 가진 이차원배열 선언 및 할당.
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			chArr[i] = new char[col];
		} // 앞에서 열의 크기는 할당하지 않았으므로 반복문을 통해 행의 크기만큼 열의 크기를 입력받고 각 행에 열의 크기만큼을 할당.
		
		char firstCh = 'a'; // a부터 순서대로 넣어야 하기때문에 제일 처음 문자인 'a'로 초기화한 firstCh 문자형 변수 선언.
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) { // chArr[i].length 로 조건식을 만든 이유는
													   // 가변배열이라 각 행마다 열의 크기가 다르기 때문
				chArr[i][j] = firstCh;
				firstCh++; // firstCh 변수를 1씩 증가시키므로써 a 다음 문자들을 저장할 수 있도록 함
			}
		}
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		} // 출력
	}
	
	public void practice8() {
		String[] students =  {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"}; // 학생 이름이 담긴 배열 초기화
		
		String[][] group1 = new String[3][2]; 
		String[][] group2 = new String[3][2]; // 2차원 배열을 2개 선언 
		
		int count = 0; // 1차원 배열에 존재하는 학생을 순서대로 가져오기 위해 0으로 초기화된 count 변수를 선언
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[count];
				count++; // 첫번째 2차원 배열에 1차원 배열에 있는 학생을 넣을때마다 count값을 증가시킨다.
			}
		}
	
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[count];
				count++; // 첫번째 2차원 배열이 다 차고나면 반복문을 한번 더 실행하여 두번째 2차원 배열에 나머지 학생들을 넣는다.
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				System.out.print(group1[i][j] + "  ");
			}
			System.out.println();
		} // 첫번째 2차원 배열 출력
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				System.out.print(group2[i][j] + "  ");
			}
			System.out.println();
		} // 두번째 2차원 배열 출력
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
		} // 여기까진 8번 문제와 동일
		
		System.out.println("============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String stdName = sc.nextLine(); // 검색할 학생 이름을 입력받아 stdName 변수에 저장
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				if(stdName.equals(group1[i][j])) {
					if(j == 0) {
						System.out.println("검색하신 " + stdName + " 학생은 1분단" + (i+1) + "번째 줄 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + stdName + " 학생은 1분단" + (i+1) + "번째 줄 오른쪽에 있습니다.");
					}
				} // 첫번째 2차원 배열을 돌면서 입력받은 이름을 가진 학생과 같은 값을 가진 인덱스가 있는지 검사하고
				  // 같은값을 가진 인덱스가 존재할 경우 j값이 0일 경우 왼쪽이고 1일 경우 오른쪽이기 때문에 
				  // 조건문을 이용하여 j값을 검사 한 후 출력
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
				} // 마찬가지로 첫번째 2차원 배열에 값이 없을 경우에는 두번째 2차원 배열에서 검색해서 찾는다.
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
					// 0번째 행에는 열 인덱스가 들어가야 하고 배열의 0행 0열에는 공백이 들어가야 하므로
					// i값이 0이고  j값이 0이 아닐경우에 j-1값을 문자열로 변환하여 넣는다.
				} else if(i != 0 && j == 0) { 
					strArr[i][j] = Integer.toString(i-1);
					// 0번째 열에는 행 인덱스가 들어가야 하고 배열의 0행 0열에는 공백이 들어가야 하므로
					// j값이 0이고  i값이 0이 아닐경우에 i-1값을 문자열로 변환하여 넣는다.
				} else {
					strArr[i][j] = " "; // 나머지는 모두 공백으로 채운다.
				}
			}
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		strArr[row+1][col+1] = "X"; // 입력받은 행과 열의 인덱스 값을 X로 바꿔준다. 단, 0번째 행과 열은 인덱스를 나타내야 하므로
									// 입력받은 값에 1을 더한 인덱스의 값을 바꿔준다.
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		} // 출력
	}
	
	public void practice11() {
		// 10번 문제에 무한루프만 추가해서 99를 입력받을 때 까지 무한루프 돌리면 된다.
		
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
	
	public void Bingo() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고 칸의 갯수를 입력하세요 : ");
		int bingoSize = sc.nextInt();
		sc.nextLine();
		
		String[][] bingoArr = new String[bingoSize][bingoSize];
		
		for(int i = 0; i < bingoArr.length; i++) {
			for(int j = 0; j < bingoArr[i].length; j++) {
				System.out.print(i + "행 " + j + "열에 넣을 숫자를 입력하세요 : ");
				bingoArr[i][j] = sc.nextLine();
			}
		}
		
		while(true) {
			System.out.println("수정하실 칸이 없다면 '99'를 입력하세요.");
			System.out.print("수정할 칸의 행을 입력하세요 : ");
			int modifyRow = sc.nextInt();
			sc.nextLine();
			
			if(modifyRow == 99) {
				break;
			}
			
			System.out.print("수정할 칸의 열을 입력하세요 : ");
			int modifyCol = sc.nextInt();
			sc.nextLine();
			
			if(modifyRow >= bingoArr.length || modifyCol >= bingoArr.length) {
				System.out.println("행과 열을 다시 입력하세요.");
				continue;
			}
			
			System.out.print("정정하고 싶은 숫자를 입력하세요 : ");
			String modifyNum = sc.nextLine();
			
			bingoArr[modifyRow][modifyCol] = modifyNum; 
		}
		
		while(true) {
			int bingoCount = 0;
			
			System.out.println("\n\n=============입력하신 빙고판=============");
			for(int i = 0; i < bingoArr.length; i++) {
				for(int j = 0; j < bingoArr[i].length; j++) {
					System.out.print(bingoArr[i][j] + "\t");
				}
				System.out.println("\n");
			}

			System.out.print("숫자를 선택하세요 : ");
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
			System.out.println("빙고갯수 : " + bingoCount);
			
			if(bingoCount >= 3) {
				System.out.println("\n\n=============입력하신 빙고판=============");
				for(int i = 0; i < bingoArr.length; i++) {
					for(int j = 0; j < bingoArr[i].length; j++) {
						System.out.print(bingoArr[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("빙고 완성!");
				break;
			}	
		}
	}
}
