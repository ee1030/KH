package com.kh.poly.ex2.model.service;

// StudentService 인터페이스를 상속 받아 구현한 클래스
public class StudentServiceImpl implements StudentService{
	
	private String[] students = new String[10000];
	private int currentIndex = 0; // 현재 배열의 데이터가 들어가 있는 마지막 인덱스 + 1
	
	
	@Override
	public void addStudent(String name) {
		students[currentIndex] = name;
		currentIndex++;
	}
}
