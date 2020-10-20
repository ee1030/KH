package com.kh.bingo.view;

import java.util.Scanner;

import com.kh.bingo.model.service.BingoService;

public class BingoView {
	private Scanner sc = new Scanner(System.in);
	
	private BingoService service = new BingoService();
	
	public void displayView() {
		
		int sel = 0;
		
		do {
			System.out.println("========= 빙고 게임 =========");
			System.out.println("1. 게임 시작");
			System.out.println("2. 제작자");
			System.out.println("0. 게임 종료");
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: bingoView(); break;
			case 2: System.out.println("made by 게으른개발자"); break;
			case 0: System.out.println("프로그램 종료");break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
		} while(sel != 0);
	}
	
	public void bingoView() {
		
		System.out.print("빙고 칸의 개수를 입력해주세요 : ");
		service.setTable(sc.nextInt());
		sc.nextLine();
		
		for(int i = 0; i < service.getTable().length; i++) {
			for(int j = 0; j < service.getTable()[i].length; j++) {
				System.out.print(i + "행 " + j + "열의 값을 입력하세요 : ");
				 service.setBingoNum(i, j, sc.nextLine());
			}
		}
		
		modifyTable();
		tableView();
	}
	
	public void modifyTable() {
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
			
			if(modifyRow >= service.getTable().length || modifyCol >= service.getTable().length) {
				System.out.println("행과 열을 다시 입력하세요.");
				continue;
			}
			
			System.out.print("정정하고 싶은 숫자를 입력하세요 : ");
			String modifyNum = sc.nextLine();
			
			service.setBingoNum(modifyRow, modifyCol, modifyNum);
		}
	}
	
	public void tableView() {
		while(true) {		
			System.out.println("\n\n=============입력하신 빙고판=============");
			for(int i = 0; i < service.getTable().length; i++) {
				for(int j = 0; j < service.getTable()[i].length; j++) {
					System.out.print(service.getTable()[i][j] + "\t");
				}
				System.out.println("\n");
			}
			
			System.out.print("숫자를 선택하세요 : ");
			String selNum = sc.nextLine();			
			
			for(int i = 0; i < service.getTable().length; i++) {
				for(int j = 0; j < service.getTable()[i].length; j++) {
					if(selNum.equals(service.getTable()[i][j])) {
						service.getTable()[i][j] = "X";
					}
				}
			}
			
			int bingoCount = service.checkBingo();
			
			System.out.println("빙고갯수 : " + bingoCount);
			
			if(bingoCount >= 3) {
				System.out.println("\n\n=============입력하신 빙고판=============");
				for(int i = 0; i < service.getTable().length; i++) {
					for(int j = 0; j < service.getTable()[i].length; j++) {
						System.out.print(service.getTable()[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("빙고 완성!");
				break;
			}
		}
	}
}
