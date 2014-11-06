package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Service("log")
@Aspect // Aspect = Pointcut + Advice(Before, After, Around....)
public class LogAdvice {

	@Before("PointcutCommon.allPointcut()")
	public void printLog(JoinPoint jp) { 
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] " + method + 
			"() �޼��� ARGS ���� : " + args[0].toString());
	}
	
}
