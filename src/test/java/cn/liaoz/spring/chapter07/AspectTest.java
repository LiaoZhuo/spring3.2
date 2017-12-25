package cn.liaoz.spring.chapter07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectTest {
	@Pointcut("execution(* cn.liaoz.spring.chapter07.*.test(..))")
	public void test() {
	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object around(ProceedingJoinPoint point) {
		System.out.println("before1");
		Object result = null;
		try {
			result = point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("after1");
		return result;
	}
}
