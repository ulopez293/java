package GUI;
import java.awt.*;

public class Ventana1 extends Frame{    
    //defino tres objetos Button
    private Button b1,b2,b3;
    
    public Ventana1(){
        //El constructor del padre recibe el titulo de la ventana
        super("Esta es la ventana 1");
        
        //defino el layout que va a tener la ventana: FlowLayout
        // setLayout(new FlowLayout());
        
        //FlowLayout a la izquierda
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //instancio el primer boton y lo agrego al container
        b1 = new Button("Boton 1");
        add(b1);
        
        //instancio el primer boton y lo agrego al container
        b2 = new Button("Boton 2");
        add(b2);
        
        //instancio el primer boton y lo agrego al container
        b3 = new Button("Boton 3");
        add(b3);
        
        //defino el size de la ventana y la hago visible
        setSize(400,300);
        setVisible(true);
    } 
    
    public static void main(String args[]){
        Ventana1 v1 = new Ventana1();
    }
    
}
