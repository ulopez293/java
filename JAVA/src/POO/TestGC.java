package POO;

import POO.estaticas.Numero;

public class TestGC {
    private static int cont = 0;
    
    public TestGC(){
        cont++;
        System.out.println(cont);
    }
    
    @Override
    public void finalize(){
        cont--;
    }
    
    public static void main(String args[]){
        int i = 1;
        while(i <= 10){
            new TestGC();
            i++;
        }
    }
}
