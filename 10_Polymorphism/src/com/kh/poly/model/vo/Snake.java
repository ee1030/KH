package com.kh.poly.model.vo;

public class Snake extends Animal{
	
	private String poison;

	@Override
	public void eat() {
		System.out.println("���� ��°�� ��Ų��.");
	}

	@Override
	public void breath() {
		System.out.println("���� �Ǻ� ȣ���� �Ѵ�.");
	}
	
	public void lock() {
		System.out.println("���� ���̸� ������.");
	}
}
