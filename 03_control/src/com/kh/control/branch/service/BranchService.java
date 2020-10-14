package com.kh.control.branch.service;

public class BranchService {

	/*
	 * �б⹮
	 * - �ݺ����� �帧�� �����ϴ� ����
	 * - �б⹮�� ���ΰ� �ִ� ���� ����� �ݺ����� �����.
	 * 
	 */
	
	public void example1() {
		for(int i = 1; ; i++) {
			System.out.println(i + " ���");
			
			if(i >= 100) {
				break;
			}
		}
	}
	
	public void example2() {
		// 1���� 100���� ��� ������ �� ���ϱ�
		// ��, 4�� ����� �����Ѵ�.
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%4 == 0) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void example3() {
		// ������ 2~9�� ��� ���
		// ��, �������� ���� Ȧ���� ��츦 �����ϰ� ���
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("======"+i+"��======");
			for(int j = 1; j <= 9; j++) {
				if(j%2 == 1) {
					continue;
				}
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
}
