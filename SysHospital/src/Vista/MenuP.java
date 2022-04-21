/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author adm
 */
public class MenuP extends javax.swing.JFrame {

    /**
     * Creates new form MenuP
     */
    public MenuP() {
      
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH); //maximizo la ventana
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuAdm = new javax.swing.JMenu();
        MenuSeg = new javax.swing.JMenu();
        MenuCrearUsuario = new javax.swing.JMenuItem();
        MenuVerUsuario = new javax.swing.JMenuItem();
        MenuPermisosUsuario = new javax.swing.JMenuItem();
        MenuEditarUsuario = new javax.swing.JMenuItem();
        MenuCambiarClave = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuMedicos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuPaciente = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuTurnos = new javax.swing.JMenu();
        MenuReportes = new javax.swing.JMenu();
        MenuAcercade = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        MenuAdm.setText("Administracion");

        MenuSeg.setText("Control & Seguridad");

        MenuCrearUsuario.setText("Crear usuario");
        MenuCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCrearUsuarioActionPerformed(evt);
            }
        });
        MenuSeg.add(MenuCrearUsuario);

        MenuVerUsuario.setText("Ver Usuarios");
        MenuVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVerUsuarioActionPerformed(evt);
            }
        });
        MenuSeg.add(MenuVerUsuario);

        MenuPermisosUsuario.setText("Ver Permisos de Usuario");
        MenuPermisosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPermisosUsuarioActionPerformed(evt);
            }
        });
        MenuSeg.add(MenuPermisosUsuario);

        MenuEditarUsuario.setText("Editar Usuario");
        MenuSeg.add(MenuEditarUsuario);

        MenuCambiarClave.setText("Cambiar Contraseña");
        MenuCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCambiarClaveActionPerformed(evt);
            }
        });
        MenuSeg.add(MenuCambiarClave);

        MenuAdm.add(MenuSeg);

        jMenu1.setText("Salir del Sistema");
        MenuAdm.add(jMenu1);

        MenuPrincipal.add(MenuAdm);

        MenuMedicos.setText("Medicos");

        jMenuItem1.setText("Registrar Medicos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuMedicos.add(jMenuItem1);

        jMenuItem2.setText("Ver Medicos");
        MenuMedicos.add(jMenuItem2);

        jMenuItem3.setText("Disponibilidad  de Medicos");
        MenuMedicos.add(jMenuItem3);

        MenuPrincipal.add(MenuMedicos);

        MenuPaciente.setText("Pacientes");

        jMenuItem4.setText("Registrar Paciente");
        MenuPaciente.add(jMenuItem4);

        jMenuItem5.setText("Ver Pacientes");
        MenuPaciente.add(jMenuItem5);

        jMenuItem6.setText("Historial clinico");
        MenuPaciente.add(jMenuItem6);

        MenuPrincipal.add(MenuPaciente);

        MenuTurnos.setText("Turnos & Citas");
        MenuPrincipal.add(MenuTurnos);

        MenuReportes.setText("Reportes");
        MenuPrincipal.add(MenuReportes);

        MenuAcercade.setText("Acerca de");
        MenuPrincipal.add(MenuAcercade);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCrearUsuarioActionPerformed
        // TODO add your handling code here:
         RegistroUsuario objRegistroUsuario = new RegistroUsuario();
         objRegistroUsuario.setVisible(true);
         
    }//GEN-LAST:event_MenuCrearUsuarioActionPerformed

    private void MenuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCambiarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCambiarClaveActionPerformed

    private void MenuPermisosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPermisosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuPermisosUsuarioActionPerformed

    private void MenuVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVerUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuVerUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuAdm;
    private javax.swing.JMenuItem MenuCambiarClave;
    private javax.swing.JMenuItem MenuCrearUsuario;
    private javax.swing.JMenuItem MenuEditarUsuario;
    private javax.swing.JMenu MenuMedicos;
    private javax.swing.JMenu MenuPaciente;
    private javax.swing.JMenuItem MenuPermisosUsuario;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JMenu MenuSeg;
    private javax.swing.JMenu MenuTurnos;
    private javax.swing.JMenuItem MenuVerUsuario;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
