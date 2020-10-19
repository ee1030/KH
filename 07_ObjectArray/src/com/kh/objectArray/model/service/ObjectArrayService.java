package com.kh.objectArray.model.service;

import com.kh.objectArray.model.vo.Book;

public class ObjectArrayService {

	// Service Ŭ���� �� ��𼭵� ��� ������ 
	// Book ��ü �迭 ���� �� �Ҵ�, �ʱ�ȭ 
	private Book[] books = { new Book("�ڹ��� ����", "���� ��", "��������", 30000),
			new Book("�����", "�����㺣��", "���л�", 8000),
			new Book("�ڹ� ����?", "�鵿��", "KH����", 100000),
			new Book("����", "�������� ��������", "��������", 12000),
			new Book("���� �������", "����� ���� ������", "�����", 63000)
	}; // ����� �ʱ�ȭ
	
	
	// ��ü ���� �� �ʱ�ȭ ����
	// JVM �⺻�� -> ����� �ʱ�ȭ -> �ʱ�ȭ �� -> ������
	
	// �⺻ ������
	public ObjectArrayService() {};
	// �����ڿ��� �ʵ� �ʱ�ȭ�� �������� ������
	// ����� �ʱ�ȭ ������ ������.
	
	// ����� å ������ ��� ��ȸ�� String ���·� ��ȯ�ϴ� �޼���
	public String selectAll() {
		String str = ""; // �� ���ڿ�0
		
		for(int i = 0; i < books.length; i++) {
			str += books[i].information() + "\n";
		}
		
		return str;
	}
	
	public String searchTitle(String title) {
		
		String str = null;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				str = books[i].information();
			}
		}
		
		return str;
	}
	
}
