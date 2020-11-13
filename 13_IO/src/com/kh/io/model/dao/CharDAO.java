package com.kh.io.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {

	// ���� ��� ��Ʈ�� : 2byte ���� ����(�����ڵ�)�� �����͸� �Է� �Ǵ� ����ϴ� ��Ʈ��
	public int charFileSave(String fileName, String content, String path) 
			throws IOException {
		int result = 0;
		
		FileWriter fw = new FileWriter(path + "/" + fileName + ".txt");
		
		try {
			fw.write(content);
			// ���� ��� ��Ʈ����
			// ���ڸ� ������ �ִ� �����͸� �ۼ��� �ϴ� �뵵
			// ���� ��� ��Ʈ���� wirte() �޼ҵ��
			// ��� ���ڸ� ������� ���������� ���������� �����Ǿ� ����.
			
			result = 1; // ���� ��� ������
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close(); // fw�� �����Ǿ����� �ݴ´�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	// ���� -> ���α׷� �Է�
	public String charFileOpen(String path) throws FileNotFoundException {
		StringBuffer sb = null;
		
		FileReader fr = new FileReader(path);
		
		try {
			sb = new StringBuffer();
			
			// FileReader�� read() �޼ҵ�� �� ���ھ��� �о���°� ������.
			// ���̻� ���� ������ ���ٸ� -1 ��ȯ.
			
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
