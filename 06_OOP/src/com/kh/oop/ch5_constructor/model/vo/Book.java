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
		// this() 생성자
		// 같은 클래스 내에서 다른 생성자를 부를 때 사용
		this(title, author, price);
		this.content = content;
		this.publisher = publisher;
	}
	
	// 오버로딩 : 한 클래스 내에 동일한 이름의 메서드를 여러개 작성하는 기법
	// 조건 1) 메서드명 동일
	// 조건 2) 매개변수의 개수, 타입, 순서가 달라야함
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		// 매개변수 개수 감소(3 -> 2)
	}
	
	public Book(String title, String author, String content) {
		// 마지막 매개변수 타입 변경(int -> String)
	}
	
	public Book(int pirce, String title, String author) {
		// 매개변수 순서 변경
	}
	
//	public Book(String content, String publisher, int price) {
//		// 매개변수 변수명 변경 -> 에러방생
//		// -> 오버로딩 시 매개변수명은 중요하지 않음. 타입만 보면 됨.
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
