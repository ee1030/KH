package com.kh.inherit.model.service;

import com.kh.inherit.model.service2.RectangleCalculator;

public class CalculatorService {
	public void example() {
		
		// Calculator 클래스와 같은 패키지
		Calculator cal = new Calculator();
		
		System.out.println(cal.MIN_INT);
		System.out.println(cal.MAX_INT);
		
		cal.setSaveNum1(100);
		cal.setSaveNum2(3.12345);
		
		System.out.println(cal.toString());
		
		RectangleCalculator rc = new RectangleCalculator(3.14, 2.51, 99.99, 123456);
		System.out.println(rc.toString());
		
		System.out.println(rc);
		// print 관련 구문 내에서 참조 변수명을 작성한 경우
		// 참조 중인 객체의 toString()을 호출할 수 있도록
		// 컴파일러가 .toString()을 자동으로 추가해줌
	}
}
