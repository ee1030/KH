package com.kh.io.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	// DAO(Date Access Object)
	// - 데이터 저장소에 접속하여 
	//   실제 데이터를 전송하거나 결과 값을 전달받는 역할을 하는 객체
	
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입력 또는 출력하는 스트림
	public int byteFileSave(String fileName, String content, String path) 
			throws FileNotFoundException {
		int result = 0;
		
		// 프로그램 -> 파일로 출력
		// FileOutputStream 사용
		
		FileOutputStream fOut 
			= new FileOutputStream(path + "/" + fileName + ".txt" /*, true*/);
		// byte폴더 안에 입력받은 파일명.txt 파일을 출력할 스트림객체 생성
		// ** FileOutputStream 객체 생성 성공 시 
		//    매개변수로 작성된 파일이 없다면 -> 바로 생성
		//	  있다면 -> 덮어쓰기 또는 이어쓰기
		//    -> 매개변수에 true 작성 시 이어쓰기
		//       false 또는 생략 시 덮어쓰기
		
		try {
			for(int i = 0; i < content.length(); i++) {
				// content에 작성된 문자의 개수만큼 반복하며
				// 한 글자씩 스트림을 통해 파일로 출력
				fOut.write(content.charAt(i));
			}
			
			result = 1; // 1반환 == 출력 성공
		} catch(IOException e) {
			e.printStackTrace();
		} finally { // 예외 까이꺼 튀나오든 말든 무적권 실행하는거야 난 안봐줘
			
			// 스트림은 사용한 경우 반드시 반환해야함.
			try {
				if(fOut != null) fOut.close(); // fOut이 생성 되었으면 닫는다.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public String byteFileOpen(String path) throws FileNotFoundException {
		
		StringBuffer sb = null; // 읽어올 파일 내용을 저장할 변수
		
		FileInputStream fis = new FileInputStream(path);
		// FileInputStream 객체 생성 시
		// 매개 변수에 작성된 path에 있는 파일과 연결
		// 만약 해당 파일이 없다면 FileNotFoundException이 발생
		
		// 바이트 기반 스트림의 read() 메소드는
		// 파일의 내용을 순차적으로 1바이트씩 읽어옴.
		// 더 이상 읽어올 내용이 없다면 -1 반환.
		
		try {
			sb = new StringBuffer();
			
			int value = 0; // read()를 통해 읽어온 값을 임시 저장할 변수
			
			while((value = fis.read()) != -1) {
				// while문을 이용해서 read() 메소드가 -1이 나올때 까지 반복
				// 읽어온 값 value를 char 형태로 형변환하여
				// sb에 누적
				
				sb.append((char)value);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(sb != null) {
			return sb.toString(); 
		} else {
			return null;
		}
	}
	
}
