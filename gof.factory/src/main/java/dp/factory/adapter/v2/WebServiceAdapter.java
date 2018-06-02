package dp.factory.adapter.v2;

import dp.factory.core.v1.Message;
import dp.factory.handler.v1.InvocationHandler;
import dp.factory.util.JAXBUtil;

public class WebServiceAdapter  implements Adapter{
	
	public void send(Message msg) {

		System.out.println("Sending Message by Web Services Provider ");
		System.out.println(JAXBUtil.printXML(msg));
	}

}
