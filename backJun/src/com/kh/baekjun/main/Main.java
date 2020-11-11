package com.kh.baekjun.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] numbers = {5, 0, 2, 7};
    	System.out.println(Arrays.toString(sol.solution(numbers)));
    	
    }
}

class Solution {
    public int[] solution(int[] numbers) {
    	
    	List<Integer> list = new ArrayList<>();
    	List<Integer> tmpList = new ArrayList<>();
    	
    	for(int i = 0; i < numbers.length-1; i++) {
    		for(int j = i+1; j < numbers.length; j++) {
    			list.add(numbers[i] + numbers[j]);
    		}
    	}
    	
    	for(int i : list) {
    		if(!tmpList.contains(i)) {
    			tmpList.add(i);
    		}
    	}
    	    	
    	int[] answer = new int[tmpList.size()];
    	
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = tmpList.get(i);
    	}
    	
    	Arrays.sort(answer);
    	
        return answer;
    }
}