package com.kh.api.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	
	// �⺻ ������
	public Book() {}

	// �Ű����� �ִ� ������
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
	
	// Object.equals() �������̵�
	// - equals() �������̵� ���� : �� ��ü�� ���� �������� ���ϴ� �������� ���
	// 								 (���� ��)
	
	// - �������̵� �� : �� ��ü�� �ּҰ��� ������ true �ƴϸ� false
	
	@Override
	public boolean equals(Object obj) {
		
		// ���� �޾ƿ� ��ü�� Book Ÿ���� �´��� �˻�
		if(!(obj instanceof Book)) {
			return false;
		}
		
		// instanceof�� ���� Book ��ü�� �´ٴ� ���� Ȯ���� ���
		// obj ���������� Book ���·� �ٿ� ĳ�����Ͽ� 
		Book other = (Book)obj;
		
		if(!this.title.equals(other.title)) {
			// �ΰ�ü�� ������ ���� ���� ���
			return false;
		} 
		
		else if(!this.author.equals(other.author)) {
			// �� ��ü�� author�� ���� �������
			return false;
		}
		
		else if(this.price != other.price) {
			return false;
		}
		
		return true;
	}
	
	// Object.hashCode() �������̵�
	// - hashCode() �������̵� ���� : �� ��ü�� ���°� ��ġ�ϴ����� ���ϴ� �������� ���
	//										(���� ��)
	
	// - hashCode() �������̵� ���
	//  -> ��������� ����Ǿ� �ִ� �����͸� �̿��ؼ�
	//	   �ٸ� ��ü�� �ߺ����� �ʴ� ���� ��ȯ�ϰ� ����.
	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31; // 17 �Ǵ� 31
		
		result = result * prime + 
				( (title == null) ? 0 : title.hashCode() );
		
		result = result * prime + 
				( (author == null) ? 0 : author.hashCode() );
		
		result = result * prime + price;
		
		return result;
	}
}