package com.kh.poly.ex1.model.vo;

public class SamsungAP extends AllinOnePrinter{
	
	public SamsungAP() {}
	
	public SamsungAP(String brand, String name) {
		super(brand, name);
	}
	
	// AllinOnePrinter Ŭ�������� ��� ���� �̿ϼ� �޼ҵ带
	// ���������� �������̵��Ѵ�.
	@Override
	public double maxPaperSize() {
		return 210.0;
	}
	
	// �ڵ��� ����
	public void connectPhone() {
		System.out.println("����Ʈ���� �����Ͽ� ���� ��� ����");
	}


}
