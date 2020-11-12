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
		// -> f1 변수를 통해서 실제 test123.txt 파일에 접근할 수 있게 됨
		
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
	
	public void example2() {
		// 2. 원하는 위치에 파일 생성
		// 절대 경로를 이용하여 C드라이브에 있는 dev 폴더 안에 파일 생성하기
		
		// 절대 경로 : 최상위 드라이브 또는 폴더로 부터의 경로를 모두 작성하는것
		try {
			File f2 = new File("C:/dev/test.txt");
			if(f2.createNewFile()) {
				System.out.println("파일 생성 성공쓰");
			} else {
				System.out.println("파일 생성 실패쓰");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void example3() {
		// 3. 원하는 위치에 파일 생성
		// 현재 프로젝트의 src 폴더 밑에 text.txt파일 생성하기
		
		// 상대 경로 : 현재 파일의 위치를 기준으로 하여 경로를 작성
		// -> 자바 프로젝트에서 상대경로 : 현재 프로젝트를 기준으로 하여 경로 작성.
		try {
			//	/, \\ 둘다 하위폴더를 의미함
			//	../ 은 상위
			
			// File f3 = new File("C:\\workspace\\KH\\13_IO\\src\\text.txt");
			// File f3 = new File("src/test2.txt");
			File f3 = new File("../test.txt");
			if(f3.createNewFile()) {
				System.out.println("파일 생성 성공쓰");
			} else {
				System.out.println("파일 생성 실패쓰");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void example4() {
		// 존재하지 않는 폴더에 파일 생성하기
		
		// 현재 프로젝트 제일 상단에 temp 폴더를 만들어서
		// 그 안에 test.txt 파일 만들기
		try {
			// 1. temp 폴더가 있는지 확인
			File folder = new File("temp");
			//exists() : 해당 경로에 폴더나 파일이 존재하면 true 반환
			if(!folder.exists()) { // temp 폴더가 존재하지 않는 경우
				if(folder.mkdir()) { // 폴더생성
					System.out.println(folder.getName() + "폴더 생성쓰");
				} else {
					System.out.println("폴더 생성 실패쓰");
				}
			}
			
			File f4 = new File("temp/test.txt");
			
			if(f4.createNewFile()) {
				System.out.println(f4.getName() + " 파일 생성 성공쓰");
			} else {
				System.out.println("파일 생성 실패쓰");
			}
			
			System.out.println("파일명 : " + f4.getName());
			System.out.println("저장 절대 경로 : " + f4.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f4.getPath());
			System.out.println("상위 폴더 : " + f4.getParent());
			System.out.println("파일 용량 : " + f4.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
