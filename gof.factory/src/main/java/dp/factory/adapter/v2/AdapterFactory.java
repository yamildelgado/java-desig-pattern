package dp.factory.adapter.v2;

import dp.factory.adapter.type.v2.AdapterType;

public class AdapterFactory {

	public static Adapter createAdapter(AdapterType type) {

		switch (type) {
		case JMS:

			return new JmsAdapter();
		case WS:

			return new WebServiceAdapter();
		case REST:

			return new RestfulAdapter();

		default:
			break;
		}

		return null;
	}

}
