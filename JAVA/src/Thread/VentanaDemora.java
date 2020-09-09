package Thread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDemora extends Frame {
    private Button boton;
    private Choice combo;
    public VentanaDemora(){
        setLayout(new FlowLayout());
        add(boton = new Button("Esto va a demorar..."));
        boton.addActionListener(new EscuchaBoton());
        add(combo = new Choice());
        combo.addItem("Item 1");
        combo.addItem("Item 2");
        combo.addItem("Item 3");
        
        setSize(300,300);
        setVisible(true);
    }

    class TareaBoton extends Thread{
        @Override
        public void run(){
            try{
                //hago aqui lo que antes hacia en el action listener
                Thread.sleep(10000);
                System.out.println("Termino la espera...");
                //cuando finalizo la tarea vuelvo a habilitar el boton
                boton.setEnabled(true);
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }

    class EscuchaBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //inhabilito el boton mientras dure el proceso
            boton.setEnabled(false);
            //instancio y lanzo el thread que lleva a cabo la tarea
            TareaBoton t = new TareaBoton();
            t.start();
        }
    }
    
    public static void main(String args[]){
        new VentanaDemora();
    }
}
