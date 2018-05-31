package dp.factory.core.v2;

import java.util.Arrays;

import dp.factory.adapter.type.v2.AdaterType;
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

		AdaterType[] adpterTypes = AdaterType.values();
		for (AdaterType type : Arrays.asList(adpterTypes)) {
			Adapter adapter = AdapterFactory.createAdapter(type);
			adapter.send(message);
		}

	}

}
