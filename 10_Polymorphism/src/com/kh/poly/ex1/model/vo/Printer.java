package com.kh.poly.ex1.model.vo;

public interface Printer extends Electronics{
	// �θ� �������̽� - �ڽ� �������̽� : extends(Ȯ��)
	// -> �������̽��� �߻� �޼ҵ常�� ������ ���� �� �����Ƿ�
	//	  �θ�κ��� �߻� �޼ҵ带 ��� ���� ��� 
	//	  �������̵��� �� �� ����. -> ��� �� ���� X
	
	public abstract void print();
	
}
