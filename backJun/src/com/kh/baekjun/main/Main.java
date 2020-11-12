package com.kh.baekjun.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] answers = {1, 2, 3, 4, 5};
    	System.out.println(Arrays.toString(sol.solution(answers)));
    }
}

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        
        int[] ansCnt = new int[3]; 
        
        int[] patt1 = {1, 2, 3, 4, 5};
        int[] patt2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] patt3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int max = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == patt1[i%5]) {
        		ansCnt[0]++;
        	}
        	
        	if(answers[i] == patt2[i%8]) {
        		ansCnt[1]++;
        	}
        	
        	if(answers[i] == patt3[i%10]) {
        		ansCnt[2]++;
        	}
        }
        
        for(int i = 0; i < ansCnt.length; i++) {
        	if(max < ansCnt[i]) {
        		max = ansCnt[i];
        	}
        }
        
        for(int i = 0; i < ansCnt.length; i++) {
        	if(max == ansCnt[i]) {
        		list.add(i+1);
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}