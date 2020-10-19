package com.kh.objectArray.model.vo;

public class Book {
	// �ʵ�(�������, Ŭ���� ����)
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	// ������
	//�⺻ ������
	public Book() {}
	
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	// �޼���

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// ��ü �ʵ� ���� ��ȯ�� �޼���
	public String information() {
		return title + " / " + author + " / " + publisher + " / "  + price + "��";
				
	}
}
