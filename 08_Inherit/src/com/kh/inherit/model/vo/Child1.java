package com.kh.inherit.model.vo;

public class Child1 extends Parent{
			//�ڽ�           �θ�
	// extends �����
	// - �ڽ� Ŭ������ �θ� Ŭ������ ����ϴ� ��� �ʵ�, �޼ҵ��� ���� �����ϹǷ�
	//   Ȯ�� �Ѵٴ� �ǹ��� ���� ����Ѵ�.
	
	/*
	 * ��� : �ٸ� Ŭ����(�θ�)�� ������ �ִ� ���(�ʵ�, �޼ҵ�)��
	 * 	���� �ۼ��� Ŭ�������� ���� ������ �ʰ�
	 *  �� Ŭ������ �ٸ� Ŭ������ ����� �ڽ��� ���ó�� ����� �� �ִ� ���
	 *  
	 *  ��� ���� : Ŭ������ ����, ������ Ŭ�����鿡 ���� �������� �Ծ� ����
	 *  
	 *  ��� ����
	 *  1) ���� ���� ���� �ڵ�� ���ο� Ŭ������ �ۼ��� �� �ִ�. -> �ڵ��ߺ� ����, ���뼺 ����
	 *  2) �ڵ带 ���������� �����ϱ� ������ ���������� ������. -> ����������, ���꼺 ���
	 */

	private String myCar = "������Ƽ";
	private String myHouse = "���� ��𰣿� ������";
	
	public String getMyCar() {
		return myCar;
	}
	public String getMyHouse() {
		return myHouse;
	}
	public void setMyCar(String myCar) {
		this.myCar = myCar;
	}
	public void setMyHouse(String myHouse) {
		this.myHouse = myHouse;
	}
}
