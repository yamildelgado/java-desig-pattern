package dp.factory.core.v1;

import dp.factory.adapter.v1.JmsAdapter;
import dp.factory.adapter.v1.RestfulAdapter;
import dp.factory.adapter.v1.WebServiceAdapter;
import dp.factory.handler.v1.InvocationHandler;

/**
 * Hello world!
 *
 */
public class InvocationManager 
{
    public static void main( String[] args )
    {
        
        
        Message message=new Message("Hola mensaje");
        
        invoke(message,new JmsAdapter());
        invoke(message,new WebServiceAdapter());
        invoke(message,new RestfulAdapter());
        
        
    }
    
    public static void invoke(Message msg,InvocationHandler handler) {
    	
    	handler.send(msg);
    	
    	
    }
    
    
}
