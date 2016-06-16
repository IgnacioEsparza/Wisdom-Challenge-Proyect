/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomjframe;

import wisdomchallenge.*;

/**
 *
 * @author Ignacio Esparza
 */
public class Ventana extends javax.swing.JFrame {

    Conf c = new Conf();
    Preguntas p = new Preguntas();
    Respuestas r = new Respuestas();
    int seleccion;
    int cont;
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Wisdom Challenge");
        setResizable(false);
        setSize(550, 580);
        configuracion();
    }

    private void configuracion() {
        cont++;
        int llamarPreguntas[] = c.preguntaRandom(); // los números de la pregunta en un arreglo, de forma aleatoria

        if(cont<11){
            int pos = llamarPreguntas[cont];// el numero de la posicion del contador mietras va aunmentando
            c.configuracion(seleccion, pos);
            String[] alternativa = r.establecerAlternativa(pos); //llamar a las alternativas
            numeroPregunta.setText(String.valueOf(cont));
            pregunta.setText(p.preguntas(pos)); //muestra las preguntas
            Alternativa1.setText(alternativa[0]); // se muestran las alternativas
            Alternativa2.setText(alternativa[1]);
            Alternativa3.setText(alternativa[2]);
            Alternativa4.setText(alternativa[3]);
        }else{
            PuntajeObtenido po = new PuntajeObtenido();
            po.setVisible(true);
            dispose();
        } 
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
        Alternativa4 = new javax.swing.JButton();
        Alternativa2 = new javax.swing.JButton();
        Alternativa1 = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        volverOpciones = new javax.swing.JButton();
        Alternativa3 = new javax.swing.JButton();
        correccion = new javax.swing.JLabel();
        numeroPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);

        jcMousePanel1.setBackground(java.awt.SystemColor.scrollbar);
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/generalbg.png"))); // NOI18N
        jcMousePanel1.setMaximumSize(new java.awt.Dimension(550, 520));
        jcMousePanel1.setMinimumSize(new java.awt.Dimension(550, 520));
        jcMousePanel1.setPreferredSize(new java.awt.Dimension(550, 520));

        Alternativa4.setBackground(java.awt.SystemColor.textHighlightText);
        Alternativa4.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Alternativa4.setText("Alternativa 4");
        Alternativa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alternativa4ActionPerformed(evt);
            }
        });

        Alternativa2.setBackground(java.awt.SystemColor.textHighlightText);
        Alternativa2.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Alternativa2.setText("Alternativa 2");
        Alternativa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alternativa2ActionPerformed(evt);
            }
        });

        Alternativa1.setBackground(java.awt.SystemColor.textHighlightText);
        Alternativa1.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Alternativa1.setText("Alternativa 1");
        Alternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alternativa1ActionPerformed(evt);
            }
        });

        pregunta.setFont(new java.awt.Font("Diogenes", 0, 24)); // NOI18N
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("Pregunta");
        pregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        volverOpciones.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        volverOpciones.setText("Volver al Menú");
        volverOpciones.setMaximumSize(new java.awt.Dimension(1071, 477));
        volverOpciones.setMinimumSize(new java.awt.Dimension(1071, 477));
        volverOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverOpcionesActionPerformed(evt);
            }
        });

        Alternativa3.setBackground(java.awt.SystemColor.textHighlightText);
        Alternativa3.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        Alternativa3.setText("Alternativa 3");
        Alternativa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alternativa3ActionPerformed(evt);
            }
        });

        correccion.setFont(new java.awt.Font("Diogenes", 0, 12)); // NOI18N
        correccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correccion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        numeroPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroPregunta.setText("2");

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correccion, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(volverOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alternativa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alternativa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alternativa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(numeroPregunta)
                        .addGap(269, 269, 269))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(numeroPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(pregunta)
                .addGap(54, 54, 54)
                .addComponent(Alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Alternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Alternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(correccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(volverOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverOpcionesActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverOpcionesActionPerformed

    private void Alternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alternativa1ActionPerformed
        seleccion = 0;
        correccion.setText(c.getCorreccion());
        configuracion();
    }//GEN-LAST:event_Alternativa1ActionPerformed

    private void Alternativa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alternativa2ActionPerformed
        seleccion = 1;
        correccion.setText(c.getCorreccion());
        configuracion();
    }//GEN-LAST:event_Alternativa2ActionPerformed

    private void Alternativa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alternativa3ActionPerformed
        seleccion = 2;
        correccion.setText(c.getCorreccion());
        configuracion();
    }//GEN-LAST:event_Alternativa3ActionPerformed

    private void Alternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alternativa4ActionPerformed
        seleccion = 3;
        correccion.setText(c.getCorreccion());
        configuracion();
    }//GEN-LAST:event_Alternativa4ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alternativa1;
    private javax.swing.JButton Alternativa2;
    private javax.swing.JButton Alternativa3;
    private javax.swing.JButton Alternativa4;
    private javax.swing.JLabel correccion;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel numeroPregunta;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton volverOpciones;
    // End of variables declaration//GEN-END:variables
}
