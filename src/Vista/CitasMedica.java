
package Vista;

import Modelo.CitaMedica;
import Modelo.Fecha;
import Modelo.GestionarCita;
import Modelo.Paciente;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */
public class CitasMedica extends javax.swing.JFrame {

   private Object jDateChooser;

//método llamado por el constructor donde se inicializan todos los componentes gráficos           
   public CitasMedica() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      ingresaNombrePaciente = new javax.swing.JTextField();
      ingresaApellidoPaciente = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      nombrePaciente = new javax.swing.JLabel();
      apellidoPaciente = new javax.swing.JLabel();
      telefono = new javax.swing.JLabel();
      correo = new javax.swing.JLabel();
      fecha = new javax.swing.JLabel();
      cedula = new javax.swing.JLabel();
      hora = new javax.swing.JLabel();
      ingresaCedulaPaciente = new javax.swing.JTextField();
      ingresaNumeroTelefono = new javax.swing.JTextField();
      ingresaCorreoElectronico = new javax.swing.JTextField();
      ingresaHora = new javax.swing.JTextField();
      especialidad = new javax.swing.JLabel();
      seleccioneEspecialidad = new javax.swing.JComboBox<>();
      jDateChooser1 = new com.toedter.calendar.JDateChooser();
      jLabel10 = new javax.swing.JLabel();
      solicitarCita = new javax.swing.JButton();
      jLabel11 = new javax.swing.JLabel();
      redirigirPrincipal = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      ingresaNombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      ingresaNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ingresaNombrePacienteActionPerformed(evt);
         }
      });
      getContentPane().add(ingresaNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 220, 30));

      ingresaApellidoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      ingresaApellidoPaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ingresaApellidoPacienteActionPerformed(evt);
         }
      });
      getContentPane().add(ingresaApellidoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 220, 30));

      jLabel1.setBackground(new java.awt.Color(255, 255, 255));
      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 204));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Solicitud agendamiento de cita médica");
      jLabel1.setOpaque(true);
      getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 460, 40));

      jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenFondo.jpg"))); // NOI18N
      getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 660, 110));

      nombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      nombrePaciente.setForeground(new java.awt.Color(0, 0, 204));
      nombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      nombrePaciente.setText("Nombre del paciente");
      getContentPane().add(nombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, -1));

      apellidoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      apellidoPaciente.setForeground(new java.awt.Color(0, 0, 204));
      apellidoPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      apellidoPaciente.setText("Apellido del paciente");
      getContentPane().add(apellidoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 260, -1));

      telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      telefono.setForeground(new java.awt.Color(0, 0, 204));
      telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      telefono.setText("Número de télefono");
      getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 300, -1));

      correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      correo.setForeground(new java.awt.Color(0, 0, 204));
      correo.setText("Correo electrónico");
      getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, -1));

      fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      fecha.setForeground(new java.awt.Color(0, 0, 204));
      fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      fecha.setText("Fecha");
      getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, -1));

      cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      cedula.setForeground(new java.awt.Color(0, 0, 204));
      cedula.setText("Cedula");
      getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

      hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      hora.setForeground(new java.awt.Color(0, 0, 204));
      hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      hora.setText("Hora");
      getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 300, -1));

      ingresaCedulaPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      ingresaCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ingresaCedulaPacienteActionPerformed(evt);
         }
      });
      getContentPane().add(ingresaCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, 30));

      ingresaNumeroTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      ingresaNumeroTelefono.setToolTipText("");
      getContentPane().add(ingresaNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 220, 30));

      ingresaCorreoElectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      getContentPane().add(ingresaCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 220, 30));

      ingresaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      getContentPane().add(ingresaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 220, 30));

      especialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      especialidad.setForeground(new java.awt.Color(0, 0, 204));
      especialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      especialidad.setText("Especialidad");
      getContentPane().add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 210, -1));

      seleccioneEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      seleccioneEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione especialidad-", "Cardiología", "Dermatología", "Médico general", "Medicina interna", "Pediatría", "Psiquiatría", "Odontología" }));
      getContentPane().add(seleccioneEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 220, 30));
      getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 220, 30));

      jLabel10.setBackground(new java.awt.Color(204, 204, 255));
      jLabel10.setOpaque(true);
      getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 630, 360));

      solicitarCita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      solicitarCita.setText("Solicitar");
      solicitarCita.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            solicitarCitaActionPerformed(evt);
         }
      });
      getContentPane().add(solicitarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 120, 70));
      getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 160, 30));

      redirigirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonSiguiente.png"))); // NOI18N
      redirigirPrincipal.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            redirigirPrincipalActionPerformed(evt);
         }
      });
      getContentPane().add(redirigirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 120, 70));
      getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 310, 30));

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void ingresaNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombrePacienteActionPerformed

    }//GEN-LAST:event_ingresaNombrePacienteActionPerformed

    private void ingresaApellidoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaApellidoPacienteActionPerformed


    }//GEN-LAST:event_ingresaApellidoPacienteActionPerformed

    private void redirigirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirigirPrincipalActionPerformed
       /* this Es una palabra reservada de Java para hacer referencia al objeto actual.
Al usarse junto con dispose() se referirá entonces a la ventana actual,     
dispose es un método de la clase Window, con esa instrucción cierras la ventana actual
        */
       this.dispose();
    }//GEN-LAST:event_redirigirPrincipalActionPerformed

    private void solicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarCitaActionPerformed
