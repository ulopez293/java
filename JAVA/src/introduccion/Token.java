
package introduccion;

import java.util.StringTokenizer;

public class Token {
    public static void main (String agrs[]){
        String s = "Juan|Marcos|Carlos|Matias";
        StringTokenizer st = new StringTokenizer(s,"|");

        String tok;
        //mientras existan tokens boolean, ejecuta
        while (st.hasMoreTokens()){
            //asigna a tok el token y recorre al siguiente token
            tok = st.nextToken();
            //imprime tok
            System.out.println(tok);
        }
    }
}
