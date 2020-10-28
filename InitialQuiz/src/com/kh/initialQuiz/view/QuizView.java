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
			System.out.println("---------- 초성퀴즈 -----------");
			System.out.println("| 1. 초성 퀴즈 시작           |");
			System.out.println("| 2. 퀴즈 추가                |");
			System.out.println("| 0. 프로그램 종료            |");
			System.out.println("-------------------------------");
			
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1: startQuiz(); break;
			case 2: insertQuiz(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력 하셨습니다."); break;
			}
			
		} while(sel != 0);
		
		
	}
	
	public void startQuiz() {
		int count = 0;
		List<QuizList> currentQuiz = service.allQuiz();
		
		for(QuizList ql : currentQuiz) {
			boolean flag = true;
			while(true) {
				System.out.println("문제 : " + ql.getInitial());
				System.out.print("정답 : ");
				String answer = sc.nextLine();
				
				flag = service.checkAnswer(answer);
				
				if(flag) {
					System.out.println("정답입니다.");
					count++;
					System.out.println("맞춘 문제 수 : " + count + " / " + currentQuiz.size());
					System.out.println();
					break;
				} else {
					System.out.println("정답이 아닙니다. 다시 입력하세요.");
				}
				
			}
		}
	}
	
	public void insertQuiz() {
		System.out.print("추가할 퀴즈의 초성을 입력하세요 : ");
		String initial = sc.nextLine();
		
		System.out.print("추가할 퀴즈의 답을 입력하세요 : ");
		String answer = sc.nextLine();
		
		service.insertQuiz(new QuizList(initial, answer));
		System.out.println("퀴즈가 추가되었습니다.");
	}
}
