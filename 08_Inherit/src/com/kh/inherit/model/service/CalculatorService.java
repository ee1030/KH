package com.kh.inherit.model.service;

import com.kh.inherit.model.service2.RectangleCalculator;

public class CalculatorService {
	public void example() {
		
		// Calculator Ŭ������ ���� ��Ű��
		Calculator cal = new Calculator();
		
		System.out.println(cal.MIN_INT);
		System.out.println(cal.MAX_INT);
		
		cal.setSaveNum1(100);
		cal.setSaveNum2(3.12345);
		
		System.out.println(cal.toString());
		
		RectangleCalculator rc = new RectangleCalculator(3.14, 2.51, 99.99, 123456);
		System.out.println(rc.toString());
		
		System.out.println(rc);
		// print ���� ���� ������ ���� �������� �ۼ��� ���
		// ���� ���� ��ü�� toString()�� ȣ���� �� �ֵ���
		// �����Ϸ��� .toString()�� �ڵ����� �߰�����
	}
}
