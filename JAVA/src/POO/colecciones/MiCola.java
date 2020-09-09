package POO.colecciones;

public class MiCola<T> {
    private static final int capacidadInicial = 5;
    private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
    
    public void encolar(T elm){
        //agregamos el elemento al final de la coleccion
        coll.agregar(elm);
    }
    
    public T desencolar(){
        //retorna y elimina de la coleccion el primer elemento
        return coll.eliminar(0);
    }
}
