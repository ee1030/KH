package com.kh.poly.model.vo;

public class Snake extends Animal{
	
	private String poison;

	@Override
	public void eat() {
		System.out.println("πÏ¿∫ ≈Î¬∞∑Œ ªÔ≈≤¥Ÿ.");
	}

	@Override
	public void breath() {
		System.out.println("πÏ¿∫ ««∫Œ »£»Ì¿ª «—¥Ÿ.");
	}
	
	public void lock() {
		System.out.println("πÏ¿∫ ∏‘¿Ã∏¶ ¡∂∏•¥Ÿ.");
	}
}
