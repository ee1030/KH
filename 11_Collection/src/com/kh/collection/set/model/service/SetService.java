package com.kh.collection.set.model.service;

import java.util.HashSet;
import java.util.Set;

import com.kh.collection.set.model.vo.Student;

public class SetService {

	// Set(����)
	// - �������� ������ �������� ����.
	// - �ߺ����� ������� ����. (null�� �ѹ��� ������ �� �ִ�)
	
	public void example1() {
		// HashSet
		// - ����Ǵ� ��ü�� hashCode()�� �̿��Ͽ� ���� ���θ� �Ǵ�
		//   -> ������ ��ü ����� ��� �ߺ� ���Ÿ� ����
		
		Set<String> set = new HashSet<String>();
		
		set.add("�ȳ��ϻ���");
		set.add("�ȳ��ϸ��ī");
		set.add("�����̴� �ߵɰž� �Ƹ���");
		set.add("�ù谡 ������ �� �Ƹ���");
		
		System.out.println(set.toString());
		
		// �ߺ������� X -> �ߺ�����
		set.add("�ȳ��ϸ��ī");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());
	}
	
	public void example2() {
		// HashSet, Student ���
		// Student�� Ÿ���� ���ѵ� Set ��ü�� �����ϴ� �������� Set
		Set<Student> set = new HashSet<>(); // Ÿ�� �߷� 
		// ���������� ����� ���׸��� ���� �����Ǵ� ��ü�� ���׸��� �߷���.
	
		// ���� ���� X
		set.add(new Student("��浿", 40, 100));
		set.add(new Student("�����", 12, 200));
		set.add(new Student("�Ѹ�", 12, 300));
		
		// �ߺ� ����
		set.add(new Student("��浿", 40, 100));
		// �ߺ� ���Ÿ� ���ؼ��� Student�� equals(), hashCode()�� �������̵� �Ǿ� �־�� ��.
		
		/*
		 * hashCode
		 * - ��ü�� ���� ���� �Ǵ� checkSum(�ߺ� �˻�)
		 * 	 -> ��ü�� ���� �����ϴ� �뵵�� ����
		 */
		
		System.out.println(set);
	}
	
}
