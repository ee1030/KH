package com.kh.poly.ex1.model.vo;

public class LGAP extends AllinOnePrinter {
	
	public LGAP() {}
	
	public LGAP(String brand, String name) {
		super(brand, name);
	}

	@Override
	public double maxPaperSize() {
		return 420.0;
	}
	
	public void print3D() {
		System.out.println("��ٷ��� �Ｚ ������ �ſ���� �����ָ� �츮�� �������.");
	}

	@Override
	public void print() {
		System.out.println("�Ｚ���� ������");
	}

	@Override
	public void powerOn() {
		System.out.println("��ġ��");
	}

	@Override
	public void powerOff() {
		System.out.println("��ġ��");
	}

	@Override
	public void scan() {
		System.out.println("�Ｚ���� �����ϰ�");
	}
}
