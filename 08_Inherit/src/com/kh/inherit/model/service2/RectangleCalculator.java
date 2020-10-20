package com.kh.inherit.model.service2;

import com.kh.inherit.model.service.Calculator;

public class RectangleCalculator extends Calculator{
	
	// �ڽĸ��� �ʵ�
	private double saveNum3;
	private double saveNum4;
	
	// �⺻������
	public RectangleCalculator() {
		// �ڽ� Ŭ������ �����ڸ� �̿��ؼ� �ڽ� ��ü ������
		// ���ο� �θ� ��ü�� ������ �Ǿ�� ��
		// -> �θ� ������ ȣ�� == super() ������
		
		// super(); // �ڽ� ��ü ���ο� �θ� ��ü�� ���� ���ִ� ������
		
		// *** ������ �ڵ� ������ ��
		// super() �����ڰ� �����Ǿ� �ִٸ�
		// ������ ���� ù��° �ٿ� super(); ������ �ڵ带 �ڵ��߰���.
	}
	
	// �Ű����� �ִ� ������
	public RectangleCalculator(double saveNum1, double saveNum2, double saveNum3, double saveNum4) {
		// ��ü ���� �� �ѹ��� ��� �ʵ带 �ʱ�ȭ �ϰ��� �ϴ� ���
		// �θ�κ��� ��ӹ��� saveNum1, saveNum2�� �ʱ�ȭ�� �����ؾ� ��
		
		// �θ� �ʵ� �ʱ�ȭ
		// ��� 1) setter ���
		// setSaveNum1(saveNum1);
		// setSaveNum2(saveNum2);
		
		// ��� 2) �θ� ������ ���
		super(saveNum1, saveNum2);
		
		this.saveNum3 = saveNum3;
		this.saveNum4 = saveNum4;
		
		
	}
	
	public void example() {
		System.out.println(MAX_INT); // protected
		// �ٸ� ��Ű�������� ��Ӱ���(�ڽ�)�� �ΰ� �����Ƿ�
		// protected ���������ڰ� ���� MAX_INT�� ���� ������ �� �ִ�.
		
		// System.out.println(MIN_INT); // default
		// default ���������ڴ�
		// ���� ��Ű�� �������� ���� �����ϹǷ�
		// ��� ���迡 �־ �ٸ� ��Ű���� ��� ���� ���� �Ұ�
	}

	// Calculator�� �������� toString() �޼ҵ带 �� ������
	@Override
	public String toString() {
		// super ���� ����
		// ��� ���踦 ���� �ڽ� ��ü ������
		// ���ο� �����ϴ� �θ� ��ü�� ���� �ּҸ� �����ϴ� ��������
		// (����� ������ �ϴ� ���� : this ��������)
		// * �����Ϸ��� ���� �ڵ� �߰���
		return super.toString() + " / " + saveNum3 + " / " + saveNum4;
	}
	
	//�ѷ�
	public double perimeter(double num1, double num2) {
		return (num1 + num2) * 2;
	}
	
	//����
	public double area(double num1, double num2) {
		return num1 * num2;
	}
}
