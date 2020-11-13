package com.kh.baekjun.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int n = 5;
    	int[] lost = {3};
    	int[] reserve = {1};
    	System.out.println(sol.solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        List<Integer> stdList = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	stdList.add(i);
        }
        
        
        
        System.out.println(stdList);
        
        return answer;
    }
}
