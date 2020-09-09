package GUI;
import java.awt.*;
import java.awt.event.*;
public class DemoListener5 extends Frame{
    private Button bAgregar;
    private TextField tfItem;
    private List lista;
    public DemoListener5(){
        super("Action Listener");
        //defino el layout principal
        setLayout(new BorderLayout());
        //al norte
        Panel pn = _crearPNorte();
        add(pn,BorderLayout.NORTH);
        //al centro
        lista = new List();
        add(lista,BorderLayout.CENTER);
        
        //seteo los listeners
        bAgregar.addActionListener(new EscuchaAgregar());
        tfItem.addActionListener(new EscuchaAgregar());
        lista.addActionListener(new EscuchaDobleClick());
        this.addWindowListener(new EscuchaVentana());
        
        setSize(350,300);
        setVisible(true);
        
        //el cursor aparecera por defecto en el textfield
        tfItem.requestFocus();
    }

    private Panel _crearPNorte() {
        Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
        p.add(new Label("Item: "));
        tfItem = new TextField(25);
        p.add(tfItem);
        bAgregar = new Button("Agregar");
        p.add(bAgregar);
        return p;
    }
    
    public static void main(String args[]){
        new DemoListener5();
    }

    class EscuchaAgregar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //tomo el texto ingresado en el textfield
            String item = tfItem.getText();
            //lo agrego a la lista
            lista.add(item);
            //selecciono todo el texto en el textfield
            tfItem.selectAll();
            //elimino el contenido
            tfItem.setText("");
            //seteo el foco en el textfield
            tfItem.requestFocus();
        }
    }

    class EscuchaDobleClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //tomo la posicion del item seleccionado
            int idx = lista.getSelectedIndex();
            //seteo el item seleccionado en el textfield
            tfItem.setText(lista.getSelectedItem());
            //lo remuevo de la lista
            lista.remove(idx);
            //selecciono todo el texto del textfield
            tfItem.selectAll();
            //seteo el foco en el textfield
            tfItem.requestFocus();
        }
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
}
