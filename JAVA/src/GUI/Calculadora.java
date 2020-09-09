package GUI;
import java.awt.*;

public class Calculadora extends Frame {
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button bDec, bMas, bMenos, bPor, bDiv, bIgual, bBorrar;
    private TextField tfDisplay;
    public Calculadora(){
        super("Calculadora");
        setLayout(new BorderLayout());
        
        //en el Norte ubico el display
        tfDisplay = new TextField();
        add(tfDisplay, BorderLayout.NORTH);
        
        //en el centro ubico el teclado
        Panel pTeclado = _crearTeclado();
        add(pTeclado, BorderLayout.CENTER);
        
        //Este metodo setea y dimensiona el tamaño exacto
        //necesario para contener todos los componentes del Frame
        pack();
        setVisible(true);
        setSize(350,350);
        setLocationRelativeTo(null);
    }
    
    private Panel _crearTeclado() {
        //instancio los 16 botones
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bDec = new Button(".");
        bMas = new Button("+");
        bMenos = new Button("-");
        bPor = new Button("*");
        bDiv = new Button("/");
        bIgual = new Button("=");
        b0 = new Button("0");
        //instancio un Panel (con un container) con GridLayout de 4x4
        Panel p = new Panel(new GridLayout(4,4));
        //Agrego los botones al panel
        //fila 1 (la de arriba)
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bDiv);
        //fila 2
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bPor);
        //fila 3
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bMenos);
        //fila 4
        p.add(bDec);
        p.add(b0);
        p.add(bIgual);
        p.add(bMas);
        //retorno el panel con todos los botones agregados
        return p;
    }
    
    public static void main(String args[]){
        Calculadora c = new Calculadora();
    }
}
