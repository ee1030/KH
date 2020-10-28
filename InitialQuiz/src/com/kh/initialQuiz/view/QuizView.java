package com.kh.initialQuiz.view;

import java.util.List;
import java.util.Scanner;

import com.kh.initialQuiz.model.service.QuizService;
import com.kh.initialQuiz.model.vo.QuizList;

public class QuizView {
	
	private QuizService service = new QuizService();
	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int sel = 0;
		
		do { 
			System.out.println("---------- �ʼ����� -----------");
			System.out.println("| 1. �ʼ� ���� ����           |");
			System.out.println("| 2. ���� �߰�                |");
			System.out.println("| 0. ���α׷� ����            |");
			System.out.println("-------------------------------");
			
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1: startQuiz(); break;
			case 2: insertQuiz(); break;
			case 0: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է� �ϼ̽��ϴ�."); break;
			}
			
		} while(sel != 0);
		
		
	}
	
	public void startQuiz() {
		int count = 0;
		List<QuizList> currentQuiz = service.allQuiz();
		
		for(QuizList ql : currentQuiz) {
			boolean flag = true;
			while(true) {
				System.out.println("���� : " + ql.getInitial());
				System.out.print("���� : ");
				String answer = sc.nextLine();
				
				flag = service.checkAnswer(answer);
				
				if(flag) {
					System.out.println("�����Դϴ�.");
					count++;
					System.out.println("���� ���� �� : " + count + " / " + currentQuiz.size());
					System.out.println();
					break;
				} else {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				}
				
			}
		}
	}
	
	public void insertQuiz() {
		System.out.print("�߰��� ������ �ʼ��� �Է��ϼ��� : ");
		String initial = sc.nextLine();
		
		System.out.print("�߰��� ������ ���� �Է��ϼ��� : ");
		String answer = sc.nextLine();
		
		service.insertQuiz(new QuizList(initial, answer));
		System.out.println("��� �߰��Ǿ����ϴ�.");
	}
}
