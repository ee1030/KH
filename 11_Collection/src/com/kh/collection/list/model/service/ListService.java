package com.kh.collection.list.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.model.vo.Book;

public class ListService {

	public void example1() {
		// �÷����̶�?
		// - �ڷᱸ���� ����Ǿ��ִ� �ڹ� Ŭ����
		// 	 (�ڹٿ��� �����ϴ� �ڷᱸ�� ��� �����ӿ�ũ)
		
		// �÷��� ��� �� ���ǻ���
		// - �÷��ǿ� ������ �� �ִ� ���� ��ü�� �����ϴ�.
		// 		-> �⺻�ڷ����� Wrapper Ŭ������ �̿��ؼ� ��üȭ �ؾ���
		
		// - �÷����� ��� Ÿ���� ��ü�� ������ �� �ִ�.
		// 	-> �ݺ��� �Ǵ� ���� ��ҿ� �����ϴ� ���
		//	   Ÿ�� �˻縦 ���� ������ ������ �߻��� �� �ִ�.
		
		// * List
		// - ����Ǵ� �������� ������ �����ȴ�.(�ε����� ����)
		// - ����Ǵ� �����Ͱ� �ߺ��Ǵ� ���� ���� �� ����.
		
		List list1 = new ArrayList(); // ������
		// �θ�(�������̽�) = �ڽ� ��ü
		
		// add(E e) : ������ �߰�
		list1.add(new String("Hello"));
		list1.add(new Book("�ڹ��� ����", "���ü�", 30000));
		list1.add(new Integer(100));
		list1.add(300); // auto boxing
		
		// get(int index) : ������ ������
		System.out.println(list1.get(0).toString());
		System.out.println(list1.get(1).toString());
		System.out.println(list1.get(2).toString());
		System.out.println(list1.get(3).toString());
		
		// Collection ��� �� ������(Ÿ�� �˻�X)
		
		// size() : ����� ������ ����
		for(int i=0; i < list1.size(); i++) {
			// System.out.println(((String)list1.get(i)).length());
								// list1.get(i)�� String ���·� �ٿ� ĳ����
			
			// �ذ� ��� : instanceof�� �̿��� Ÿ�԰˻�
			if(list1.get(i) instanceof String) {
				System.out.println(((String)list1.get(i)).length());
			} else if (list1.get(i) instanceof Book) {
				System.out.println(((Book)list1.get(i)).getTitle());
			}
		}
	}
	
	public void example2() {
		
		/*
		 * ���׸�(Generics) : <>
		 * - Ŭ����, �޼ҵ�, �÷��� ���ο��� ����� Ŭ���� Ÿ����
		 *   �� ������ �����ϴ� ���
		 *   
		 * - �÷��ǿ� ���� ������ Ÿ���� ����Ǹ�
		 *   ��� �� ���� Ÿ�� �˻簡 �ʿ���. -> ��ȿ����
		 *   
		 *   --> ���׸��� �̿��ؼ� �÷��� ��ü��
		 *   	 ����Ǵ� ������ Ÿ���� ������(�� ����)
		 *   		-> Ÿ�԰˻� ���ʿ� -> ���~
		 *   
		 * *** ���׸��� ���� : ������ �ܰ迡�� ������ Ÿ�� üũ ����.
		 * 
		 */
		
		List<Book> list = new ArrayList<Book>(); // �⺻�����ڷ� �����ϸ� 10ĭ ������.
		// Book Ÿ�Ը� ������ �� �ִ� List
		
		System.out.println("�ʱⰪ : " + list);
		// 1. isEmpty() : �÷��� ��ü ���ΰ� ����ִ��� Ȯ��
		System.out.println("isEmpty() : " + list.isEmpty());
		
		System.out.println("----------------------------------------------");
		
		// 2. add(Book e)
		//    -> ���׸��� ���� Book ��ü���� ���޹ް� ��.
		// list.add(new String("Hello")); // ����
		list.add(new Book("�ڹ��� ����", "���ü�", 30000));
		list.add(new Book("�����", "�����薧��", 8000));
		list.add(new Book("�ﱹ��", "�̹���", 200000));
		
		System.out.println("list : " + list);
		System.out.println("isEmpty() : " + list.isEmpty());
		
		// 3. add(int index, Book e) : index��ġ�� ����
		// 	  ������ �ش� �ε����� �ִ� �ν��Ͻ��� ���� index�� �и�
		
		list.add(1, new Book("�ظ�����", "���� K �Ѹ�", 9000));
		// System.out.println("list : " + list);
		
		// ���� for��
		// - �迭 �Ǵ� �÷����� ��� ��ҿ� ���������� �����ϴ� �뵵�� ���
		
		for(Book book : list) {
			// - list ��Ҹ� �ϳ��� �ݺ� �����ϸ� ������ ��Ҹ� book�� ����
			System.out.println(book);
		}
		
		System.out.println("----------------------------------------------");
		
		// 4. set(int index, Book e) 
		// -  �ش� �ε����� ��Ҹ� ���ο� ���(e)�� ���� �ϴ� ��
		list.set(0, new Book("�ڹ��� ���� ������", "���ü�", 25000));
		printList(list);

		// 5. size() : �÷��� ���ο� �����ϴ� �ν��Ͻ��� ������ ��ȯ
		System.out.println("----------------------------------------------");
		System.out.println("list.size() : " + list.size());
		
		// 6. remove(int index) : �ش� �ε����� �����ϴ� �ν��Ͻ��� ����
		// remove() ȣ�� �� �����Ǵ� �ν��Ͻ��� ��ȯ ��.
		System.out.println("----------------------------------------------");
		System.out.println(list.remove(0).getTitle() + "��(��) ������");
		printList(list);
		System.out.println("----------------------------------------------");
		
		// 7. get(int index) : �ش� �ε����� �ִ� �ν��Ͻ��� ����.
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------------------------");
		// 8. subList(int index1, int index2)
		//	  ���� list���� index1���� index2���� ����
		//    ���� ����
		//    index1 �̻� index2 �̸�
		List<Book> sub = list.subList(0, 2);
		
		System.out.println("====== list =====");
		printList(list);
		System.out.println("====== sub =====");
		printList(sub);
		
		// 9. addAll(Collection c) 
		System.out.println("====== addAll() ======");
		list.addAll(sub);
		printList(list);
		
		// 10. indexOf(Book e)
		// list ��Ҹ� �տ������� �˻��Ͽ�
		// ���� ��ü�� �ִ� �ε����� ��ȯ, ������ -1�� ��ȯ(���� ���� �˻��Ǵ� �ϳ�)
		// (���� ��ü == ���ü == ���� ���� ��ü --> equals �������̵� �ʿ�)
		System.out.println("����� ��ġ : " + list.indexOf(new Book("�����", "�����薧��", 8000)));
		System.out.println("����� ��ġ : " + list.lastIndexOf(new Book("�����", "�����薧��", 8000)));
		
		// 11. clear() : ��� �ν��Ͻ� ����
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}
	
	public void printList(List<Book> list) {
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
