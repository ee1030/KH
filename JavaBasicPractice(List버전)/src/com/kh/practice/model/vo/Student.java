package com.kh.practice.model.vo;

public class Student {

	private String name;
	private int age;
	private char gender;
	
	// �⺻ ������
	public Student() {}

	// �Ű����� �ִ� ������
	public Student(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// Object.toString() �޼ҵ带 �������̵� �Ͽ� Student ��ü�� �ʵ� ������ ��ȯ
	@Override
	public String toString() {
		return "�̸� : " + name + " | ���� : " + age + " | ���� : " + gender ;
	}
	
	
	
	
	
}
