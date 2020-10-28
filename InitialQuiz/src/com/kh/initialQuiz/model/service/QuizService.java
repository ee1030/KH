package com.kh.initialQuiz.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.initialQuiz.model.vo.QuizList;

public class QuizService {
	private QuizList[] quiz = { new QuizList("��������", "��󷣵�"),
								new QuizList("����������", "��ٿ�Ÿ��"),
								new QuizList("����", "����"),
								new QuizList("������", "�˶��"),
								new QuizList("����������������", "������������"),
								new QuizList("��������", "���Ҽ�"),
								new QuizList("������", "��Ʈ��"),
								new QuizList("����", "����"),
								new QuizList("������������������", "�����׷쿵�����͹�"),
								new QuizList("������", "�߰���"),
								new QuizList("����", "�õ�"),
								new QuizList("����", "Ÿ¥"),
								new QuizList("����������", "�������ĺ�"),
								new QuizList("��������������", "�巡�����̱�"),
								new QuizList("��������", "���˵���")
						};
	
	private List<QuizList> quizList = new ArrayList<>(Arrays.asList(quiz));
	
	public List<QuizList> allQuiz() {
		return quizList;
	}
	
	public boolean checkAnswer(String answer) {
		for(QuizList quiz : quizList) {
			if(quiz.getAnswer().equals(answer)) {
				return true;
			}
		}
		return false;
	}
	
	public void insertQuiz(QuizList quiz) {
		quizList.add(quiz);
	}
	
}
