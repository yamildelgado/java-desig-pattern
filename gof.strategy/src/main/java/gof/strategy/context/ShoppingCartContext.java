package gof.strategy.context;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartContext {
	
	public ShoppingCartContext() {
		items=new  ArrayList<Item>();
	}

	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item e) {
		this.items.add(e);
	}

	private float getCalcularTotal() {
		float sumTotal = 0f;
		for (Item item : getItems()) {

			sumTotal += item.getPrecie();
		}

		return sumTotal;
	}

	public void pay(PaymentStrategy paymentStrategy) {

		paymentStrategy.pay(getCalcularTotal());
	}
}
