package com.kh.poly.ex2.model.service;

// StudentService �������̽��� ��� �޾� ������ Ŭ����
public class StudentServiceImpl implements StudentService{
	
	private String[] students = new String[10000];
	private int currentIndex = 0; // ���� �迭�� �����Ͱ� �� �ִ� ������ �ε��� + 1
	
	
	@Override
	public void addStudent(String name) {
		students[currentIndex] = name;
		currentIndex++;
	}
}
