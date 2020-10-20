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
		Animal parent = new Person();
		
		// parent.studyJava(); // �ڽİ�ü�� ���� ����� ������ �� ����
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
