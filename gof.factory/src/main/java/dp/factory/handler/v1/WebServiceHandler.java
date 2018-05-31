package dp.factory.handler.v1;

import dp.factory.adapter.v1.WebServiceAdapter;
import dp.factory.core.v1.MOMessage;

public class WebServiceHandler extends MOMessage{

	@Override
	public InvocationHandler getInvocationHandler() {
		
		return new WebServiceAdapter();
	}

}
