package com.kg.inherit.model.vo;

public class Child1 extends Parent{
			//�ڽ�           �θ�
	// extends �����
	// - �ڽ� Ŭ������ �θ� Ŭ������ ����ϴ� ��� �ʵ�, �޼ҵ��� ���� �����ϹǷ�
	//   Ȯ�� �Ѵٴ� �ǹ��� ���� ����Ѵ�.
	

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
