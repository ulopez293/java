package Introspeccion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String args[]){
        try{
            //definimos el nombre de la clase y obtengo el class
            String sClass = "java.awt.Frame";
            Class clazz = Class.forName(sClass);
            //Invoco al constructor que recibe un string como argumento
            Class[] pTypesCtor = {String.class};
            Object[] pValuesCtor = {"Ventana AWT Relfect"};
            Constructor ctor = clazz.getConstructor(pTypesCtor);
            Object obj = ctor.newInstance(pValuesCtor);
            //invoco al metodo setSize que recibe 2 enteros
            String mtdName1="setSize";
            Class[] pTypes1 = {Integer.TYPE, Integer.TYPE };
            Object[] pValues1 = {300, 300};
            Method mtd = obj.getClass().getMethod(mtdName1, pTypes1);
            mtd.invoke(obj, pValues1);
            //invoco al metodo setVisible que recibe un boolean
            String mtdName2="setVisible";
            Class[]pTypes2 = {Boolean.TYPE};
            Object[]pValues2 = {true};
            Method mtd2 = obj.getClass().getMethod(mtdName2, pTypes2);
            mtd2.invoke(obj, pValues2);
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
