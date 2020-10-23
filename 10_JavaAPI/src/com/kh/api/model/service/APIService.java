package com.kh.api.model.service;

import java.util.Arrays;
import java.util.StringTokenizer;

import com.kh.api.model.vo.Book;

public class APIService {
	// API(Application Programming Interface)
	// - 응용 프로그램 또는 프로그래밍 언어가 제공하는 기능을
	//   사용할 수 있도록 하는 인터페이스
	
	public void  example1() {
		// Object.toString()
		// - 상속받은 자식 클래스에서 오버라이딩 하여
		//	 해당 클래스의 멤버 변수 정보를 출력하는 용도로 사용할 수 있도록
		//	 자바에서 제공해주는 메소드.
		
		Book book1 = new Book("눈물을 마시는 새", "이영도", 30000);
		Book book2 = new Book("눈물을 마시는 새", "이영도", 30000);
		Book book3 = new Book("눈물을 마시는 새1", "이영도", 30000);
		
		// print 관련 구문에서 참조 변수명만 입력할 경우 .toString()이 컴파일 단계에서 추가됨.
		System.out.println(book1);
		System.out.println(book1.toString());
		// toString() 오버라이딩 전
		// Object.toString() : 패키지를 포함한 클래스명 + @ + 해시코드 16진수 
		
		// equals 오버라이딩 확인
		System.out.println("book1과 boo2가 참조하는 객체의 필드값이 같은가? " + book1.equals(book2));
		
		System.out.println("book1과 boo3가 참조하는 객체의 필드값이 같은가? " + book1.equals(book3));
		
		System.out.println();
		
		System.out.println("book1의 hashCode() : " + book1.hashCode());
		// 오버라이딩 전 hashCode() : 366712642
		// 오버라이딩 후 hashCode() : -1875916496
		
		System.out.println("book2의 hashCode() : " + book2.hashCode());
		System.out.println("book3의 hashCode() : " + book3.hashCode());
	}
	
	// equals(), hashCode() 둘 중 하나라도 오버라이딩 하는 경우
	// 나머지 하나도 반드시 오버라이딩 진행
	
	public void  example2() {
		// String Class
		// 1. String Literal(스트링 리터럴)
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		// str 1, 2, 3를 비교연산자를 이용하여 비교
		System.out.println("str1과 str2이 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3이 같은가? : " + (str1 == str3));
		
		// System.identityHashCode()
		// -> 실제 객체의 시작주소를 이용하여 특정 값을 만들어 내는 메소드
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
	}
	
	public void example3() {
		// String의 불변성(immutable)
		// String 데이터는 한번 생성되면 변하지 않는 성질을 띄고 있음.
		
		String str1 = "abc";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
		
		// str1 변경 후 주소값 확인
		str1 += "def";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
		
		// String 데이터는 한번 생성되면 변하지 않으므로
		// 수정이 되지 않으면 새로운 String 데이터가 생성된다.
		// -> 잦은 String 데이터 수정이 발생하는 경우 메모리 낭비가 심해진다.
		
		// StringBuffer
		System.out.println();
		System.out.println("StringBuffer 활용");
		
		StringBuffer sb = new StringBuffer(); // 초기 용량 16할당
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("추가 전 주소값 : " + System.identityHashCode(sb));
		
		// StringBuffer에 데이터 추가
		sb.append("1234567890123456");
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		
		sb.append("X");
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		
		System.out.println("저장 결과 출력 : " + sb.toString());
		
		String lastStr = sb.toString();
		
		System.out.println(lastStr);
	}
	
	public void example4() {
		// String.split(구분자)
		// 문자열을 지정된 구분자를 기준으로 하여 분리한 후
		// String[]로 반환하는 메소드
		
		String str = "사과, 바나나, 딸기, 파인애플, 오렌지, 멜론, 자두";
		
		String[] arr = str.split(", ");
		
		// 향상된 for문(for each문)
		// - 용도 : 특정 배열의 처음부터 끝까지 반복 접근하는 용도
		for(String s : arr) {
			// arr 배열 요소를 순서대로 하나씩 꺼내서
			// s 변수에 저장
			
			System.out.println(s);
		}
		
		// String.join("구분자", String 배열)
		// - 배열 요소를 하나의 문자열로 만들어주는 메소드
		// - 요소 사이를 구분할 구분자를 작성해야함.
		String str2 = String.join("-", arr);
		System.out.println("join된 문자열 : " + str2);
	}
	
	public void example5() {
		// StringTokenizer
		// - 생성될때 전달받은 문자열을 특정 구분자에 맞게 구분하여 토큰화 시킴
		// (토큰 : 구분되는 데이터)
		
		// StringTokenizer(String str)
		// - 전달받은 문자열 내에 \t(tab키), \n, \r(개행문자), 띄어쓰기 등
		//	 화이트 스페이스를 구분자로 하여 토큰화를 시킴
		String str1 = "아 배고프다. 오늘 점심 뭐먹을까요?";
		StringTokenizer st1 = new StringTokenizer(str1);
		while(st1.hasMoreTokens()) {
			// hasMoreToken() : 남아있는 토큰이 있으면 true
			
			System.out.println(st1.nextToken());
			// nextToken() : 다음 토큰을 얻어옴
		}
		
		System.out.println();
		
		String str2 = "어제. 내드린, 문제, 어렵죠? ㅋㅋㅋ/ㅈㅅ";
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		// str2를 ','로 구분
		
		while(st2.hasMoreTokens()) {
			
			System.out.println(st2.nextToken());
		}
		
	}
	
	public void example6() {
		// Wrapper Class
		// wrapper : 포장지
		// -> 기본자료형을 객체로 사용할 수 있도록 포장하는 클래스
		
		// 왜 사용하는가?
		// 1) 기본자료형으로는 수행할 수 없는 기능을 사용하기 위해서
		// - 기본 자료형의 데이터 최대/ 최소 값
		// - String데이터 
		//   ex) "1204" + 1 = 12041
		//		Integer.parseInt("1204") + 1 = 1205
		
		// 2) 어쩔수 없이 기본자료형을 사용할 수 없는 경우
		//	  기본 자료형 -> 객체로 변환하기 위해 사용
		// ex) Object obj = 1; // 원래는 안되지만 jdk 1.5부터 가능
		//	   -> Auto Boxing / UnBoxing
	
		// 기본자료형별 Wrapper Class
		/* boolean -> Boolean
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * char -> Character
		 * 
		 */
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String str = "123";
		
		int iNum = Integer.parseInt(str);
		// Integer.parseInt(문자열) : 숫자로만 이루어진 문자열을 -> int형으로 변환
		// parsing(파싱) : 데이터의 형태를 변경
		
		System.out.println(iNum);
		
		// Boxing : 기본 자료형을 Wrapper Class 객체로 변경
		int num1 = 10;
		Integer it1 = new Integer(num1); // 빢씽
		
		System.out.println("it1 : " + it1);
		System.out.println(it1.MAX_VALUE);
		
		// UnBoxing : Wrapper Class를 -> 기본자료형
		int i1 = it1.intValue();
		System.out.println("i1 : " + i1); // 언빢씽 1번
		int i2 = (int)it1;
		
		// Auto Boxing/UnBoxing
		Integer it3 = 100;
		// 100이라는 숫자가 컴파일 시 자동으로 Integer 객체로 포장된다.
		// --> Auto Boxing
		
		Object it4 = 100;
		
	
		int i3 = it1;
		// int = Integer
		// Auto UnBoxing
		                                                                                                                                                                                                  
	}
}
