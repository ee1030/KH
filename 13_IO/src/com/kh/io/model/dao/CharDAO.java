package com.kh.io.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {

	// 문자 기반 스트림 : 2byte 문자 단위(유니코드)로 데이터를 입력 또는 출력하는 스트림
	public int charFileSave(String fileName, String content, String path) 
			throws IOException {
		int result = 0;
		
		FileWriter fw = new FileWriter(path + "/" + fileName + ".txt");
		
		try {
			fw.write(content);
			// 문자 기반 스트림은
			// 문자만 가지고 있는 데이터를 송수신 하는 용도
			// 문자 기반 스트림의 wirte() 메소드는
			// 모든 문자를 순서대로 내보내도록 내부적으로 구현되어 있음.
			
			result = 1; // 파일 출력 성공시
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close(); // fw가 생성되었으면 닫는다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	// 파일 -> 프로그램 입력
	public String charFileOpen(String path) throws FileNotFoundException {
		StringBuffer sb = null;
		
		FileReader fr = new FileReader(path);
		
		try {
			sb = new StringBuffer();
			
			// FileReader의 read() 메소드는 한 글자씩만 읽어오는게 가능함.
			// 더이상 읽을 내용이 없다면 -1 반환.
			
			int value = 0;
			while((value = fr.read()) != -1) {
				sb.append((char)value);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
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
