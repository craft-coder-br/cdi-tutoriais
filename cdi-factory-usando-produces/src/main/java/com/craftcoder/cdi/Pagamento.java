package com.craftcoder.cdi;

import javax.inject.Inject;

public class Pagamento {

	@Inject
	private MeuLogger logger;
	
	public void inicia() {
		logger.loga("Iniciando Pagamento");
	}

}