// Evalua que el campo del JTextField este lleno        
       if (!ingresaNombrePaciente.getText().isEmpty() && !ingresaApellidoPaciente.getText().isEmpty() && !ingresaCedulaPaciente.getText().isEmpty()
	       && !ingresaCorreoElectronico.getText().isEmpty() && !ingresaNumeroTelefono.getText().isEmpty()
	       && !ingresaHora.getText().isEmpty()) {

	  try {
// se crea un objeto con la clase fecha, este nos permite dar un formato de fecha.  	       
	     Fecha fechaCalendario = new Fecha();

	     String nombre = ingresaNombrePaciente.getText();
	     String apellido = ingresaApellidoPaciente.getText();
	     String identificacion = ingresaCedulaPaciente.getText();
	     int telefono = Integer.parseInt(ingresaNumeroTelefono.getText().trim());
	     String correo = ingresaCorreoElectronico.getText();
	     String especialidad = seleccioneEspecialidad.getSelectedItem().toString();
	     //String fecha= ingresaFecha.getText();
	     String fecha = fechaCalendario.getFecha(jDateChooser1);

	     String hora = ingresaHora.getText();
	     Paciente paciente = new Paciente(correo, telefono, identificacion, nombre, apellido);
	     CitaMedica cita = new CitaMedica(fecha, hora, especialidad, paciente);
	     /*gestionarCita es verdadero el not ! lo vuelve falso, agrega cita
gestionarCita es falso el not ! lo vuelve verdadero, no hay cita disponible
	      */
	     if (!(GestionarCita.existeSolicitudCita(fecha, hora, especialidad))) {
		GestionarCita.agregarCita(cita);
		JOptionPane.showMessageDialog(null, "Cita Agregada Correctamente");
		// Me permite volver a dejar los campos vacios para volver a agregar                  
		ingresaNombrePaciente.setText("");
		ingresaApellidoPaciente.setText("");
		ingresaCedulaPaciente.setText("");
		ingresaNumeroTelefono.setText("");
		ingresaCorreoElectronico.setText("");
		seleccioneEspecialidad.setSelectedItem("");

		ingresaHora.setText("");

	     } else {
		JOptionPane.showMessageDialog(null, "No hay cita disponible");
//Me permite volver a dejar los campos vacios para volver a agregar otro médico.		    
		ingresaNombrePaciente.setText("");
		ingresaApellidoPaciente.setText("");
		ingresaCedulaPaciente.setText("");
		ingresaNumeroTelefono.setText("");
		ingresaCorreoElectronico.setText("");
		seleccioneEspecialidad.setSelectedItem("");

		ingresaHora.setText("");

	     }
// Si el usuario ingresa datos de tipo String en teléfono lanza la excepción de NumberFormatExcepction      		
	  } catch (NumberFormatException | HeadlessException ex) {
	     JOptionPane.showMessageDialog(null, "Problemas al agregar ");
	  }
	  // Si el usuario no llena todos los campos del formulario            
       } else {
	  JOptionPane.showMessageDialog(null, "Faltan Datos, Revisar.....");
       }
    }//GEN-LAST:event_solicitarCitaActionPerformed

   private void ingresaCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaCedulaPacienteActionPerformed

   }//GEN-LAST:event_ingresaCedulaPacienteActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
	 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	    if ("Nimbus".equals(info.getName())) {
	       javax.swing.UIManager.setLookAndFeel(info.getClassName());
	       break;
	    }
	 }
      } catch (ClassNotFoundException ex) {
	 java.util.logging.Logger.getLogger(CitasMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(CitasMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(CitasMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(CitasMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
/*Nos permite correr el programa
EventQueue.invokeLater(new Runnable() Envia el codigo que se ejecuta dentro del metodo run(). 
       */
 /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new CitasMedica().setVisible(true);
	 }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel apellidoPaciente;
   private javax.swing.JLabel cedula;
   private javax.swing.JLabel correo;
   private javax.swing.JLabel especialidad;
   private javax.swing.JLabel fecha;
   private javax.swing.JLabel hora;
   private javax.swing.JTextField ingresaApellidoPaciente;
   private javax.swing.JTextField ingresaCedulaPaciente;
   private javax.swing.JTextField ingresaCorreoElectronico;
   private javax.swing.JTextField ingresaHora;
   private javax.swing.JTextField ingresaNombrePaciente;
   private javax.swing.JTextField ingresaNumeroTelefono;
   private com.toedter.calendar.JDateChooser jDateChooser1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel nombrePaciente;
   private javax.swing.JButton redirigirPrincipal;
   private javax.swing.JComboBox<String> seleccioneEspecialidad;
   private javax.swing.JButton solicitarCita;
   private javax.swing.JLabel telefono;
   // End of variables declaration//GEN-END:variables
}
