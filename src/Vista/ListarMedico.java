
package Vista;

import Modelo.GestionarCita;
import javax.swing.table.DefaultTableModel;

/*JFrame es una clase utilizada en Swing (biblioteca gráfica) para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario.
JFrame es una subclase que extiende de la clase Frame 
 */
public class ListarMedico extends javax.swing.JFrame {

   //método llamado por el constructor donde se inicializan todos los componentes gráficos  
   public ListarMedico() {
      initComponents();
      listarMedico();
   }

   public void listarMedico() {
      int cantidad = GestionarCita.listaMedico.size();
      DefaultTableModel modelo = (DefaultTableModel) tablaMedico.getModel();
      tablaMedico.setModel(modelo);
      String[] datos = new String[7];
      for (int i = 0; i < cantidad; i++) {
	 datos[0] = GestionarCita.listaMedico.get(i).getIdentificacion();
	 datos[1] = Integer.toString(GestionarCita.listaMedico.get(i).getIdMedico());
	 datos[2] = GestionarCita.listaMedico.get(i).getNombre();
	 datos[3] = GestionarCita.listaMedico.get(i).getApellido();
	 datos[4] = Integer.toString(GestionarCita.listaMedico.get(i).getTelefono());
	 datos[5] = GestionarCita.listaMedico.get(i).getCorreo();
	 datos[6] = GestionarCita.listaMedico.get(i).getEspecialidad();
	 modelo.addRow(datos);
      }
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedico = new javax.swing.JTable();
        redirigirPrincipal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTAR MEDICO");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 607, 33));

        tablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Id Médico", "Nombre", "Apellido", "Teléfono", "Correo", "Especialidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMedico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 647, 251));

        redirigirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonSiguiente.png"))); // NOI18N
        redirigirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirigirPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(redirigirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, 60));
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
	 java.util.logging.Logger.getLogger(ListarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(ListarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(ListarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(ListarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new ListarMedico().setVisible(true);
	 }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton redirigirPrincipal;
    private javax.swing.JTable tablaMedico;
    // End of variables declaration//GEN-END:variables
}
