package com.craftcoder.cdi;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class MainApplication {

	public static void main(String[] args) {
		try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();
			
			checkout.finaliza();
		}
	}
		
}
