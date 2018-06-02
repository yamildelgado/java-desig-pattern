package dp.factory.core.v1;

import dp.factory.handler.v1.InvocationHandler;

public abstract class MOMessage {
	
	
	public void sendMessage(Message msg) {
		
		InvocationHandler  invokationMng=getInvocationHandler();
		invokationMng.send(msg);
		
	}
	public  abstract InvocationHandler getInvocationHandler();

}
