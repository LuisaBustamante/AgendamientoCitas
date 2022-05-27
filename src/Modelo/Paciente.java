package Modelo;

public class Paciente extends Persona {

    private String correo;
    private int telefono;

    public Paciente(String correo, int telefono, String identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" + "correo=" + correo + ", telefono=" + telefono + '}';
    }

}
