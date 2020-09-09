package EstructurasDinamicas;

public class Cola2<T> {
    private Nodo<T> p = null;
    public void encolar(T v){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setInfo(v);
        if(p==null){
            nuevo.setRef(nuevo);
            p = nuevo;
        }else{
            nuevo.setRef(p.getRef());
            p.setRef(nuevo);
        }
        p = nuevo;
    }
    public Nodo<T> desencolar(){
        //retorno el siguiente de p
        Nodo<T> ret = p.getRef();
        if(p.getRef()== p){
            p = null;
        }else{
            Nodo<T> aux = p.getRef();
            p.setRef(aux.getRef());
        }
        return ret;
    }
}
