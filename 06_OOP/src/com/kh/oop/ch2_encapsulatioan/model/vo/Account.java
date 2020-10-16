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
	private final String BANK_CODE = "002"; // �����ڵ�
	private int balance = 100000; // �ܾ�
	
	// public static final double PI = 3.14;
	
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
	public String getBankCode() {
		return BANK_CODE;
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
//	BANK_CODE�� final(���) �̹Ƿ� ���� ���� �� �� ����.
//	public void setBankCode(String bankCode) {
//		this.BANK_CODE = bankCode;
//	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
