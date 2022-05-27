package Modelo;

import java.util.ArrayList;

public class GestionarCita {

    public static ArrayList<Paciente> listaPaciente = new ArrayList<>();
    public static ArrayList<Medico> listaMedico = new ArrayList<>();
    public static ArrayList<CitaMedica> listaCitaMedica = new ArrayList<>();

    public static void agregarMedico(Medico medico) {
        listaMedico.add(medico);
    }

    public static void agregarPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public static void agregarCita(CitaMedica citaMedica) {
   
     listaCitaMedica.add(citaMedica);
	      }
               
            
        
       
    
 
    public static boolean existePaciente(String identificacion) {
        boolean existe = false;
        int tamañoLista = listaPaciente.size();
        for (int i = 0; i < tamañoLista; i++) {
            if (listaPaciente.get(i).getIdentificacion().equals(identificacion) 
		    
		    
		    ) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean existeMedico(String identificacion) {
        boolean existe = false;
        int tamañoLista = listaMedico.size();
        for (int i = 0; i < tamañoLista; i++) {
            if (listaMedico.get(i).getIdentificacion().equals(identificacion)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
        public static boolean existeSolicitudCita(String fecha, String hora, String especialidad) {
        boolean existe = false;
        int tamañoLista = listaCitaMedica.size();
        for (int i = 0; i < tamañoLista; i++) {
            if (listaCitaMedica.get(i).getFecha().equals(fecha) &&
               listaCitaMedica.get(i).getHora().equals(hora) &&
               listaCitaMedica.get(i).getEspecialidad().equals(especialidad)   
		    
		    ) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static Paciente obtenerPacientePorIdentificacion(String identificacion) {
        Paciente paciente = null;
        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getIdentificacion().equals(identificacion)) {
                paciente = listaPaciente.get(i);
                break;
            }
        }
        return paciente;
    }
    
        public static Medico obtenerMedicoPorIdentificacion(String identificacion) {
        Medico medico = null;
        for (int i = 0; i < listaMedico.size(); i++) {
            if (listaMedico.get(i).getIdentificacion().equals(identificacion)) {
                medico = listaMedico.get(i);
                break;
            }
        }
        return medico;
    }
       
public static CitaMedica obtenerCitaPorIdentificacion(String identificacion) {
        CitaMedica cita = null;
        for (int i = 0; i < listaCitaMedica.size(); i++) {
            if (listaCitaMedica.get(i).getPaciente().getIdentificacion().equals(identificacion)) {
                cita = listaCitaMedica.get(i);
                break;
            }
        }
        return cita;
    }

   public static ArrayList<Paciente> getListaPaciente() {
      return listaPaciente;
   }

   public static void setListaPaciente(ArrayList<Paciente> listaPaciente) {
      GestionarCita.listaPaciente = listaPaciente;
   }

   public static ArrayList<Medico> getListaMedico() {
      return listaMedico;
   }

   public static void setListaMedico(ArrayList<Medico> listaMedico) {
      GestionarCita.listaMedico = listaMedico;
   }

   public static ArrayList<CitaMedica> getListaCitaMedica() {
      return listaCitaMedica;
   }

   public static void setListaCitaMedica(ArrayList<CitaMedica> listaCitaMedica) {
      GestionarCita.listaCitaMedica = listaCitaMedica;
   }
	
		
		

}
