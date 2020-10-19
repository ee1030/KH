package com.kh.bingo.model.vo;

public class Bingo {
	
	private int bingoSize;
	private String[][] bingoTable;
	
	public Bingo() {}
	
	public Bingo(int bingoSize, String[][] bingoTable) {
		this.bingoSize = bingoSize;
		this.bingoTable = bingoTable;
	}
	
	public int getBingoSize() {
		return bingoSize;
	}
	
	public String[][] getBingoTable() {
		return bingoTable;
	}
	
	public void setBingoSize(int bingoSize) {
		this.bingoSize = bingoSize;
	}
	
	public void setBingoTable() {
		this.bingoTable = new String[bingoSize][bingoSize];
	}

}
