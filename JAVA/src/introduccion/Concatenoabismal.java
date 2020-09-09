package introduccion;

public class Concatenoabismal {
    public static void main (String args[]){
        String x = new StringBuffer().append("Hola ")
                                     .append("Que Tal?")
                                     .toString();
        System.out.println(x);
    }
}
