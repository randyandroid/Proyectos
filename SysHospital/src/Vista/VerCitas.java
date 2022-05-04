
package Vista;


import Modelo.CitasDAO;
import Modelo.Citas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Matias
 */
public class VerCitas extends javax.swing.JPanel {

    Citas objCitas = new Citas();
    CitasDAO objCitasDAO = new CitasDAO();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    TableRowSorter TrsBuscar;
    

    public VerCitas() {
        initComponents();
        ListarCitas();
    }

    public void ListarCitas(){
        
        List<Citas> objCitaLista = objCitasDAO.ListarCita();
        ModeloTabla = (DefaultTableModel) TablaCita.getModel();
        Object[] obj = new Object[12];
        
        for(int i=0; i<objCitaLista.size(); i++){
            
            obj[0] = objCitaLista.get(i).getId();
            obj[1] = objCitaLista.get(i).getNombre();
            obj[2] = objCitaLista.get(i).getApellido();
            obj[3] = objCitaLista.get(i).getCedula();
            obj[4] = objCitaLista.get(i).getTelefono();
            obj[5] = objCitaLista.get(i).getEdad();
            obj[6] = objCitaLista.get(i).getSexo();
            obj[7] = objCitaLista.get(i).getFecha();
            obj[8] = objCitaLista.get(i).getJornada();
            obj[9] = objCitaLista.get(i).getHora();
            obj[10] = objCitaLista.get(i).getTipo();
            obj[11] = objCitaLista.get(i).getMedico();
            
            
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
        BHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bcita = new javax.swing.JTextField();
        Bfecha = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 550));

        TablaCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Cedula", "Telefono", "Edad", "Sexo", "Fecha", "Jornada", "Hora", "Cita", "Medico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCita);

        BHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHoraActionPerformed(evt);
            }
        });
        BHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BHoraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BHoraKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hora:");

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

        Bfecha.setText("aa-mm-dd");
        Bfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BfechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(177, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Bfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BHora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BHoraActionPerformed

    private void BHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BHoraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BHoraKeyPressed

    private void BHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BHoraKeyTyped
        // TODO add your handling code here:

        BHora.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {

                TrsBuscar.setRowFilter(RowFilter.regexFilter(BHora.getText(), 9));
               

            }

        } );

        TrsBuscar = new TableRowSorter(ModeloTabla);
        TablaCita.setRowSorter(TrsBuscar);
    }//GEN-LAST:event_BHoraKeyTyped

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

               TrsBuscar.setRowFilter(RowFilter.regexFilter(Bcita.getText(), 1,3));
              

            }

        } );

        TrsBuscar = new TableRowSorter(ModeloTabla);
        TablaCita.setRowSorter(TrsBuscar);
        
    }//GEN-LAST:event_BcitaKeyTyped

    private void BfechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BfechaKeyTyped
        // TODO add your handling code here:
        
        Bfecha.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {

                TrsBuscar.setRowFilter(RowFilter.regexFilter(Bfecha.getText(), 7));
               

            }

        } );

        TrsBuscar = new TableRowSorter(ModeloTabla);
        TablaCita.setRowSorter(TrsBuscar);
    }//GEN-LAST:event_BfechaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BHora;
    private javax.swing.JTextField Bcita;
    private javax.swing.JTextField Bfecha;
    private javax.swing.JTable TablaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
