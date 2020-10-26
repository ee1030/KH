package com.kh.collection.list.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.model.vo.Book;

public class ListService {

	public void example1() {
		// 컬렉션이란?
		// - 자료구조가 내장되어있는 자바 클래스
		// 	 (자바에서 제공하는 자료구조 담당 프레임워크)
		
		// 컬렉션 사용 시 주의사항
		// - 컬렉션에 저장할 수 있는 값은 객체만 가능하다.
		// 		-> 기본자료형을 Wrapper 클래스를 이용해서 객체화 해야함
		
		// - 컬렉션은 모든 타입의 객체를 저장할 수 있다.
		// 	-> 반복문 또는 직접 요소에 접근하는 경우
		//	   타입 검사를 하지 않으면 오류가 발생할 수 있다.
		
		// * List
		// - 저장되는 데이터의 순서가 유지된다.(인덱스로 구분)
		// - 저장되는 데이터가 중복되는 값을 가질 수 있음.
		
		List list1 = new ArrayList(); // 다형성
		// 부모(인터페이스) = 자식 객체
		
		// add(E e) : 데이터 추가
		list1.add(new String("Hello"));
		list1.add(new Book("자바의 정석", "남궁성", 30000));
		list1.add(new Integer(100));
		list1.add(300); // auto boxing
		
		// get(int index) : 데이터 얻어오기
		System.out.println(list1.get(0).toString());
		System.out.println(list1.get(1).toString());
		System.out.println(list1.get(2).toString());
		System.out.println(list1.get(3).toString());
		
		// Collection 사용 시 문제점(타입 검사X)
		
		// size() : 저장된 데이터 개수
		for(int i=0; i < list1.size(); i++) {
			// System.out.println(((String)list1.get(i)).length());
								// list1.get(i)를 String 형태로 다운 캐스팅
			
			// 해결 방법 : instanceof를 이용한 타입검사
			if(list1.get(i) instanceof String) {
				System.out.println(((String)list1.get(i)).length());
			} else if (list1.get(i) instanceof Book) {
				System.out.println(((Book)list1.get(i)).getTitle());
			}
		}
	}
	
	public void example2() {
		
		/*
		 * 제네릭(Generics) : <>
		 * - 클래스, 메소드, 컬렉션 내부에서 사용할 클래스 타입을
		 *   한 종류로 제한하는 기능
		 *   
		 * - 컬렉션에 여러 데이터 타입이 저장되면
		 *   사용 시 마다 타입 검사가 필요함. -> 비효율적
		 *   
		 *   --> 제네릭을 이용해서 컬렉션 객체에
		 *   	 저장되는 데이터 타입을 제한함(한 종류)
		 *   		-> 타입검사 불필요 -> 편안~
		 *   
		 * *** 제네릭의 이점 : 컴파일 단계에서 강력한 타입 체크 가능.
		 * 
		 */
		
		List<Book> list = new ArrayList<Book>(); // 기본생정자로 생성하면 10칸 생성됨.
		// Book 타입만 저장할 수 있는 List
		
		System.out.println("초기값 : " + list);
		// 1. isEmpty() : 컬렉션 객체 내부가 비어있는지 확인
		System.out.println("isEmpty() : " + list.isEmpty());
		
		System.out.println("----------------------------------------------");
		
		// 2. add(Book e)
		//    -> 제네릭에 의해 Book 객체만을 전달받게 됨.
		// list.add(new String("Hello")); // 에러
		list.add(new Book("자바의 정석", "남궁성", 30000));
		list.add(new Book("어린왕자", "썡떆쮜뼤리", 8000));
		list.add(new Book("삼국지", "이문열", 200000));
		
		System.out.println("list : " + list);
		System.out.println("isEmpty() : " + list.isEmpty());
		
		// 3. add(int index, Book e) : index위치에 삽입
		// 	  기존에 해당 인덱스에 있던 인스턴스는 다음 index로 밀림
		
		list.add(1, new Book("해리포터", "조앤 K 롤링", 9000));
		// System.out.println("list : " + list);
		
		// 향상된 for문
		// - 배열 또는 컬렉션의 모든 요소에 순차적으로 접근하는 용도로 사용
		
		for(Book book : list) {
			// - list 요소를 하나씩 반복 접근하며 접근한 요소를 book에 저장
			System.out.println(book);
		}
		
		System.out.println("----------------------------------------------");
		
		// 4. set(int index, Book e) 
		// -  해당 인덱스의 요소를 새로운 요소(e)로 변경 하는 것
		list.set(0, new Book("자바의 정석 기초편", "남궁성", 25000));
		printList(list);

		// 5. size() : 컬렉션 내부에 존재하는 인스턴스의 개수를 반환
		System.out.println("----------------------------------------------");
		System.out.println("list.size() : " + list.size());
		
		// 6. remove(int index) : 해당 인덱스에 존재하는 인스턴스를 삭제
		// remove() 호출 시 삭제되는 인스턴스가 반환 됨.
		System.out.println("----------------------------------------------");
		System.out.println(list.remove(0).getTitle() + "이(가) 삭제됨");
		printList(list);
		System.out.println("----------------------------------------------");
		
		// 7. get(int index) : 해당 인덱스에 있는 인스턴스를 얻어옴.
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------------------------");
		// 8. subList(int index1, int index2)
		//	  기존 list에서 index1부터 index2까지 추출
		//    원본 유지
		//    index1 이상 index2 미만
		List<Book> sub = list.subList(0, 2);
		
		System.out.println("====== list =====");
		printList(list);
		System.out.println("====== sub =====");
		printList(sub);
		
		// 9. addAll(Collection c) 
		System.out.println("====== addAll() ======");
		list.addAll(sub);
		printList(list);
		
		// 10. indexOf(Book e)
		// list 요소를 앞에서부터 검사하여
		// 같은 객체가 있는 인덱스를 반환, 없으면 -1을 반환(제일 먼저 검색되는 하나)
		// (같은 객체 == 동등객체 == 값이 같은 객체 --> equals 오버라이딩 필요)
		System.out.println("어린왕자 위치 : " + list.indexOf(new Book("어린왕자", "썡떆쮜뼤리", 8000)));
		System.out.println("어린왕자 위치 : " + list.lastIndexOf(new Book("어린왕자", "썡떆쮜뼤리", 8000)));
		
		// 11. clear() : 모든 인스턴스 삭제
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}
	
	public void printList(List<Book> list) {
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
