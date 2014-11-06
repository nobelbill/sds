package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

//@Service("afterThrowing")
@Aspect
public class AfterThrowingAdvice {
	
	@AfterThrowing(pointcut="PointcutCommon.allPointcut()", throwing="exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) { 
		String method = jp.getSignature().getName();	
		
		System.out.println("[���� ó��] " + method + 
			"() �޼��� ���� �� �߻��� ���� �޽��� : " + 
				exceptObj.getMessage());
	}
	
}
