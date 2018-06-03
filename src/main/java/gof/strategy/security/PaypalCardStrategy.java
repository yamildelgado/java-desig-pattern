package gof.strategy.security;

import gof.strategy.context.PaymentStrategy;

public class PaypalCardStrategy implements PaymentStrategy {


	public void pay(float mount) {
		
		
		System.out.println("CreditCard " +"Mount"+mount);
		
	}

}
