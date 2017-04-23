package com.craftcoder.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Checkout {

	@Inject
	private Event<EventoCheckout> evento;
	
	public void finaliza() {
		System.out.println("Finalizando Checkout");
		
		evento.fire(new EventoCheckout("iPad"));
	}

}
