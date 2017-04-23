package com.craftcoder.cdi;

import javax.inject.Inject;

public class Checkout {

	@Inject @PayPal
	private Pagamento pagamento;
	
	public void finaliza() {
		System.out.println("Finalizando Checkout");
		
		pagamento.inicia();
	}

}
