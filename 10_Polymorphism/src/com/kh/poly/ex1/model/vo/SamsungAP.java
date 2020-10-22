package com.kh.poly.ex1.model.vo;

public class SamsungAP extends AllinOnePrinter implements Fax {
						// Ŭ���� ��Ӱ� �������̽� ����� ���ÿ� �� �� �ִ�.
	
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

	@Override
	public void print() {
		System.out.println("��ΰ� ���");
	}

	@Override
	public void powerOn() {
		System.out.println("���� �򽺺�");
		
	}

	@Override
	public void powerOff() {
		System.out.println("���� �򽺺�");
		
	}

	@Override
	public void scan() {
		System.out.println("�����ϰ� ����ϰ�");
		
	}

	@Override
	public void sendFax() {
		System.out.println("��ȣ ������ ����");
	}

	@Override
	public void receiveFax() {
		System.out.println("���� �԰���");
	}
}
