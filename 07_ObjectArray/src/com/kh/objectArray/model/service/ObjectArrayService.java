package com.kh.objectArray.model.service;

import com.kh.objectArray.model.vo.Book;

public class ObjectArrayService {

	// Service 클래스 내 어디서든 사용 가능한 
	// Book 객체 배열 선언 및 할당, 초기화 
	private Book[] books = { new Book("자바의 정석", "남궁 성", "도우출판", 30000),
			new Book("어린왕자", "생텍쥐베리", "교학사", 8000),
			new Book("자바 쉽죠?", "백동현", "KH출판", 100000),
			new Book("개미", "베르나르 베르베르", "교보문고", 12000),
			new Book("보리 국어사전", "토박이 사전 편찬실", "토박이", 63000)
	}; // 명시적 초기화
	
	
	// 객체 생성 시 초기화 순서
	// JVM 기본값 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
	
	// 기본 생성자
	public ObjectArrayService() {};
	// 생성자에서 필드 초기화를 진행하지 않으면
	// 명시적 초기화 내용이 유지됨.
	
	// 저장된 책 정보를 모두 조회해 String 형태로 반환하는 메서드
	public String selectAll() {
		String str = ""; // 빈 문자열0
		
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
