package dp.factory.adapter.v2;

import dp.factory.adapter.type.v2.AdaterType;

public class AdapterFactory {

	public static Adapter createAdapter(AdaterType type) {
		Adapter adapter = null;

		switch (type) {
		case JMS:

			adapter = new JmsAdapter();

			break;
		case WS:

			adapter = new WebServiceAdapter();
			break;
		case REST:

			adapter = new RestfulAdapter();

			break;

		default:
			break;
		}

		return adapter;

	}

}
