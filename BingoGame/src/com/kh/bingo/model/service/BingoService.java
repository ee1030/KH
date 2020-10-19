package com.kh.bingo.model.service;

import com.kh.bingo.model.vo.Bingo;

public class BingoService {
	
	private Bingo bingo = new Bingo();
	
	public void setTable(int size) {
		bingo.setBingoSize(size);
		bingo.setBingoTable();
	}
	
	public String[][] getTable() {
		return bingo.getBingoTable();
	}
	
	public void setBingoNum(int row, int col, String num) {
		bingo.getBingoTable()[row][col] = num;
	}
	
	public int checkBingo() {
		int bingoCount = 0;
		int checkCnt3 = 0;
		
		for(int i = 0; i < bingo.getBingoTable().length; i++) {
			
			int checkCnt1 = 0;
			int checkCnt2 = 0;
			
			
			for(int j = 0; j < bingo.getBingoTable()[i].length; j++) {
				if(bingo.getBingoTable()[i][j] == "X") {
					checkCnt1++;
					if(checkCnt1 >= bingo.getBingoTable().length) {
						bingoCount++;
					}
				}
				
				if(bingo.getBingoTable()[j][i] == "X") {
					checkCnt2++;
					if(checkCnt2 >= bingo.getBingoTable().length) {
						bingoCount++;
					}
				}
				
				if(i == j && bingo.getBingoTable()[i][j] == "X") {
					checkCnt3++;
					if(checkCnt3 >= bingo.getBingoTable().length) {
						bingoCount++;
					}
				}
			}		
		}
		
		int tmp = bingo.getBingoTable().length - 1;
		int checkCnt4 = 0;
		
		for(int i = 0; i < bingo.getBingoTable().length; i++) {
			if(bingo.getBingoTable()[i][tmp] == "X") {
				checkCnt4++;
				if(checkCnt4 >= bingo.getBingoTable().length) {
					bingoCount++;
				}
			}
			tmp--;
		}		
		return bingoCount;
	}
	
	
	
	
	
	

//	public void Bingo() { 
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� ĭ�� ������ �Է��ϼ��� : ");
//		int bingoSize = sc.nextInt();
//		sc.nextLine();
//		
//		String[][] bingoArr = new String[bingoSize][bingoSize];
//		
//		for(int i = 0; i < bingoArr.length; i++) {
//			for(int j = 0; j < bingoArr[i].length; j++) {
//				System.out.print(i + "�� " + j + "���� ���� ���ڸ� �Է��ϼ��� : ");
//				bingoArr[i][j] = sc.nextLine();
//			}
//		}
//		
//		while(true) {
//			System.out.println("�����Ͻ� ĭ�� ���ٸ� '99'�� �Է��ϼ���.");
//			System.out.print("������ ĭ�� ���� �Է��ϼ��� : ");
//			int modifyRow = sc.nextInt();
//			sc.nextLine();
//			
//			if(modifyRow == 99) {
//				break;
//			}
//			
//			System.out.print("������ ĭ�� ���� �Է��ϼ��� : ");
//			int modifyCol = sc.nextInt();
//			sc.nextLine();
//			
//			if(modifyRow >= bingoArr.length || modifyCol >= bingoArr.length) {
//				System.out.println("��� ���� �ٽ� �Է��ϼ���.");
//				continue;
//			}
//			
//			System.out.print("�����ϰ� ���� ���ڸ� �Է��ϼ��� : ");
//			String modifyNum = sc.nextLine();
//			
//			bingoArr[modifyRow][modifyCol] = modifyNum; 
//		}
//		
//		while(true) {
//			int bingoCount = 0;
//			
//			System.out.println("\n\n=============�Է��Ͻ� ������=============");
//			for(int i = 0; i < bingoArr.length; i++) {
//				for(int j = 0; j < bingoArr[i].length; j++) {
//					System.out.print(bingoArr[i][j] + "\t");
//				}
//				System.out.println("\n");
//			}
//
//			System.out.print("���ڸ� �����ϼ��� : ");
//			String selNum = sc.nextLine();			
//			
//			for(int i = 0; i < bingoArr.length; i++) {
//				for(int j = 0; j < bingoArr[i].length; j++) {
//					if(selNum.equals(bingoArr[i][j])) {
//						bingoArr[i][j] = "X";
//					}
//				}
//			}
//			
//			int checkCnt3 = 0;
//			
//			for(int i = 0; i < bingoArr.length; i++) {
//				
//				int checkCnt1 = 0;
//				int checkCnt2 = 0;
//				
//				
//				for(int j = 0; j < bingoArr[i].length; j++) {
//					if(bingoArr[i][j] == "X") {
//						checkCnt1++;
//						if(checkCnt1 >= bingoArr.length) {
//							bingoCount++;
//						}
//					}
//					
//					if(bingoArr[j][i] == "X") {
//						checkCnt2++;
//						if(checkCnt2 >= bingoArr.length) {
//							bingoCount++;
//						}
//					}
//					
//					if(i == j && bingoArr[i][j] == "X") {
//						checkCnt3++;
//						if(checkCnt3 >= bingoArr.length) {
//							bingoCount++;
//						}
//					}
//				}		
//			}
//			
//			int tmp = bingoArr.length - 1;
//			int checkCnt4 = 0;
//			
//			for(int i = 0; i < bingoArr.length; i++) {
//				if(bingoArr[i][tmp] == "X") {
//					checkCnt4++;
//					if(checkCnt4 >= bingoArr.length) {
//						bingoCount++;
//					}
//				}
//				tmp--;
//			}
//			System.out.println("������ : " + bingoCount);
//			
//			if(bingoCount >= 3) {
//				System.out.println("\n\n=============�Է��Ͻ� ������=============");
//				for(int i = 0; i < bingoArr.length; i++) {
//					for(int j = 0; j < bingoArr[i].length; j++) {
//						System.out.print(bingoArr[i][j] + "\t");
//					}
//					System.out.println("\n");
//				}
//				System.out.println("���� �ϼ�!");
//				break;
//			}	
//		}
//	}
}
