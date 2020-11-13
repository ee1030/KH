package com.kh.io.model.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.io.model.dao.CharDAO;

public class CharService {

	private CharDAO charDAO = new CharDAO();
	
	public int charFileSave(String fileName, String content) 
			throws IOException {
		
		
		File folder = new File("char");
		
		if(!folder.exists()) { // "char" 폴더 없으면 생성해라
			folder.mkdir();
		}
		
		int result = charDAO.charFileSave(fileName, content, "char");
		
		return result;
	}

	public String charFileOpen(String path) throws FileNotFoundException {
		
		return charDAO.charFileOpen(path);
	}
}
