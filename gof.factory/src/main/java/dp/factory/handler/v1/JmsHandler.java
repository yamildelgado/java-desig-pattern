package dp.factory.handler.v1;

import dp.factory.adapter.v1.JmsAdapter;
import dp.factory.core.v1.MOMessage;

public class JmsHandler extends MOMessage{

	@Override
	public InvocationHandler getInvocationHandler() {
		
		return new JmsAdapter();
	}

}
