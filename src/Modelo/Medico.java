package Modelo;

public class Medico extends Persona {

    private int idMedico;
    private String especialidad;
    private String correo;
    private int telefono;

    public Medico(int idMedico, String especialidad, String correo, int telefono, String identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        return "Medico{" + "idMedico=" + idMedico + ", especialidad=" + especialidad + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

}
