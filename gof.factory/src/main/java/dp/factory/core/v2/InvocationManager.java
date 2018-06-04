package dp.factory.core.v2;

import java.util.Arrays;

import dp.factory.adapter.type.v2.AdapterType;
import dp.factory.adapter.v2.Adapter;
import dp.factory.adapter.v2.AdapterFactory;
import dp.factory.core.v1.Message;

/**
 * Hello world!
 *
 */
public class InvocationManager {
	public static void main(String[] args) {

		Message message = new Message("JAXB Element ");

		Adapter jms = AdapterFactory.createAdapter(AdapterType.JMS);
		Adapter rest = AdapterFactory.createAdapter(AdapterType.REST);
		Adapter ws = AdapterFactory.createAdapter(AdapterType.WS);
		
		
		jms.send(message);
		ws.send(message);
		rest.send(message);

	}

}
