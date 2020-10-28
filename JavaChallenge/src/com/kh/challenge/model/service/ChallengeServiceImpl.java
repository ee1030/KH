package com.kh.challenge.model.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ChallengeServiceImpl implements ChallengeService{
	
	private Scanner sc = new Scanner(System.in);

	@Override
	public void challenge1() {
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void challenge2() {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

	@Override
	public void challenge3() {
		for(int i = 1; i <= 30; i++) {
			if(i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

	@Override
	public void challenge4() {
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");
		}
		
	}

	@Override
	public void challenge5() {
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void challenge6() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		
		System.out.println("소수입니다.");
	}

	@Override
	public void challenge7() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}

	@Override
	public void challenge8() {
		for(int i = 9; i >= 2; i--) {
			for(int j = 9; j >= 1; j--) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}	
	}

	@Override
	public void challenge9() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i*j)%5 == 0) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
	}

	@Override
	public void challenge10() {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	@Override
	public void challenge11() {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void challenge12() {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void challenge13() {
		int random = (int)(Math.random()*50+1);
		
		while(true) {
			System.out.print("입력 : ");
			int input = sc.nextInt();
			
			if(input > random) {
				System.out.println("Down!");
			} else if(input < random) {
				System.out.println("Up!");
			} else {
				System.out.println("정답 !!");
				break;
			}
		}
		
	}

	@Override
	public void challenge14() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		System.out.print("정방향 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n역방향 : ");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	@Override
	public void challenge15() {
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < 10; i++) {
			set.add((int)(Math.random()*100+1));
		}
		
		for(Integer i : set) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void challenge16() {
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < 10; i++) {
			set.add((int)(Math.random()*100+1));
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

	@Override
	public void challenge17() {
		int[][] arr = new int[4][4];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void challenge18() {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		char[][] arr = new char[input][input];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					arr[i][j] = '*';
				} else if(j == arr[i].length - 1 - i) {
					arr[i][j] = '*';
				} else {
					arr[i][j] = ' ';
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

	@Override
	public void challenge19() {
		int[][] arr = new int[4][4];
		
		Set<Integer> set = new LinkedHashSet<>();
		
		while(true) {
			set.add((int)(Math.random()*16+1));
			if(set.size() == 16) {
				break;
			}
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = list.get(count++);
			}
		}
		
		while(true) {
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
			boolean flag = true;
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) return;
			
			System.out.print("0으로 변환할 숫자 : ");
			int changeNum = sc.nextInt();
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == changeNum) {
						arr[i][j] = 0;
					}
				}
			}
		}
		
	}

	@Override
	public void challenge20() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void challenge21() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Integer> generateLotto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
