package GUI;
import java.awt.*;
import java.awt.event.*;

public class DemoListener extends Frame{
    private Button boton;

    public DemoListener() {
        super("Demo");
        setLayout(new FlowLayout());
        boton = new Button("Boton");
        //agrego un listener al boton
        boton.addActionListener(new EscuchaBoton());
        //lo agrego al flowlayout
        add(boton);
        //ventana
        setSize(200,150);
        setVisible(true);
    }

    class EscuchaBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Se presiono el boton...");
            //dimension de la ventana
            Dimension dimVentana = getSize();
            //dimension de la pantalla
            Dimension dimScreen = getToolkit().getScreenSize();
            //nuevas coordenadas (aleatorias) para reubicar la ventana
            int x = (int) (Math.random()*(dimScreen.width-dimVentana.width));
            int y = (int)(Math.random()*(dimScreen.height-dimVentana.height));
            
            //cambio la ubicacion de la ventana
            setLocation(x,y);
        }
    }
    
    public static void main(String args[]){
        new DemoListener();
    }
    
}
