package model;

public class Carrera extends Identified {

    private NombreCarrera nombreCarrera;

    private String descripcion;

    public Carrera(Long id, NombreCarrera nombreCarrera, String descripcion) {
        super(id);
        this.nombreCarrera = nombreCarrera;
        this.descripcion = descripcion;
    }

    public NombreCarrera getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(NombreCarrera nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombreCarrera=" + nombreCarrera +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
