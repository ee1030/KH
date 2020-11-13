package com.kh.io.model.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.io.model.dao.ByteDAO;

public class ByteService {
	
	private ByteDAO byteDAO = new ByteDAO();

	public int byteFileSave(String fileName, String content) 
			throws FileNotFoundException {
		File folder = new File("byte");
		
		if(!folder.exists()) { // byte 폴더가 존재하지 않는 경우
			folder.mkdir();
		}
		
		int result = byteDAO.byteFileSave(fileName, content, "byte");
		
		return result; // byteDAO.byteFileSave() 의 수행 결과를 그대로 View로 반환
	}

	public String byteFileOpen(String path) throws FileNotFoundException {
		// Service는 DAO로 전달할 데이터 또는
		// 반환받은 데이터를 가공하는 역할. (비즈니스 로직)
		
		String content = byteDAO.byteFileOpen(path);
		
		return content;
	}

}
