package com.craftcoder.cdi;

import javax.enterprise.inject.Default;

@Default
public class PagamentoMoip implements Pagamento {

	@Override
	public void inicia() {
		System.out.println("Iniciando PagamentoMoip");
	}

}
