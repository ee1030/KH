package com.kh.collection.set.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
		// Set<Student> set = new HashSet<>();
		
		Set<Student> set = new LinkedHashSet<>(); // Ÿ�� �߷� 
		// LinkedHashSet : ������ �����ϴ� set
		
		// ���������� ����� ���׸��� ���� �����Ǵ� ��ü�� ���׸��� �߷���.
	
		// ���� ���� X
		set.add(new Student("��浿", 40, 100));
		set.add(new Student("�����", 12, 200));
		set.add(new Student("�Ѹ�", 12, 300));
		
		// �ߺ� ����
		set.add(new Student("��浿", 40, 100));
		System.out.println(set);
		// �ߺ� ���Ÿ� ���ؼ��� Student�� equals(), hashCode()�� �������̵� �Ǿ� �־�� ��.
		
		/*
		 * hashCode
		 * - ��ü�� ���� ���� �Ǵ� checkSum(�ߺ� �˻�)
		 * 	 -> ��ü�� ���� �����ϴ� �뵵�� ����
		 */
		
		// size()
		System.out.println("set ũ�� : " + set.size());
		
		// remove(Student std) 
		System.out.println("�������� : " + set.remove(new Student("��浿", 40, 100)));
		System.out.println(set);
		
		// set�� ������ ���� ������ ���ϴ� �����͸��� ���� ���� ���� �Ұ���
		// -> ���ο� �ִ� ��� �����͸� �������� �� ������ ���� ����
		
		// 1. Set -> List�� ��ȯ
		System.out.println("---------------------------------------------------");
		System.out.println("Set -> List ��ȯ");
		List<Student> list = new ArrayList<Student>(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 2. Iterator �ݺ��� �̿��� ���
		// ���� : Iterator�� �� �������θ� ���� ����(�ܹ���)
		// -> ListIterator(�����)
		System.out.println("---------------------------------------------------");
		System.out.println("Iterator �ݺ��� �̿�");
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 3. ���� for��
		// �迭 �Ǵ� �÷��� ��ҿ� �ݺ� �����ϴ� �뵵
		System.out.println("---------------------------------------------------");
		System.out.println("���� for�� �̿�");
		for(Student std : set) {
			System.out.println(std);
		}
	}
	
	public void example3() {
		// TreeSet
		// - �˻� ����� ��ȭ�� Set����
		// 	 ���� ������ Ȱ���� ����Ʈ�� �ڷᱸ�� ������ Set
		// - �⺻���� Set�� Ư¡(���� X, �ߺ� X) + ����
		
		Set<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(7);
		
		System.out.println(treeSet);
	}
	
	public void example4() {
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() <= 7) {
			int random = (int)(Math.random()*45+1);
			lotto.add(random);
		}
		
		System.out.println("�ζ� ��ȣ�� : " + lotto);
	}
	
	public void example5() {
		Set<Student> set = new TreeSet<>();
		
		set.add(new Student("����ȣ", 29, 80));
		set.add(new Student("�迵��", 28, 90));
		set.add(new Student("����ȭ", 25, 85));
		set.add(new Student("����", 26, 100));
		set.add(new Student("����", 32, 95));
		
		for(Student std : set) {
			System.out.println(std);
		}
	}
	
	public void example6() {
		// ���� 7�� �Է¹޾�
		// ������ �ζ� ��ȣ�� ��� ��ġ�ϴ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet<>();
		List<Integer> lotto = new ArrayList<Integer>();
		
		System.out.print("���� 7�� �Է� : ");
		String inputNum = sc.nextLine();
		String[] splitArr = inputNum.split(" ");
		
		for(int i = 0; i < 7; i++) {
			set.add((int)(Math.random()*45+1));
			lotto.add(Integer.parseInt(splitArr[i]));
		}
		
		System.out.print("������ �ζ� ��ȣ : ");
		for(int i : set) {
			System.out.print(i + " ");
		}
		
		int count = 0;
		String str = "";
		
		for(int i : set) {
			for(int j = 0; j < lotto.size(); j++) {
				if(i == lotto.get(j)) {
					count++;
					str += (i + " ");
				}	
			}
		}
		
		System.out.println("\n��ġ�ϴ� ��ȣ : " + str);
		System.out.println("���� ���� ���� : " + count);
	}
}
