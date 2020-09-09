package GUI;
import java.awt.*;
import java.awt.event.*;
public class DemoListener3 extends Frame{
    private Button boton;

    public DemoListener3() {
        super("Demo");
        setLayout(new FlowLayout());
        
        //quien genera el evento es el Frame
        addMouseMotionListener(new EscuchaMouse());
        
        boton = new Button("Boton");
        add(boton);
        
        //ventana
        setSize(200,150);
        setVisible(true);
    }

    class EscuchaMouse implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent e) {}
        @Override
        public void mouseMoved(MouseEvent e) {
            int distancia = 10;
            Point pMouse = e.getPoint();
            
            Dimension dimBoton = boton.getSize();
            Point pBoton = boton.getLocation();
            
            int difX1 = Math.abs(pBoton.x-pMouse.x);
            int difX2 = Math.abs((pBoton.x+dimBoton.width)-pMouse.x);
            
            int difY1 = Math.abs(pBoton.y-pMouse.y);
            int difY2 = Math.abs((pBoton.y+dimBoton.height)-pMouse.y);
            
            if (difX1<distancia || difX2 < distancia || difY1<distancia || difY2 < distancia) {
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
        
    }
    
    public static void main(String args[]){
        new DemoListener3();
    }
    
}
