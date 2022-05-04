/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;

/**
 *
 * @author Matias
 */
public class Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Acerca
     */
    public Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        VerPaciente pa = new VerPaciente ();
        pa.setSize(1070, 550);
        pa.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(pa, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
        BotonPaciente.setCursor(new Cursor(HAND_CURSOR));
        BotonRegistrarPaciente.setCursor(new Cursor(HAND_CURSOR));
        HistorialClinico.setCursor(new Cursor(HAND_CURSOR));
        
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
        HistorialClinico = new javax.swing.JButton();
        BotonRegistrarPaciente = new javax.swing.JButton();
        BotonPaciente = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Pacientes ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        FondoPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada.jpg"))); // NOI18N
        jPanel1.add(FondoPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 700));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        HistorialClinico.setBackground(new java.awt.Color(204, 204, 204));
        HistorialClinico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        HistorialClinico.setForeground(new java.awt.Color(0, 0, 0));
        HistorialClinico.setText("Historial Clínico ");
        HistorialClinico.setContentAreaFilled(false);
        HistorialClinico.setName(""); // NOI18N
        HistorialClinico.setSelected(true);
        HistorialClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialClinicoActionPerformed(evt);
            }
        });

        BotonRegistrarPaciente.setBackground(new java.awt.Color(204, 204, 204));
        BotonRegistrarPaciente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BotonRegistrarPaciente.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrarPaciente.setText("Registrar Pacientes");
        BotonRegistrarPaciente.setContentAreaFilled(false);
        BotonRegistrarPaciente.setName(""); // NOI18N
        BotonRegistrarPaciente.setSelected(true);
        BotonRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarPacienteActionPerformed(evt);
            }
        });

        BotonPaciente.setBackground(new java.awt.Color(204, 204, 204));
        BotonPaciente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BotonPaciente.setForeground(new java.awt.Color(0, 0, 0));
        BotonPaciente.setText("Pacientes ");
        BotonPaciente.setContentAreaFilled(false);
        BotonPaciente.setName(""); // NOI18N
        BotonPaciente.setSelected(true);
        BotonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(BotonPaciente)
                .addGap(61, 61, 61)
                .addComponent(BotonRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(HistorialClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HistorialClinico)
                    .addComponent(BotonRegistrarPaciente)
                    .addComponent(BotonPaciente))
                .addContainerGap())
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

    
    public void VPaciente() {
       VerPaciente pa = new VerPaciente ();
     
    
      
        pa.setSize(1070, 550);
        pa.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(pa, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
    }
    public void RPaciente() {
       RegistrarPaciente pa = new RegistrarPaciente ();
        pa.setSize(1070, 550);
        pa.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(pa, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
    }
    
     public void HPaciente() {
       HistorialClinico hc = new HistorialClinico ();
        hc.setSize(1070, 550);
        hc.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(hc, BorderLayout.CENTER);
        
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

    private void BotonRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarPacienteActionPerformed
       RegistrarPaciente pa = new RegistrarPaciente ();
        pa.setSize(1070, 550);
        pa.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(pa, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_BotonRegistrarPacienteActionPerformed

    private void HistorialClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialClinicoActionPerformed
        HistorialClinico hc = new HistorialClinico ();
        hc.setSize(1070, 550);
        hc.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(hc, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_HistorialClinicoActionPerformed

    private void BotonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPacienteActionPerformed
      VerPaciente pa = new VerPaciente ();
     
    
      
        pa.setSize(1070, 550);
        pa.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(pa, BorderLayout.CENTER);
        
        Contenedor.revalidate();
        Contenedor.repaint();
        
        
    }//GEN-LAST:event_BotonPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPaciente;
    private javax.swing.JButton BotonRegistrarPaciente;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel FondoPortada;
    private javax.swing.JButton HistorialClinico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
