package com.multicampus.biz.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		// 1. Spring IoC �����̳ʸ� �����Ѵ�. 
		ApplicationContext container = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring IoC �����̳ʷκ��� UserServiceImpl ��ü�� Lookup�Ѵ�.
		UserService userService = 
			(UserService) container.getBean("userService");
		
		// 3. �˻��� ��ü�� �޼��带 �׽�Ʈ�Ѵ�.
		UserVO vo = new UserVO();
		vo.setId("aaa");
		vo.setPassword("aaa");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�α��� ȯ��");
		} else {
			System.out.println("�α��� ����");
		}
	}
}





