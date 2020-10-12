package com.kh.control.condition.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		String result = null;
		
		switch(input) {
		case 1 :
			result = "입력";
			break;
		case 2 :
			result = "수정";
			break;
		case 3 :
			result = "조회";
			break;
		case 4 :
			result = "삭제";
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
		
		System.out.println(result + " 메뉴 입니다.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input > 0) {
			if(input % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		sc.close();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();

		String result = null;
		switch(input) {
		case 1:
			result = "겨울";
			break;
		case 2:
			result = "겨울";
			break;
		case 3:
			result = "봄";
			break;
		case 4:
			result = "봄";
			break;
		case 5:
			result = "봄";
			break;
		case 6:
			result = "여름";
			break;
		case 7:
			result = "여름";
			break;
		case 8:
			result = "여름";
			break;
		case 9:
			result = "가을";
			break;
		case 10:
			result = "가을";
			break;
		case 11:
			result = "가을";
			break;
		case 12:
			result = "겨울";
			break;
		default :
			System.out.println(input + "은 잘못 입력된 달입니다.");
			return;
		}
		
		System.out.println(input + "은 " + result +"입니다.");
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPwd";
		
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		
		sc.close();
		
		if(inputId.equals(id)) {
			if(inputPwd.equals(pwd)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		sc.close();
		
		switch(grade) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
			
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
			
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		sc.close();
		
		double BMI = weight / (height * height);
		
		if(BMI < 18.5) {
			System.out.println("BMI 지수 : " + BMI + "\n저체중");
		} else if(BMI < 23) {
			System.out.println("BMI 지수 : " + BMI + "\n정상체중");
		} else if(BMI < 25) {
			System.out.println("BMI 지수 : " + BMI + "\n과체중");
		} else if(BMI < 30) {
			System.out.println("BMI 지수 : " + BMI + "\n비만");
		} else {
			System.out.println("BMI 지수 : " + BMI + "\n고도비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력 : ");
		char op = sc.nextLine().charAt(0);
		
		sc.close();
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int semiEx = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalEx = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int practice = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int  att = sc.nextInt();
		
		sc.close();
		
		double semiResult = semiEx*0.2;
		double finalResult = finalEx*0.3;
		double pracResult = practice*0.3;
		
		double result = semiResult + finalResult + pracResult + att;
		
		String pass = null;
		
		if(att > 14) {
			if(result >= 70) {
				pass = "Pass";
				System.out.println("============= 결과 =============");
				System.out.println("중간 고사 점수(20) : " + semiResult);
				System.out.println("기말 고사 점수(30) : " + finalResult);
				System.out.println("과제 점수		(20) : " + pracResult);
				System.out.println("출석 점수		(20) : " + att);
				System.out.println("총점 : " + result);
				System.out.println(pass);
			} else { 
				pass = "Fail [점수 미달]";
				System.out.println("============= 결과 =============");
				System.out.println("중간 고사 점수(20) : " + semiResult);
				System.out.println("기말 고사 점수(30) : " + finalResult);
				System.out.println("과제 점수		(20) : " + pracResult);
				System.out.println("출석 점수		(20) : " + att);
				System.out.println("총점 : " + result);
				System.out.println(pass);
			}
		} else {
			pass = "Fail [출석 회수 부족 ("+att+"/20)]";
			System.out.println(pass);
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
		
		sc.close();
	}
}
