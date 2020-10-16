package com.kh.oop.ch5_constructor.model.service;

import com.kh.oop.ch5_constructor.model.vo.Book;

public class ConstructorService {

	public void example() {
		// �⺻ �����ڸ� �̿��� Book ��ü ����
		Book book1 = new Book();
		System.out.println(book1.toString());
		
		book1.setTitle("�ڹ��� ����");
		book1.setAuthor("���ü�");
		book1.setContent("���� �ڹ� �����϶�� ��");
		book1.setPublisher("��������");
		book1.setPrice(30000);
		
		System.out.println(book1.toString());
		
		Book book2 = new Book("�ڹ�Ĩ����Ǫġ���� ����", "���ùμ�", "���� ���� ����� ��",
				"����߾�����", 50500000);
		System.out.println(book2.toString());
	}
}
