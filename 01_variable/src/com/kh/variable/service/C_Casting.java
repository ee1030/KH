package com.kh.variable.service;

public class C_Casting {
	
	public void autoCasting() {
		int iNum = 12;
		double dNum = 3.3;
		/* �ڵ� ����ȯ
		 * ���� �ٸ� �ڷ����� ������ �Ͼ�� ���
		 * ���� ������ ���� �ڷ����� ū �ڷ������� 
		 * �����Ϸ��� �ڵ����� ��ȯ���شٴ�
		 */
		
		// iNum + dNum
		//	12 	+  3.3
		//	12.0 + 3.3
		//	= 15.3
		
		double result = iNum + dNum;
		System.out.println("result : " + result);
		
		//int -> long
		int iNum2 = 2147483647; // integer �ִ밪
		long lNum2 = 10000000000L;
		long result2 = iNum2 + lNum2;
		System.out.println("result2 : " + result2);
		
		// long -> float
		long lNum3 = 100000000000L;
		float fNum3 = lNum3;
		System.out.println("fNum3 : " + fNum3);
		
		// char -> int
		char ch4 = 'A'; // 'A' == 65
		int iNum4 = ch4;
		System.out.println("iNum4 : " + iNum4);
		
		// (����) Ư�� ���ڰ� �����ڵ忡�� � ���ڸ� ����Ű�°�
		char ch5 = 97;
		System.out.println("ch5 : " + ch5);
	}
	
	public void forcedCasting() {
		
		int iNum1 = 290;
		byte bNum = (byte)iNum1;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("bNum : " + bNum);
		
		// int + double = int
		int iNum2 = 12;
		double dNum2 = 3.3;
		int result2 = (int)(iNum2 + dNum2);
		
		System.out.println("result2 : " + result2);
		
		// �Ǽ��� -> ������ ������ȯ �� �Ҽ��� �Ʒ��� ���� ó����.
		// (����) �Էµ� �Ǽ� �� ����, �Ҽ� �κ� ���� ����ϱ�
		
		// �����Է� : 12.3
		// ���� : 12
		// �Ҽ� : 0.3
		
		double dNum3 = 12.3;
		int result3 = (int)dNum3;
		double result4 = dNum3 - result3;
		System.out.println("�����Է� : " + dNum3 + "\n���� : " + result3 + "\n�Ҽ� : " + result4);
		
		// byte, short �ڷ��� ���� �� ���ǻ���
		//byte num1 = 1; // 1, 2�� integer�� ���ͷ� ǥ����̴�.
		//byte num2 = 2; // byte, short�� ������ ���ͷ� ǥ����� ���� X
					   // byte, short �ڷ��� �ʱ�ȭ �ÿ��� int ���ͷ� ǥ����� ����� �� ����.
		
		//byte num3 = (byte)(num1 + num2);
	}
}
