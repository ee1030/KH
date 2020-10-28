package com.kh.initialQuiz.model.vo;

public class QuizList {
	private String initial;
	private String answer;
	
	public QuizList() {}

	public QuizList(String initial, String answer) {
		super();
		this.initial = initial;
		this.answer = answer;
	}

	public String getInitial() {
		return initial;
	}

	public String getAnswer() {
		return answer;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
