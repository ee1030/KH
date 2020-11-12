package com.kh.baekjun.main;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int n = 5;
    	int[] lost = {2, 4};
    	int[] reserve = {1, 3, 5};
    	System.out.println(sol.solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i : lost) {
        	set.add(i-1);
        	set.add(i+1);
        }
        
        
       
        System.out.println(set);
        
        return answer;
    }
}
