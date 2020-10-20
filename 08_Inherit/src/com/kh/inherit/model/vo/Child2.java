package com.kh.inherit.model.vo;

public final class Child2 extends Parent{
	// final class : 상속 불가능한 클래스
	// -> 다른 클래스에서 extends로 상속 관계를 만들 수 없음.
	
	private String myComputer = "150만원짜리 검퓨터";
	private String membership = "천생연분";
	
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

//	//final 메소드는 오버라이드 불가
//	@Override
//	public void hun_yug() {
//		System.out.println("아빠도 사람이야 사람!");
//	}
}
