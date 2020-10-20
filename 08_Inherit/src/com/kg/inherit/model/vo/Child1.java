package com.kg.inherit.model.vo;

public class Child1 extends Parent{
			//자식           부모
	// extends 예약어
	// - 자식 클래스가 부모 클래스를 상속하는 경우 필드, 메소드의 양이 증가하므로
	//   확장 한다는 의미의 예약어를 사용한다.
	

	private String myCar = "마세라티";
	private String myHouse = "서울 어디간에 반지하";
	
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
