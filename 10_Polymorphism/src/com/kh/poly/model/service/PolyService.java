package com.kh.poly.model.service;

import com.kh.poly.model.vo.Animal;
import com.kh.poly.model.vo.Fish;
import com.kh.poly.model.vo.Person;
import com.kh.poly.model.vo.Snake;

public class PolyService {
	public void example1() {
		// * X 50
		// 다형성
		// - 상속을 이용한 기술로 부모 타입 참조변수 하나로 
		//   상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술.
		
		// 부모 참조 = 부모 객체
		Animal a = new Animal();
		
		// 자식 참조 = 자식 객체
		Person p = new Person();
		Fish f = new Fish();
		Snake s = new Snake();
		
		// 기존에 알고있던 정상적인 객체 참조 방법
		// Person Parent = new Person();
		
		// 업캐스팅 : 참조변수의 타입이 부모 타입으로 변경되는 것
		// -> 부모타입의 참조변수로 자식 객체를 참조하는 것
		Animal parent = new Person();
		
		// parent.studyJava(); // 자식객체의 고유 기능을 참조할 수 없음
		a.eat();
		parent.eat();
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Animal();
		arr[1] = new Person();
		arr[2] = new Fish();
		arr[3] = new Snake();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].breath();
		}
	}
}
