package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + ch + "의 개수 : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] dow = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		if(input < 0 || input > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i = 0; i < dow.length; i++) {
			if(i == input) {
				System.out.println(dow[i] + "요일");
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input%2 == 0 || input < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int[] arr = new int[input];
			int std = arr.length/2 + 1;
			
			for(int i = 0; i < std; i++) {
				arr[i] = i+1;
			}
			
			int count = std;
			
			for(int i = std; i < input; i++) {
				count--;
				arr[i] = count;
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(i != input-1) {
					System.out.print(arr[i] + ", ");
				} else {
					System.out.print(arr[i]);
				}
			}
			break;
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"양념", "후라이드", "슈프림", "고추바사삭", "뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(name)) {
				System.out.println(chicken[i] + "치킨 배달 가능");
				break;
			} else {
				System.out.println(name + "치킨은 없는 메뉴 입니다.");
				break;
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		char[] idArr1 = new char[idNum.length()];
		
		for(int i = 0; i < idArr1.length; i++) {
			idArr1[i] = idNum.charAt(i);
		}
		
		char[] idArr2 = new char[idArr1.length];
		
		for(int i = 0; i < idArr2.length; i++) {
			if(i > 7) {
				idArr2[i] = '*';
			} else {
				idArr2[i] = idArr1[i];
			}
		}
		
		for(int i = 0; i < idArr2.length; i++) {
			System.out.print(idArr2[i]);
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}		
		System.out.println("\n최대값 : " + max + "\n최소값 : " + min);		
	}
	
	public void practice13() {
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
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					chArr[i] = ' ';
				}
			}
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != ' ') {
				if(i == chArr.length-1) {
					System.out.print(chArr[i]);
					count++;
					
				} else {
					System.out.print(chArr[i] + ", ");
					count++;
				}
			} 
		}
		System.out.println("\n문자 개수 : " + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 하세요 : ");
		int arrSize = sc.nextInt();
		
		String[] strArr = new String[arrSize];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}
		
		do {
			System.out.print("더 값을 입력 하시겠습니까?(Y/N) : ");
			char extenedCheck = sc.nextLine().charAt(0);
			
			if(extenedCheck == 'y' || extenedCheck == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int extendedSize = sc.nextInt();
				
				String[] extendedArr = new String[strArr.length+extendedSize];
				
				for(int i = 0; i < strArr.length; i++) {
					extendedArr[i] = strArr[i];
				}
				
				for(int i = strArr.length + 1; i < extendedArr.length; i++) {
					System.out.print(i + "번째 문자열 : ");
					extendedArr[i] = sc.nextLine();
				}
			} 
			
		} while(true);
	}
}
