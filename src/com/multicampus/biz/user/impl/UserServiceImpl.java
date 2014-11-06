package com.multicampus.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
