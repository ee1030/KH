package com.kh.array.run;

import com.kh.array.service.A_Array;
import com.kh.array.service.B_ArraySort;
import com.kh.array.service.C_ArrayOverlap;

public class ArrayRun {
	public static void main(String[] args) {
		A_Array aa = new A_Array();
		//aa.example5();
		
		B_ArraySort ba = new B_ArraySort();
		//ba.bubbleSort();
		
		C_ArrayOverlap ca = new C_ArrayOverlap();
		ca.createLottoNumber();
	}
}
