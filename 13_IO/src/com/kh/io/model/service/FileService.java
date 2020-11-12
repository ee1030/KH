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
		// -> f1 ������ ���ؼ� ���� test123.txt ���Ͽ� ������ �� �ְ� ��
		
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
	
	public void example2() {
		// 2. ���ϴ� ��ġ�� ���� ����
		// ���� ��θ� �̿��Ͽ� C����̺꿡 �ִ� dev ���� �ȿ� ���� �����ϱ�
		
		// ���� ��� : �ֻ��� ����̺� �Ǵ� ������ ������ ��θ� ��� �ۼ��ϴ°�
		try {
			File f2 = new File("C:/dev/test.txt");
			if(f2.createNewFile()) {
				System.out.println("���� ���� ������");
			} else {
				System.out.println("���� ���� ���о�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void example3() {
		// 3. ���ϴ� ��ġ�� ���� ����
		// ���� ������Ʈ�� src ���� �ؿ� text.txt���� �����ϱ�
		
		// ��� ��� : ���� ������ ��ġ�� �������� �Ͽ� ��θ� �ۼ�
		// -> �ڹ� ������Ʈ���� ����� : ���� ������Ʈ�� �������� �Ͽ� ��� �ۼ�.
		try {
			//	/, \\ �Ѵ� ���������� �ǹ���
			//	../ �� ����
			
			// File f3 = new File("C:\\workspace\\KH\\13_IO\\src\\text.txt");
			// File f3 = new File("src/test2.txt");
			File f3 = new File("../test.txt");
			if(f3.createNewFile()) {
				System.out.println("���� ���� ������");
			} else {
				System.out.println("���� ���� ���о�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void example4() {
		// �������� �ʴ� ������ ���� �����ϱ�
		
		// ���� ������Ʈ ���� ��ܿ� temp ������ ����
		// �� �ȿ� test.txt ���� �����
		try {
			// 1. temp ������ �ִ��� Ȯ��
			File folder = new File("temp");
			//exists() : �ش� ��ο� ������ ������ �����ϸ� true ��ȯ
			if(!folder.exists()) { // temp ������ �������� �ʴ� ���
				if(folder.mkdir()) { // ��������
					System.out.println(folder.getName() + "���� ������");
				} else {
					System.out.println("���� ���� ���о�");
				}
			}
			
			File f4 = new File("temp/test.txt");
			
			if(f4.createNewFile()) {
				System.out.println(f4.getName() + " ���� ���� ������");
			} else {
				System.out.println("���� ���� ���о�");
			}
			
			System.out.println("���ϸ� : " + f4.getName());
			System.out.println("���� ���� ��� : " + f4.getAbsolutePath());
			System.out.println("���� ��� ��� : " + f4.getPath());
			System.out.println("���� ���� : " + f4.getParent());
			System.out.println("���� �뷮 : " + f4.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
