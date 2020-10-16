package com.kh.oop.ch2_encapsulatioan.model.service;

import com.kh.oop.ch2_encapsulatioan.model.vo.Account;

public class EncapsulationService {
	public void example() {
		Account ac = new Account();
		
		System.out.println(ac.getName());
		// name 멤버 변수는 private 으로 선언 되어 있으니까 getter로 가져와야댐
		// getName() 메서드의 반환값을 출력
		
		String name = ac.getName();
		System.out.println(name);
		
		// 잔액 조회
		System.out.println("잔액 : " + ac.getBalance());
		int balance = ac.getBalance(); // 100000
		
		balance -= 3000; // 97000
		
		// 계좌 잔액 수정
		ac.setBalance(balance);
		
		System.out.println("수정 후 잔액 : " + ac.getBalance());
	}
}
