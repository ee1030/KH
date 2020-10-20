package com.kh.bingo.view;

import java.util.Scanner;

import com.kh.bingo.model.service.BingoService;

public class BingoView {
	private Scanner sc = new Scanner(System.in);
	
	private BingoService service = new BingoService();
	
	public void displayView() {
		
		int sel = 0;
		
		do {
			System.out.println("========= ���� ���� =========");
			System.out.println("1. ���� ����");
			System.out.println("2. ������");
			System.out.println("0. ���� ����");
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: bingoView(); break;
			case 2: System.out.println("made by ������������"); break;
			case 0: System.out.println("���α׷� ����");break;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		} while(sel != 0);
	}
	
	public void bingoView() {
		
		System.out.print("���� ĭ�� ������ �Է����ּ��� : ");
		service.setTable(sc.nextInt());
		sc.nextLine();
		
		for(int i = 0; i < service.getTable().length; i++) {
			for(int j = 0; j < service.getTable()[i].length; j++) {
				System.out.print(i + "�� " + j + "���� ���� �Է��ϼ��� : ");
				 service.setBingoNum(i, j, sc.nextLine());
			}
		}
		
		modifyTable();
		tableView();
	}
	
	public void modifyTable() {
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
			
			if(modifyRow >= service.getTable().length || modifyCol >= service.getTable().length) {
				System.out.println("��� ���� �ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.print("�����ϰ� ���� ���ڸ� �Է��ϼ��� : ");
			String modifyNum = sc.nextLine();
			
			service.setBingoNum(modifyRow, modifyCol, modifyNum);
		}
	}
	
	public void tableView() {
		while(true) {		
			System.out.println("\n\n=============�Է��Ͻ� ������=============");
			for(int i = 0; i < service.getTable().length; i++) {
				for(int j = 0; j < service.getTable()[i].length; j++) {
					System.out.print(service.getTable()[i][j] + "\t");
				}
				System.out.println("\n");
			}
			
			System.out.print("���ڸ� �����ϼ��� : ");
			String selNum = sc.nextLine();			
			
			for(int i = 0; i < service.getTable().length; i++) {
				for(int j = 0; j < service.getTable()[i].length; j++) {
					if(selNum.equals(service.getTable()[i][j])) {
						service.getTable()[i][j] = "X";
					}
				}
			}
			
			int bingoCount = service.checkBingo();
			
			System.out.println("������ : " + bingoCount);
			
			if(bingoCount >= 3) {
				System.out.println("\n\n=============�Է��Ͻ� ������=============");
				for(int i = 0; i < service.getTable().length; i++) {
					for(int j = 0; j < service.getTable()[i].length; j++) {
						System.out.print(service.getTable()[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println("���� �ϼ�!");
				break;
			}
		}
	}
}
