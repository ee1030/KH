package com.kh.noticeBoard.view;

import java.util.List;

import com.kh.noticeBoard.model.service.BoardService;
import com.kh.noticeBoard.model.service.BoardServiceImpl;
import com.kh.noticeBoard.model.vo.Board;

public class BoardViewImpl extends BoardView {
	
	private BoardService service = new BoardServiceImpl();

	@Override
	public void viewAll() {
		// service.viewAll() �޼ҵ带 ȣ���Ͽ� �Խñ� ����Ʈ�� ��ȯ�޾�
		// �ۼ��� ��ü �Խñ��� ��ȸ�ϴ� ���
		// �Խñ��� ����� �ۼ���, ��ȸ���� ǥ�õǾ�� �Ѵ�.
		List<Board> boardList = service.viewAll();
		
		for(Board board : boardList) {
			System.out.println(board.getTitle() + " || " + board.getAuthor() + " || " + board.getCount());
		}
	}

	@Override
	public void selectTitle() {
		// service.selectTitle() �޼ҵ带 ȣ���Ͽ�
		// ���޹��� �Ű������� ���� �������� �˻��Ͽ� �Խñ��� ��ȸ�ϴ� ���
		// �ߺ��Ǵ� ������ ���ٰ� �����Ѵ�.
		// ������ �˻��ؼ� �Խñ��� ��ȸ�� ��� �ش� �Խñ��� ��ȸ���� 1 ������Ų��.
		System.out.print("�˻��Ͻ� �Խñ��� ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		Board newBoard = service.selectTitle(title);
		
		if(newBoard == null) {
			System.out.println("�˻��Ͻ� ����� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(newBoard);
		}
	}

	@Override
	public void selectAuthor() {
		// ���޹��� �Ű������� ���� �ۼ��ڷ� �˻��Ͽ� �Խñ��� ��ȸ�ϴ� ���
		// service.selectAuthor() �޼ҵ带 ȣ���Ͽ� ����Ʈ�� ��ȯ�޾�
		// ���� for���� �̿��Ͽ� ����Ѵ�.
		// �ۼ����� �̸����� �˻��ؼ� �Խñ��� ��ȸ�� ��� ��ȸ���� ������ �ʴ´�.
		System.out.print("�˻��Ͻ� �ۼ����� �̸��� �Է��ϼ��� : ");
		String author = sc.nextLine();
		
		List<Board> tmpList = service.selectAuthor(author);
		
		if(tmpList.size() == 0) {
			System.out.println("�˻��Ͻ� �ۼ��ڿ� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�.");
		} else {
			for(Board board : tmpList) {
				System.out.println(board);
			}
		}
	}
	
	@Override
	public void createBoard() {
		// �Խñ��� ���� �ۼ��ϴ� ���
		// ����, �ۼ���, �Խñ� �����
		// �Խñ��� ��й�ȣ�� �Է¹����� Board ��ü�� �����ϰ�
		// service.create() �޼ҵ带 ȣ���Ͽ� Board ��ü�� �Ű������� �����Ͽ�
		// ���ο� �Խñ��� �߰��Ѵ�.
		
		System.out.print("������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		System.out.print("�ۼ��� �̸��� �Է��ϼ��� : ");
		String author = sc.nextLine();
		
		System.out.print("�Խñ� ������ �Է��ϼ��� : ");
		String content = sc.nextLine();
		
		System.out.print("�Խñ��� ��й�ȣ�� �Է��ϼ��� : ");
		String pwd = sc.nextLine();
		
		Board newBoard = new Board(title, author, content, pwd);
		service.createBoard(newBoard);
		
	}

	@Override
	public void updateBoard() {
		// �����ϴ� �Խñ��� �����ϴ� ���
		// �Է¹��� ����� ��ġ�ϴ� �Խñ��� �������
		// "�Է��Ͻ� ����� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�."�� ���
		// ����� �ۼ���, ����, ��й�ȣ�� �Է¹��� ��
		// ��й�ȣ�� �Ű������� ���� �����ؼ� ��й�ȣ�� �˻��ϰ�
		// service.updateBoard() �޼ҵ带 ȣ���Ͽ�
		// ����� ��й�ȣ�� �����ϸ� ���� null ���� ���ϵǸ�
		// "�Է��Ͻ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�." ���
		
		System.out.print("������ �Խñ��� ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		Board tmpBoard = service.selectTitle(title);
		
		if(tmpBoard == null) {
			System.out.println("�Է��Ͻ� ����� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("�����Ͻ� ������ �Է��ϼ��� : ");
		String updateTitle = sc.nextLine();
		
		System.out.print("�����Ͻ� �ۼ��� �̸��� �Է��ϼ��� : ");
		String updateAuthor = sc.nextLine();
		
		System.out.print("�����Ͻ� ������ �Է��ϼ��� : ");
		String updateContent = sc.nextLine();
		
		System.out.print("������ �Խñ��� ��й�ȣ�� �Է��ϼ��� : ");
		String pwd = sc.nextLine();

		String str = service.updateBoard(title, pwd, new Board(updateTitle, updateAuthor, updateContent));
		
		if(str == null) {
			System.out.println("�Է��Ͻ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		} else {
			System.out.println(str);
		}
		
	}

	@Override
	public void deleteBoard() {
		// �����ϴ� �Խñ��� �����ϴ� ���
		// ������ �Խñ��� ����� ��й�ȣ�� �Է¹ް�
		// �ӽ� Board ��ü�� ���� �� service.deleteBoard() �޼ҵ带 ȣ���Ͽ�
		// ����� ��й�ȣ�� �˻� �� �� 
		// �˻縦 ����ϸ� ������ �Խñ� ���� + " �Խñ��� �����Ͽ����ϴ�." ���
		// �˻縦 ������� ���ϰ� null ���� ���� ������ "���� �Ǵ� ��й�ȣ�� Ȯ���� �ּ���." ���
		
		System.out.print("�����Ͻ� �Խñ��� ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		System.out.print("�����Ͻ� �Խñ��� ��й�ȣ�� �Է��ϼ��� : ");
		String pwd = sc.nextLine();
		
		Board tmpBoard = service.deldteBoard(title, pwd);
		
		if(tmpBoard == null) {
			System.out.println("���� �Ǵ� ��й�ȣ�� Ȯ���� �ּ���.");
		} else {
			System.out.println(tmpBoard.getTitle() + " �Խñ��� �����Ͽ����ϴ�.");
		}
		
	}

}
