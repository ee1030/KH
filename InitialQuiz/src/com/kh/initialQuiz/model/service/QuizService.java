package com.kh.initialQuiz.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.initialQuiz.model.vo.QuizList;

public class QuizService {
	private QuizList[] quiz = { new QuizList("ㄹㄹㄹㄷ", "라라랜드"),
								new QuizList("ㅇㅂㅇㅌㅇ", "어바웃타임"),
								new QuizList("ㅋㅋ", "코코"),
								new QuizList("ㅇㄹㄷ", "알라딘"),
								new QuizList("ㅇㅂㅈㅅㅇㄷㄱㅇ", "어벤저스엔드게임"),
								new QuizList("ㅂㄹㅍㅅ", "블랙팬서"),
								new QuizList("ㄴㅌㅂ", "노트북"),
								new QuizList("ㄹㅇ", "레옹"),
								new QuizList("ㅅㅈㄱㄹㅇㅇㅌㅇㅂ", "삼진그룹영어토익반"),
								new QuizList("ㅊㄱㅈ", "추격자"),
								new QuizList("ㅅㄷ", "시동"),
								new QuizList("ㅌㅉ", "타짜"),
								new QuizList("ㅈㅈㅎㅎㅂ", "정직한후보"),
								new QuizList("ㄷㄹㄱㄱㄷㅇㄱ", "드래곤길들이기"),
								new QuizList("ㅂㅈㄷㅅ", "범죄도시")
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
