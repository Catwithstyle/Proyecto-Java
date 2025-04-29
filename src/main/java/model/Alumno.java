package model;

public class Alumno extends Identified {

    private final String cif;

    private final String Nombre;

    private final String apellido;

    private Materia materia;

    private String telefono1;

    private String telefono2;

    private String email;

    private String email2;

    public Alumno(Long id, String cif,
                  String nombre, String apellido,
                  Materia materia, String telefono1,
                  String telefono2, String email,
                  String email2) {
        super(id);
        this.cif = cif;
        Nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.email = email;
        this.email2 = email2;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "cif='" + cif + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", materia=" + materia +
                ", telefono1='" + telefono1 + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", email='" + email + '\'' +
                ", email2='" + email2 + '\'' +
                '}';
    }
}
