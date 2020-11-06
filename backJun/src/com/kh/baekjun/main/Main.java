package com.kh.baekjun.main;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	
    	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] moves = {1,5,3,5,1,2,1,4};
    	System.out.println(sol.solution(board, moves));
    	
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> result = new Stack<>(); 
        
        
        return answer;
    }
}