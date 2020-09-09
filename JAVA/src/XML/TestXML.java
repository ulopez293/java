package XML;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class TestXML {
    public static void main(String args[]){
        try{
            //obtenemos el parser
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            //parseamos el archivo depts.xml
            sp.parse("src/xml/connectionpool.xml", new CPoolXMLHandler());
            //sp.parse(file, new CPoolXMLHandler());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
