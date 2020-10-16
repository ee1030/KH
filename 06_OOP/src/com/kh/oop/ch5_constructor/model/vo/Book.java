package com.kh.oop.ch5_constructor.model.vo;

public class Book {
	// �Ӽ�(�ʵ�)
	private String title; // å ����
	private String author; // ����
	private String content; // ����
	private String publisher; // ���ǻ�
	private int price; // ����
	
	public Book() {
		// Ŭ���� ���� �����ڰ� �ϳ��� �ۼ����� ���� ���
		// ������ �� �ڵ����� �⺻ �����ڰ� �߰���
		System.out.println("Book() �⺻ �����ڷ� ������. ��");
	}
		
	// �Ű������� �ִ� ������
	// ��ü ���� �� ���޹��� ���� ��ü �ʵ� �ʱ�ȭ������ �����.
	// �ڵ� �������� �ʰ�, ������ �ʿ信 ���ؼ� �ۼ��Ǵ� ������
	public Book(String title, String author, String content, String publisher, int price) {
		// this() ������
		// ���� Ŭ���� ������ �ٸ� �����ڸ� �θ� �� ���
		this(title, author, price);
		this.content = content;
		this.publisher = publisher;
	}
	
	// �����ε� : �� Ŭ���� ���� ������ �̸��� �޼��带 ������ �ۼ��ϴ� ���
	// ���� 1) �޼���� ����
	// ���� 2) �Ű������� ����, Ÿ��, ������ �޶����
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		// �Ű����� ���� ����(3 -> 2)
	}
	
	public Book(String title, String author, String content) {
		// ������ �Ű����� Ÿ�� ����(int -> String)
	}
	
	public Book(int pirce, String title, String author) {
		// �Ű����� ���� ����
	}
	
//	public Book(String content, String publisher, int price) {
//		// �Ű����� ������ ���� -> �������
//		// -> �����ε� �� �Ű��������� �߿����� ����. Ÿ�Ը� ���� ��.
//	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
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
	public void setContent(String content) {
		this.content = content;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", content=" + content + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
}
