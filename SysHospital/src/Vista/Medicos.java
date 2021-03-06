/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;

/**
 *
 * @author Matias
 */
public class Medicos extends javax.swing.JFrame {

    /**
     * Creates new form Acerca
     */
    public Medicos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        VerMedico me = new VerMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        BotonMedico.setCursor(new Cursor(HAND_CURSOR));
        VerMedico.setCursor(new Cursor(HAND_CURSOR));
        BotonRegistrarMedico.setCursor(new Cursor(HAND_CURSOR));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FondoPortada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        VerMedico = new javax.swing.JButton();
        BotonMedico = new javax.swing.JButton();
        BotonRegistrarMedico = new javax.swing.JButton();
        Contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("X");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 0, 50, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("-");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, 50, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("M??dicos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        FondoPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada.jpg"))); // NOI18N
        jPanel1.add(FondoPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 700));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        VerMedico.setBackground(new java.awt.Color(204, 204, 204));
        VerMedico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        VerMedico.setForeground(new java.awt.Color(0, 0, 0));
        VerMedico.setText("Disponibiliadad de M??dicos");
        VerMedico.setName(""); // NOI18N
        VerMedico.setSelected(true);
        VerMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMedicoActionPerformed(evt);
            }
        });

        BotonMedico.setBackground(new java.awt.Color(204, 204, 204));
        BotonMedico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BotonMedico.setForeground(new java.awt.Color(0, 0, 0));
        BotonMedico.setText("M??dicos");
        BotonMedico.setName(""); // NOI18N
        BotonMedico.setSelected(true);
        BotonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMedicoActionPerformed(evt);
            }
        });

        BotonRegistrarMedico.setBackground(new java.awt.Color(204, 204, 204));
        BotonRegistrarMedico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BotonRegistrarMedico.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrarMedico.setText("Registrar M??dicos");
        BotonRegistrarMedico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonRegistrarMedico.setName(""); // NOI18N
        BotonRegistrarMedico.setSelected(true);
        BotonRegistrarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonRegistrarMedicoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonRegistrarMedicoMouseReleased(evt);
            }
        });
        BotonRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BotonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(BotonRegistrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(VerMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMedico)
                    .addComponent(VerMedico)
                    .addComponent(BotonRegistrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1130, 120));

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 1070, 550));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoblancooo.jpg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1130, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 681));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void RMedicos() {
        RegistrarMedico me = new RegistrarMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
    }
    
    
public void DMedicos() {
       DisponibilidadMedico me = new DisponibilidadMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        
        
           MenuP MP = new MenuP();
           MP.setVisible(true);
        

       


           dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarMedicoActionPerformed
       RegistrarMedico me = new RegistrarMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_BotonRegistrarMedicoActionPerformed

    private void VerMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMedicoActionPerformed
        DisponibilidadMedico me = new DisponibilidadMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_VerMedicoActionPerformed

    private void BotonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMedicoActionPerformed
        VerMedico me = new VerMedico ();
        me.setSize(1070, 550);
        me.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(me, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_BotonMedicoActionPerformed

    private void BotonRegistrarMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMedicoMousePressed
       
    }//GEN-LAST:event_BotonRegistrarMedicoMousePressed

    private void BotonRegistrarMedicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMedicoMouseReleased
         
    }//GEN-LAST:event_BotonRegistrarMedicoMouseReleased

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
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMedico;
    private javax.swing.JButton BotonRegistrarMedico;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel FondoPortada;
    private javax.swing.JButton VerMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
