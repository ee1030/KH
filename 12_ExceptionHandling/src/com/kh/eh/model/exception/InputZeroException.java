package com.kh.eh.model.exception;

public class InputZeroException extends Exception{
	// ����� ���� ���ܸ� ����� ���
	// -> ���ܷ� ������� �ϴ� Ŭ������ Exception ���� Ŭ������ ��ӽ�Ų��.
	
	// �����ڸ� ���� ���� �߻� �� ������ ������.
	public InputZeroException() {
		System.out.println("0�� �ԷµǾ����ϴ�.");
	}
}
