package com.multicampus.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.BoardVO;

// DAO(Data Access Object)
@Repository
public class BoardDAOHibernate {
	
	@Autowired
	private HibernateTemplate hibernate;
	// �� ���
	public void insertBoard(BoardVO vo){
		hibernate.save(vo);
	}
	
	// �� ����
	public void updateBoard(BoardVO vo){
		hibernate.update(vo);
	}	
	
	// �� ����
	public void deleteBoard(BoardVO vo){
		hibernate.delete(vo);
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo){
		return hibernate.get(BoardVO.class,vo.getSeq());
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		return hibernate.find("from BoardVO b order by b.seq desc");
	}	
}














