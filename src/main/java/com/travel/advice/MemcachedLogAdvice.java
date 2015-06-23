package com.travel.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.travel.util.TravelStaticValue;

@Component
@Aspect
public class MemcachedLogAdvice {
	private static Log log = LogFactory.getLog(MemcachedLogAdvice.class);
	
	@Around("execution(* com.danga.MemCached.MemCachedClient.*(..))")
	public Object memcachedLog(ProceedingJoinPoint pjp) throws Throwable{
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		String logArgs = "";
		if(args!=null && 0<args.length){
			for(Object arg : args){
				logArgs += arg+",";
			}
		}
		Object ret = pjp.proceed();
		log.info(TravelStaticValue.LOG_PREFIX + "Memcached >>> method:["+methodName+"] -- "
															   +"args:["+logArgs+"] -- "
															 +"return:["+ret+"]");
		return ret;
	}
}
