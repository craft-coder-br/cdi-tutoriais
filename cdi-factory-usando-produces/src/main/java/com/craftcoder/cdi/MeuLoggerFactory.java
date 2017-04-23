package com.craftcoder.cdi;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MeuLoggerFactory {

	@Produces
	public MeuLogger cria(InjectionPoint ip) {
		Class<?> classeDesejada = ip.getMember().getDeclaringClass();
		
		return new MeuLogger(classeDesejada);
	}
	
}
