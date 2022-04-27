/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.PacienteDAO;
import Modelo.Paciente;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matias
 */
public class VerPaciente extends javax.swing.JPanel {

  
    PacienteDAO objPacienteDAO = new PacienteDAO();
    
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    public VerPaciente() {
        initComponents();
        
      ListarPaciente();
        
    }
    //fin del constructor
    
 public void ListarPaciente(){
        
        List<Paciente> objPacienteLista = objPacienteDAO.ListarPaciente();
        ModeloTabla = (DefaultTableModel) TablaPaciente.getModel();
        Object[] obj = new Object[9];
        
        for(int i=0; i<objPacienteLista.size(); i++){
            
            obj[0] = objPacienteLista.get(i).getId();
            obj[1] = objPacienteLista.get(i).getCedula();
            obj[2] = objPacienteLista.get(i).getNombre();
            obj[3] = objPacienteLista.get(i).getApellido();
            obj[4] = objPacienteLista.get(i).getTelefono();
            obj[5] = objPacienteLista.get(i).getDireccion();
            obj[6] = objPacienteLista.get(i).getEdad();
            obj[7] = objPacienteLista.get(i).getEstado();
            obj[8] = objPacienteLista.get(i).getSexo();
            
            ModeloTabla.addRow(obj);
            
        }//fin del for
         
        TablaPaciente.setModel(ModeloTabla);
        
    }//fin del metodo
 
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPaciente = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 550));

        TablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cedula", "Nombre", "Apellido", "Telefono", "Domicilio", "Edad", "Estado Civil", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaPaciente);
        if (TablaPaciente.getColumnModel().getColumnCount() > 0) {
            TablaPaciente.getColumnModel().getColumn(0).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(0).setPreferredWidth(200);
            TablaPaciente.getColumnModel().getColumn(1).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(1).setPreferredWidth(500);
            TablaPaciente.getColumnModel().getColumn(2).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(2).setPreferredWidth(400);
            TablaPaciente.getColumnModel().getColumn(3).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(3).setPreferredWidth(400);
            TablaPaciente.getColumnModel().getColumn(4).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(4).setPreferredWidth(400);
            TablaPaciente.getColumnModel().getColumn(5).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(5).setPreferredWidth(500);
            TablaPaciente.getColumnModel().getColumn(6).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(6).setPreferredWidth(300);
            TablaPaciente.getColumnModel().getColumn(7).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(7).setPreferredWidth(600);
            TablaPaciente.getColumnModel().getColumn(8).setResizable(false);
            TablaPaciente.getColumnModel().getColumn(8).setPreferredWidth(300);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
