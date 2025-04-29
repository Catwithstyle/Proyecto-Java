package model;

import java.time.LocalDate;
import java.util.Date;

public class Asistencia extends Identified {
    private LocalDate fecha;
    private Materia materia;

    public Asistencia(Long id, LocalDate fecha, Materia materia) {
        super(id);
        this.fecha = fecha;
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "fecha=" + fecha +
                ", materia=" + materia +
                '}';
    }
}
