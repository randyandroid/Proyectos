/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Medicos;
import Modelo.MedicoDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TabExpander;

/**
 *
 * @author Matias
 */
public class VerMedico extends javax.swing.JPanel {


    MedicoDAO objMedicoDAO = new MedicoDAO();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    TableRowSorter TrsBuscar;
    
    public VerMedico() {
        initComponents();
        ListarMedico();
        
  }

    public void ListarMedico(){
        
        List<Medicos> objMedicoLista = objMedicoDAO.ListarMedicos();
        ModeloTabla = (DefaultTableModel) TablaMedico.getModel();
        Object[] obj = new Object[10];
        
        for(int i=0; i<objMedicoLista.size(); i++){
            
            obj[0] = objMedicoLista.get(i).getId();
            obj[1] = objMedicoLista.get(i).getCedula();
            obj[2] = objMedicoLista.get(i).getNombre();
            obj[3] = objMedicoLista.get(i).getApellido();
            obj[4] = objMedicoLista.get(i).getTelefono();
            obj[5] = objMedicoLista.get(i).getDomicilio();
            obj[6] = objMedicoLista.get(i).getEstado();
            obj[7] = objMedicoLista.get(i).getSexo();
            obj[8] = objMedicoLista.get(i).getEspecialidad();
            obj[9] = objMedicoLista.get(i).getJornada();
            
            ModeloTabla.addRow(obj);
            
        }//fin del for
         
        TablaMedico.setModel(ModeloTabla);
        
    }//fin del metodo
 
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMedico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BuscarMedico = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 550));

        TablaMedico.setBackground(new java.awt.Color(255, 255, 255));
        TablaMedico.setForeground(new java.awt.Color(0, 0, 0));
        TablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cedula", "Nombre", "Apellido", "Telefono", "Domicilio", "Estado Civil", "Sexo", "Especialidad", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMedico.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TablaMedico);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Medico:");

        BuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMedicoActionPerformed(evt);
            }
        });
        BuscarMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscarMedicoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarMedicoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
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

    private void BuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarMedicoActionPerformed

    private void BuscarMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMedicoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_BuscarMedicoKeyPressed

    private void BuscarMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMedicoKeyTyped
        // TODO add your handling code here:

        BuscarMedico.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {

                TrsBuscar.setRowFilter(RowFilter.regexFilter(BuscarMedico.getText(), 1,2));

            }

        } );

        TrsBuscar = new TableRowSorter(ModeloTabla);
        TablaMedico.setRowSorter(TrsBuscar);

    }//GEN-LAST:event_BuscarMedicoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarMedico;
    private javax.swing.JTable TablaMedico;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
