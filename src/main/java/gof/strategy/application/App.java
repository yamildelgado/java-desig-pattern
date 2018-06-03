package gof.strategy.application;

import gof.strategy.context.Item;
import gof.strategy.context.ShoppingCartContext;
import gof.strategy.security.CreditCardStrategy;
import gof.strategy.security.DebitCardStrategy;
import gof.strategy.security.PaypalCardStrategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ShoppingCartContext context=new ShoppingCartContext();
    	context.addItem(new Item(1,20.0f));
    	context.addItem(new Item(2,40.0f));
    	
		context.pay(new CreditCardStrategy());
		context.pay(new DebitCardStrategy());
		context.pay(new PaypalCardStrategy());
    }
}
