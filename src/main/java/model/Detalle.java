package model;

public class Detalle extends Identified {

    private Alumno alumno;

    private boolean asistenciaAlumno;

    private Asistencia asistencia;

    public Detalle(Long id, Alumno alumno, boolean asistenciaAlumno, Asistencia asistencia) {
        super(id);
        this.alumno = alumno;
        this.asistenciaAlumno = asistenciaAlumno;
        this.asistencia = asistencia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isAsistenciaAlumno() {
        return asistenciaAlumno;
    }

    public void setAsistenciaAlumno(boolean asistenciaAlumno) {
        this.asistenciaAlumno = asistenciaAlumno;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "alumno=" + alumno +
                ", asistenciaAlumno=" + asistenciaAlumno +
                ", asistencia=" + asistencia +
                '}';
    }
}

