package com.kh.baekjun.main;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int n = 3;
    	int[] lost = {3};
    	int[] reserve = {1};
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
        
        for(int i : lost) {
        	if(set.contains(i)) {
        		set.remove(i);
        		i = -1;
        	}
        }
        
        int count = lost.length;
        
        for(int i : reserve) {
        	if(set.contains(i)) count --;
        	if(count == 0) break;
        }
        
        answer = n - count;
        
        return answer;
    }
}
