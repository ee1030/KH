package com.kh.poly.ex1.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner {
	// implements : �����ϴ�
	// �θ� �������̽� - �ڽ� Ŭ���� ��� : implements
	// �������̽��� ���� ��� ����
	// * �߻� Ŭ������ �������̽� ��� �� 
	//	 �������̽��� �߻� �޼ҵ带 �������̵� ���� �ʾƵ� ����X
	//   -> ��? �߻� Ŭ������ ���������� �߻� �޼ҵ带 ������ �� �ֱ� ����
	
	// ���ձ�(������, ��ĳ��)
	
	// �߻� Ŭ����
	// - �Ϲ� ���(���� + �ϼ��� �޼ҵ�) + �̿ϼ� �޼ҵ尡 ���Ե� Ŭ����
	// - �̿ϼ� �����̱� ������ new�� �̿��� ��ü ������ �Ұ�����.
	// -> ��, �θ�Ÿ�� ���� �����δ� ��� ������(������)
	
	// �Ϲ� ��� ����
	private String brand;
	private String name;

	// ������
	public AllinOnePrinter() {}

	public AllinOnePrinter(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �̿ϼ� �޼ҵ�(abstract method)
	// -> ��� ���迡 �ִ� �ڽ� �޼ҵ忡�� �������̵��� ����ȭ ��.
	public abstract double maxPaperSize();
}
