package GUI;
import java.awt.*;
import java.awt.event.*;
public class DemoListener4 extends Frame{
    public DemoListener4(){
        super("Demo");
        //relaciono un windowlistener con el frame
        addWindowListener(new EscuchaVentana());
        setSize(200,150);
        setVisible(true);
    }

    class EscuchaVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {}
        @Override
        public void windowClosing(WindowEvent e) {
            //para cerrar la ventana y finalizar el programa
            //correctamente son tres pasos:
            //1.- ocultar la ventana con setVisible(false)
            //2.- liberarla con el metodo dispose
            //3.- finalizar la aplicacion con system.exit
            System.out.println("Oculto...");
            setVisible(false);
            System.out.println("Libero...");
            dispose();
            System.out.println("Bye bye...");
            System.exit(0);
        }
        @Override
        public void windowClosed(WindowEvent e) {}
        @Override
        public void windowIconified(WindowEvent e) {}
        @Override
        public void windowDeiconified(WindowEvent e) {}
        @Override
        public void windowActivated(WindowEvent e) {}
        @Override
        public void windowDeactivated(WindowEvent e) {}
    }
    
    public static void main(String args[]){
        new DemoListener4();
    }
}
