package XML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CPoolXMLHandler extends DefaultHandler{
    
    public void endElement(String uri, String localName, String qName)throws SAXException {
        System.out.println("Cierra: "+qName);
    }

    public void startElement(String uri, String localName, String qName, Attributes atributes)throws SAXException {
        //muestro el nombre del tag
        System.out.println("Comienza tag:"+qName);
        //recorro la lista de atributos del tag
        for(int i = 0; i<atributes.getLength();i++){
            //muestro cada atributo del tag(atributo = valor)
            System.out.print("    "+atributes.getQName(i)+" = ");
            System.out.println(atributes.getValue(i));
        }
    }
    
}
