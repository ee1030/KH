package com.kh.eh.model.exception;

public class InputZeroException extends RuntimeException{
	// ����� ���� ���ܸ� ����� ���
	// -> ���ܷ� ������� �ϴ� Ŭ������ Exception ���� Ŭ������ ��ӽ�Ų��.
	
	// �����ڸ� ���� ���� �߻� �� ������ ������.
	public InputZeroException() {
		System.out.println("0�� �ԷµǾ����ϴ�.");
	}
	
	// ���� �ε� : ���� Ŭ���� ������ ���� �޼ҵ������ ���� �޼ҵ带 �ۼ��ϴ� ��.
	// �޼ҵ�� ��ġ, �Ű� ������ Ÿ��, ����, ������ �޶�� ��
	public InputZeroException(String msg) {
		super(msg);
	}
}
