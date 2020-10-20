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
}
