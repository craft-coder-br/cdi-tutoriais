package com.craftcoder.cdi;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private Pagamento pagamento;

	@Inject
	private MeuLogger logger;
	
	public void finaliza() {
		logger.loga("Finalizando Checkout");
		
		pagamento.inicia();
	}

}
