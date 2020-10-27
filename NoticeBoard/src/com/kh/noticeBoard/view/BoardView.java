package com.kh.noticeBoard.view;

import java.util.Scanner;

public abstract class BoardView {
	Scanner sc = new Scanner(System.in);
	
	public void	displayMainMenu() {
		int sel = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("1. ��ü �Խñ� ��ȸ");
			System.out.println("2. Ư�� ���� �˻�");
			System.out.println("3. �Խñ� �߰�");
			System.out.println("4. �Խñ� ����");
			System.out.println("5. �Խñ� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println("--------------------------------------");
			
			switch(sel) {
			case 1 : viewAll(); break;
			case 2 : subMenu(); break;
			case 3 : createBoard(); break;
			case 4 : updateBoard(); break;
			case 5 : deleteBoard(); break;
			case 0 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(sel != 0);
	}
	


	public void subMenu() {
		int sel = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("1. �������� �˻�");
			System.out.println("2. �ۼ��ڷ� �˻�");
			System.out.println("0. ���θ޴���");
			
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println("--------------------------------------");
			
			switch(sel) {
			case 1 : selectTitle(); break;
			case 2 : selectAuthor(); break;
			case 0 : System.out.println("���θ޴��� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(sel != 0);
	}
	
	// ��ü �Խù��� ��ȸ�ϴ� ���
	public abstract void viewAll();
	
	// �Խñ� ���� ���
	public abstract void createBoard();
	
	// �Խñ� ���� ���
	public abstract void updateBoard();
	
	// �Խñ� ���� ���
	public abstract void deleteBoard();
	
	// ������ ���ؼ� �Խñ��� �˻��ϴ� ���
	public abstract void selectTitle();
	
	// �ۼ��ڸ� ���� �Խñ��� �˻��ϴ� ���
	public abstract void selectAuthor();	
}
