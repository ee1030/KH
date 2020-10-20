package com.kh.inherit.model.service;

import com.kh.inherit.model.vo.Child1;
import com.kh.inherit.model.vo.Child2;

public class InheritService {
	public void example1() {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		// c1, c2�� �θ� ��ü�� Parent�� ��� ������ ����� �� ����
		c1.assets -= 100000000; // ù°�� ��� ����
		
		c2.assets += 2500000; // �ƺ���... �ظ��ؼ� ������ �ȳ��� ����ε�... ������ ����...?
		
		// ���� �θ� ��ӹ��� ��ü����
		// �θ� ��� ���� ���� �����ϴ� ���� �ƴ�
		// ���� �θ� ��� ���� ���� �����ϴ� ���̴�.
		System.out.println("c1�� �ڻ� : " + c1.assets);
		System.out.println("c2�� �ڻ� : " + c2.assets);
		
		// �θ��� private �ʵ� �Ǵ� �޼ҵ�� ����� ������
		// �ڽ��� ���� ���� �� �� ����.
		// c1.getGoldBar();
		
		// -> �θ� ��ü�� ���ǵ� private �ʵ� ���� ������ �޼ҵ带 ����ϸ� �ȴ�.
		System.out.println("�������� ���� ���� : " + c1.getGoldBar());
		
		// �ڽĸ��� ������ �ʵ� �Ǵ� �޼ҵ嵵 ��� ������
		System.out.println("c1�� �ڵ��� : " + c1.getMyCar());
		System.out.println("c2�� ��� ��� : " + c2.getMembership());
	}
}
