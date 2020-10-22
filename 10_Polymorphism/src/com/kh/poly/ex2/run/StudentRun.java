package com.kh.poly.ex2.run;

import com.kh.poly.ex2.model.service.StudentService;
import com.kh.poly.ex2.model.service.StudentServiceImpl;

public class StudentRun {
	public static void main(String[] args) {
		
		// 인터페이스를 부모 참조변수로 활용
		StudentService service = new StudentServiceImpl();
		// StudentService service = new StdServiceImpl();
		
		long start = System.nanoTime();
		
		service.addStudent("윤익곤");
		service.addStudent("박대길");
		service.addStudent("김덕배");
		service.addStudent("한놈");
		service.addStudent("두시기");
		service.addStudent("석삼");
		service.addStudent("너구리");
		
		long end = System.nanoTime();
		
		System.out.println(end-start);
		System.out.println("정상 수행됨.");
	}
}
