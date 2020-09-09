package GUI;

import javax.swing.ListModel;
import java.util.Vector;
import javax.swing.event.ListDataListener;

public class ArrayModel implements ListModel{
    private Object[] datos;
    public ArrayModel(Object[] datos){
        this.datos = datos;
    }
    
    @Override
    public int getSize() {
        return datos.length;
    }
    @Override
    public Object getElementAt(int index) {
        return datos[index];
    }
    @Override
    public void addListDataListener(ListDataListener l) {}
    @Override
    public void removeListDataListener(ListDataListener l) {}
}
