package dp.factory.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import dp.factory.core.v1.Message;

public class JAXBUtil {
	
	public static String printXML(Message msg) {
		StringWriter writer = new StringWriter();
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(msg, writer);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer.toString();
	}

}
