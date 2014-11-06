package com.multicampus.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* com.multicampus.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	@Pointcut("execution(* com.multicampus.biz..*Impl.get*(..))")
	public void getPointcut(){}
	
}
