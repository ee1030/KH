package com.kh.inherit.model.vo;

public final class Child2 extends Parent{
	// final class : ��� �Ұ����� Ŭ����
	// -> �ٸ� Ŭ�������� extends�� ��� ���踦 ���� �� ����.
	
	private String myComputer = "150����¥�� ��ǻ��";
	private String membership = "õ������";
	
	public String getMyComputer() {
		return myComputer;
	}
	public String getMembership() {
		return membership;
	}
	public void setMyComputer(String myComputer) {
		this.myComputer = myComputer;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}

//	//final �޼ҵ�� �������̵� �Ұ�
//	@Override
//	public void hun_yug() {
//		System.out.println("�ƺ��� ����̾� ���!");
//	}
}
