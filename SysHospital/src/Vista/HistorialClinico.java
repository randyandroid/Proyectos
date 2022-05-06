/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Citas;
import Modelo.CitasDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Matias
 */
public class HistorialClinico extends javax.swing.JPanel {

    
    
    Citas objCitas = new Citas();
    CitasDAO objCitasDAO = new CitasDAO();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    TableRowSorter TrsBuscar;
    
    
    
    public HistorialClinico() {
        initComponents();
        ListarCitas();
    }


     public void ListarCitas(){
        
        List<Citas> objCitaLista = objCitasDAO.ListarCita();
        ModeloTabla = (DefaultTableModel) TablaCita.getModel();
        Object[] obj = new Object[5];
        
        for(int i=0; i<objCitaLista.size(); i++){
            
            obj[0] = objCitaLista.get(i).getNombre();
            obj[1] = objCitaLista.get(i).getApellido();
            obj[2] = objCitaLista.get(i).getFecha();
            obj[3] = objCitaLista.get(i).getTipo();
            obj[4] = objCitaLista.get(i).getMedico();
     
            
            
            ModeloTabla.addRow(obj);
            
        }//fin del for
         
        TablaCita.setModel(ModeloTabla);
        
    }//fin del metodo
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCita = new javax.swing.JTable();
        Bcita = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 550));

        TablaCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Ultima Cita", "Razon ", "Medico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCita);

        Bcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcitaActionPerformed(evt);
            }
        });
        Bcita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BcitaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BcitaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
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

    private void BcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcitaActionPerformed

    private void BcitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcitaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcitaKeyPressed

    private void BcitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcitaKeyTyped
        // TODO add your handling code here:

        Bcita.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {

                TrsBuscar.setRowFilter(RowFilter.regexFilter(Bcita.getText(), 0));

            }

        } );

        TrsBuscar = new TableRowSorter(ModeloTabla);
        TablaCita.setRowSorter(TrsBuscar);

    }//GEN-LAST:event_BcitaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bcita;
    private javax.swing.JTable TablaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
