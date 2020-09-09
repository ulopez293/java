package GUI;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.event.TreeModelListener;

public class MatrizModel implements TableModel{
    private Object[][] datos;
    
    public MatrizModel(Object[][] datos) {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        //retorno la cantidad de filas que sera uno menos que
        //el length porque la primera contiene los headers
        return datos.length-1;
    }
    @Override
    public int getColumnCount() {
        //retorno la cantidad de columnas
        return datos[0].length;
    }
    @Override
    public String getColumnName(int columnIndex) {
        //retorno el titulo (header) de la columna
        return datos[0][columnIndex].toString();
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
         return String.class;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //la fila 0 corresponde a los header
        return datos[rowIndex+1][columnIndex];
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {}
    @Override
    public void addTableModelListener(TableModelListener l) {}
    @Override
    public void removeTableModelListener(TableModelListener l) {}
    
}
