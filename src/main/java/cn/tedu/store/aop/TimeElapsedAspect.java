package cn.tedu.store.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeElapsedAspect {
	
	private long startTime;
	
	
	/**
	 * @Around("execution(* cn.tedu.store.service.impl.*.*(..))")
	 * 
	 * 以上注解配置表示无论是哪种返回值，只要是在cn.tedu.store.service.impl包下的任类（第1个星号）中的任何方法（第2个星号），
	 * 且无论是什么参数（两个小数点），都满足切面的执行前提，所以，后续，在执行这个包中的任何类中的任何业务方法时，
	 * 都会按照@Around对应的方法流程来进行处理！
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(* cn.tedu.store.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		//执行前序任务
		doBefore();
		
		//调用原本应该执行的方法
		Object result = pjp.proceed();
		
		//执行后续任务
		doAfter();
		
		//返回原本应该执行的方法的返回值
		return result;
	}
	
	
	public void doBefore(){
		System.out.println("TimeElapsedAspect.doBefore()");
		startTime = System.currentTimeMillis();
	}
	
	public void doAfter(){
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("TimeElapsedAspect.doAfter(): " +elapsed);
	}

}
