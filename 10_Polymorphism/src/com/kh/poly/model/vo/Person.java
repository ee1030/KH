package com.kh.poly.model.vo;

public class Person extends Animal{

	private String name;
	
	@Override
	public void eat() {
		System.out.println("�ı⸦ �̿��ؼ� ������ �Դ´�.");
	}

	@Override
	public void breath() {
		System.out.println("����� �ڿ� ������ ���� ����.");
	}
	
	public void studyJava() {
		System.out.println("����� ������ �ڹٸ� ������ �� �ִ�.");
	}
	
}
