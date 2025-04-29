package model;

public class Profesor extends Identified{

    private String Firstname;

    private String lastName;

    private String telefono;

    private String telefono2;

    private String correo;

    private String dirrecion;

    public Profesor(Long id, String firstname,
                    String lastName, String telefono,
                    String telefono2, String correo,
                    String dirrecion) {
        super(id);
        Firstname = firstname;
        this.lastName = lastName;
        this.telefono = telefono;
        this.telefono2 = telefono2;
        this.correo = correo;
        this.dirrecion = dirrecion;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "Firstname='" + Firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", correo='" + correo + '\'' +
                ", dirrecion='" + dirrecion + '\'' +
                '}';
    }
}


