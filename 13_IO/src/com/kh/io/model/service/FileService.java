package com.kh.io.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {
	
	// File 클래스
	// - 파일 시스템의 파일을 표현하는 클래스
	
	// File 클래스 주의사항
	// - File 클래스로 객체를 생성한다고 해서 찐 파일 만들어지는거 아님.
	
	public void example1() {
		// 1. 파일 생성
		try {
		File f1 = new File("test123.txt");
		// 					-> 파일 이름만 적혀있는 경우
		//					   현재 프로젝트 최상단을 의미함.
		
		// test123.txt 파일이 있다면?
		// -> f1 변수를 통해서 실제 etst123.txt 파일에 접근할 수 있게 됨
		
		// test123.txt 파일이 없다면?
		// -> 현재 프로젝트 최상단에 test123.txt 파일을 만들어낼 준비를 할 수 있게 됨.
		f1.createNewFile();
		// -> createNewFile() == 새로운 파일을 만드는 것
		// --> 자바 프로그램 -> 실제 컴퓨터 저장소로 파일을 출력
		// --> 입력 또는 출력과 관련된 메소드는 IOException을 발생시킬 가능성이 있음.
		// --> IOException은 예외처리를 반드시 해줘야 하는 CheckedException
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
