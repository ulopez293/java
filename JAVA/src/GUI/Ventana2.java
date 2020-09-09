package GUI;
import java.awt.*;

public class Ventana2 extends Frame {
    //defino tres objetos Button
    private Button bN,bS,bO, bE, bC;
    
    public Ventana2(){
        super("Esta es la ventana 2");
        setLayout(new BorderLayout());
        
        bN = new Button("Norte");
        add(bN, BorderLayout.NORTH);
        bS = new Button("Sur");
        add(bS, BorderLayout.SOUTH);
        bO = new Button("Oeste");
        add(bO, BorderLayout.WEST);
        bE = new Button("Este");
        add(bE, BorderLayout.EAST);
        bC = new Button("Centro");
        add(bC, BorderLayout.CENTER);
        
        setSize(400,300);
        setVisible(true);
    } 
    
    public static void main(String args[]){
        Ventana2 v2 = new Ventana2();
    }    
    
}
