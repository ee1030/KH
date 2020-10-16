package com.kh.oop.ch2_encapsulatioan.model.service;

import com.kh.oop.ch2_encapsulatioan.model.vo.Account;

public class EncapsulationService {
	public void example() {
		Account ac = new Account();
		
		System.out.println(ac.getName());
		// name ��� ������ private ���� ���� �Ǿ� �����ϱ� getter�� �����;ߴ�
		// getName() �޼����� ��ȯ���� ���
		
		String name = ac.getName();
		System.out.println(name);
		
		// �ܾ� ��ȸ
		System.out.println("�ܾ� : " + ac.getBalance());
		int balance = ac.getBalance(); // 100000
		
		balance -= 3000; // 97000
		
		// ���� �ܾ� ����
		ac.setBalance(balance);
		
		System.out.println("���� �� �ܾ� : " + ac.getBalance());
	}
}
