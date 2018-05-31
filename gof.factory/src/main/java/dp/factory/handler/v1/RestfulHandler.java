package dp.factory.handler.v1;

import dp.factory.adapter.v1.RestfulAdapter;
import dp.factory.core.v1.MOMessage;

public class RestfulHandler extends MOMessage{

	@Override
	public InvocationHandler getInvocationHandler() {
		
		return new RestfulAdapter();
	}

}
