package com.craftcoder.cdi;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private Pagamento pagamento;
	
	public void finaliza() {
		System.out.println("Finalizando Checkout");
		
		pagamento.inicia();
	}

}
