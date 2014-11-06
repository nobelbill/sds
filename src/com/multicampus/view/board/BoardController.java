package com.multicampus.view.board;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// �� ���
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BindingResult errors) throws IOException {
		// ���� ���ε� ���� 
		
		new BoardValidator().validate(vo, errors);
		if(errors.hasErrors()) 
			return "insertBoard.jsp";
		
		MultipartFile uploadFile = vo.getUploadFile();
		if (uploadFile.getOriginalFilename().length() > 0) {
			String fileName = uploadFile.getOriginalFilename();
			byte[] data = uploadFile.getBytes();
			FileOutputStream out = new FileOutputStream("C:/DEV/workspace/SpringMVC2Project/WebContent/uploadFiles/" + fileName);
			out.write(data);
			out.close();
		}
		boardService.insertBoard(vo);		
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);		
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);		
		return "getBoardList.do";
	}
	
	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // Model ���� ����
		return "getBoard.jsp";       // View  ���� ����
	}
	
	// �� ��� ��ȸ
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		model.addAttribute("boardList", boardService.getBoardList(vo)); // Model ���� ����
		return "getBoardList.jsp";       // View  ���� ����
	}
}
