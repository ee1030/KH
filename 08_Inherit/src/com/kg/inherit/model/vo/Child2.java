package com.kg.inherit.model.vo;

public class Child2 extends Parent{
	
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
}
