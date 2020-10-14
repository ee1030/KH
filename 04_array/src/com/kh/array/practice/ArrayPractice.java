package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 길이가 10인 배열 선언 후 1부터 10까지 반복문을 이용하여
		// 배열 인덱스에 넣고 출력
		int[] arr = new int[10]; // 길이 10인 배열 선언 및 할당 int[] arr까지가 선언이고 뒷부분이 할당이다.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			// 반복문을 이용하여 0번 index부터 9번 index까지(조건식이 arr.length 미만이므로)
			// i값을 1씩 증가시키며 배열 인덱스에 i+1값을 넣는다.(i가 0부터 시작하므로 1~10을 넣기 위해선 i+1 해야함)
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// 반복문을 이용하여 배열의 0번 인덱스부터 9번 인덱스까지 출력
		}
	}
	
	public void practice2() {
		// 1번문제와 로직은 같지만 배열 인덱스에 값을 넣을때
		// 역순으로 값을 넣어야함 ex) 10 9 8 7 ... 1 처럼 거꾸로 집어 넣는다는 뜻
		
		int[] arr = new int[10]; // 배열 선언 및 할당
		
		for(int i = 0; i < arr.length; i++) { // 첫번째 for문에서 조건식은 1번문제와 같다. 인덱스는 0부터 9까지 순서대로
											  // 들어가야 하기 때문
			
			arr[i] = arr.length-i; // 이부분이 1번 문제와 다르다. i번 인덱스에 배열의 길이에서 i값을 뺀 값을 집어넣게 되는데
								   // 배열의 길이에서 i값을 빼면 10부터 1까지 넣을 수 있기 때문.
								   // ex) i = 0 일때 arr.length = 10 이고 10 - 0 --> arr[0] = 10
								   //     i = 1 일때 arr.length = 10 이고 10 - 1 --> arr[1] = 9
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // for문을 이용하여 0번 인덱스 부터 9번 인덱스까지 출력
	}
	
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()]; // arr 배열을 선언하고 입력받은 숫자 만큼의 길이로 할당한다.
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		} // arr.length가 입력받은 숫자와 같으므로 arr.length를 조건식에 사용하고 배열의 인덱스에 값을 넣어준다.
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // for문을 이용하여 0번 인덱스부터 9번 인덱스까지 출력
	}
	
	public void practice4() {
		// 길이가 5인 String 배열 선언하고 동시에 과일 이름으로 초기화
		// 이후 배열 인덱스를 이용해 귤을 출력한다.
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"}; // String 배열 arr을 선언과 동시에 초기화
		
		System.out.println(arr[1]); // 귤은 1번째 index의 값이므로 arr[1]을 출력한다.
	}
	
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가
		// 문자열에 몇 개가 들어있는지 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine(); // 문자열을 입력받아 str 변수에 저장한다.
		
		char[] chArr = new char[str.length()]; // 한글자씩 잘라서 배열에 넣고 검색해야 하므로
											   // char형 배열 chArr을 선언하고 String클래스의 length() 메서드를 이용하여
											   // 문자열 str의 길이만큼 배열의 길이를 할당해준다.
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		} // 반복문을 이용하여 str에서 한글자씩 뽑아내서 chArr 배열의 인덱스에 값을 넣어준다.
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // 어떤 문자를 검색할 것인지 입력 받는다.
		
		int count = 0; // 문자가 몇개 있는지 출력하기 위해 count 변수를 사용한다.
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < chArr.length; i++) { // for문을 이용하여 chArr 배열의 0번 인덱스 부터
												// 배열의 끝까지 검색한다.
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
				// 조건문을 이용하여 chArr의 i번째 인덱스의 값이 위에서 입력받은 문자형 변수 ch의 값과 같으면
				// 해당 인덱스의 번호를 출력하고 count 변수를 1 증가시킨다.
			}
		}
		System.out.println("\n" + ch + "의 개수 : " + count); // 반복문이 종료되면, 마지막으로 문자가 몇개 있는지 출력해준다.
	}
	
	public void practice6() {
		// 숫자를 입력하면 해당 인덱스에 있는 문자를 출력하는 예제
		
		Scanner sc = new Scanner(System.in);
		String[] dow = {"월", "화", "수", "목", "금", "토", "일"}; // String 배열 dow를 선언함과 동시에 요일로 초기화
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt(); // 숫자를 입력받아 input 변수에 저장해준다.
		
		if(input < 0 || input > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
			// 입력받은 값이 0보다 작거나 6보다 크면 오류메시지 출력
		}
		
		for(int i = 0; i < dow.length; i++) {
			if(i == input) {
				System.out.println(dow[i] + "요일");
			}
			// for문을 이용하여 0번 인덱스부터 5번 인덱스까지 돌면서 
			// i값이 입력받은 값과 같을 때 dow 배열의 i번째 인덱스 값을 출력한다.
		}
	}
	
	public void practice7() {
		// 배열의 길이를 직접 입력하여 그 값만큼의 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 인덱스에 값도 직접 입력하여 집어 넣고 배열 전체 값을 나열한 뒤 
		// 인덱스에 저장된 값들의 합계를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()]; // 입력받은 수 만큼 배열의 길이 할당
		int sum = 0; // 합계를 저장하기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			// 첫번째 for문에서는 배열의 길이만큼 인덱스 값을 직접 입력받고, 인덱스 값을 줄때마다 sum 변수에
			// 합계를 계산한다.
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// 두번째 for문에서는 인덱스 값을 나열한다.
		}
		System.out.println("\n총 합 : " + sum); // 인덱스 값들의 합계 출력
	}
	
	public void practice8() {
		// 3이상의 홀수를 입력 받아 해당하는 크기만큼의 배열을 숫자가 대칭되는
		// 모양으로 출력하기
		Scanner sc = new Scanner(System.in);
		
		while(true) { // while문을 이용하여 특정 조건이 만족되기 전까지 무한 반복
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input%2 == 0 || input < 3) {
				System.out.println("다시 입력하세요.");
				continue;
				// 입력받은 값이 3보다 작거나, 홀수가 아니면 오류 메시지를 출력하고 밑의 코드는 수행하지 않는다.
			}
			
			int[] arr = new int[input]; // if문에서 걸리지 않았다면 입력받은 값 만큼의 길이를 가진 배열 선언 및 할당
			int std = arr.length/2 + 1; // 배열의 중간을 찾기 위한 변수 홀수이기 때문에 입력받은 값을 2로 나눈뒤 1을 더하면
										// 중간 값이 된다.
			
			for(int i = 0; i < std; i++) {
				arr[i] = i+1;
			} // 0번 인덱스부터 std(기준점)번의 인덱스까지는 1씩 증가하며 인덱스 값을 넣어준다.
			
			int count = std; // 1씩 감소하는 모양을 만들기 위해 count 변수에 중간 값을 넣어준다.
			
			for(int i = std; i < input; i++) {
				count--;
				arr[i] = count;
				// 배열의 중간 이후부터 배열의 마지막 까지는 1씩 감소해야 하기 때문에 
				// 두번째 for문의 i 값의 std(배열의 중간값)부터 시작하여 count값을 1씩 감소시키고
				// 해당값을 i번 인덱스에 넣어줌으로써 1씩 감소하는 모양으로 인덱스 값을 넣어준다.
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(i != input-1) {
					System.out.print(arr[i] + ", "); 
					// i값이 배열의 마지막이 아니면 쉼표와 함께 출력
				} else {
					System.out.print(arr[i]);
					// i값이 배열의 마지막이면 쉼표 없이 출력
				}
			}
			break; // 무한루프 안의 모든 연산이 종료되면 무한루프 탈출 
		}
	}
	
	public void practice9() {
		
		// 6번 예제와 비슷하다. 반복문을 통해 배열을 쭉 검색하며 문자열 값이 같은 값을 출력하는것
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"양념", "후라이드", "슈프림", "고추바사삭", "뿌링클"}; // String 배열 선언 및 초기화
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) { // 배열의 0번 인덱스부터 마지막 인덱스까지 반복한다.
			if(chicken[i].equals(name)) {
				System.out.println(chicken[i] + "치킨 배달 가능");
				break;
				// 배열의 i번째 인덱스와 입력받은 치킨 이름이 동일할 경우 배달 가능하다고 출력 후 탈출
			} else {
				System.out.println(name + "치킨은 없는 메뉴 입니다.");
				break;
				// 치킨 이름이 동일하지 않으면 없는 메뉴 출력
			}
		}
	}
	
	public void practice10() {
		
		// 간단한 깊은 복사 문제
		// 얕은 복사는 원본 값이 같이 변하므로 사용 X
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine(); // 주민번호 입력받아 저장
		
		char[] idArr1 = new char[idNum.length()]; // 문자형 배열을 idNum의 길이만큼 할당
		
		for(int i = 0; i < idArr1.length; i++) {
			idArr1[i] = idNum.charAt(i);
			// 첫번째 for문에서는 입력받은 주민번호를 문자 하나 단위로 쪼개서 배열의 인덱스 값에 저장
		}
		
		char[] idArr2 = new char[idArr1.length]; // 복사할 배열 선언 및 할당
		
		for(int i = 0; i < idArr2.length; i++) {
			if(i > 7) {
				idArr2[i] = '*'; // 8번째 글자부터는 인덱스 값을 복사해오는 대신 '*' 문자를 넣는다
			} else {
				idArr2[i] = idArr1[i]; // 7번째 글자 까지는 그대로 깊은 복사를 해온다.
			}
		}
		
		for(int i = 0; i < idArr2.length; i++) {
			System.out.print(idArr2[i]);
			// 복사해와서 뒤쪽을 '*'문자로 가린 배열 출력 
		}
	}
	
	public void practice11() {
		// 난수 발생시켜 길이 10짜리 정수형 배열안에 집어 넣기
		int[] arr = new int[10]; // 배열 선언 할당
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		} // 난수 발생시켜 index값 초기화시켜주기
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // arr 출력
	}

	public void practice12() {
		// 난수 발생 시키고 배열에 초기화 후
		// 배열 전체 값과 최소, 최대값 출력
		int[] arr = new int[10]; // 배열 선언 할당
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		} // 난수 발생시켜 배열에 초기화
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // 배열 전체 값 출력

		int min = arr[0];
		int max = arr[0];
		// min값과 max값 모두 0번째 인덱스 값으로 초기화
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			// 배열의 전체값을 돌면서 min보다 작은 값은 min 변수에 저장하고, max보다 큰 값은 max 변수에 저장한다.
		}		
		System.out.println("\n최대값 : " + max + "\n최소값 : " + min);		// 출력
	}
	
	public void practice13() {
		// 난수 발생 및 배열에 초기화
		// 중복 제거까지
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); // arr에 난수받아서 초기화
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					// 안쪽에 for문을 한번 더 돌려서 만약 i번째 인덱스의 값과 j번째 인덱스의
					// 값이 같으면 i를 1 감소시켜서 다른 난수를 초기화 할수 있게 한다.
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		// 로또 번호 생성기
		// 13번 문제와 빗슷하다.
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1); // 난수에 45를 곱한 뒤 1을 더해 1~45까지의 난수를 발생시킨다.
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				} // 13번 문제와 마찬가지로 안쪽에 for을 넣어서 중복 제거
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		// 문자열 입력받아서 중복 제거한뒤 문자열에 있는 문자를 출력하고,
		// 문자의 갯수를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()]; // 입력받은 문자열의 길이 만큼의 크기를 가진 문자형 배열 할당
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i); // 입력받은 문자열을 문자 단위로 쪼개어 배열의 인덱스에 넣어준다.
			
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					chArr[i] = ' ';
					// 안쪽 for문은 중복제거인데, 난수할때와 다르게 i번째 인덱스와 j번째 인덱스의 값이
					// 같은 경우 i번째 인덱스를 공백문자로 바꿔준다.
				}
				
			}
		}
		
		int count = 0; // 문자 개수를 저장하기 위한 변수
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != ' ') {
				if(i == chArr.length-1) {
					System.out.print(chArr[i]);
					count++;
					// 배열을 처음부터 끝까지 순회하며 해당 인덱스 값이 공백문자가 아닌 경우 
					// 마지막 인덱스 이면 인덱스 값만 출력 후 count값 1증가
					
				} else {
					System.out.print(chArr[i] + ", ");
					count++;
					// 마지막 인덱스가 아닐경우 쉼표와 함께 출력하고 count값 1증가					
				}
			} 
		}
		System.out.println("\n문자 개수 : " + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 하세요 : ");
		int arrSize = sc.nextInt();
		sc.nextLine();
		// 배열의 크기를 입력한다.
		
		String[] strArr = new String[arrSize]; // strArr 배열을 선언하고 받은 입력크기 만큼의 길이로 할당해준다
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		} // strArr의 길이만큼 문자열을 입력받아 배열의 인덱스에 넣을 값을 초기화 해준다.
		
		while(true) { // 무한루프를 통해 y나 Y외의 다른 문자를 입력하는 경우 toString메서드를 이용하여 배열을 출력하고
					  // 반복문을 탈출한다.
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char loopCheck = sc.nextLine().charAt(0);
			// 배열의 길이를 늘릴지 여부를 문자로 입력받아 loopCheck변수에 저장해준다.
			
			if(loopCheck == 'y' || loopCheck == 'Y') { // loopCheck 변수가 y또는 Y일 경우
				System.out.print("더 입력하고 싶은 개수 : ");
				int addCount = sc.nextInt();
				sc.nextLine(); // 배열의 길이를 얼마나 늘리고 싶은지 입력받아 addCount 변수에 저장한다.
				
				String[] extendedArr = new String[strArr.length + addCount];
				// 배열의 길이를 늘리기 위해서 깊은 복사를 해야하므로
				// 새로운 배열인 extendedArr를 선언하고, 처음 입력받았던 strArr의 길이에 addCount값을 더한 만큼의  
				// 길이를 할당해 준다.
				
				for(int i = 0; i < strArr.length; i++) {
					extendedArr[i] = strArr[i];
				} // 기존에 존재하던 strArr의 인덱스 값들을 extendedArr에 복사해준다(깊은 복사)
				
				for(int i = strArr.length+1; i <= extendedArr.length; i++) {
					System.out.print(i + "번째 문자열 : ");
					extendedArr[i-1] = sc.nextLine();
				} // 복사가 종료되면 추가될 문자열을 추가된 길이 만큼의 횟수로 입력받고 해당 인덱스 값을 초기화해준다.
				
				strArr = extendedArr; // 새로운 배열에 문자열 추가까지 끝났다면, 기존의 배열인 strArr에 extenedArr를
									  // 대입하여 반복문이 계속 되더라도 누적될 수 있게 한다.
			} else {
				System.out.println(Arrays.toString(strArr));
				break;
				// loopCheck 변수가 y나 Y 이외의 다른 문자가 입력되면 strArr를 출력하고 반복문을 탈출한다.
			}
		}
	}
}
