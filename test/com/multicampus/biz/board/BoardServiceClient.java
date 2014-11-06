package com.multicampus.biz.board;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. Spring IoC �����̳ʸ� �����Ѵ�. 
		ApplicationContext container = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring IoC �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup�Ѵ�.
		BoardService boardService = 
			(BoardService) container.getBean("boardService");
		
		// 3. �˻��� ��ü�� �޼��带 �׽�Ʈ�Ѵ�.
		BoardVO vo = new BoardVO();
		vo.setTitle("Spring JDBC ����");
		vo.setWriter("ä����");
		vo.setContent("Spring JDBC ����................");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}
}










