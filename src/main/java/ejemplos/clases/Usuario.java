package ejemplos.clases;

public class Usuario {
    private String Nombre;
    private String Apellido;

    public Usuario(){}

    public Usuario(String eNombre, String eApellido) {
        this.Nombre = eNombre;
        this.Apellido = eApellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return Nombre + " " + Apellido;
    }
}
