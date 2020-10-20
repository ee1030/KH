package com.kh.inherit.model.vo;

public class Parent {
	public int assets = 1000000000;
	private int goldBar = 3;
	
	public int getAssets() {
		return assets;
	}
	public int getGoldBar() {
		return goldBar;
	}
	public void setAssets(int assets) {
		this.assets = assets;
	}
	public void setGoldBar(int goldBar) {
		this.goldBar = goldBar;
	}
	
	public final void hun_yug() {
		System.out.println("니 인생에나 훈수 하세요 제발");
	}
}
