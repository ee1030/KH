package com.kh.poly.model.service;

import com.kh.poly.model.vo.Animal;
import com.kh.poly.model.vo.Fish;
import com.kh.poly.model.vo.Person;
import com.kh.poly.model.vo.Snake;

public class PolyService {
	public void example1() {
		// * X 50
		// ������
		// - ����� �̿��� ����� �θ� Ÿ�� �������� �ϳ��� 
		//   ��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���.
		
		// �θ� ���� = �θ� ��ü
		Animal a = new Animal();
		
		// �ڽ� ���� = �ڽ� ��ü
		Person p = new Person();
		Fish f = new Fish();
		Snake s = new Snake();
		
		// ������ �˰��ִ� �������� ��ü ���� ���
		// Person Parent = new Person();
		
		// ��ĳ���� : ���������� Ÿ���� �θ� Ÿ������ ����Ǵ� ��
		// -> �θ�Ÿ���� ���������� �ڽ� ��ü�� �����ϴ� ��
		Animal person = new Person();
		
		// parent.studyJava(); // �ڽİ�ü�� ���� ����� ������ �� ����
		a.eat();
		person.eat();
		// ���α׷� ���� ��(������ �ܰ����) 
		// person(Animal)�� �����ϰ� �ִ� ��ü�� 
		// person��ü ���ο� �����ϴ� Animal ��ü�� eat()�� ȣ����.
		// --> ���� ���ε�
		
		// ���α׷� ���� ��
		// person(Animal)�� �����ϰ� �ִ� ��ü�� eat()�� ȣ���ϸ�
		// ���ο� �����ϴ� Animal ��ü�� eat()�� �ƴ�
		// �������̵� �� Person�� eat()�� ȣ����
		// --> ���� ���ε�
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Animal();
		arr[1] = new Person();
		arr[2] = new Fish();
		arr[3] = new Snake();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].breath();
			// arr�� 1, 2, 3 �� �ε��� ��Ұ� �����ϰ� �ִ�
			// �ڽ� ��ü���� �θ��� Animal�� ���� ��ӹ��� 
			// breath() �޼ҵ带 �������̵� �Ͽ��� ������
			// ������ ������ �θ��� breath�� ���ε� �Ǿ� �ִٰ�(���� ���ε�)
			// ���� �߿��� ���� �������̵� �� breath�� ����ȴ�.(���� ���ε�)
		}
		
		// �θ� ���������� �ڽĸ��� �޼ҵ� ȣ��
		// arr[1].studyJava();
		// �θ� Ÿ�� ���������δ� �ڽ� �� �θ� �κи� ���� ����
		
		// �ٿ� ĳ����
		// �θ� ���� ���� = �ڽ� ��ü
		// --> �ڽ� ���� ���� = �ڽ� ��ü
		// ���������� �θ� -> �ڽ����� �������ν�
		// �ڽİ�ü�� ������ ������ �� �ְ� ��.
		
		// (Person)arr[1].studyJava(); // X
		// -> (�ڷ���), . �켱������ .�� �� ���� ������ �޼ҵ� ȣ���� ���� �ϰԵǼ� ���� X
		
		System.out.println("\n ===== �ٿ� ĳ���� =====");
		((Person)arr[1]).studyJava();
		((Fish)arr[2]).swim();
		((Snake)arr[3]).lock();
	}
}
