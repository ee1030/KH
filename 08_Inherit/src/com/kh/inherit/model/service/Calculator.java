package com.kh.inherit.model.service;

public class Calculator extends Object {
							// -> ���� �� ��� �����Ϸ��� Object ��� ������ �ڵ����� �߰�
	
	// ~ (default) : ���� ��Ű�� ���ο��� ���� ����
	// # (protected) : ���� ��Ű�� + �ٸ� ��Ű�� �� ��Ӱ����� Ŭ�������� ���� ����
	
	final int MIN_INT = -2147483648; 
	protected int MAX_INT = 2147483647;
	
	private double saveNum1;
	private double saveNum2;
	
	
	// get/setter
	public double getSaveNum1() {
		return saveNum1;
	}

	public double getSaveNum2() {
		return saveNum2;
	}

	public void setSaveNum1(double saveNum1) {
		this.saveNum1 = saveNum1;
	}

	public void setSaveNum2(double saveNum2) {
		this.saveNum2 = saveNum2;
	}

	// �⺻ ������
	public Calculator() {}
	
	// �Ű����� �ִ� ������
	public Calculator(double saveNum1, double saveNum2) {
		this.saveNum1 = saveNum1;
		this.saveNum2 = saveNum2;
	}

	// �Ϲ� ��� ����
	public String calculate(double num1, double num2, char op) {
		String result = null;
		
		if(num2 == 0 && (op == '/' || op == '%')) {
			result = "0���� ���� �� �����ϴ�.";
		} else {
			switch(op) {
			case '+' : result = num1 + " + " + num2 + " = " + (num1+num2); break;
			case '-' : result = num1 + " - " + num2 + " = " + (num1-num2); break;
			case '*' : result = num1 + " X " + num2 + " = " + (num1*num2); break;
			case '/' : result = num1 + " / " + num2 + " = " + (num1/num2); break;
			case '%' : result = num1 + " % " + num2 + " = " + (num1%num2); break;
			
			default : result = op + "�����ڴ� �������� �ʽ��ϴ�.";
			}
		}
		
		return result;
	}

	public double squared(double num) {
		return num * num;
	}
	
	// ���丮�� ����
	// 1���� num���� ��� ������ ��
	// 5!
	public int factorial(int num) {
		int result = 1;
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// Object toString() �������̵�
	// �������̵� : ��ӹ��� �θ� �޼ҵ带 �ڽ��� ������ �ϴ� ��
	// ***** �������̵� �ۼ� ����!! *****
	// 1) �޼ҵ���� ����
	// 2) ��ȯ�� ����
	// 3) �Ű����� ����, ����, Ÿ�� ��� ����
	// 4) ���� �����ڴ� ������ ���ų� �� ���� ������ ���� ����
	// 5) ����ó���� ������ ���ų� �� ��ü���� ������ ����
	
	@Override // @Override ������̼� : �����Ϸ����� �������̵��� �� �޼ҵ����� �˷��ִ� ����
	public String toString() {
		// toString() �޼ҵ� �뵵 : ��ü�� ��� �ʵ尪 ��ȯ
		return saveNum1 + " / " + saveNum2;
	}
}
