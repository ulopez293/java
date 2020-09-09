package GUI;

import java.awt.*;
import javax.swing.*;

public class DemoJTable extends JFrame {
    public DemoJTable(){
        super("Demo JList");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        Object[][] datos = _obtenerMatrizDatos();
        JTable tabla = new JTable(new MatrizModel(datos));
        
        JScrollPane scrollLista = new JScrollPane(tabla);
        content.add(scrollLista, BorderLayout.CENTER);
        
        setSize(300,300);
        setVisible(true);
    }

    private Object[][] _obtenerMatrizDatos() {
        Object [][]mat = {
            {"Columna 0","Columna 1","Columna 2","Columna 3"},
            {"Rojo","Verde","Azul","Violeta"},
            {"Amarillo","Naranja","Blanco","Gris"},
            {"Negro","Turquia","Sepia","Rosa"},
            {"Salmon","Maiz","Limon","Fucsia"}
        };
        return mat;
    }
    
    public static void main(String args[]){
        new DemoJTable();
    }
}
