package com.kh.poly.ex2.run;

import com.kh.poly.ex2.model.service.StudentService;
import com.kh.poly.ex2.model.service.StudentServiceImpl;

public class StudentRun {
	public static void main(String[] args) {
		
		// �������̽��� �θ� ���������� Ȱ��
		StudentService service = new StudentServiceImpl();
		// StudentService service = new StdServiceImpl();
		
		long start = System.nanoTime();
		
		service.addStudent("���Ͱ�");
		service.addStudent("�ڴ��");
		service.addStudent("�����");
		service.addStudent("�ѳ�");
		service.addStudent("�νñ�");
		service.addStudent("����");
		service.addStudent("�ʱ���");
		
		long end = System.nanoTime();
		
		System.out.println(end-start);
		System.out.println("���� �����.");
	}
}
