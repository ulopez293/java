
package introduccion;

public class CadenaB {
    public static void main(String args[]){
        long hi = System.currentTimeMillis();
        int n = 100000;
        
        String s="";
        char c;
        for (int i = 0; i < n; i++) {
            c = (char)('A'+i%('Z'-'A'+1));
            //concateno el caracter c utilizando el operador +
            s = s + c;
        }
        long hf = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(hf-hi+" milisegundos");
    }  
}
