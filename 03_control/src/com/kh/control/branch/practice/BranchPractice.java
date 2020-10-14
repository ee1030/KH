package com.kh.control.branch.practice;

import java.util.Scanner;

public class BranchPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(true) { // while 조건식은 true로 줌으로써 무한루프 실행
			System.out.print("1이상의 숫자를 입력하세요 : ");
			input = sc.nextInt();
			
			if(input < 1) { 
				System.out.println("1 이상의 숫자를 입력해주세요.");
				// 조건문으로 input값이 1보다 작을경우 오류메시지 출력
			} else {
				for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
					// 1보다 큰 경우 1부터 input까지 반복하여 출력
				}
				break; // 반복문이 끝나면 더이상 while문을 반복하지 않도록 break문을 이용하여 탈출한다.
			}
		}	
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(true) { // 마찬가지로 while문을 이용 무한루프 실행
			System.out.print("1이상의 숫자를 입력하세요 : ");
			input = sc.nextInt();
			
			if(input < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요."); // 오류메시지
			} else {
				for(int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break; // 1번문제 역순으로 출력하고 반복문 종료시 while문 탈출
			}
		}		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			} // 첫번째 숫자가 두번째 숫자보다 클 경우 두 숫자 swap
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				// 두 숫자중 하나라도 1 미만일 경우 오류 메시지 출력
			} else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					// 이외의 경우에는 num1 부터 num2까지 1씩 증가시키며 출력
				}
				break; // 반복문 종료시 무한루프 탈출
			}
		}
	}
	
	public void practice4() {
		// 구구단 출력 with 무한루프
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 이쯤되면 알아야함
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			if(input > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요."); 
				// 오류 메시지 출력
			} else {			
				for(int i = input; i <= 9; i++) { 
					System.out.println("===== " + i + "단 =====");
					for(int j = 1; j<=9; j++) {
						System.out.println(i + " * " + j + " = " + i * i);
					}
					// 이외의 경우에는 입력받은 단부터 9단까지의 모든 구구단을 출력
				}
				break; // 반복문 종료시 무한루프 탈출
			}
		}
	}
	
	public void practice5() {
		// 시작 숫자부터 공차를 더해가며 출력
		// 단 10개의 숫자만 출력 되어야함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int bubbleTea = sc.nextInt();
		
		int count = 0; // 숫자 갯수가 몇갠지 세기 위해서 필요한 임시 저장 변수
		
		for(int i = startNum; ; i += bubbleTea) { 
			// i를 시작숫자로 초기화 하고, 조건식 없이 무한루프를 돌린다 다만 i값은 공차 값만큼 증가
			// 숫자가 줄어들때는 공차값을 음수로 주기때문에 += 연산자를 사용해도 상관없다.
			System.out.print(i + " ");
			
			count++; // 반복수행 될때 마다 count값을 1씩 증가 시키고
			
			if(count == 10) { 
				break;
				// count값이 10이 되면 숫자의 갯수가 10개라는 의미 이므로 for문을 탈출하기 위해 break;
			}
		}
	}
	
	public void practice6() {
		// 무한루프 계산기 
		// 조건문만 잘쓰면 코드가 좀 지저분하지만 쉽게 작성할 수 있음.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 시작은 while문을 이용한 무한루프
			System.out.print("연산자(+, -, *, /, %) : ");
			String sOp = sc.nextLine();
			char op = sOp.charAt(0); 
			// exit를 입력받으면 종료가 되어야 하기 때문에 String형 변수인 sOp와
			// 연산자를 구분할 char형 변수 op를 따로 준비한다.
			// op는 sOp를 charAt() 메서드를 이용하여 구한다.
			
			if(sOp.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
			// 연산자 입력을 받은 뒤 바로 equals 메서드를 이용하여 exit가 입력되었는지
			// 검사하도록 한다. exit가 맞을 경우 종료 메시지 출력 후 무한루프 탈출
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			//연산자 검사 이후 정수를 입력받는다.
			
			int result = 0; // 결과 값을 저장하기 위한 변수
			
			if(op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
				System.out.println("없는 연사자입니다. 다시 입력해주세요.");
				continue;
				// 조건식에 있는 연산자가 아닐 경우 오류메시지를 출력하고
				// continue를 이용하여 아래쪽 코드들을 건너뛰고 다시 루프 시작
			} else if(op == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
				// 마찬가지고 '/'연산자를 입력하고 정수2에 0을 입력하였을 경우
				// 나눌 수 없기 때문에 오류메시지 출력 후 continue를 이용하여 코드 건너뛰기
			} else {
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
				}
				// 그 외의 경우에는 switch문을 이용하여 result값을 계산해준다.
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);		
			// 조건문을 무사히 빠져나왔다면 결과 값을 출력 후 다시 무한루프로 돌아간다.
		}
	}
}
