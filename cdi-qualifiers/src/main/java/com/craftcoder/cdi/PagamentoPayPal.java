package com.craftcoder.cdi;

@PayPal
public class PagamentoPayPal implements Pagamento {

	@Override
	public void inicia() {
		System.out.println("Iniciando PagamentoPayPal");
	}

}
