package com.kh.io.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	// DAO(Date Access Object)
	// - ������ ����ҿ� �����Ͽ� 
	//   ���� �����͸� �����ϰų� ��� ���� ���޹޴� ������ �ϴ� ��ü
	
	// ����Ʈ ��� ��Ʈ�� : 1byte ������ �����͸� �Է� �Ǵ� ����ϴ� ��Ʈ��
	public int byteFileSave(String fileName, String content, String path) 
			throws FileNotFoundException {
		int result = 0;
		
		// ���α׷� -> ���Ϸ� ���
		// FileOutputStream ���
		
		FileOutputStream fOut 
			= new FileOutputStream(path + "/" + fileName + ".txt" /*, true*/);
		// byte���� �ȿ� �Է¹��� ���ϸ�.txt ������ ����� ��Ʈ����ü ����
		// ** FileOutputStream ��ü ���� ���� �� 
		//    �Ű������� �ۼ��� ������ ���ٸ� -> �ٷ� ����
		//	  �ִٸ� -> ����� �Ǵ� �̾��
		//    -> �Ű������� true �ۼ� �� �̾��
		//       false �Ǵ� ���� �� �����
		
		try {
			for(int i = 0; i < content.length(); i++) {
				// content�� �ۼ��� ������ ������ŭ �ݺ��ϸ�
				// �� ���ھ� ��Ʈ���� ���� ���Ϸ� ���
				fOut.write(content.charAt(i));
			}
			
			result = 1; // 1��ȯ == ��� ����
		} catch(IOException e) {
			e.printStackTrace();
		} finally { // ���� ���̲� Ƣ������ ���� ������ �����ϴ°ž� �� �Ⱥ���
			
			// ��Ʈ���� ����� ��� �ݵ�� ��ȯ�ؾ���.
			try {
				if(fOut != null) fOut.close(); // fOut�� ���� �Ǿ����� �ݴ´�.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public String byteFileOpen(String path) throws FileNotFoundException {
		
		StringBuffer sb = null; // �о�� ���� ������ ������ ����
		
		FileInputStream fis = new FileInputStream(path);
		// FileInputStream ��ü ���� ��
		// �Ű� ������ �ۼ��� path�� �ִ� ���ϰ� ����
		// ���� �ش� ������ ���ٸ� FileNotFoundException�� �߻�
		
		// ����Ʈ ��� ��Ʈ���� read() �޼ҵ��
		// ������ ������ ���������� 1����Ʈ�� �о��.
		// �� �̻� �о�� ������ ���ٸ� -1 ��ȯ.
		
		try {
			sb = new StringBuffer();
			
			int value = 0; // read()�� ���� �о�� ���� �ӽ� ������ ����
			
			while((value = fis.read()) != -1) {
				// while���� �̿��ؼ� read() �޼ҵ尡 -1�� ���ö� ���� �ݺ�
				// �о�� �� value�� char ���·� ����ȯ�Ͽ�
				// sb�� ����
				
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
