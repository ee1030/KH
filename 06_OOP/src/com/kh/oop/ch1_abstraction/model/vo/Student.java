package com.kh.oop.ch1_abstraction.model.vo;

public class Student {
	
	public String name;
	public int age;
	public char gender;
	public String academy;
	public String className;
	public double javaScore;
	
	public void attendance() {
		System.out.println("삐빅. 정상처리되었습니다.");
	}

	public void study() {
		System.out.println("수업시간에 공부합니다.");
	}

	public void test() {
		System.out.println("과락 되지 않게 열심히 볼게요.");
	}

	public void printInformation() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("학원 : " + academy);
		System.out.println("반 : " + className);
		System.out.println("Java 점수 : " + javaScore);
	}
}
