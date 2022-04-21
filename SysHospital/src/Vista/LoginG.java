
package Vista;

import Modelo.LoginDAO;
import Modelo.Login;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class LoginG extends javax.swing.JFrame {


    public LoginG() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
    
    
    public void ValidarInicio(){
        
        String Usuario = TxtUsuario.getText();
        String Clave = String.valueOf(TXtClave.getPassword());

        if (!"".equals(Usuario) || !"".equals(Clave)) {

            Login objLogin = new Login();
            LoginDAO objLoginDAO = new LoginDAO();

           objLogin = objLoginDAO.Iniciar(Usuario, Clave);
           
          if(objLogin.getUser()!= null && objLogin.getClave() != null){
              
              MenuP objMenuP = new MenuP();
              objMenuP.setVisible(true);
              dispose();
              
          }//fin del if 
          else{
              
              JOptionPane.showMessageDialog(null, "Los Datos para el inicio de sesion son incorrectos");
              
          }


           
        }//fin del if
       


    }//fin del metodo


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconoLogin = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LabelClave = new javax.swing.JLabel();
        TXtClave = new javax.swing.JPasswordField();
        BtnIniciarLog = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLogin.png"))); // NOI18N
        getContentPane().add(IconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        LabelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsuario.setText("User:");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 50, 20));

        TxtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 230, 40));

        LabelClave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelClave.setForeground(new java.awt.Color(102, 102, 102));
        LabelClave.setText("Password:");
        getContentPane().add(LabelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 30));

        TXtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXtClaveActionPerformed(evt);
            }
        });
        TXtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXtClaveKeyPressed(evt);
            }
        });
        getContentPane().add(TXtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 230, 40));

        BtnIniciarLog.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnIniciarLog.setForeground(new java.awt.Color(51, 51, 51));
        BtnIniciarLog.setText("Sign in");
        BtnIniciarLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarLogActionPerformed(evt);
            }
        });
        BtnIniciarLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnIniciarLogKeyPressed(evt);
            }
        });
        getContentPane().add(BtnIniciarLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, 40));

        BotonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 51, 0));
        BotonSalir.setText("Exit");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        BotonSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonSalirKeyPressed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginMedicina.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarLogActionPerformed
        // TODO add your handling code here:

        ValidarInicio();

    }//GEN-LAST:event_BtnIniciarLogActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnIniciarLogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnIniciarLogKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIniciarLogKeyPressed

    private void TXtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXtClaveActionPerformed

    private void TXtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXtClaveKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
       
       ValidarInicio();
       
       }
    }//GEN-LAST:event_TXtClaveKeyPressed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
    
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
       
       ValidarInicio();
       
       }

    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonSalirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BtnIniciarLog;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoLogin;
    private javax.swing.JLabel LabelClave;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPasswordField TXtClave;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
