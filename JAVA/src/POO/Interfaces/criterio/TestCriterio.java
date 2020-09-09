package POO.Interfaces.criterio;

import POO.Interfaces.comparable.Alumno;

public class TestCriterio {
    public static void main(String args[]){
        Alumno arr[] = { new Alumno("Juan",20,8.5)
                       , new Alumno("Pedro",18,5.3)
                       , new Alumno("Alberto",19,4.6)};
        Util.ordenar(arr,new CriterioAlumnoNombre());
        Util.imprimir(arr);
        System.out.println("---------------");
        Util.ordenar(arr, new CriterioAlumNotaProm());
        Util.imprimir(arr);
    }
}
