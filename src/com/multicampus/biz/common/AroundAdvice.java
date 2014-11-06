package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service("around")
@Aspect
public class AroundAdvice {

	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = null;
		String method = pjp.getSignature().getName();
		
		long start = System.currentTimeMillis();
		
		obj = pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(method + "() �޼��� ���࿡ �ɸ� �ð� : " + 
				(end - start) + "ms(��)");
		
		return obj;
	}
	
}
