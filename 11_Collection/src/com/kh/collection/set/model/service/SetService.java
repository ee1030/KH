package com.kh.collection.set.model.service;

import java.util.HashSet;
import java.util.Set;

import com.kh.collection.set.model.vo.Student;

public class SetService {

	// Set(집합)
	// - 데이터의 순서가 존재하지 않음.
	// - 중복값을 허용하지 않음. (null도 한번만 저장할 수 있다)
	
	public void example1() {
		// HashSet
		// - 저장되는 객체를 hashCode()를 이용하여 동일 여부를 판단
		//   -> 동일한 객체 저장될 경우 중복 제거를 진행
		
		Set<String> set = new HashSet<String>();
		
		set.add("안녕하새우");
		set.add("안녕하모니카");
		set.add("동갑이는 잘될거야 아마두");
		set.add("택배가 도착할 걸 아마두");
		
		System.out.println(set.toString());
		
		// 중복데이터 X -> 중복제거
		set.add("안녕하모니카");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());
	}
	
	public void example2() {
		// HashSet, Student 사용
		// Student로 타입이 제한된 Set 객체를 참조하는 참조변수 Set
		Set<Student> set = new HashSet<>(); // 타입 추론 
		// 참조변수에 선언된 제네릭을 통해 생성되는 객체의 제네릭을 추론함.
	
		// 순서 유지 X
		set.add(new Student("고길동", 40, 100));
		set.add(new Student("도우너", 12, 200));
		set.add(new Student("둘리", 12, 300));
		
		// 중복 삽입
		set.add(new Student("고길동", 40, 100));
		// 중복 제거를 위해서는 Student에 equals(), hashCode()가 오버라이딩 되어 있어야 함.
		
		/*
		 * hashCode
		 * - 객체에 대한 서명 또는 checkSum(중복 검사)
		 * 	 -> 객체를 서로 구분하는 용도의 정수
		 */
		
		System.out.println(set);
	}
	
}
