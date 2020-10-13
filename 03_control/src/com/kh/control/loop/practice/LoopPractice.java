package com.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// 1부터 입력받은 수까지 모든 숫자 출력 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요."); // 1 미만의 숫자가 입력되면 오류 메시지 출력
		} else {
			for(int i=1; i<=input; i++) {			
				System.out.print(i + " "); // for 반복문을 이용하여 i는 1부터 input과 값이 같아질 때까지 반복하여 i 값을 출력
			}
		}
	}
	
	public void practice2() {
		// 1번 문제를 역순으로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input; i>=1; i--) {			
				System.out.print(i + " ");
				// for문을 이용하여 i를 input값 부터 1과 값이 같아질 때 까지 1씩 감소시키며 반복하여 i값을 출력
			}
		}
		
	}

	public void practice3() {
		// 1부터 입력 받은 수 까지의 정수들의 합을 for문을 이용하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close(); // 메모리 누수 방지를 위하여 사용하는 메서드인데 없어도 무방
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) { // for문을 이용하여 i를 1부터 input값과 같아질 때까지 1씩 증가시키며 반복
			if(i == input) {
				System.out.print(i);
				sum += i;				
				// i값이 input값과 같아지면 마지막 정수라는 뜻이므로, 뒤에 '+' 문자를 생략하고 i값만 출력한다.
			} else {				
				System.out.print(i + " + ");
				sum += i;				
				// i값이 input값과 같지 않은 경우에는 i값을 출력하고 '+' 문자를 뒤에 출력한다.
			}
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		// 사용자로부터 두개의 값을 입력받아 그 사이의 숫자를 모두 출력한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		} // swap 메서드 첫 번째 숫자가 두 번째 숫자보다 작을 경우 값을 바꿔준다.
		
		for(int i=num1; i<=num2; i++) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				break;
				// if문을 이용하여 num1이 1 미만이거나, num2가 1 미만인 경우 오류 메시지를 출력하고, 반복문을 빠져나온다.
			} else {
				System.out.print(i + " ");
				// 그 외의 경우에는 i값을 출력하고 공백 한칸을 출력
			}
		}
	}
	
	public void practice5() {
		// 입력받은 단의 구구단을 출력한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		System.out.println("===== " + input + "단 ====="); // 입력받은 값의 단으로 나와야 하므로 input 변수 사용
		
		for(int i=1; i<=9; i++) {
			System.out.println(input + " * " + i + " = " + input * i); 
			// for문을 이용하여 1부터 9까지 곱할 숫자를 증가시키고 구구단을 출력 input값이 단을 의미하기 때문에 바뀌지 않는다.
		}
	}
	
	public void practice6() {
		// 입력 받은 값의 단부터 9단까지의 구구단 모두 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요."); // if문을 이용하여 input값이 9를 초과할 경우 오류 메시지 출력
		} else {			
			for(int i = input; i <= 9; i++) { 
				System.out.println("===== " + i + "단 =====");
				// 바깥쪽 for문에서는 몇 단인지를 출력함과 동시에 i값을 input값으로 초기화함으로써
				// 입력받은 값의 단부터 9단까지 반복하게 만든다.
				for(int j = 1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + i * i);
					// 안쪽 for문에서는 5번문제의 구구단 출력과 마찬가지로 곱할 숫자를 1~9까지 증가시키며 구구단을 출력
					// 여기서 i값은 단을 의미하고 j 값은 곱하는 숫자를 의미한다.
				}
			}
		}
	}
	
	public void practice7() {
		// 기본적인 별찍기 예제 중, 직각 삼각형 찍기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			// 바깥쪽 for문을 이용하여 행을 계산한다. i 값이 증가하면 1행이 증가하는것과 같다.
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				// 안쪽 for문에서는 열을 계산하게 되는데 '*'문자를 찍는 갯수를 연산하게 된다.
				// j값이 1부터 i값과 같아질때 까지 j를 1씩 증가시키며 반복하므로 i = 1 일 때 j도 한번 수행되고
				// i = 2일 때 j도 2번 수행되는 식.
				// 최종적으로 i는 input값 만큼의 횟수로 반복되고 
				// j는 i번 실행되기 때문에 마지막 줄에는 input의 값만큼 '*'문자가 출력되게 된다.
			}
			System.out.println(); // 안쪽 for문이 종료되면 다음 행으로 넘어가기 위해 println() 메서드를 사용 행을 바꿔준다.
		}
	}
	
	public void practice8() {
		// 위의 7번 문제를 역순으로 출력하는 문제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = input; i>=1; i--) {
			// 바깥쪽 for문에서는 7번 문제의 초기식과 조건식을 반대로 바꿔주고 1씩 감소시키는 연산을 통해
			// input값부터 1까지 감소하며 반복하게 만든다.
			for(int j=i; j>=1; j--) {
				System.out.print("*");
				// 안쪽 for문도 마찬가지로 최대 값인 i값 부터 1이하가 될 때까지 j값을 감소시키며 '*'문자를 출력한다.
				// 즉 i = 5이면 j는 5번 i = 4이면 4번 '*'문자가 출력되게 된다.
			}
			System.out.println(); // 마찬가지로 행을 바꿔주기 위해 사용
		}
	}
	
	public void practice9() {
		// 1부터 사용자가 입력한 수까지 중 2와 3의 배수를 모두 출력하고, 2와 3의 공배수 갯수를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		int count = 0; // 2와 3의 공배수의 갯수를 저장하기 위한 변수
		
		for(int i = 1; i <= input; i++) {
			if(i%2 == 0 || i%3 == 0) { 
				// 첫번째 조건문에서는 '%'연산의 통하여 2의 배수이거나 3의 배수인 수를 찾는다.
				if(i%2 == 0 && i%3 == 0) { 
					count++;
					// 두번째 조건문에서는 2의 배수이거나 3의 배수인 수 중에서 공배수를 찾기 위해 AND 연산을 이용하여
					// 조건에 맞는 수를 찾고 공배수 갯수를 저장하기 위한 변수 count의 값을 1 증가시켜 준다.
				}
				System.out.print(i + " "); // 첫번째 조건문인 2의 배수이거나 3의 배수인 수를 모두 출력한다.
			}
		}
		System.out.println("\ncount : " + count); // 반복문이 종료되면 두번째 조건문에서 찾은 공배수의 갯수를 출력한다.
	}
	
	public void practice10() {
		// 별찍기 예제 직각 삼각형을 반대로 찍기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= input; i++) {
			// 바깥쪽 for문에서는 행을 계산하기 위해 i값을 1부터 입력받은 input값이 될때까지 반복한다.
			for(int j = 1; j <= (input-i); j++) {
				System.out.print(" ");
				// 출력 예제를 보면 '*'문자를 출력하기 전에 공백 문자를 먼저 출력해야 한다.
				// 따라서 공백문자를 출력하기 위한 반복문을 사용해야 하는데 그것이 안쪽의 첫번째 for문
				// j값을 1부터 input-i 값이 될 때 까지 반복하게 되는데 출력해야 하는 공백 문자의 갯수가
				// 항상 input 값에서 i값을 뺀 만큼이 되기 때문.
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				// 안쪽의 두번재 for문에서는 첫번째 for문에서 공백문자를 모두 출력 하였으므로, '*'문자를 출력한다.
				// '*'문자의 갯수는 행의 갯수, 즉 i의 값과 같기 때문에 k값을 1부터 i의 값까지 반복하여 '*'문자를 출력한다.
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		// 반쪽짜리 마름모 모양 찍기 문제
		// 직각삼각형 찍기 문제와 그 문제를 역순으로 출력하는 문제를 합쳤다고 생각하면 이해하기가 쉽다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		
		for(int i = 1; i<=input; i++) {
				// 바깥쪽 for문은 행을 계산하기 위한 반복문이다. 이쯤되면 익숙해질 때 쯤 됐다. 
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				// 안쪽 for문에서는 마찬가지로 i번째 행에 '*'를 찍기위한 반복문
				// j값이 1부터 i의 값과 같아질 때 까지 반복하므로, 결국 i번 '*'문자를 출력하게 된다.
			}
			System.out.println(); // 행 바꾸기
		}
		
		// 첫 번째 for문에서는 평범한 직각 삼각형 찍기와 같다. '*'문자가 i값 만큼의 횟수로 출력되는것.
		// 그렇게 되면 직각삼각형 모양의 별찍기가 완성된다.
		
		for(int i = (input-1); i >= 1; i--) {
			// 바깥쪽 for문은 행을 계산하기 위한 반복문이다. 이쯤되면 익숙해질 때 쯤 됐다. 진짜로 진지함.
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
				// 마찬가지로 두번째 안쪽의 for문에서는 i값 만큼의 횟수로 '*'문자를 출력하며 행이 증가할 수록
				// '*'문자를 출력하는 횟수를 1씩 감소시켜 준다.
			}
			System.out.println(); // 행바꾸기
		}
		// 두번째 for문에서는 i값 만큼의 '*'가 출력되는 행은 필요 없으므로 input값에서 1을 뺀 값부터 시작하여
		// 1과 같아질때 까지 i값을 감소시키며 반복한다.

	}
	
	public void practice12() {
		// 피라미드 찍기 문제.
		// 공백을 어떻게 찍어야 하고, '*'문자를 몇번 찍어야 하는지 생각해봐야 한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i<=input; i++) {
			// 바깥쪽 for문에서는 마찬가지로 행을 계산한다.
			for(int j = 1; j<=input-i; j++) {
				System.out.print(" ");
				// 안쪽 첫번째 for문에서는 공백문자를 출력하기 위한 계산을 한다.
				// 공백문자는 10번 문제와 마찬가지로 input 값에서 i값을 뺀 만큼 출력해야 하기 때문에
				// j를 1로 초기화하고, (input-i)번 만큼 공백을 출력한다.
			}
			
			for(int j = 1; j<=(2*i)-1; j++) {
				System.out.print("*");
				// 두번째 for문에서는 '*'문자를 출력하기 위해 for문을 사용한다.
				// 두번째 반복문에서 중요한건 조건식. 
				// 출력 예제를 살펴보면 항상 행 하나가 늘어날 때 마다 '*'문자가 2개씩 늘어난다는 것을 알 수 있다.
				// 그 말인 즉슨 i값에 2를 곱한후 1을 빼면 찍어야 될 '*'의 갯수가 된다는 말인데
				// 간단하게 설명하자면 홀수를 구하는 방법과 같다. ex) i = 1일때 j = (i*2)-1 = 1, i가 2일때 j = (i*2)-1 = 3
			}
			System.out.println(); // 행바꾸기
		}
	}
	
	public void practice13() {
		// '*' 문자로 사각형 만들어보기
		// 조건문만 잘쓰면 12번보다 쉽다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i<input; i++) {
			// 이쯤 되면 눈치가 아무리 없어도 행을 계산하기 위한 for문이라는 것을 이해 했을것.
			if(i == 0 || i == (input-1)) {
				// 첫번째 조건문에서는 i값이 첫번째 행이거나 마지막 행인지를 검사한다.
				// i값이 0이거나, input-1(왜 input-1이냐면 i가 0부터 시작했기 때문) 이라면
				// 첫번재 행이거나 마지막 행이라는 의미이다.
				
				for(int j=0; j<input; j++) {
					System.out.print("*");
					// if문 안쪽의 for문은 조건문을 만족하는 행이라면 '*'문자를 input값만큼 출력 할수 있도록 한다.
				}
			} else {
				// 조건을 만족하지 않는 경우라면, 첫번째나 마지막 행이 아니라는 뜻이므로, 공백문자 앞뒤로 '*'문자를 출력하고,
				// '*'문자 사이는 공백문자로 채우도록 한다.
				
				System.out.print("*"); // 공백 문자 앞쪽 '*' 문자
				
				for(int j=0; j<input-2; j++) {
					System.out.print(" ");
					// else문 안쪽의 for문은 공백 문자를 출력하기 위한 반복문인데
					// 조건식이 왜 j < input-2 이냐면 맨 앞열과 맨 뒷열은 '*'문자를 출력하여 사각형 모양을 만들어야 하기 때문이다.
					// 따라서 '*'문자를 출력한 2개의 공간을 남겨둔 나머지 공간을
					// 공백문자로 채우기 위해 조건식이 j < input-2가 되는것.
				}
				
				System.out.print("*"); // 공백 문자 뒷쪽 '*' 문자
			}
			System.out.println(); // 행바꾸기
		}
	}
}
