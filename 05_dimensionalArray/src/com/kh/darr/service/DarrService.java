package com.kh.darr.service;

import java.util.Arrays;
import java.util.Scanner;

public class DarrService {

	public void example1() {
		// 2차원 배열
		// - 1차원 배열의 묶음
		
		// 2차원 배열 선언
		int[][] iArr;
		
		// 2차원 배열 할당
		iArr = new int[2][3];
		// 2차원 배열 2행 3열을 할당하여
		// 시작 주소값을 iArr 참조 변수에 대입
		
		// 배열의 각 요소에 1부터 6까지를 저장
		int count = 1;
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = count++;
			}
		}
		
		for(int i = 0; i< iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		// System.out.println(Arrays.deepToString(iArr));
	}
	
	public void example2() {
		// 2차원 배열 선언, 할당, 초기화를 한번에! 2차원 배열 올인원 패키지!
		int[][] arr = {{10, 20, 30}, {4, 5, 6}, {19, 17, 21}};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("배열의 값들의 합계 : " + sum +
				"\n배열의 값들의 평균 : " + (double)sum / (arr.length*arr[0].length));
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void example3() {
		// 학생 두명의 국어 영어 수학 점수를 입력 받아
		// 각 학생의 점수 합계, 평균 출력
		// 두 학생의 국어 평균, 영어 평균, 수학 평균 출력
		
		/*
		 * 1번 학생 점수 입력
		 * 국어 : 50
		 * 영어 : 60
		 * 수학 : 70
		 * 
		 * 2번 학생 점수 입력
		 * 국어 : 70
		 * 영어 : 80
		 * 수학 : 90
		 * 
		 * -----------------------------
		 * 
		 * 1번 학생 성적
		 * 국어 : 50
		 * 영어 : 60
		 * 수학 : 70
		 * 합계 : 180
		 * 평균 : 60
		 * 
		 * 2번 학생 성적
		 * 국어 : 70
		 * 영어 : 80
		 * 수학 : 90
		 * 합계 : 2240
		 * 평균 : 80
		 * 
		 * 국어 평균 : 60
		 * 영어 평균 : 70
		 * 수학 평균 : 80
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[2][3];
		
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1+"번 학생 점수 입력");
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(subject[j] + " : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n--------------------------------------=\n");
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1+"번 학생 성적");
			int sum = 0;
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.println(subject[j] + " : " + score[i][j]);
			}
			
			System.out.println("합계 : " + sum +
					"\n평균 : " + (double)sum/(subject.length));
		}
		
		for(int i = 0; i < score[0].length; i++) {
			int subjectSum = 0;
			for(int j = 0; j < score.length; j++) {
				subjectSum += score[j][i];
			}
			
			System.out.println(subject[i] + " 평균 : " + (double)(subjectSum/score.length));
		}
	}
}
