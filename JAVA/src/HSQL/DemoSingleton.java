package HSQL;

public class DemoSingleton {
    //atributo y metodo
    private static String s = null;
    public static String obtenerString(){
        if (s == null) {
            s = new String("Unica instancia");
        }
        return s;
    }
    //principal
    public static void main(String args[]){
        String s1 = DemoSingleton.obtenerString();
        String s2 = DemoSingleton.obtenerString();
        if (s1 == s2) {
            System.out.println("Son la misma (y unica) instancia !!!");
        }
    }
}
