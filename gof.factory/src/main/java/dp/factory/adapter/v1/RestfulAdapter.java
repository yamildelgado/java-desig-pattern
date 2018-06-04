package dp.factory.adapter.v1;

import dp.factory.core.v1.Message;
import dp.factory.handler.v1.InvocationHandler;

public class RestfulAdapter implements InvocationHandler{

	public void send(Message msg) {

		System.out.println("Sending message by RestFul Provider ");
		
	}

}
