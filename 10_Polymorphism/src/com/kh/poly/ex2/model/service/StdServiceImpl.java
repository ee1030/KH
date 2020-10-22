package com.kh.poly.ex2.model.service;

public class StdServiceImpl implements StudentService {

	private String[] stdArr = new String[3];
	private int currentIndex = 0;
	
	@Override
	public void addStudent(String name) {
		
		// currentIndex�� ���� ���� �迭�� ���̿� ���ٸ� 
		// == �迭�� �� á�ٸ� -> 2�� ����
		
		if(currentIndex == stdArr.length) {
			// ���̰� 2�� �� �� ���ο� �迭 ����, �Ҵ�
			String [] newArr = new String[stdArr.length*2];
			
			// ���� ����
			System.arraycopy(stdArr, 0, newArr, 0, stdArr.length);
			
			// ���� ����
			stdArr = newArr;
		}
		
		stdArr[currentIndex] = name;
		currentIndex++;
	}
}
