package com.kh.noticeBoard.model.service;

import java.util.List;

import com.kh.noticeBoard.model.vo.Board;

public interface BoardService {
	// ��ü �Խñ� ����Ʈ ��ȸ
	public abstract List<Board> viewAll();
	
	// �Խñ� ����
	public abstract void createBoard(Board board);
	
	// �Է��� ������ ���� �Խñ� ��ȸ
	public abstract Board selectTitle(String title);
	
	// �Է��� �ۼ��ڸ� ���� �Խñ� ��ȸ
	public abstract List<Board> selectAuthor(String author);
	
	// �Խñ� ����
	public abstract String updateBoard(String title, String pwd, Board board);
	
	// �Խñ� ����(��й�ȣ �Է��ؼ� ������ ����)
	public abstract Board deldteBoard(String title, String pwd);
}
