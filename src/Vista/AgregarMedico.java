package Vista;

import Modelo.GestionarCita;
import Modelo.Medico;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */
public class AgregarMedico extends javax.swing.JFrame {

   public AgregarMedico() {
      //método llamado por el constructor donde se inicializan todos los componentes gráficos
      initComponents();
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JButton();
        redirigirPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreMedico = new javax.swing.JLabel();
        apellidoMedico = new javax.swing.JLabel();
        cedulaMedico = new javax.swing.JLabel();
        idMedico = new javax.swing.JLabel();
        ingresaNombre = new javax.swing.JTextField();
        ingresaApellido = new javax.swing.JTextField();
        ingresaCedula = new javax.swing.JTextField();
        ingresaIdMedico = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        ingreseTelefono = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JLabel();
        ingresaCorreo = new javax.swing.JTextField();
        especialidadMedico = new javax.swing.JLabel();
        seleccioneEspecialidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAgregar.png"))); // NOI18N
        agregar.setText("...");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        redirigirPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        redirigirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSiguiente.png"))); // NOI18N
        redirigirPrincipal.setText("...");
        redirigirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirigirPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR MEDICO");
        jLabel1.setOpaque(true);

        nombreMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreMedico.setText("Nombres");

        apellidoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidoMedico.setText("Apellidos");

        cedulaMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedulaMedico.setText("Identificacion");

        idMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idMedico.setText("ID  ");

        ingresaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNombreActionPerformed(evt);
            }
        });

        ingresaApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaApellidoActionPerformed(evt);
            }
        });

        ingresaCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaCedulaActionPerformed(evt);
            }
        });

        ingresaIdMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setText("Teléfono");

        ingreseTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        correoElectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correoElectronico.setText("Correo ");

        ingresaCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaCorreo.setToolTipText("");

        especialidadMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        especialidadMedico.setText("Especialidad");

        seleccioneEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccioneEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione especialidad-", "Cardiólogo", "Dermatólogo", "Médico general", "Médico interna", "Pediatra", "Psiquiatra", "Odontólogo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(agregar)
                .addGap(60, 60, 60)
                .addComponent(redirigirPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedulaMedico)
                    .addComponent(idMedico)
                    .addComponent(nombreMedico)
                    .addComponent(apellidoMedico)
                    .addComponent(telefono)
                    .addComponent(correoElectronico)
                    .addComponent(especialidadMedico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingreseTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresaIdMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(ingresaApellido)
                            .addComponent(ingresaCedula)
                            .addComponent(ingresaNombre))
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccioneEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMedico)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMedico)
                    .addComponent(ingresaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaMedico)
                    .addComponent(ingresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMedico))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(ingreseTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoElectronico)
                    .addComponent(ingresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadMedico)
                    .addComponent(seleccioneEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(redirigirPrincipal))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redirigirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirigirPrincipalActionPerformed
       /* this Es una palabra reservada de Java para hacer referencia al objeto actual.
Al usarse junto con dispose() se referirá entonces a la ventana actual,     
dispose es un método de la clase Window, con esa instrucción cierras la ventana actual
        */
       this.dispose();
    }//GEN-LAST:event_redirigirPrincipalActionPerformed

    private void ingresaCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaCedulaActionPerformed

    }//GEN-LAST:event_ingresaCedulaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       // Evalua que el campo del JTextField este lleno
       if (!ingresaNombre.getText().isEmpty() && !ingresaApellido.getText().isEmpty() && !ingresaCedula.getText().isEmpty()
	       && !ingresaIdMedico.getText().isEmpty() && !ingresaCorreo.getText().isEmpty()
	       && !ingreseTelefono.getText().isEmpty()) {
// getText permite obtener el valor del JTextField   
	  try {
// Guardar la información del formulario en variables
	     String nombre = ingresaNombre.getText();
	     String apellido = ingresaApellido.getText();
	     String identificacion = ingresaCedula.getText();
	     int idMedico = Integer.parseInt(ingresaIdMedico.getText().trim());
	     int telefono = Integer.parseInt(ingreseTelefono.getText().trim());
	     String correo = ingresaCorreo.getText();
	     String especialidadMedico = seleccioneEspecialidad.getSelectedItem().toString();
	     Medico medico = new Medico(idMedico, especialidadMedico, correo, telefono, identificacion, nombre, apellido);
	     if (GestionarCita.existeMedico(ingresaCedula.getText()) == false) {
		GestionarCita.agregarMedico(medico);
		JOptionPane.showMessageDialog(null, "Medico Agregado Correctamente");

		// Me permite volver a dejar los campos vacios para volver a agregar otro médico.
		ingresaNombre.setText("");
		ingresaApellido.setText("");
		ingresaCedula.setText("");
		ingresaIdMedico.setText("");
		ingreseTelefono.setText("");
		ingresaCorreo.setText("");
// Si el usuario ingresa un número de cédula que ya existe evalua la condición
	     } else {
		JOptionPane.showMessageDialog(null, "Ya existe Medico con esa identificación");
	     }
// Si el usuario ingresa datos de tipo String en Id y teléfono lanza la excepción de NumberFormatExcepction
	  } catch (NumberFormatException | HeadlessException ex) {
	     JOptionPane.showMessageDialog(null, "Problemas al agregar ");
	  }
	  // Si el usuario no llena todos los campos del formulario 
       } else {
	  JOptionPane.showMessageDialog(null, "Faltan Datos, Revisar.....");
       }


    }//GEN-LAST:event_agregarActionPerformed

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed

    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void ingresaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaApellidoActionPerformed

    }//GEN-LAST:event_ingresaApellidoActionPerformed

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
	 java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
 /*Nos permite correr el programa
EventQueue.invokeLater(new Runnable() Envia el codigo que se ejecuta dentro del metodo run(). 
       */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new AgregarMedico().setVisible(true);
	 }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel apellidoMedico;
    private javax.swing.JLabel cedulaMedico;
    private javax.swing.JLabel correoElectronico;
    private javax.swing.JLabel especialidadMedico;
    private javax.swing.JLabel idMedico;
    private javax.swing.JTextField ingresaApellido;
    private javax.swing.JTextField ingresaCedula;
    private javax.swing.JTextField ingresaCorreo;
    private javax.swing.JTextField ingresaIdMedico;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JTextField ingreseTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombreMedico;
    private javax.swing.JButton redirigirPrincipal;
    private javax.swing.JComboBox<String> seleccioneEspecialidad;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
