package com.kh.darr.service;

import java.util.Arrays;
import java.util.Scanner;

public class DarrService {

	public void example1() {
		// 2���� �迭
		// - 1���� �迭�� ����
		
		// 2���� �迭 ����
		int[][] iArr;
		
		// 2���� �迭 �Ҵ�
		iArr = new int[2][3];
		// 2���� �迭 2�� 3���� �Ҵ��Ͽ�
		// ���� �ּҰ��� iArr ���� ������ ����
		
		// �迭�� �� ��ҿ� 1���� 6������ ����
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
		// 2���� �迭 ����, �Ҵ�, �ʱ�ȭ�� �ѹ���! 2���� �迭 ���ο� ��Ű��!
		int[][] arr = {{10, 20, 30}, {4, 5, 6}, {19, 17, 21}};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("�迭�� ������ �հ� : " + sum +
				"\n�迭�� ������ ��� : " + (double)sum / (arr.length*arr[0].length));
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void example3() {
		// �л� �θ��� ���� ���� ���� ������ �Է� �޾�
		// �� �л��� ���� �հ�, ��� ���
		// �� �л��� ���� ���, ���� ���, ���� ��� ���
		
		/*
		 * 1�� �л� ���� �Է�
		 * ���� : 50
		 * ���� : 60
		 * ���� : 70
		 * 
		 * 2�� �л� ���� �Է�
		 * ���� : 70
		 * ���� : 80
		 * ���� : 90
		 * 
		 * -----------------------------
		 * 
		 * 1�� �л� ����
		 * ���� : 50
		 * ���� : 60
		 * ���� : 70
		 * �հ� : 180
		 * ��� : 60
		 * 
		 * 2�� �л� ����
		 * ���� : 70
		 * ���� : 80
		 * ���� : 90
		 * �հ� : 2240
		 * ��� : 80
		 * 
		 * ���� ��� : 60
		 * ���� ��� : 70
		 * ���� ��� : 80
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[2][3];
		
		String[] subject = {"����", "����", "����"};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1+"�� �л� ���� �Է�");
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(subject[j] + " : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n--------------------------------------=\n");
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i+1+"�� �л� ����");
			int sum = 0;
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.println(subject[j] + " : " + score[i][j]);
			}
			
			System.out.println("�հ� : " + sum +
					"\n��� : " + (double)sum/(subject.length));
		}
		
		for(int i = 0; i < score[0].length; i++) {
			int subjectSum = 0;
			for(int j = 0; j < score.length; j++) {
				subjectSum += score[j][i];
			}
			
			System.out.println(subject[i] + " ��� : " + (double)(subjectSum/score.length));
		}
	}
}
