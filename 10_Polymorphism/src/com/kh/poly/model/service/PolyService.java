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
		Animal person = new Person();
		
		// parent.studyJava(); // 자식객체의 고유 기능을 참조할 수 없음
		a.eat();
		person.eat();
		// 프로그램 실행 전(컴파일 단계까지) 
		// person(Animal)이 참조하고 있는 객체는 
		// person객체 내부에 존재하는 Animal 객체의 eat()를 호출함.
		// --> 정적 바인딩
		
		// 프로그램 실행 중
		// person(Animal)이 참조하고 있는 객체의 eat()를 호출하면
		// 내부에 존재하는 Animal 객체의 eat()이 아닌
		// 오버라이딩 된 Person의 eat()를 호출함
		// --> 동적 바인딩
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Animal();
		arr[1] = new Person();
		arr[2] = new Fish();
		arr[3] = new Snake();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].breath();
			// arr의 1, 2, 3 번 인덱스 요소가 참조하고 있는
			// 자식 객체들이 부모인 Animal로 부터 상속받은 
			// breath() 메소드를 오버라이딩 하였기 때문에
			// 컴파일 전에는 부모의 breath로 바인딩 되어 있다가(정적 바인딩)
			// 실행 중에는 각자 오버라이딩 된 breath가 실행된다.(동적 바인딩)
		}
		
		// 부모 참조변수로 자식만의 메소드 호출
		// arr[1].studyJava();
		// 부모 타입 참조변수로는 자식 내 부모 부분만 참조 가능
		
		// 다운 캐스팅
		// 부모 참조 변수 = 자식 객체
		// --> 자식 참조 변수 = 자식 객체
		// 참조변수가 부모 -> 자식으로 변함으로써
		// 자식객체를 온전히 참조할 수 있게 됨.
		
		// (Person)arr[1].studyJava(); // X
		// -> (자료형), . 우선순위가 .이 더 높기 때문에 메소드 호출을 먼저 하게되서 실행 X
		
		System.out.println("\n ===== 다운 캐스팅 =====");
		((Person)arr[1]).studyJava();
		((Fish)arr[2]).swim();
		((Snake)arr[3]).lock();
	}
}
