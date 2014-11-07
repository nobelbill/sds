package com.multicampus.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.BoardVO;

// DAO(Data Access Object)
@Repository
public class BoardDAOiBatis {
	
	@Autowired
	private SqlMapClientTemplate ibatis;

	// �� ���
	public void insertBoard(BoardVO vo){
		ibatis.insert("insertBoard",vo);
	}
	
	// �� ����
	public void updateBoard(BoardVO vo){
		ibatis.update("updateBoard",vo);
	}	
	
	// �� ����
	public void deleteBoard(BoardVO vo){
		ibatis.delete("deleteBoard",vo);
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo){
		return (BoardVO) ibatis.queryForObject("getBoard",vo);
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		return ibatis.queryForList("getBoardList",vo);
	}	
}














