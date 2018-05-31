package dp.factory.adapter.v2;

import dp.factory.core.v1.Message;
import dp.factory.handler.v1.InvocationHandler;

public class JmsAdapter implements Adapter{

	public void send(Message msg) {

		System.out.println("Sending Message by  JMS Provider ");
		
	}

}
