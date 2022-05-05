/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.PacienteDAO;
import Modelo.Paciente;
import Modelo.Citas;
import Modelo.CitasDAO;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class AgendarCitas extends javax.swing.JPanel {

    Paciente objPaciente = new Paciente();
    PacienteDAO objPacienteDAO = new PacienteDAO();
    Citas objCita = new Citas();
   CitasDAO objCitaDAO = new CitasDAO();
   
    
   
    
    /**
     * Creates new form Medico
     */
    public AgendarCitas() {
        initComponents();
        
        
        objPacienteDAO.ConsultarMedicos(CbxMedico);
        BotonAgregar.setCursor(new Cursor(HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JornadaMedico = new javax.swing.JComboBox<>();
        NombreMedico12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        NombreMedico6 = new javax.swing.JLabel();
        NombreMedico7 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        NombreMedico8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NombreMedico9 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        NombreMedico11 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtCedula = new javax.swing.JTextField();
        FechaCita = new com.toedter.calendar.JDateChooser();
        NombreMedico10 = new javax.swing.JLabel();
        CbxSexo = new javax.swing.JComboBox<>();
        CbxMedico = new javax.swing.JComboBox<>();
        CbxCita = new javax.swing.JComboBox<>();
        CbxJornada = new javax.swing.JComboBox<>();
        NombreMedico13 = new javax.swing.JLabel();
        NombreMedico14 = new javax.swing.JLabel();
        TxtHora = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JLabel();
        NombreMedico15 = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();

        JornadaMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Matutina", "Vespertina", "Noctura" }));

        NombreMedico12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico12.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico12.setText("Jornada");

        setPreferredSize(new java.awt.Dimension(1070, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 550));

        Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre : ");

        Apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Apellido.setForeground(new java.awt.Color(0, 0, 0));
        Apellido.setText("Apellido :");

        NombreMedico6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico6.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico6.setText("Teléfono :");

        NombreMedico7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico7.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico7.setText("Cédula :");

        TxtApellido.setEditable(false);

        TxtTelefono.setEditable(false);

        NombreMedico8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico8.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico8.setText("Fecha de cita : ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Citasicono.png"))); // NOI18N

        NombreMedico9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico9.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico9.setText("Tipo de cita : ");

        BotonAgregar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(51, 51, 51));
        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        NombreMedico11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico11.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico11.setText("Sexo :");

        TxtNombre.setEditable(false);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtCedula.setEditable(false);
        TxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaActionPerformed(evt);
            }
        });

        NombreMedico10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico10.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico10.setText("Médico :");

        CbxSexo.setEditable(true);
        CbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));

        CbxMedico.setEditable(true);
        CbxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));

        CbxCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Primera Vez", "Rutinaria", "Por Enfermedad", "Emision de Recetas", "Emision de Resultados" }));
        CbxCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCitaActionPerformed(evt);
            }
        });

        CbxJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Matutina", "Vespertina", "Noctura" }));

        NombreMedico13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico13.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico13.setText("Jornada :");

        NombreMedico14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico14.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico14.setText("Hora:");

        TxtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        Nombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        Nombre1.setText("Buscar Paciente:");

        NombreMedico15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico15.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico15.setText("Edad:");

        TxtEdad.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreMedico7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(NombreMedico6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)))
                            .addComponent(NombreMedico15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(NombreMedico11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(316, 316, 316)
                                    .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NombreMedico13))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                            .addComponent(NombreMedico9))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NombreMedico10)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CbxJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NombreMedico14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtHora))
                                            .addComponent(CbxCita, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(NombreMedico8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(Nombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreMedico11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreMedico8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreMedico7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreMedico13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbxJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreMedico14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreMedico6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreMedico9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxCita))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreMedico15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreMedico10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                                .addComponent(BotonAgregar)
                                .addGap(184, 184, 184))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){

            if(!"".equals(txtBuscar.getText())){

                String Cpaciente = txtBuscar.getText();
                objPaciente = objPacienteDAO.BuscarPaciente(Cpaciente);

                if(objPaciente.getNombre() != null){

                    TxtNombre.setText("" +objPaciente.getNombre());
                    TxtApellido.setText("" +objPaciente.getApellido());
                    TxtCedula.setText("" +objPaciente.getCedula());
                    TxtTelefono.setText("" +objPaciente.getTelefono());
                    CbxSexo.setSelectedItem("" +objPaciente.getSexo());
                    TxtEdad.setText(""+objPaciente.getEdad());

                }else{

                    TxtNombre.setText("");
                    TxtApellido.setText("");
                    TxtCedula.setText("");
                    TxtTelefono.setText("");
                    TxtEdad.setText("");

                }//fin if else

            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el Codigo, La Cedula, o el Nombre para Agregar Paciente");

            }//fin if else

        }//fin del if

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void TxtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraActionPerformed

    private void CbxCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxCitaActionPerformed

    private void TxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:

        int Afecha;
        int Mfecha;
        int Dfecha;

        Afecha = FechaCita.getCalendar().get(Calendar.YEAR);
        Mfecha = FechaCita.getCalendar().get(Calendar.MONTH)+1;
        Dfecha = FechaCita.getCalendar().get(Calendar.DAY_OF_MONTH);

        String NfechaCita = Afecha+ "-"+Mfecha+ "-"+Dfecha;

        if (!"".equals(TxtNombre.getText()) && !"".equals(TxtApellido.getText()) && !"".equals(TxtCedula.getText()) && !"".equals(TxtTelefono.getText()) && !"".equals(FechaCita.getDate()) && !"".equals(CbxCita.getSelectedItem()) && !"".equals(CbxJornada.getSelectedItem()) && !"".equals(CbxSexo.getSelectedItem()) && !"".equals(TxtHora.getText()) && !"".equals(CbxMedico.getSelectedItem()) ) {

            objCita.setNombre(TxtNombre.getText());
            objCita.setApellido(TxtApellido.getText());
            objCita.setCedula(TxtCedula.getText());
            objCita.setTelefono(TxtTelefono.getText());
            objCita.setEdad(Integer.parseInt(TxtEdad.getText()));
            objCita.setSexo((String) CbxSexo.getSelectedItem());
            objCita.setFecha(NfechaCita);
            objCita.setJornada((String) CbxJornada.getSelectedItem());
            objCita.setHora(TxtHora.getText());
            objCita.setTipo((String) CbxCita.getSelectedItem());
            objCita.setMedico((String) CbxMedico.getSelectedItem());

            objCitaDAO.RegistrarCita(objCita);

            JOptionPane.showMessageDialog(null, "Los Datos de la han sido guardado de manera correcta");

        }//fin del if
        else {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }//fin del else

    }//GEN-LAST:event_BotonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JComboBox<String> CbxCita;
    private javax.swing.JComboBox<String> CbxJornada;
    private javax.swing.JComboBox<String> CbxMedico;
    private javax.swing.JComboBox<String> CbxSexo;
    private com.toedter.calendar.JDateChooser FechaCita;
    private javax.swing.JComboBox<String> JornadaMedico;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel NombreMedico10;
    private javax.swing.JLabel NombreMedico11;
    private javax.swing.JLabel NombreMedico12;
    private javax.swing.JLabel NombreMedico13;
    private javax.swing.JLabel NombreMedico14;
    private javax.swing.JLabel NombreMedico15;
    private javax.swing.JLabel NombreMedico6;
    private javax.swing.JLabel NombreMedico7;
    private javax.swing.JLabel NombreMedico8;
    private javax.swing.JLabel NombreMedico9;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtHora;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
