/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomjframe;

/**
 *
 * @author Ignacio Esparza
 */
public class Opciones extends javax.swing.JFrame {

    /**
     * Creates new form Opciones
     */
    public Opciones() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Opciones");
        setResizable(false);
        setSize(550, 580);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        opciones = new javax.swing.JLabel();
        Nombre = new javax.swing.JButton();
        volverMenuOpciones = new javax.swing.JButton();
        AcercaDe = new javax.swing.JButton();
        Dificultad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/generalbg.png"))); // NOI18N
        jcMousePanel1.setMaximumSize(new java.awt.Dimension(550, 520));
        jcMousePanel1.setMinimumSize(new java.awt.Dimension(550, 520));

        opciones.setFont(new java.awt.Font("Diogenes", 0, 24)); // NOI18N
        opciones.setText("Opciones");

        Nombre.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Nombre.setText("Nombre");
        Nombre.setMaximumSize(new java.awt.Dimension(1071, 477));
        Nombre.setMinimumSize(new java.awt.Dimension(1071, 477));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        volverMenuOpciones.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        volverMenuOpciones.setText("Volver");
        volverMenuOpciones.setMaximumSize(new java.awt.Dimension(1071, 477));
        volverMenuOpciones.setMinimumSize(new java.awt.Dimension(1071, 477));
        volverMenuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuOpcionesActionPerformed(evt);
            }
        });

        AcercaDe.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        AcercaDe.setText("Acerca de");
        AcercaDe.setMaximumSize(new java.awt.Dimension(1071, 477));
        AcercaDe.setMinimumSize(new java.awt.Dimension(1071, 477));
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });

        Dificultad.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Dificultad.setText("Dificultad");
        Dificultad.setMaximumSize(new java.awt.Dimension(1071, 477));
        Dificultad.setMinimumSize(new java.awt.Dimension(1071, 477));
        Dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(opciones))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(volverMenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(0, 197, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opciones)
                .addGap(107, 107, 107)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(AcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(volverMenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void volverMenuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuOpcionesActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverMenuOpcionesActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        AcercaDe a = new AcercaDe();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void DificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DificultadActionPerformed

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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcercaDe;
    private javax.swing.JButton Dificultad;
    private javax.swing.JButton Nombre;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel opciones;
    private javax.swing.JButton volverMenuOpciones;
    // End of variables declaration//GEN-END:variables
}
