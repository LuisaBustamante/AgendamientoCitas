
package Vista;

import Modelo.CitaMedica;
import javax.swing.JOptionPane;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      imagenPrincipal = new javax.swing.JLabel();
      barraOpciones = new javax.swing.JMenuBar();
      paciente = new javax.swing.JMenu();
      agregarPaciente = new javax.swing.JCheckBoxMenuItem();
      consultarPaciente = new javax.swing.JCheckBoxMenuItem();
      listarPaciente = new javax.swing.JCheckBoxMenuItem();
      medico = new javax.swing.JMenu();
      agregarMedico = new javax.swing.JCheckBoxMenuItem();
      consultarMedico = new javax.swing.JCheckBoxMenuItem();
      listarMedico = new javax.swing.JCheckBoxMenuItem();
      citaMedica = new javax.swing.JMenu();
      solicitarCita = new javax.swing.JCheckBoxMenuItem();
      consultarCita = new javax.swing.JCheckBoxMenuItem();
      ListarCita = new javax.swing.JCheckBoxMenuItem();
      Cerrar = new javax.swing.JMenu();
      salir = new javax.swing.JCheckBoxMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      imagenPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CitasMedicas_Movil.jpg"))); // NOI18N

      barraOpciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      paciente.setText("Paciente");
      paciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      paciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      agregarPaciente.setText("Agregar Paciente  ");
      agregarPaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarPacienteActionPerformed(evt);
         }
      });
      paciente.add(agregarPaciente);

      consultarPaciente.setText("Consultar Paciente");
      consultarPaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarPacienteActionPerformed(evt);
         }
      });
      paciente.add(consultarPaciente);

      listarPaciente.setText("Listar Paciente");
      listarPaciente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            listarPacienteActionPerformed(evt);
         }
      });
      paciente.add(listarPaciente);

      barraOpciones.add(paciente);

      medico.setText("Medico");
      medico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      medico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      agregarMedico.setText("Agregar médico");
      agregarMedico.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarMedicoActionPerformed(evt);
         }
      });
      medico.add(agregarMedico);

      consultarMedico.setText("Consultar médico");
      consultarMedico.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarMedicoActionPerformed(evt);
         }
      });
      medico.add(consultarMedico);

      listarMedico.setText("Listar médico");
      listarMedico.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            listarMedicoActionPerformed(evt);
         }
      });
      medico.add(listarMedico);

      barraOpciones.add(medico);

      citaMedica.setText("Cita Médica");
      citaMedica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      citaMedica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      solicitarCita.setText("Solicitar cita");
      solicitarCita.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            solicitarCitaActionPerformed(evt);
         }
      });
      citaMedica.add(solicitarCita);

      consultarCita.setText("Consultar Cita");
      consultarCita.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarCitaActionPerformed(evt);
         }
      });
      citaMedica.add(consultarCita);

      ListarCita.setText("Listar Cita");
      ListarCita.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ListarCitaActionPerformed(evt);
         }
      });
      citaMedica.add(ListarCita);

      barraOpciones.add(citaMedica);

      Cerrar.setText("Cerrar");
      Cerrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      salir.setText("Salir");
      salir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            salirActionPerformed(evt);
         }
      });
      Cerrar.add(salir);

      barraOpciones.add(Cerrar);

      setJMenuBar(barraOpciones);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(imagenPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(imagenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 3, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void agregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPacienteActionPerformed
     
        AgregarPaciente paciente = new AgregarPaciente();
        paciente.setVisible(true);
    }//GEN-LAST:event_agregarPacienteActionPerformed

    private void consultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPacienteActionPerformed
       
        ConsultarPaciente consulta = new ConsultarPaciente();
        consulta.setVisible(true);
    }//GEN-LAST:event_consultarPacienteActionPerformed

    private void listarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPacienteActionPerformed
        
        ListarPaciente lista = new ListarPaciente();
        lista.setVisible(true);
    }//GEN-LAST:event_listarPacienteActionPerformed

    private void agregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMedicoActionPerformed
    
        AgregarMedico medico = new AgregarMedico();
        medico.setVisible(true);
              
    }//GEN-LAST:event_agregarMedicoActionPerformed

    private void listarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMedicoActionPerformed
     
        ListarMedico lista = new ListarMedico();
        lista.setVisible(true);
    }//GEN-LAST:event_listarMedicoActionPerformed

    private void solicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarCitaActionPerformed
        
        CitasMedica citas = new CitasMedica();
        citas.setVisible(true);
    }//GEN-LAST:event_solicitarCitaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       
         int dialogButton = JOptionPane.YES_NO_OPTION;
         int confirmado = JOptionPane.showConfirmDialog(null, "Está seguro de Salir", "Salir", dialogButton);
     if (JOptionPane.YES_OPTION==confirmado){
         System.exit(0);
     }
    }//GEN-LAST:event_salirActionPerformed

    private void consultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMedicoActionPerformed
   
        ConsultarMedico consultar = new ConsultarMedico();
        consultar.setVisible(true);
    }//GEN-LAST:event_consultarMedicoActionPerformed

    private void consultarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCitaActionPerformed
   
        ConsultarCitaMedica cita= new ConsultarCitaMedica();
        cita.setVisible(true);
    }//GEN-LAST:event_consultarCitaActionPerformed

   private void ListarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCitaActionPerformed
 
      ListarCitaMedica mostrar = new ListarCitaMedica();
      mostrar.setVisible(true);
   }//GEN-LAST:event_ListarCitaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenu Cerrar;
   private javax.swing.JCheckBoxMenuItem ListarCita;
   private javax.swing.JCheckBoxMenuItem agregarMedico;
   private javax.swing.JCheckBoxMenuItem agregarPaciente;
   private javax.swing.JMenuBar barraOpciones;
   private javax.swing.JMenu citaMedica;
   private javax.swing.JCheckBoxMenuItem consultarCita;
   private javax.swing.JCheckBoxMenuItem consultarMedico;
   private javax.swing.JCheckBoxMenuItem consultarPaciente;
   private javax.swing.JLabel imagenPrincipal;
   private javax.swing.JCheckBoxMenuItem listarMedico;
   private javax.swing.JCheckBoxMenuItem listarPaciente;
   private javax.swing.JMenu medico;
   private javax.swing.JMenu paciente;
   private javax.swing.JCheckBoxMenuItem salir;
   private javax.swing.JCheckBoxMenuItem solicitarCita;
   // End of variables declaration//GEN-END:variables
}
