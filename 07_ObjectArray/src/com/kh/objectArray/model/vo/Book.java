package com.kh.objectArray.model.vo;

public class Book {
	// 필드(멤버변수, 클래스 변수)
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	// 생성자
	//기본 생성자
	public Book() {}
	
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	// 메서드

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
	
	// 객체 필드 정보 반환용 메서드
	public String information() {
		return title + " / " + author + " / " + publisher + " / "  + price + "원";
				
	}
}
