package com.kh.oop.ch2_encapsulatioan.model.vo;

public class Account {

	// VO(Value Object) : ���� ����ϴ� ��ü
	
	// �Ӽ� ����
	// �̸�, ���¹�ȣ, ��й�ȣ, �����ڵ�, �ܾ�
	
	// ĸ��ȭ : �Ӽ�, ����� ����, (class�� {}�� �Ӽ�, ����� ������)
	//			�ܺηκ��� ��� ������ ���� �����ϴ� ���� ����
	// 			-> �ΰ� ȿ���� ���� ������ ��Ÿ����.
	
	// ��� ����
	// public : ������ ��𼭵� ���� ����
	// private : ���� Ŭ����(��ü) �������� ���� ����
	
	private String name = "������"; // �̸�
	private String accNum = "123-45-6789"; // ���¹�ȣ
	private int pwd = 1234; // ��й�ȣ
	private String backCode = "002"; // �����ڵ�
	private int balance = 100000; // �ܾ�
	
	// ��� ����
	// private���� �ܺ� ���� ������ ���ѵ� ��� ������
	// ���� ������ �����ϵ��� �ϴ� �޼ҵ�(���) ����
	// == setter/getter
	
	
	public String getName() {
		return name;
	}
	public String getAccNum() {
		return accNum;
	}
	public int getPwd() {
		return pwd;
	}
	public String getBackCode() {
		return backCode;
	}
	public int getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public void setBackCode(String backCode) {
		this.backCode = backCode;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
