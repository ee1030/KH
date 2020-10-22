package com.kh.poly.ex1.model.vo;

public class SamsungAP extends AllinOnePrinter{
	
	public SamsungAP() {}
	
	public SamsungAP(String brand, String name) {
		super(brand, name);
	}
	
	// AllinOnePrinter 클래스에서 상속 받은 미완성 메소드를
	// 강제적으로 오버라이딩한다.
	@Override
	public double maxPaperSize() {
		return 210.0;
	}
	
	// 핸드폰 연결
	public void connectPhone() {
		System.out.println("스마트폰과 연결하여 사진 출력 가능");
	}


}
