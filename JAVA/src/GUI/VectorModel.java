package GUI;

import javax.swing.ListModel;
import java.util.Vector;
import javax.swing.event.ListDataListener;

public class VectorModel implements ListModel{
    private Vector<Object> datos;
    
    public VectorModel(Vector<Object> datos){
        this.datos = datos;
    }

    @Override
    public int getSize() {
        return datos.size();
    }
    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }
    @Override
    public void addListDataListener(ListDataListener l) {}
    @Override
    public void removeListDataListener(ListDataListener l) {}
    
}
