package GUI;
import java.awt.*;
import java.awt.event.*;
public class DemoListener6 extends Frame{
    private TextField tf;
    private Label lab;
    public DemoListener6(){
        super("Key Listener");
        //defino el layout principal
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new Label("Ingrese Texto: "));        
        tf = new TextField(15);
        add(tf);
        lab = new Label();
        add(lab);
        //agrego los listeners al Textfield
        tf.addActionListener(new EscuchaEnter());
        tf.addKeyListener(new EscuchaTecla());
        
        setSize(350,100);
        setVisible(true);
        
        addWindowListener(new EscuchaVentana());
    }

    class EscuchaEnter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //tomo el texto ingresado en el textfield
            String texto = tf.getText();
            //lo seteo como texto en el Label
            lab.setText(texto);
            //refresco los componentes de la ventana
            validate();
            //combierto a mayuscula el texto del textfield
            tf.setText(texto.toUpperCase());
            //lo selecciono todo
            tf.selectAll();
        }
    }

    class EscuchaTecla implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}
        @Override
        public void keyPressed(KeyEvent e) {
            //por cada tecla presionada toma el caracter
            char c = e.getKeyChar();
            //seteo el caracter como texto del label
            lab.setText(Character.toString(c));
        }
        @Override
        public void keyReleased(KeyEvent e) {}
    }
    
    class EscuchaVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {}
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
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
        new DemoListener6();
    }
    
}
