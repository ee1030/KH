package com.kh.baekjun.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	String[] participant = {"mislav", "stanko", "mislav", "ana"};
    	String[] completion = {"stanko", "ana", "mislav"};
    	System.out.println(sol.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        
        for(i = 0; i < completion.length; i++) {
        	if(participant[i] != completion[i]) {
        		return participant[i];
        	}
        }
        
        return participant[i];
    }
}