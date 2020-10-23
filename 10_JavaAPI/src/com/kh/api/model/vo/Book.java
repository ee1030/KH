package com.kh.api.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	
	// 기본 생성자
	public Book() {}

	// 매개변수 있는 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// get / setter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
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

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	// Object.equals() 오버라이딩
	// - equals() 오버라이딩 목적 : 두 객체의 값이 같은지를 비교하는 목적으로 사용
	// 								 (동등 비교)
	
	// - 오버라이딩 전 : 두 객체의 주소값이 같으면 true 아니면 false
	
	@Override
	public boolean equals(Object obj) {
		
		// 전달 받아온 객체가 Book 타입이 맞는지 검사
		if(!(obj instanceof Book)) {
			return false;
		}
		
		// instanceof를 통해 Book 객체가 맞다는 것을 확인한 경우
		// obj 참조변수를 Book 형태로 다운 캐스팅하여 
		Book other = (Book)obj;
		
		if(!this.title.equals(other.title)) {
			// 두객체의 제목이 같지 않을 경우
			return false;
		} 
		
		else if(!this.author.equals(other.author)) {
			// 두 객체의 author가 같지 않을경우
			return false;
		}
		
		else if(this.price != other.price) {
			return false;
		}
		
		return true;
	}
	
	// Object.hashCode() 오버라이딩
	// - hashCode() 오버라이딩 목적 : 두 객체의 형태가 일치하는지를 비교하는 목적으로 사용
	//										(동일 비교)
	
	// - hashCode() 오버라이딩 방법
	//  -> 멤버변수에 저장되어 있는 데이터를 이용해서
	//	   다른 객체와 중복되지 않는 값을 반환하게 만듦.
	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31; // 17 또는 31
		
		result = result * prime + 
				( (title == null) ? 0 : title.hashCode() );
		
		result = result * prime + 
				( (author == null) ? 0 : author.hashCode() );
		
		result = result * prime + price;
		
		return result;
	}
}