package com.mermer.springIoc.aop;

import javax.persistence.EntityManager;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * com.mermer.springIoc.aop
 * PerfAspect.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 15. 오전 11:51:13
 * @desc    : 
 * @version : x.x
 */
@Component
@Aspect
public class PerfAspect {
	
	EntityManager em;
	
	@Around("@annotation(PerfLogging)")
	public Object logPerf(ProceedingJoinPoint joinPoint) throws Throwable {
		long begin =  System.currentTimeMillis();
		Object retVal = joinPoint.proceed();
		System.out.println("time::" + (System.currentTimeMillis() - begin));
		return retVal;
	}

	@Before("@annotation(PerfLogging)")
	public void endPerf() throws Throwable {
		long begin =  System.currentTimeMillis();
		System.out.println("before::" + (System.currentTimeMillis() - begin));
	}
}
