package com.kh.poly.model.vo;

public class Person extends Animal{

	private String name;

	// �ƹ��� �����ڰ� �ۼ����� ���� ��� �⺻�����ڸ� �����Ϸ��� �߰�����
	public Person() {
		super(); // ��Ӱ��迡 �ִ� �θ� ��ü�� �ڽ� ��ü ���� �� ���ο� �߰��ؾ� �ϹǷ�
				 // �ڽ� ������ ù ��° �ٿ� super() �����ڸ� �ۼ��ؾ� �Ѵ�.
				 // (���ۼ� �� �����Ϸ��� �ڵ� �߰�)
	}
	
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
