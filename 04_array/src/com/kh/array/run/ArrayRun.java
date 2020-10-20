package com.kh.array.run;

import com.kh.array.service.A_Array;
import com.kh.array.service.B_ArraySort;
import com.kh.array.service.C_ArrayOverlap;
import com.kh.array.service.D_ArrayCopy;

public class ArrayRun {
	public static void main(String[] args) {
		A_Array aa = new A_Array();
		//aa.example5();
		
		B_ArraySort bas = new B_ArraySort();
		bas.bsEx2();
		
		C_ArrayOverlap cao = new C_ArrayOverlap();
		//cao.createLottoNumber();
		
		D_ArrayCopy dac = new D_ArrayCopy();
		//dac.example1();
	}
}
