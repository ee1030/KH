package com.kh.api.model.service;

import java.util.Arrays;
import java.util.StringTokenizer;

import com.kh.api.model.vo.Book;

public class APIService {
	// API(Application Programming Interface)
	// - ���� ���α׷� �Ǵ� ���α׷��� �� �����ϴ� �����
	//   ����� �� �ֵ��� �ϴ� �������̽�
	
	public void  example1() {
		// Object.toString()
		// - ��ӹ��� �ڽ� Ŭ�������� �������̵� �Ͽ�
		//	 �ش� Ŭ������ ��� ���� ������ ����ϴ� �뵵�� ����� �� �ֵ���
		//	 �ڹٿ��� �������ִ� �޼ҵ�.
		
		Book book1 = new Book("������ ���ô� ��", "�̿���", 30000);
		Book book2 = new Book("������ ���ô� ��", "�̿���", 30000);
		Book book3 = new Book("������ ���ô� ��1", "�̿���", 30000);
		
		// print ���� �������� ���� ������ �Է��� ��� .toString()�� ������ �ܰ迡�� �߰���.
		System.out.println(book1);
		System.out.println(book1.toString());
		// toString() �������̵� ��
		// Object.toString() : ��Ű���� ������ Ŭ������ + @ + �ؽ��ڵ� 16���� 
		
		// equals �������̵� Ȯ��
		System.out.println("book1�� boo2�� �����ϴ� ��ü�� �ʵ尪�� ������? " + book1.equals(book2));
		
		System.out.println("book1�� boo3�� �����ϴ� ��ü�� �ʵ尪�� ������? " + book1.equals(book3));
		
		System.out.println();
		
		System.out.println("book1�� hashCode() : " + book1.hashCode());
		// �������̵� �� hashCode() : 366712642
		// �������̵� �� hashCode() : -1875916496
		
		System.out.println("book2�� hashCode() : " + book2.hashCode());
		System.out.println("book3�� hashCode() : " + book3.hashCode());
	}
	
	// equals(), hashCode() �� �� �ϳ��� �������̵� �ϴ� ���
	// ������ �ϳ��� �ݵ�� �������̵� ����
	
	public void  example2() {
		// String Class
		// 1. String Literal(��Ʈ�� ���ͷ�)
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		// str 1, 2, 3�� �񱳿����ڸ� �̿��Ͽ� ��
		System.out.println("str1�� str2�� ������? : " + (str1 == str2));
		System.out.println("str1�� str3�� ������? : " + (str1 == str3));
		
		// System.identityHashCode()
		// -> ���� ��ü�� �����ּҸ� �̿��Ͽ� Ư�� ���� ����� ���� �޼ҵ�
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
	}
	
	public void example3() {
		// String�� �Һ���(immutable)
		// String �����ʹ� �ѹ� �����Ǹ� ������ �ʴ� ������ ��� ����.
		
		String str1 = "abc";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
		
		// str1 ���� �� �ּҰ� Ȯ��
		str1 += "def";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
		
		// String �����ʹ� �ѹ� �����Ǹ� ������ �����Ƿ�
		// ������ ���� ������ ���ο� String �����Ͱ� �����ȴ�.
		// -> ���� String ������ ������ �߻��ϴ� ��� �޸� ���� ��������.
		
		// StringBuffer
		System.out.println();
		System.out.println("StringBuffer Ȱ��");
		
		StringBuffer sb = new StringBuffer(); // �ʱ� �뷮 16�Ҵ�
		System.out.println("sb �뷮 : " + sb.capacity());
		System.out.println("�߰� �� �ּҰ� : " + System.identityHashCode(sb));
		
		// StringBuffer�� ������ �߰�
		sb.append("1234567890123456");
		System.out.println("sb �뷮 : " + sb.capacity());
		System.out.println("�߰� �� �ּҰ� : " + System.identityHashCode(sb));
		
		sb.append("X");
		System.out.println("sb �뷮 : " + sb.capacity());
		System.out.println("�߰� �� �ּҰ� : " + System.identityHashCode(sb));
		
		System.out.println("���� ��� ��� : " + sb.toString());
		
		String lastStr = sb.toString();
		
		System.out.println(lastStr);
	}
	
