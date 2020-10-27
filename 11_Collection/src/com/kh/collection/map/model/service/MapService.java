package com.kh.collection.map.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Member;

public class MapService {
	// Map
	// - key, Value�� �ѽ����� ������
	// - key�� �ߺ��� ���� ������� �ʰ�, ������ �������� ���� == Set Ư¡
	// - Value�� Key�� ���� ���ΰ� ���еǹǷ� �ߺ����� �����,
	
	public void example1() {
		// HashMap<K, V>
		// - �ڹ��� ���� ��ǥ���� ��
		// - Key ��ü�� hashCode()�� �̿��� �ߺ��˻縦 ������.
		// - hashCode()�� �̿��Ͽ� Key�� �˻��� �����ϹǷ�
		// 	 �˻� �ӵ��� ������.
		
		Map<String, Member> memberMap = new HashMap<>();
												// Ÿ�� �߷�
		// 1. put(K Key, V Value) : Map�� ������ �߰�
		memberMap.put("admin", new Member("admin", "1234", "�����", "1990-01-01", "010-1234-5678"));
		memberMap.put("user01", new Member("user01", "pass01", "������", "1991-01-01", "010-1111-1111"));
		memberMap.put("user02", new Member("user02", "pass02", "������", "1992-01-01", "010-2222-2222"));
		System.out.println(memberMap);
		
		System.out.println();
		
		// 2. get(k Key) : Map ���� �������� Key���� ��ġ�ϴ� �κ��� Value�� ����.
		
		System.out.println("get()");
		System.out.println(memberMap.get("admin"));
		
		// 3. size() : Map�� ����ִ� Key�� ����
		System.out.println("-----------------------------------------------");
		System.out.println("size()");
		System.out.println(memberMap.size());
		
		// 4. remove(k Key) : Key���� ��ġ�ϴ� Map ������ ����
		// ���� ���� �� ������ Key�� Value���� ��ȯ��.
		// System.out.println("-----------------------------------------------");
		// System.out.println("remove() : " + memberMap.remove("user02"));
		
		// Map �ݺ� ���� ���
		
		// 1. KeySet()�� �̿��ϴ� ���
		// - Map�� ����� ������ �� Key������ �̷���� Set
		Set<String> keySet = memberMap.keySet();
		
		// 1) Set -> List ��ȯ
		// 2) Iterator �ݺ���
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		System.out.println("-----------------------------------------------");
		
		// 3) ���� for��
		for(String key : keySet) {
			System.out.println("Key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		System.out.println("----------- entrySet() �̿� -----------");
		
		// 2. entrySet()�� �̿��� ���
		// - entry��? Key�� Value �� ���� ��� �θ��¸�
		
		Set<Entry<String, Member>> entrySet = memberMap.entrySet();
		
		// 1) Iterator �ݺ��� ���
		System.out.println("----------- iterator �ݺ��� -----------");
		Iterator<Entry<String, Member>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Member> entry = it2.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		
		// 2) ���� for��
		System.out.println("----------- ���� for�� -----------");
		for(Entry<String, Member> entry : entrySet) {
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}
}
