package com.craftcoder.cdi;

import javax.enterprise.event.Observes;

public class Estoque {

	public void remove(@Observes EventoCheckout evento) {
		String produto = evento.getProduto();
		
		System.out.println("Removendo do Estoque o produto: " + produto);
	}

}
