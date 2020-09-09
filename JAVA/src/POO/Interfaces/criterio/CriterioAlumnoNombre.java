package POO.Interfaces.criterio;
import POO.Interfaces.comparable.Alumno;
//heredo de Criterio especializando en Alumno
public class CriterioAlumnoNombre extends Criterio<Alumno>{

    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
}
