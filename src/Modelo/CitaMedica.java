package Modelo;

public class CitaMedica {

    private String fecha;
    private String hora;
    private String especialidad;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora, String especialidad, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", especialidad=" + especialidad + ", paciente=" + paciente + '}';
    }

}
