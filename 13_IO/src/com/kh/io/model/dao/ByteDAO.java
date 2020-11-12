package com.kh.io.model.dao;

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
				if(fOut != null) fOut.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
