package XML;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ConnectionPoolTag extends DefaultHandler{
    private JDBCTag jdbc;
    private PoolsTag pools;
    private static ConnectionPoolTag instancia = null;
    private ConnectionPoolTag(){
        jdbc = new JDBCTag();
        pools = new PoolsTag();
    }
    public String toString(){
        String x = "";
        x+="-- JDBC --\n";
        x+=jdbc.toString();
        x+="-- POOLES ---\n";
        x+=pools.toString();
        return x;
    }
    
    //setters and getters
    public JDBCTag getJdbc() {
        return jdbc;
    }

    public void setJdbc(JDBCTag jdbc) {
        this.jdbc = jdbc;
    }

    public PoolsTag getPools() {
        return pools;
    }

    public void setPools(PoolsTag pools) {
        this.pools = pools;
    }

    public static ConnectionPoolTag getInstancia() {
        try{
            if(instancia == null){
                SAXParserFactory spf = SAXParserFactory.newInstance();
                SAXParser sp = spf.newSAXParser();
                sp.parse("src/xml/connectionpool.xml", new ConnectionPoolTag());
            }
            return instancia;  
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void setInstancia(ConnectionPoolTag instancia) {
        ConnectionPoolTag.instancia = instancia;
    }
    
    //start element y end element
    public void endElement(String uri, String localName, String qName)throws SAXException {
    }

    public void startElement(String uri, String localName, String qName, Attributes atributes)throws SAXException {
        if(qName.equals("connection-pol")){
            instancia = new ConnectionPoolTag();
        }
        if(qName.equals("jdbc")){
            jdbc = new JDBCTag();            
            instancia.setJdbc(jdbc);
        }
        if(qName.equals("pools")){
            pools = new PoolsTag();
            instancia.setPools(pools);
        }
        if(qName.equals("conection")){
            ConnectionTag c = new ConnectionTag();
            c.setName(atributes.getValue("name"));
            c.setDriver(atributes.getValue("driver"));
            c.setUrl(atributes.getValue("url"));
            c.setUsr(atributes.getValue("usr"));
            c.setPwd(atributes.getValue("pwd"));
            jdbc.addConnectionTag(c);
        }
        if(qName.equals("pool")){
            int min = Integer.parseInt(atributes.getValue("minsize"));
            int max = Integer.parseInt(atributes.getValue("maxsize"));
            int steep = Integer.parseInt(atributes.getValue("steep"));
            PoolTag c = new PoolTag();
            c.setName(atributes.getValue("name"));
            c.setMinsize(min);
            c.setMaxsize(max);
            c.setSteep(steep);
            pools.addPoolTag(c);
        }
    }
}
