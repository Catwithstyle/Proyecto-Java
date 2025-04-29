package model;

public class Materia extends Identified {

    private nombreMateria nombreMateria;

    private String descripcion;

    private Carrera carrera;

    private Profesor profesor;

    public Materia(Long id,
                   nombreMateria nombreMateria,
                   String descripcion,
                   Carrera carrera,
                   Profesor profesor) {
        super(id);
        this.nombreMateria = nombreMateria;
        this.descripcion = descripcion;
        this.carrera = carrera;
        this.profesor = profesor;
    }

    public model.nombreMateria getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(model.nombreMateria nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombreMateria=" + nombreMateria +
                ", descripcion='" + descripcion + '\'' +
                ", carrera=" + carrera +
                ", profesor=" + profesor +
                '}';
    }
}