	public void example4() {
		// String.split(������)
		// ���ڿ��� ������ �����ڸ� �������� �Ͽ� �и��� ��
		// String[]�� ��ȯ�ϴ� �޼ҵ�
		
		String str = "���, �ٳ���, ����, ���ξ���, ������, ���, �ڵ�";
		
		String[] arr = str.split(", ");
		
		// ���� for��(for each��)
		// - �뵵 : Ư�� �迭�� ó������ ������ �ݺ� �����ϴ� �뵵
		for(String s : arr) {
			// arr �迭 ��Ҹ� ������� �ϳ��� ������
			// s ������ ����
			
			System.out.println(s);
		}
		
		// String.join("������", String �迭)
		// - �迭 ��Ҹ� �ϳ��� ���ڿ��� ������ִ� �޼ҵ�
		// - ��� ���̸� ������ �����ڸ� �ۼ��ؾ���.
		String str2 = String.join("-", arr);
		System.out.println("join�� ���ڿ� : " + str2);
	}
	
	public void example5() {
		// StringTokenizer
		// - �����ɶ� ���޹��� ���ڿ��� Ư�� �����ڿ� �°� �����Ͽ� ��ūȭ ��Ŵ
		// (��ū : ���еǴ� ������)
		
		// StringTokenizer(String str)
		// - ���޹��� ���ڿ� ���� \t(tabŰ), \n, \r(���๮��), ���� ��
		//	 ȭ��Ʈ �����̽��� �����ڷ� �Ͽ� ��ūȭ�� ��Ŵ
		String str1 = "�� �������. ���� ���� ���������?";
		StringTokenizer st1 = new StringTokenizer(str1);
		while(st1.hasMoreTokens()) {
			// hasMoreToken() : �����ִ� ��ū�� ������ true
			
			System.out.println(st1.nextToken());
			// nextToken() : ���� ��ū�� ����
		}
		
		System.out.println();
		
		String str2 = "����. ���帰, ����, �����? ������/����";
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		// str2�� ','�� ����
		
		while(st2.hasMoreTokens()) {
			
			System.out.println(st2.nextToken());
		}
		
	}
	
	public void example6() {
		// Wrapper Class
		// wrapper : ������
		// -> �⺻�ڷ����� ��ü�� ����� �� �ֵ��� �����ϴ� Ŭ����
		
		// �� ����ϴ°�?
		// 1) �⺻�ڷ������δ� ������ �� ���� ����� ����ϱ� ���ؼ�
		// - �⺻ �ڷ����� ������ �ִ�/ �ּ� ��
		// - String������ 
		//   ex) "1204" + 1 = 12041
		//		Integer.parseInt("1204") + 1 = 1205
		
		// 2) ��¿�� ���� �⺻�ڷ����� ����� �� ���� ���
		//	  �⺻ �ڷ��� -> ��ü�� ��ȯ�ϱ� ���� ���
		// ex) Object obj = 1; // ������ �ȵ����� jdk 1.5���� ����
		//	   -> Auto Boxing / UnBoxing
	
		// �⺻�ڷ����� Wrapper Class
		/* boolean -> Boolean
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * char -> Character
		 * 
		 */
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String str = "123";
		
		int iNum = Integer.parseInt(str);
		// Integer.parseInt(���ڿ�) : ���ڷθ� �̷���� ���ڿ��� -> int������ ��ȯ
		// parsing(�Ľ�) : �������� ���¸� ����
		
		System.out.println(iNum);
		
		// Boxing : �⺻ �ڷ����� Wrapper Class ��ü�� ����
		int num1 = 10;
		Integer it1 = new Integer(num1); // ����
		
		System.out.println("it1 : " + it1);
		System.out.println(it1.MAX_VALUE);
		
		// UnBoxing : Wrapper Class�� -> �⺻�ڷ���
		int i1 = it1.intValue();
		System.out.println("i1 : " + i1); // �𕾾� 1��
		int i2 = (int)it1;
		
		// Auto Boxing/UnBoxing
		Integer it3 = 100;
		// 100�̶�� ���ڰ� ������ �� �ڵ����� Integer ��ü�� ����ȴ�.
		// --> Auto Boxing
		
		Object it4 = 100;
		
	
		int i3 = it1;
		// int = Integer
		// Auto UnBoxing
		                                                                                                                                                                                                  
	}
}
