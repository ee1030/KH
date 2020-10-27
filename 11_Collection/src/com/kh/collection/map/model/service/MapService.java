package com.kh.collection.map.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Member;

public class MapService {
	// Map
	// - key, Value가 한쌍으로 존재함
	// - key는 중복된 값을 허용하지 않고, 순서가 유지되지 않음 == Set 특징
	// - Value는 Key에 의해 서로가 구분되므로 중복값을 허용함,
	
	public void example1() {
		// HashMap<K, V>
		// - 자바의 가장 대표적인 맵
		// - Key 객체의 hashCode()를 이용한 중복검사를 진행함.
		// - hashCode()를 이용하여 Key값 검색을 진행하므로
		// 	 검색 속도가 빠르다.
		
		Map<String, Member> memberMap = new HashMap<>();
												// 타입 추론
		// 1. put(K Key, V Value) : Map에 데이터 추가
		memberMap.put("admin", new Member("admin", "1234", "김관리", "1990-01-01", "010-1234-5678"));
		memberMap.put("user01", new Member("user01", "pass01", "유저일", "1991-01-01", "010-1111-1111"));
		memberMap.put("user02", new Member("user02", "pass02", "유저이", "1992-01-01", "010-2222-2222"));
		System.out.println(memberMap);
		
		System.out.println();
		
		// 2. get(k Key) : Map 내부 데이터중 Key값이 일치하는 부분의 Value를 얻어옴.
		
		System.out.println("get()");
		System.out.println(memberMap.get("admin"));
		
		// 3. size() : Map에 담겨있는 Key의 개수
		System.out.println("-----------------------------------------------");
		System.out.println("size()");
		System.out.println(memberMap.size());
		
		// 4. remove(k Key) : Key값이 일치하는 Map 데이터 제거
		// 삭제 성공 시 삭제된 Key의 Value값이 반환됨.
		// System.out.println("-----------------------------------------------");
		// System.out.println("remove() : " + memberMap.remove("user02"));
		
		// Map 반복 접근 방법
		
		// 1. KeySet()을 이용하는 방법
		// - Map의 저장된 데이터 중 Key만으로 이루어진 Set
		Set<String> keySet = memberMap.keySet();
		
		// 1) Set -> List 변환
		// 2) Iterator 반복자
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		System.out.println("-----------------------------------------------");
		
		// 3) 향상된 for문
		for(String key : keySet) {
			System.out.println("Key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		System.out.println("----------- entrySet() 이용 -----------");
		
		// 2. entrySet()을 이용한 방법
		// - entry란? Key와 Value 한 쌍을 묶어서 부르는말
		
		Set<Entry<String, Member>> entrySet = memberMap.entrySet();
		
		// 1) Iterator 반복자 사용
		System.out.println("----------- iterator 반복자 -----------");
		Iterator<Entry<String, Member>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Member> entry = it2.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		
		// 2) 향상된 for문
		System.out.println("----------- 향상된 for문 -----------");
		for(Entry<String, Member> entry : entrySet) {
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}
}
