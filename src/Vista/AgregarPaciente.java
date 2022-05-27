package Vista;

import Modelo.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */

public class AgregarPaciente extends javax.swing.JFrame {

//método llamado por el constructor donde se inicializan todos los componentes gráficos  
   public AgregarPaciente() {

      initComponents();
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JButton();
        redirigirPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombrePaciente = new javax.swing.JLabel();
        apellidoPaciente = new javax.swing.JLabel();
        cedulaPaciente = new javax.swing.JLabel();
        correoPaciente = new javax.swing.JLabel();
        ingresaNombre = new javax.swing.JTextField();
        ingresaApellido = new javax.swing.JTextField();
        ingresaCedula = new javax.swing.JTextField();
        ingresaCorreo = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        ingresaTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel1.setText("AGREGAR PACIENTE");
        jLabel1.setOpaque(true);

        nombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombrePaciente.setText("Nombres");

        apellidoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidoPaciente.setText("Apellidos");

        cedulaPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedulaPaciente.setText("Identificacion");

        correoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correoPaciente.setText("Correo");

        ingresaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ingresaApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ingresaCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaCedulaActionPerformed(evt);
            }
        });

        ingresaCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setText("Teléfono");

        ingresaTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar)
                .addGap(74, 74, 74)
                .addComponent(redirigirPrincipal)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedulaPaciente)
                    .addComponent(correoPaciente)
                    .addComponent(nombrePaciente)
                    .addComponent(apellidoPaciente)
                    .addComponent(telefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(ingresaApellido)
                            .addComponent(ingresaCedula)
                            .addComponent(ingresaNombre))
                        .addGap(140, 140, 140))))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePaciente)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaciente)
                    .addComponent(ingresaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaPaciente)
                    .addComponent(ingresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoPaciente))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(ingresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redirigirPrincipal)
                    .addComponent(agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redirigirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirigirPrincipalActionPerformed
       /*this.dispose es equivalente a setVisible(false)
this Es una palabra reservada de Java para hacer referencia al objeto actual.
Al usarse junto con dispose() se referirá entonces a la ventana actual,     
dispose es un método de la clase Window, con esa instrucción cierras la ventana actual*/
       this.dispose();


    }//GEN-LAST:event_redirigirPrincipalActionPerformed

    private void ingresaCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaCedulaActionPerformed

    }//GEN-LAST:event_ingresaCedulaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       // Evalua que el campo del JTextField este lleno       
       if (!ingresaCorreo.getText().isEmpty() && !ingresaCedula.getText().isEmpty()
	       && !ingresaNombre.getText().isEmpty() && !ingresaApellido.getText().isEmpty() && !ingresaTelefono.getText().isEmpty()) {
// getText permite obtener el valor del JTextField             
	  try {
// Guardar la información del formulario en variables		    
	     String identificacion = ingresaCedula.getText();
	     String nombre = ingresaNombre.getText();
	     String apellido = ingresaApellido.getText();
	     String correo = ingresaCorreo.getText();
	     int telefono = Integer.parseInt(ingresaTelefono.getText().trim());
	     Paciente paciente = new Paciente(correo, telefono, identificacion, nombre, apellido);
	     /* true==false - no / false ya existe 
false==false - verdadero agrega paciente */
	     if (GestionarCita.existePaciente(ingresaCedula.getText()) == false) {
		GestionarCita.agregarPaciente(paciente);
		JOptionPane.showMessageDialog(null, "Paciente Agregado");
// Me permite volver a dejar los campos vacios para volver a agregar otro paciente.		    
		ingresaCorreo.setText("");
		ingresaCedula.setText("");
		ingresaNombre.setText("");
		ingresaApellido.setText("");
		ingresaTelefono.setText("");
		// Si el usuario ingresa un número de cédula que ya existe evalua la condición                   
	     } else {
		JOptionPane.showMessageDialog(null, "Ya existe un paciente con esa identificación");
	     }
// Si el usuario ingresa datos de tipo String en Id y teléfono lanza la excepción de NumberFormatExcepction    		
	  } catch (NumberFormatException | HeadlessException error) {
	     JOptionPane.showMessageDialog(null, "Error, solo dato numérico ");
	  }
// Si el usuario no llena todos los campos del formulario       		 
       } else {
	  JOptionPane.showMessageDialog(null, "Faltan Datos");
       }
    }//GEN-LAST:event_agregarActionPerformed

    private void ingresaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaTelefonoActionPerformed

    }//GEN-LAST:event_ingresaTelefonoActionPerformed

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
	 java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
 /*Nos permite correr el programa
EventQueue.invokeLater(new Runnable() Envia el codigo que se ejecuta dentro del metodo run(). */
 /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new AgregarPaciente().setVisible(true);
	 }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel apellidoPaciente;
    private javax.swing.JLabel cedulaPaciente;
    private javax.swing.JLabel correoPaciente;
    private javax.swing.JTextField ingresaApellido;
    private javax.swing.JTextField ingresaCedula;
    private javax.swing.JTextField ingresaCorreo;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JTextField ingresaTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombrePaciente;
    private javax.swing.JButton redirigirPrincipal;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
