package com.kh.noticeBoard.view;

import java.util.List;

import com.kh.noticeBoard.model.service.BoardService;
import com.kh.noticeBoard.model.service.BoardServiceImpl;
import com.kh.noticeBoard.model.vo.Board;

public class BoardViewImpl extends BoardView {
	
	private BoardService service = new BoardServiceImpl();

	@Override
	public void viewAll() {
		// service.viewAll() 메소드를 호출하여 게시글 리스트를 반환받아
		// 작성된 전체 게시글을 조회하는 기능
		// 게시글은 제목과 작성자, 조회수만 표시되어야 한다.
		List<Board> boardList = service.viewAll();
		
		for(Board board : boardList) {
			System.out.println(board.getTitle() + " || " + board.getAuthor() + " || " + board.getCount());
		}
	}

	@Override
	public void selectTitle() {
		// service.selectTitle() 메소드를 호출하여
		// 전달받은 매개변수를 통해 제목으로 검색하여 게시글을 조회하는 기능
		// 중복되는 제목은 없다고 가정한다.
		// 제목을 검색해서 게시글을 조회할 경우 해당 게시글의 조회수를 1 증가시킨다.
		System.out.print("검색하실 게시글의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		Board newBoard = service.selectTitle(title);
		
		if(newBoard == null) {
			System.out.println("검색하신 제목과 일치하는 게시글이 존재하지 않습니다.");
		} else {
			System.out.println(newBoard);
		}
	}

	@Override
	public void selectAuthor() {
		// 전달받은 매개변수를 통해 작성자로 검색하여 게시글을 조회하는 기능
		// service.selectAuthor() 메소드를 호출하여 리스트를 반환받아
		// 향상된 for문을 이용하여 출력한다.
		// 작성자의 이름으로 검색해서 게시글을 조회할 경우 조회수는 오르지 않는다.
		System.out.print("검색하실 작성자의 이름을 입력하세요 : ");
		String author = sc.nextLine();
		
		List<Board> tmpList = service.selectAuthor(author);
		
		if(tmpList.size() == 0) {
			System.out.println("검색하신 작성자와 일치하는 게시글이 존재하지 않습니다.");
		} else {
			for(Board board : tmpList) {
				System.out.println(board);
			}
		}
	}
	
	@Override
	public void createBoard() {
		// 게시글을 새로 작성하는 기능
		// 제목, 작성자, 게시글 내용과
		// 게시글의 비밀번호를 입력받은뒤 Board 객체를 생성하고
		// service.create() 메소드를 호출하여 Board 객체를 매개변수로 전달하여
		// 새로운 게시글을 추가한다.
		
		System.out.print("제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 이름을 입력하세요 : ");
		String author = sc.nextLine();
		
		System.out.print("게시글 내용을 입력하세요 : ");
		String content = sc.nextLine();
		
		System.out.print("게시글의 비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();
		
		Board newBoard = new Board(title, author, content, pwd);
		service.createBoard(newBoard);
		
	}

	@Override
	public void updateBoard() {
		// 존재하는 게시글을 수정하는 기능
		// 입력받은 제목과 일치하는 게시글이 없을경우
		// "입력하신 제목과 일치하는 게시글이 존재하지 않습니다."를 출력
		// 제목과 작성자, 내용, 비밀번호를 입력받은 뒤
		// 비밀번호는 매개변수로 같이 전달해서 비밀번호를 검사하고
		// service.updateBoard() 메소드를 호출하여
		// 제목과 비밀번호가 동일하면 수정 null 값이 리턴되면
		// "입력하신 비밀번호가 올바르지 않습니다." 출력
		
		System.out.print("수정할 게시글의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		Board tmpBoard = service.selectTitle(title);
		
		if(tmpBoard == null) {
			System.out.println("입력하신 제목과 일치하는 게시글이 존재하지 않습니다.");
			return;
		}
		
		System.out.print("수정하실 제목을 입력하세요 : ");
		String updateTitle = sc.nextLine();
		
		System.out.print("수정하실 작성자 이름을 입력하세요 : ");
		String updateAuthor = sc.nextLine();
		
		System.out.print("수정하실 내용을 입력하세요 : ");
		String updateContent = sc.nextLine();
		
		System.out.print("수정할 게시글의 비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();

		String str = service.updateBoard(title, pwd, new Board(updateTitle, updateAuthor, updateContent));
		
		if(str == null) {
			System.out.println("입력하신 비밀번호가 올바르지 않습니다.");
		} else {
			System.out.println(str);
		}
		
	}

	@Override
	public void deleteBoard() {
		// 존재하는 게시글을 삭제하는 기능
		// 삭제할 게시글의 제목과 비밀번호를 입력받고
		// 임시 Board 객체를 만든 뒤 service.deleteBoard() 메소드를 호출하여
		// 제목과 비밀번호를 검사 한 뒤 
		// 검사를 통과하면 삭제된 게시글 제목 + " 게시글을 삭제하였습니다." 출력
		// 검사를 통과하지 못하고 null 값을 리턴 받으면 "제목 또는 비밀번호를 확인해 주세요." 출력
		
		System.out.print("삭제하실 게시글의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제하실 게시글의 비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();
		
		Board tmpBoard = service.deldteBoard(title, pwd);
		
		if(tmpBoard == null) {
			System.out.println("제목 또는 비밀번호를 확인해 주세요.");
		} else {
			System.out.println(tmpBoard.getTitle() + " 게시글을 삭제하였습니다.");
		}
		
	}

}
