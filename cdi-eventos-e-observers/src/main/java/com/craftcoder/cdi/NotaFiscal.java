package com.craftcoder.cdi;

import javax.enterprise.event.Observes;

public class NotaFiscal {

	public void geraNota(@Observes EventoCheckout evento) {
		String produto = evento.getProduto();
		
		System.out.println("Gerando Nota Fiscal para o produto: " + produto);
	}

}
