package com.kh.poly.ex1.model.service;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;
import com.kh.poly.ex1.model.vo.LGAP;
import com.kh.poly.ex1.model.vo.SamsungAP;

public class AbstractService {
	public void example1() {
		
		// 추상클래스를 이용한 객체 생성
		// AllinOnePrinter ap1 = new AllinOnePrinter();
		// -> 추상클래스는 객체 생성이 불가능하다.
		//	  왜? 미완성 클래스라서!
		
		// 추상클래스를 상속받은 클래스로 객체 생성
		SamsungAP sap = new SamsungAP();
		
		// 추상 클래스는 객체 생성은 불가능 하지만
		// 부모 참조 변수로 상속관계에 있는 자식 객체 참조는 가능함.
		AllinOnePrinter ap2 = new SamsungAP();
		
		ap2.setBrand("삼성");
		
		// 객체배열
		// 추상 클래스를 부모타입 참조변수로 활용
		AllinOnePrinter[] apArr = new AllinOnePrinter[2];
		
		// 상속 + 다형성(업캐스팅)
		apArr[0] = new SamsungAP("Samsung", "갤럭시 복합기S1");
		apArr[1] = new LGAP("LG", "V 복합기 v.3D"); 
		
		for(int i = 0; i < apArr.length; i++) {
			// 상속
			System.out.print(apArr[i].getBrand() + " 복합기의 최대 용지 사이즈 : ");
			
			// 오버라이딩 + 동적바인딩
			System.out.println(apArr[i].maxPaperSize()); // 동적 바인딩
			
			// instanceof
			if(apArr[i] instanceof SamsungAP) {
				// 다형성(다운 캐스팅)
				((SamsungAP)apArr[i]).connectPhone();
			} else if(apArr[i] instanceof LGAP){
				// 다형성(다운 캐스팅)
				((LGAP)apArr[i]).print3D();
			}
		}
		
	}
}
