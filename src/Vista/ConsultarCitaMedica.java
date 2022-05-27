
package Vista;

import Modelo.CitaMedica;
import Modelo.GestionarCita;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame */
public class ConsultarCitaMedica extends javax.swing.JFrame {

   //método llamado por el constructor donde se inicializan todos los componentes gráficos  
   public ConsultarCitaMedica() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        identificacion = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        ingresaCedula = new javax.swing.JTextField();
        ingresaNombre = new javax.swing.JTextField();
        ingresaApellido = new javax.swing.JTextField();
        redirigirPrincipal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        correo = new javax.swing.JLabel();
        ingresaCorreo = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        ingresaTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        ingresaFecha = new javax.swing.JTextField();
        especialidad = new javax.swing.JLabel();
        ingresaEspecialidad = new javax.swing.JTextField();
        hora = new javax.swing.JLabel();
        ingresaHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR CITA MEDICA");
        jLabel1.setOpaque(true);

        identificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identificacion.setForeground(new java.awt.Color(0, 0, 204));
        identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        identificacion.setText("Cedula");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 204));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre");

        apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 0, 204));
        apellido.setText("Apellido");

        ingresaCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ingresaNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingresaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNombreActionPerformed(evt);
            }
        });

        ingresaApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        redirigirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonSiguiente.png"))); // NOI18N
        redirigirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirigirPrincipalActionPerformed(evt);
            }
        });

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file_search.png"))); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 0, 204));
        correo.setText("Correo");

        ingresaCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 204));
        telefono.setText("Telefono");

        ingresaTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 204));
        fecha.setText("Fecha");

        ingresaFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        especialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        especialidad.setForeground(new java.awt.Color(0, 0, 204));
        especialidad.setText("Especialidad");

        ingresaEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 204));
        hora.setText("Hora");

        ingresaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre)
                                            .addComponent(apellido)
                                            .addComponent(correo)
                                            .addComponent(telefono)
                                            .addComponent(fecha)
                                            .addComponent(especialidad)
                                            .addComponent(hora))
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(identificacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ingresaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ingresaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ingresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ingresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(redirigirPrincipal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(ingresaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(ingresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(ingresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha)
                            .addComponent(ingresaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hora)
                            .addComponent(ingresaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especialidad))
                        .addGap(27, 27, 27)
                        .addComponent(redirigirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed

    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void redirigirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirigirPrincipalActionPerformed
       /* this Es una palabra reservada de Java para hacer referencia al objeto actual.
Al usarse junto con dispose() se referirá entonces a la ventana actual,     
dispose es un método de la clase Window, con esa instrucción cierras la ventana actual
        */
       this.dispose();
    }//GEN-LAST:event_redirigirPrincipalActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       // Me permite volver a dejar los campos vacios para volver a agregar otra cita.       
       ingresaNombre.setText("");
       ingresaApellido.setText("");
       ingresaCorreo.setText("");
       ingresaTelefono.setText("");
       ingresaFecha.setText("");
       ingresaEspecialidad.setText("");
       ingresaHora.setText("");
//Si el campo no esta vacio, se obtiene el número de la cedula	
       if (!ingresaCedula.getText().isEmpty()) {
	  String identificacion = ingresaCedula.getText();
	  CitaMedica cita = GestionarCita.obtenerCitaPorIdentificacion(ingresaCedula.getText());
// si cita es diferente a vacío, se obtiene los datos por los métodos getter 		
	  if (cita != null) {
	     ingresaNombre.setText(cita.getPaciente().getNombre());
	     ingresaApellido.setText(cita.getPaciente().getApellido());
	     ingresaCorreo.setText(cita.getPaciente().getCorreo());
	     ingresaTelefono.setText(Integer.toString(cita.getPaciente().getTelefono()));
	     ingresaFecha.setText((cita.getFecha()));
	     ingresaHora.setText(cita.getHora());
	     ingresaEspecialidad.setText(cita.getEspecialidad());
	  } else {
	     JOptionPane.showMessageDialog(null, "No existe Cita Médica con dicha Identificación");
	  }
       } else {
	  JOptionPane.showMessageDialog(null, "No se puede dejar campo vacio");
       }
    }//GEN-LAST:event_consultarActionPerformed

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
	 java.util.logging.Logger.getLogger(ConsultarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(ConsultarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(ConsultarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(ConsultarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
/*Nos permite correr el programa
EventQueue.invokeLater(new Runnable() Envia el codigo que se ejecuta dentro del metodo run().   */
 /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new ConsultarCitaMedica().setVisible(true);
	 }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel identificacion;
    private javax.swing.JTextField ingresaApellido;
    private javax.swing.JTextField ingresaCedula;
    private javax.swing.JTextField ingresaCorreo;
    private javax.swing.JTextField ingresaEspecialidad;
    private javax.swing.JTextField ingresaFecha;
    private javax.swing.JTextField ingresaHora;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JTextField ingresaTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton redirigirPrincipal;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
