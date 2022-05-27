
package Vista;

import Modelo.GestionarCita;
import javax.swing.table.DefaultTableModel;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */
public class ListarCitaMedica extends javax.swing.JFrame {

   //método llamado por el constructor donde se inicializan todos los componentes gráficos  
   public ListarCitaMedica() {
      initComponents();
      listarCitaMedica();
   }

   public void listarCitaMedica() {
      int cantidad = GestionarCita.listaCitaMedica.size();
      DefaultTableModel modelo = (DefaultTableModel) tablaCitaMedica.getModel();
      tablaCitaMedica.setModel(modelo);
      String[] datos = new String[8];
      for (int i = 0; i < cantidad; i++) {
	 datos[0] = GestionarCita.listaCitaMedica.get(i).getPaciente().getIdentificacion();
	 datos[1] = GestionarCita.listaCitaMedica.get(i).getPaciente().getNombre();
	 datos[2] = GestionarCita.listaCitaMedica.get(i).getPaciente().getApellido();
	 datos[3] = GestionarCita.listaCitaMedica.get(i).getPaciente().getCorreo();
	 datos[4] = Integer.toString(GestionarCita.listaCitaMedica.get(i).getPaciente().getTelefono());
	 datos[5] = GestionarCita.listaCitaMedica.get(i).getFecha();
	 datos[6] = GestionarCita.listaCitaMedica.get(i).getHora();
	 datos[7] = GestionarCita.listaCitaMedica.get(i).getEspecialidad();
	 modelo.addRow(datos);
      }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tablaCitaMedica = new javax.swing.JTable();
      redirigirPrincipal = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      jLabel1.setBackground(new java.awt.Color(0, 0, 204));
      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("LISTAR CITA MEDICA");
      jLabel1.setOpaque(true);
      getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 730, 33));

      tablaCitaMedica.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Cédula", "Nombre paciente", "Apellido paciente", "Correo", "Teléfono", "Fecha", "Hora", "Especialidad"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane1.setViewportView(tablaCitaMedica);
      if (tablaCitaMedica.getColumnModel().getColumnCount() > 0) {
         tablaCitaMedica.getColumnModel().getColumn(0).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(1).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(2).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(3).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(4).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(5).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(6).setPreferredWidth(100);
         tablaCitaMedica.getColumnModel().getColumn(7).setPreferredWidth(100);
      }

      getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 750, 251));

      redirigirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonSiguiente.png"))); // NOI18N
      redirigirPrincipal.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            redirigirPrincipalActionPerformed(evt);
         }
      });
      getContentPane().add(redirigirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 90, 60));
      getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, 40));

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void redirigirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirigirPrincipalActionPerformed
       /* this Es una palabra reservada de Java para hacer referencia al objeto actual.
Al usarse junto con dispose() se referirá entonces a la ventana actual,     
dispose es un método de la clase Window, con esa instrucción cierras la ventana actual
        */
       this.dispose();
    }//GEN-LAST:event_redirigirPrincipalActionPerformed

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
	 java.util.logging.Logger.getLogger(ListarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(ListarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(ListarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(ListarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
/*Nos permite correr el programa
EventQueue.invokeLater(new Runnable() Envia el codigo que se ejecuta dentro del metodo run(). 
       */
 /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new ListarCitaMedica().setVisible(true);
	 }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JButton redirigirPrincipal;
   private javax.swing.JTable tablaCitaMedica;
   // End of variables declaration//GEN-END:variables
}
