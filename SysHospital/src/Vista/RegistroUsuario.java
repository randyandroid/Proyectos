/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


//import Modelo.hash;
import Modelo.Login;
import Modelo.LoginDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        NombreRegristro = new javax.swing.JLabel();
        NombreRegristro2 = new javax.swing.JLabel();
        UsuarioRegristro = new javax.swing.JLabel();
        NombreRegristro3 = new javax.swing.JLabel();
        xxx = new javax.swing.JLabel();
        TxtUsuarioUser = new javax.swing.JTextField();
        TxtUsuarioNombre = new javax.swing.JTextField();
        TxtUsuarioNuevaPassword = new javax.swing.JPasswordField();
        BtnUsuarioRegistrar = new javax.swing.JButton();
        BtnUsuarioSalir = new javax.swing.JButton();
        TxtUsuarioPassword = new javax.swing.JPasswordField();
        CbxUsuarioTipo = new javax.swing.JComboBox<>();
        NombreRegristro4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro.setText("Nombre: ");
        fondo.add(NombreRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        NombreRegristro2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro2.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro2.setText("Tipo de usuario:");
        fondo.add(NombreRegristro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 160, -1));

        UsuarioRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        UsuarioRegristro.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioRegristro.setText("Usuario :");
        fondo.add(UsuarioRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        NombreRegristro3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro3.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro3.setText("Contraseña : ");
        fondo.add(NombreRegristro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        xxx.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        xxx.setForeground(new java.awt.Color(0, 0, 0));
        xxx.setText("Registro ");
        fondo.add(xxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        TxtUsuarioUser.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuarioUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TxtUsuarioUser.setForeground(new java.awt.Color(0, 0, 0));
        TxtUsuarioUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioUserActionPerformed(evt);
            }
        });
        fondo.add(TxtUsuarioUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 220, -1));

        TxtUsuarioNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuarioNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TxtUsuarioNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtUsuarioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioNombreActionPerformed(evt);
            }
        });
        fondo.add(TxtUsuarioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 220, -1));

        TxtUsuarioNuevaPassword.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuarioNuevaPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtUsuarioNuevaPassword.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(TxtUsuarioNuevaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 220, -1));

        BtnUsuarioRegistrar.setText("Registrar");
        BtnUsuarioRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioRegistrarActionPerformed(evt);
            }
        });
        fondo.add(BtnUsuarioRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 170, 50));

        BtnUsuarioSalir.setText("Atras");
        BtnUsuarioSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioSalirActionPerformed(evt);
            }
        });
        fondo.add(BtnUsuarioSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        TxtUsuarioPassword.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuarioPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtUsuarioPassword.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(TxtUsuarioPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 220, -1));

        CbxUsuarioTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Administrador", "Usuario" }));
        fondo.add(CbxUsuarioTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 130, 30));

        NombreRegristro4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro4.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro4.setText("Confirmar Contraseña: ");
        fondo.add(NombreRegristro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioUserActionPerformed

    private void TxtUsuarioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioNombreActionPerformed

    private void BtnUsuarioSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioSalirActionPerformed
            MenuP objMenuP = new MenuP();
           objMenuP.setVisible(true);
           dispose();
    }//GEN-LAST:event_BtnUsuarioSalirActionPerformed

    private void BtnUsuarioRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioRegistrarActionPerformed
        // TODO add your handling code here:

        Login objLogin = new Login();
        LoginDAO objLoginDao = new LoginDAO();

        String pass = new String(TxtUsuarioPassword.getPassword()); //obtengo contraseña
        String passCon = new String(TxtUsuarioNuevaPassword.getPassword());//obtengo confirmacion de contraseña

        if(pass.equals(passCon)){
            
            objLogin.setNombre(TxtUsuarioNombre.getText());
            objLogin.setUser(TxtUsuarioUser.getText());
            objLogin.setClave(TxtUsuarioPassword.getText());
            objLogin.setUsuarioTipo(CbxUsuarioTipo.getSelectedItem().toString());
            
            objLoginDao.RegistrarUsuario(objLogin);
            
             JOptionPane.showMessageDialog(null, "El usuario ha sido Registrado");
            
            
            
        }//fin if validar password
        
        else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }//fin else validar password
        
            
       
    }//GEN-LAST:event_BtnUsuarioRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUsuarioRegistrar;
    private javax.swing.JButton BtnUsuarioSalir;
    private javax.swing.JComboBox<String> CbxUsuarioTipo;
    private javax.swing.JLabel NombreRegristro;
    private javax.swing.JLabel NombreRegristro2;
    private javax.swing.JLabel NombreRegristro3;
    private javax.swing.JLabel NombreRegristro4;
    private javax.swing.JTextField TxtUsuarioNombre;
    private javax.swing.JPasswordField TxtUsuarioNuevaPassword;
    private javax.swing.JPasswordField TxtUsuarioPassword;
    private javax.swing.JTextField TxtUsuarioUser;
    private javax.swing.JLabel UsuarioRegristro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel xxx;
    // End of variables declaration//GEN-END:variables
}
