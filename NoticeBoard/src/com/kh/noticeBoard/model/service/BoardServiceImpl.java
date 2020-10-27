package com.kh.noticeBoard.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.noticeBoard.model.vo.Board;

public class BoardServiceImpl implements BoardService{
	
	private Board[] boards = { 
			new Board("���� �����Դϴ�.", "������", "������ �ƹ��ų�", "1234"),
			new Board("���鼭 Ǫ�ɾ���.", "���Ѽ�", "������ �ƹ��ų�", "5678"),
			new Board("���� �����Դϴ�.", "������", "������ �ƹ��ų�", "9123"),
			new Board("�ſ��� �����Դϴ�.", "������", "������ �ƹ��ų�", "1234")
			};

	// ��ü �迭 ����Ʈ�� ��ȯ
	private List<Board> boardList = new ArrayList<>(Arrays.asList(boards));
	
	// ��ü �Խù� ��ȸ�� ���Ͽ� �Խñ� ����Ʈ�� ��ȯ�ϴ� �޼ҵ�
	@Override
	public List<Board> viewAll() {
		return boardList;
	}


	// �������� �˻��ϱ� ���� �޼ҵ�
	// ���� for���� �̿��Ͽ� ����Ʈ�� �����ϰ�
	// ������ �������� �˻��Ͽ� ���� ������ �Խñ��� ��ȯ���ش�.
	// �Խñ��� ��ȯ �� ��� �ش� �Խñ��� ��ȸ���� 1 �÷��ش�.
	@Override
	public Board selectTitle(String title) {
		for(Board board : boardList) {
			if(board.getTitle().equals(title)) {
				board.setCount(board.getCount()+1);
				return board;
			}
		}
		return null;
	}

	// �ۼ����� �̸����� �Խñ��� �˻��ϱ� ���� �޼ҵ�
	// �ӽ� ����Ʈ�� �ϳ� �����ϰ� 
	// �Ű������� ���� �ۼ��� �̸��� ���� �����ϴ� �Խñ� ����Ʈ�� �ۼ��� �̸��� ���Ͽ�
	// ���� �ۼ��ڰ� ������ �ӽ� ����Ʈ�� �ش� ��ü�� �߰�
	// �� �۾��� ������ �ӽ� ����Ʈ�� ��ȯ�Ѵ�.
	
	@Override
	public List<Board> selectAuthor(String author) {
		
		List<Board> tmpList = new ArrayList<>();
		
		for(Board board : boardList) {
			if(board.getAuthor().equals(author)) {
				tmpList.add(board);
			}
		}
		return tmpList;
	}
	
	// �Խñ��� �߰��ϱ� ���� �޼ҵ�
	// ���� �Խñ� ����Ʈ�� �Ű������� ���� board ��ü�� �߰��Ѵ�.
	
	@Override
	public void createBoard(Board board) {
		boardList.add(board);
	}


	// �Խñ��� �����ϱ� ���� �޼ҵ�
	// �Ű������� ���� ����� ��й�ȣ�� �˻��Ͽ�
	// �˻縦 ����� ��ü�� ����� ����, �ۼ��ڸ�
	// �Ű������� ���� board ��ü�� ����� ����, �ۼ��ڷ� �ٲ��ش�.
	// ��й�ȣ�� ����ǰų� null ���� �Ǹ� �ȵȴ�.
	// �Ϸ�Ǹ� "������ �Ϸ�Ǿ����ϴ�" ��� ���ڿ� ���� ��ȯ�ϰ�
	// ������ ����� ��ü�� ���� ��� null ���� ����
	
	@Override
	public String updateBoard(String title, String pwd, Board board) {
		
		for(Board bd : boardList) {
			if(bd.getTitle().equals(title) && bd.getPwd().equals(pwd)) {
				bd.setTitle(board.getTitle());
				bd.setContent(board.getContent());
				bd.setAuthor(board.getAuthor());
				bd.setCount(bd.getCount() - 1);
				
				return "������ �Ϸ�Ǿ����ϴ�.";
			}
		}
		return null;
	}
	
	// �Խñ��� �����ϱ� ���� �޼ҵ�
	// for���� �̿��Ͽ� ���޹��� ����� ��й�ȣ�� 
	// ���� �Խñ� ����Ʈ�� ���Ͽ� �˻縦 ����� ��ü�� �ӽ� ������ �� �����
	// �ӽ������� ��ü�� ��ȯ���ش�. ������ ����� ��ü�� ���ٸ� null���� ��ȯ.

	@Override
	public Board deldteBoard(String title, String pwd) {
		
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getTitle().equals(title) && boardList.get(i).getPwd().equals(pwd)) {
				Board tmpBoard = boardList.remove(i);
				return tmpBoard;
			}
		}
		return null;
	}
	
}
