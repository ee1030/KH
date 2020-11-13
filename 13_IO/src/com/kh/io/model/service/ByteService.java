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
		
		if(!folder.exists()) { // byte ������ �������� �ʴ� ���
			folder.mkdir();
		}
		
		int result = byteDAO.byteFileSave(fileName, content, "byte");
		
		return result; // byteDAO.byteFileSave() �� ���� ����� �״�� View�� ��ȯ
	}

	public String byteFileOpen(String path) throws FileNotFoundException {
		// Service�� DAO�� ������ ������ �Ǵ�
		// ��ȯ���� �����͸� �����ϴ� ����. (����Ͻ� ����)
		
		String content = byteDAO.byteFileOpen(path);
		
		return content;
	}

}
