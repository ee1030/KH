package com.kh.poly.model.vo;

public class Person extends Animal{

	private String name;
	
	@Override
	public void eat() {
		System.out.println("식기를 이용해서 음식을 먹는다.");
	}

	@Override
	public void breath() {
		System.out.println("사람은 코와 입으로 숨을 쉰다.");
	}
	
	public void studyJava() {
		System.out.println("사람은 누구나 자바를 공부할 수 있다.");
	}
	
}
