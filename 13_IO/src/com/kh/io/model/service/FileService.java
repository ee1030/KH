package com.kh.io.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {
	
	// File Ŭ����
	// - ���� �ý����� ������ ǥ���ϴ� Ŭ����
	
	// File Ŭ���� ���ǻ���
	// - File Ŭ������ ��ü�� �����Ѵٰ� �ؼ� �� ���� ��������°� �ƴ�.
	
	public void example1() {
		// 1. ���� ����
		try {
		File f1 = new File("test123.txt");
		// 					-> ���� �̸��� �����ִ� ���
		//					   ���� ������Ʈ �ֻ���� �ǹ���.
		
		// test123.txt ������ �ִٸ�?
		// -> f1 ������ ���ؼ� ���� etst123.txt ���Ͽ� ������ �� �ְ� ��
		
		// test123.txt ������ ���ٸ�?
		// -> ���� ������Ʈ �ֻ�ܿ� test123.txt ������ ���� �غ� �� �� �ְ� ��.
		f1.createNewFile();
		// -> createNewFile() == ���ο� ������ ����� ��
		// --> �ڹ� ���α׷� -> ���� ��ǻ�� ����ҷ� ������ ���
		// --> �Է� �Ǵ� ��°� ���õ� �޼ҵ�� IOException�� �߻���ų ���ɼ��� ����.
		// --> IOException�� ����ó���� �ݵ�� ����� �ϴ� CheckedException
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
