package com.study.test.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//表示是一个通知类
@Component
@Aspect
public class MyAdvice {
	// 声明一个切入点，advice为切入点名称
	@Pointcut("execution(* com.study.test.impl..*InterfaceImpl.*(..))")
	public void advice() {
	}

	// 前置通知
	// 指定方法是前置通知，并制定切入点
	@Before("advice()")
	public void before() {
		System.out.println("这是前置通知！");
	}

	// 后置通知
	@AfterReturning("advice()")
	public void afterReturning() {
		System.out.println("这是后置通知(如果出现异常不会调用)");
	}

	// 环绕通知
	@Around("advice()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知之前的部分！");
		Object proceed = pjp.proceed();// 调用目标方法
		System.out.println("这是环绕通知之后的部分！");
		return proceed;
	}

	// 异常通知
	@AfterThrowing("advice()")
	public void afterException() {
		System.out.println("异常出现了！");
	}

	// 后置通知
	@After("advice()")
	public void after() {
		System.out.println("这是后置通知(出现异常也会调用)");
	}
}
