package com.kh.oop.ch5_constructor.model.vo;

public class Book {
	// 속성(필드)
	private String title; // 책 제목
	private String author; // 저자
	private String content; // 내용
	private String publisher; // 출판사
	private int price; // 가격
	
	public Book() {
		// 클래스 내에 생성자가 하나도 작성되지 않은 경우
		// 컴파일 시 자동으로 기본 생성자가 추가됨
		System.out.println("Book() 기본 생성자로 생성됨. ㅎ");
	}
		
	// 매개변수가 있는 생성자
	// 객체 생성 시 전달받은 값을 객체 필드 초기화용으로 사용함.
	// 자동 생성되지 않고, 개발자 필요에 의해서 작성되는 생성자
	public Book(String title, String author, String content, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.content = content;
		this.publisher = publisher;
		this.price = price;
	}
	
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
