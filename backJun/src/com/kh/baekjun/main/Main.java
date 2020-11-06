package com.kh.baekjun.main;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> result = new Stack<>(); 
    
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]] != 0) {
        			result.add(board[j][moves[i]]);
        			if(result.size() > 1) {
        				answer += 2;
        				result.remove(i);
        				result.remove(i);
        			}
        			board[j][moves[i]] = 0;
        		}
        	}
        }
        
        return answer;
    }
}