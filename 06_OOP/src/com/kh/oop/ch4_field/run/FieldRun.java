package com.kh.oop.ch4_field.run;

import com.kh.oop.ch4_field.model.service.FieldService;

public class FieldRun {
	public static void main(String[] args) {
		
		FieldService fs = new FieldService();
		fs.num1 = 10; // ��� ����
		fs.num2 = 20; // static ������ ����ϴ� ���� ����� �ƴϴ�.
		
		System.out.println("fs.num2 : " + fs.num2); // 20
		
		FieldService.num2 = 30; // static ������ ����ϴ� ���� ���
		// Ŭ������.static ������
		
		System.out.println("FieldService.num2 : " + FieldService.num2); // 30
	
		System.out.println("fs.num2 : " + fs.num2); // 30
		
		FieldService fs2 = new FieldService();		
		System.out.println("fs2.num2 : " + fs2.num2); // 30
	}
}
