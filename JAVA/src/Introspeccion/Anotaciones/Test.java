package Introspeccion.Anotaciones;

public class Test {
    public static void main(String args[]) throws Exception{
        String sClass = "Introspeccion.Anotaciones.Demo";
        Class<?> clazz = Class.forName(sClass);
        
        HolaMundo a = clazz.getMethod("unMetodo").getAnnotation(HolaMundo.class);
        System.out.println("nombre = "+a.nombre());
    }
}
