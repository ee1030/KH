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

	// Set(집합)
	// - 데이터의 순서가 존재하지 않음.
	// - 중복값을 허용하지 않음. (null도 한번만 저장할 수 있다)
	
	public void example1() {
		// HashSet
		// - 저장되는 객체를 hashCode()를 이용하여 동일 여부를 판단
		//   -> 동일한 객체 저장될 경우 중복 제거를 진행
		
		Set<String> set = new HashSet<String>();
		
		set.add("안녕하새우");
		set.add("안녕하모니카");
		set.add("동갑이는 잘될거야 아마두");
		set.add("택배가 도착할 걸 아마두");
		
		System.out.println(set.toString());
		
		// 중복데이터 X -> 중복제거
		set.add("안녕하모니카");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());
	}
	
	public void example2() {
		// HashSet, Student 사용
		// Student로 타입이 제한된 Set 객체를 참조하는 참조변수 Set
		// Set<Student> set = new HashSet<>();
		
		Set<Student> set = new LinkedHashSet<>(); // 타입 추론 
		// LinkedHashSet : 순서를 유지하는 set
		
		// 참조변수에 선언된 제네릭을 통해 생성되는 객체의 제네릭을 추론함.
	
		// 순서 유지 X
		set.add(new Student("고길동", 40, 100));
		set.add(new Student("도우너", 12, 200));
		set.add(new Student("둘리", 12, 300));
		
		// 중복 삽입
		set.add(new Student("고길동", 40, 100));
		System.out.println(set);
		// 중복 제거를 위해서는 Student에 equals(), hashCode()가 오버라이딩 되어 있어야 함.
		
		/*
		 * hashCode
		 * - 객체에 대한 서명 또는 checkSum(중복 검사)
		 * 	 -> 객체를 서로 구분하는 용도의 정수
		 */
		
		// size()
		System.out.println("set 크기 : " + set.size());
		
		// remove(Student std) 
		System.out.println("삭제성공 : " + set.remove(new Student("고길동", 40, 100)));
		System.out.println(set);
		
		// set은 순서가 없기 때문에 원하는 데이터만을 꺼내 보는 것이 불가능
		// -> 내부에 있는 모든 데이터를 무작위로 다 꺼내는 것은 가능
		
		// 1. Set -> List로 변환
		System.out.println("---------------------------------------------------");
		System.out.println("Set -> List 변환");
		List<Student> list = new ArrayList<Student>(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 2. Iterator 반복자 이용한 출력
		// 단점 : Iterator는 한 방향으로만 접근 가능(단방향)
		// -> ListIterator(양방향)
		System.out.println("---------------------------------------------------");
		System.out.println("Iterator 반복자 이용");
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 3. 향상된 for문
		// 배열 또는 컬렉션 요소에 반복 접근하는 용도
		System.out.println("---------------------------------------------------");
		System.out.println("향상된 for문 이용");
		for(Student std : set) {
			System.out.println(std);
		}
	}
	
	public void example3() {
		// TreeSet
		// - 검색 기능이 강화된 Set으로
		// 	 계층 구조를 활용한 이진트리 자료구조 형태의 Set
		// - 기본적인 Set의 특징(순서 X, 중복 X) + 정렬
		
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
		
		System.out.println("로또 번호는 : " + lotto);
	}
	
	public void example5() {
		Set<Student> set = new TreeSet<>();
		
		set.add(new Student("이준호", 29, 80));
		set.add(new Student("김영주", 28, 90));
		set.add(new Student("김정화", 25, 85));
		set.add(new Student("고보석", 26, 100));
		set.add(new Student("박희도", 32, 95));
		
		for(Student std : set) {
			System.out.println(std);
		}
	}
	
	public void example6() {
		// 숫자 7개 입력받아
		// 생성된 로또 번호와 몇개가 일치하는지 출력
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet<>();
		List<Integer> lotto = new ArrayList<Integer>();
		
		System.out.print("숫자 7개 입력 : ");
		String inputNum = sc.nextLine();
		String[] splitArr = inputNum.split(" ");
		
		for(int i = 0; i < 7; i++) {
			set.add((int)(Math.random()*45+1));
			lotto.add(Integer.parseInt(splitArr[i]));
		}
		
		System.out.print("생성된 로또 번호 : ");
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
		
		System.out.println("\n일치하는 번호 : " + str);
		System.out.println("맞은 숫자 개수 : " + count);
	}
}
