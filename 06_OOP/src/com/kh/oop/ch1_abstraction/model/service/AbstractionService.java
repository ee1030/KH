package com.kh.oop.ch1_abstraction.model.service;

import com.kh.oop.ch1_abstraction.model.vo.Student;

public class AbstractionService {
	public void example() {
		Student std = new Student();
		// Student 객체를 생성하고, 생성된 객체의 시작 주소값을 std 참조
		
		// . 연산자 : 하위, 내부 요소 접근 연산자
		std.attendance();
		std.study();
		std.test();
	
		std.name = "유현재";
		std.age = 28;
		std.gender = '남';
		std.academy = "KH정보교육원";
		std.className = "A반";
		std.javaScore = 99.99;
		
		std.printInformation();		
	}

}
