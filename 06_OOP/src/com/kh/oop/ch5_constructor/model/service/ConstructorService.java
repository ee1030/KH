package com.kh.oop.ch5_constructor.model.service;

import com.kh.oop.ch5_constructor.model.vo.Book;

public class ConstructorService {

	public void example() {
		// 기본 생성자를 이용한 Book 객체 생성
		Book book1 = new Book();
		System.out.println(book1.toString());
		
		book1.setTitle("자바의 정석");
		book1.setAuthor("남궁성");
		book1.setContent("대충 자바 공부하라는 뜻");
		book1.setPublisher("도우출판");
		book1.setPrice(30000);
		
		System.out.println(book1.toString());
		
		Book book2 = new Book("자바칩프라푸치노의 정석", "냄궁민수", "대충 스벅 가라는 뜻",
				"깐따삐야출판", 50500000);
		System.out.println(book2.toString());
	}
}
