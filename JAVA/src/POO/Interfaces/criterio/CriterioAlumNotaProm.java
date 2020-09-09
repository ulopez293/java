package POO.Interfaces.criterio;
import POO.Interfaces.comparable.Alumno;

public class CriterioAlumNotaProm extends Criterio<Alumno> {
    public int comparar(Alumno a, Alumno b){
        double diff = a.getNotaPromedio()-b.getNotaPromedio();
        return diff>0 ? 1: diff <0 ? -1 : 0;
    }
}
