package com.kh.oop.ch1_abstraction.model.vo;

public class Student {
	
	public String name;
	public int age;
	public char gender;
	public String academy;
	public String className;
	public double javaScore;
	
	public void attendance() {
		System.out.println("�ߺ�. ����ó���Ǿ����ϴ�.");
	}

	public void study() {
		System.out.println("�����ð��� �����մϴ�.");
	}

	public void test() {
		System.out.println("���� ���� �ʰ� ������ ���Կ�.");
	}

	public void printInformation() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("�п� : " + academy);
		System.out.println("�� : " + className);
		System.out.println("Java ���� : " + javaScore);
	}
}
