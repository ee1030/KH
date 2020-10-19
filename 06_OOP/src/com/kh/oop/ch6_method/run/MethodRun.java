package com.kh.oop.ch6_method.run;

import com.kh.oop.ch6_method.service.MethodService;

public class MethodRun {
	public static void main(String[] args) {
		int[] arr = {5, 8, 1, 23, 5, 6, 7, 8, 0};
		System.out.println(MethodService.staticMethod(arr));
//		MethodService ms = new MethodService();
//		ms.displayMenu();
	}
}
