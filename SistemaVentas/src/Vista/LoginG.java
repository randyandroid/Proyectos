
package Vista;

import Modelo.LoginDAO;
import Modelo.Login;
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
              
              SistemaG objSistemaG = new SistemaG();
              objSistemaG.setVisible(true);
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

        PanelLogin = new javax.swing.JPanel();
        LabelIniciarIMG = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelClave = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TXtClave = new javax.swing.JPasswordField();
        BtnIniciarLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        LabelFondoIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        LabelIniciarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iniciar.png"))); // NOI18N

        LabelTitulo.setBackground(new java.awt.Color(0, 51, 153));
        LabelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 51, 204));
        LabelTitulo.setText("B I E N V E N I D O");

        LabelUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(0, 51, 204));
        LabelUsuario.setText("USUARIO:");

        LabelClave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelClave.setForeground(new java.awt.Color(0, 51, 204));
        LabelClave.setText("CLAVE:");

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        BtnIniciarLog.setBackground(new java.awt.Color(0, 51, 204));
        BtnIniciarLog.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnIniciarLog.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciarLog.setText("I N I C I A R");
        BtnIniciarLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarLogActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Randy Dev, todos los derechos reservados 2021");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addComponent(LabelUsuario)
                                .addGap(7, 7, 7)
                                .addComponent(LabelIniciarIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(BtnIniciarLog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(LabelIniciarIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnIniciarLog, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 280, 400));

        PanelPrincipal.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        LabelFondoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.jpg"))); // NOI18N
        getContentPane().add(LabelFondoIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 0, 260, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnIniciarLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarLogActionPerformed
        // TODO add your handling code here:
        
        ValidarInicio();
        
    }//GEN-LAST:event_BtnIniciarLogActionPerformed

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
    private javax.swing.JButton BtnIniciarLog;
    private javax.swing.JLabel LabelClave;
    private javax.swing.JLabel LabelFondoIMG;
    private javax.swing.JLabel LabelIniciarIMG;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPasswordField TXtClave;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
