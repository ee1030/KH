package com.kh.poly.ex1.model.vo;

public class LGAP extends AllinOnePrinter {
	
	public LGAP() {}
	
	public LGAP(String brand, String name) {
		super(brand, name);
	}

	@Override
	public double maxPaperSize() {
		return 420.0;
	}
	
	public void print3D() {
		System.out.println("기다려라 삼성 엘지의 매운맛을 보여주마 우리는 쓰리디다.");
	}
}
