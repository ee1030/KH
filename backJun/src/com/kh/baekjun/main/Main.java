package com.kh.baekjun.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[][] maze = new int[10][10];
    	
    	for(int i = 0; i < maze.length; i++) {
    		for(int j = 0; j < maze[i].length; j++) {
    			maze[i][j] = sc.nextInt();
    		}
    	}
    	
    	int mazeCount = 1;
    	boolean flag = false;
    	
    	for(int i = 1; i < maze.length; i++) {
    		for(int j = mazeCount; j < maze[i].length; j++) {
    			if(maze[i][j] == 1) {
    				mazeCount = j-1;
    				break;
    			} else if(maze[i][j] == 2) {
    				maze[i][j] = 9;
    				flag = true;
    				break;
    			} else {
    				maze[i][j] = 9;
    			}
    		}
    		if(flag) break;
    	}
    	
    	for(int i = 0; i < maze.length; i++) {
    		for(int j = 0; j < maze[i].length; j++) {
    			if(i == 9 && j == 9) {
    				System.out.print(maze[i][j]);
    			} else {
    				System.out.print(maze[i][j]+ " ");
    			}
    		}
    		if(i != 9) {
    			System.out.println();
    		}
    	}
    }
}
