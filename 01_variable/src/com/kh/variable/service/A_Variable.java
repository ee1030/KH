package com.kh.variable.service;

public class A_Variable {

	public void noVariable() {
		System.out.println("----- 변수사용 X -----");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	}
	
	public void usingVariable() {
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		System.out.println("----- 변수사용 O -----");
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}
	
	public void declareVariable() {
		
		// 1. 논리형
		boolean isTrue; // 1byte
		isTrue = true;
		// isTrue : 변수명
		// '=' : 대입 연산자로서 오른쪽 data를 왼쪽 변수에 저장한다는 의미
		// true : 리터럴
		
		// 2. 정수형
		byte bNum; // 1byte
		bNum = 100;
		short sNum; // 2byte
		sNum = 10000;
		// byte, short는 int형 리터럴 표기법을 사용함.
		// 왜? byte, short는 다른 프로그래밍 언어와의 호환을 위해 필요한 자료형
		// Java만으로 코드 작성시 사용할 일이 없는 자료형이다. --> 별도의 리터럴 표기법이 존재하지 않는다.
		
		int iNum; // 4byte, 정수 기본형
		iNum = 1000000000; // 10억
		iNum = 1_000_000_000; // '_'를 이용하여 자릿 수 구분 가능
		
		long lNum; // 8byte
		lNum = 10000000000L; // 100억
		// (숫자뒤)L 또는 l : long형 리터럴 표기법
		// 각각의 자료형에 따라 리터럴 표기법이 존재함
		
		
		// 3. 실수형
		float fNum; // 4byte
		fNum = 3.141592f;
		double dNum; // 8byte, 실수 기본형
		dNum = 3.141592;
		
		// 4. 문자형
		char ch;
		ch = 'A';
		ch = 65;
		ch = '\u0041';
		// char의 리터럴 표기법 : ''
		
		// 5. 문자열
		String str;
		str = "안녕하세요?";
		// 실제 데이터를 저장하지 않고 데이터가 저장된 주소를 저장한다.
		
		// 변수 선언과 동시에 초기화
		int iNum2 = 200;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		System.out.println("iNum2 : " + iNum2);
		
		// 상수 선언 및 초기화
		System.out.println("----- 상수 -----");
		
		int age = 28;
		System.out.println("age : " + age); // 28
		
		age = 29;
		System.out.println("age : " + age); // 29
		
		// 상수명은 모두 대문자, 연결된 단어는 '_'로 구분
		final int AGE = 28;
		System.out.println("age : " + age); // 28
		
		// AGE = 29; // 상수는 초기화 후 값을 변경할 수 없기 때문에 에러발생
	}
}
