package com.kh.oop.ch1_abstraction.model.service;

import com.kh.oop.ch1_abstraction.model.vo.Student;

public class AbstractionService {
	public void example() {
		Student std = new Student();
		// Student ��ü�� �����ϰ�, ������ ��ü�� ���� �ּҰ��� std ����
		
		// . ������ : ����, ���� ��� ���� ������
		std.attendance();
		std.study();
		std.test();
	
		std.name = "������";
		std.age = 28;
		std.gender = '��';
		std.academy = "KH����������";
		std.className = "A��";
		std.javaScore = 99.99;
		
		std.printInformation();		
	}

}
