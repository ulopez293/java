package Excepciones;

public class Demo2 {
    public static void main(String args[]){
        try{
            int i = Integer.parseInt("no es una cadena numerica...");
        }catch(ArrayIndexOutOfBoundsException ex){  
        /*El verdadero error es un NumberFormatException, por eso no muestra este catch.
         Este catch validad pasarse de largo en un array */
            System.out.println("Entre en el catch...");
        }finally{
            System.out.println("Esto sale siempre !");
        }
    }
}
