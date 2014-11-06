package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

//@Service("afterReturning")
@Aspect
public class AfterReturningAdvice {
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) { 
		String method = jp.getSignature().getName();	
		
		System.out.println("[���� ó��] " + method + 
			"() �޼��� ���� �� : " + returnObj.toString());
	}
	
}
