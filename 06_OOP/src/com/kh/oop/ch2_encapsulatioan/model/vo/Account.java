package com.kh.oop.ch2_encapsulatioan.model.vo;

public class Account {

	// VO(Value Object) : 값을 취급하는 객체
	
	// 속성 정의
	// 이름, 계좌번호, 비밀번호, 은행코드, 잔액
	
	// 캡슐화 : 속성, 기능을 묶고, (class의 {}가 속성, 기능을 묶어줌)
	//			외부로부터 멤버 변수에 직접 접근하는 것을 차단
	// 			-> 부가 효과로 정보 은닉이 나타난다.
	
	// 멤버 변수
	// public : 누구나 어디서든 접근 가능
	// private : 같은 클래스(객체) 내에서만 접근 가능
	
	private String name = "유현재"; // 이름
	private String accNum = "123-45-6789"; // 계좌번호
	private int pwd = 1234; // 비밀번호
	private final String BANK_CODE = "002"; // 은행코드
	private int balance = 100000; // 잔액
	
	// public static final double PI = 3.14;
	
	// 기능 정의
	// private으로 외부 직접 접근이 제한된 멤버 변수에
	// 간접 접근이 가능하도록 하는 메소드(기능) 생성
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
//	BANK_CODE는 final(상수) 이므로 값을 변경 할 수 없음.
//	public void setBankCode(String bankCode) {
//		this.BANK_CODE = bankCode;
//	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
