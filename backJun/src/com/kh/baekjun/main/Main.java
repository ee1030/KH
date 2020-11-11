package com.kh.baekjun.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	
    	int[][] board = {{0,0,1,0,0},{0,0,1,0,0},{0,2,1,0,0},{0,2,1,0,0},{0,2,1,0,0}};
    	int[] moves = {1,2,3,3,2,3,1};
    	System.out.println(sol.solution(board, moves));
    	
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> result = new ArrayList<>(); 
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]-1] != 0) {	
        			if(!result.isEmpty()) {
        				if(result.get(result.size()-1) == board[j][moves[i]-1]) {
        					result.remove(result.size()-1);
        					answer += 2;
        				} else {
        					result.add(board[j][moves[i]-1]);
        				}
        			} else {
        				result.add(board[j][moves[i]-1]);
        			}
        			board[j][moves[i]-1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}