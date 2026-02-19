package co.vinni.servicios;

import co.vinni.dto.Docente;
import co.vinni.dto.Universidad;

public class GestionUniversidad {
    private Universidad universidad;

    public void crear(Universidad universidad){
        this.universidad = universidad;
    }
    public void adicionarDocente(Docente docente){
        this.universidad.getDocentes().add(docente);
    }
}
