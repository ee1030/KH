package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수다" : "양수가 아니다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수다" : (input == 0) ? "0이다." : "음수다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy/people) + "\n남는 사탕 개수" + (candy%people));
		
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int studentNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지 : ");
		double record = sc.nextDouble();
		
		String genderResult = (gender == 'M') ? "남학생" : "여학생"; 
		
		System.out.println(grade + "학년 " + group + "반 " + studentNum + "번 " + name + genderResult +
				"의 " + "성적은" + record + "이다."); 
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String result = (kor >= 40 && eng >= 40 && math >=40 && avg >= 60.0) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum + "\n평균 : " + avg + "\n" + result);
		
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민 번호를 입력하세요(- 포함) : ");
		char idNum = sc.nextLine().charAt(7);
		
		String result = (idNum == '1') ? "남자" : "여자";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		boolean result = num <= num1 || num > num2;
		
		System.out.println(result);
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		
		double aResult = A + (A*0.4);
		double bResult = B;
		double cResult = C + (C*0.15);
		
		String aIncentiveResult = (aResult >= 3000) ? "3000 이상" : "3000 미만";
		String bIncentiveResult = (bResult >= 3000) ? "3000 이상" : "3000 미만";
		String cIncentiveResult = (cResult >= 3000) ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + A + "/" + aResult + "\n" + aIncentiveResult);
		System.out.println("B사원의 연봉/연봉+a : " + B + "/" + bResult + "\n" + bIncentiveResult);
		System.out.println("C사원의 연봉/연봉+a : " + C + "/" + cResult + "\n" + cIncentiveResult);
		
		sc.close();
	}
}
