package com.kh.poly.model.vo;

public class Fish extends Animal{
	private int fin; // �������� ����
	
	@Override
	public void eat() {
		System.out.println("������ ���� �������� �Դ´�.");
	}

	@Override
	public void breath() {
		System.out.println("������ �ư��̷� ȣ���Ѵ�.");
	}
	
	public void swim() {
		System.out.println("������ ����� ĥ �� �ִ�.");
	}
}
