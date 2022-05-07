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

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 *
 * @author Matias
 */
public class AgendarCitas extends javax.swing.JPanel {

    Paciente objPaciente = new Paciente();
    PacienteDAO objPacienteDAO = new PacienteDAO();
    Citas objCita = new Citas();
   CitasDAO objCitaDAO = new CitasDAO();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
     TableRowSorter TrsBuscar;
   
     
     
    public AgendarCitas() {
        initComponents();
        ListarCitas();
        objPacienteDAO.ConsultarMedicos(CbxMedico);
 
        BuscarCita.setSize(900,400);
        BuscarCita.setLocationRelativeTo(null);
        IdCita.setVisible(false);
    }

    
    public void ListarCitas(){
        
        List<Citas> objCitaLista = objCitaDAO.ListarCita();
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

        BuscarCita = new javax.swing.JDialog();
        Bcita = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCita = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        NombreMedico6 = new javax.swing.JLabel();
        NombreMedico7 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        NombreMedico8 = new javax.swing.JLabel();
        NombreMedico9 = new javax.swing.JLabel();
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
        BotonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        IdCita = new javax.swing.JTextField();

        BuscarCita.setModal(true);

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar:");

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
        TablaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaCitaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCita);

        javax.swing.GroupLayout BuscarCitaLayout = new javax.swing.GroupLayout(BuscarCita.getContentPane());
        BuscarCita.getContentPane().setLayout(BuscarCitaLayout);
        BuscarCitaLayout.setHorizontalGroup(
            BuscarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarCitaLayout.createSequentialGroup()
                .addGroup(BuscarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarCitaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BuscarCitaLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        BuscarCitaLayout.setVerticalGroup(
            BuscarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarCitaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(BuscarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

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

        NombreMedico9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreMedico9.setForeground(new java.awt.Color(0, 0, 0));
        NombreMedico9.setText("Tipo de cita : ");

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

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
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

        BotonAgregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarGrande.png"))); // NOI18N
        BotonAgregar.setContentAreaFilled(false);
        BotonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarP.png"))); // NOI18N
        BotonAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarGrande.png"))); // NOI18N
        BotonAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseExited(evt);
            }
        });
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarG.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarP.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarG.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarG.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarP.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarG.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        IdCita.setEditable(false);
        IdCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreMedico7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreMedico15)
                            .addComponent(NombreMedico6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(Nombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(NombreMedico8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(CbxCita, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(NombreMedico11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36)
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
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreMedico6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreMedico9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbxCita, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreMedico15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreMedico10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(317, 317, 317))
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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       BuscarCita.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void TablaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitaMouseClicked
        // TODO add your handling code here:
        
         int ValorTabla = TablaCita.rowAtPoint(evt.getPoint());
        
        IdCita.setText(TablaCita.getValueAt(ValorTabla, 0).toString());
        TxtNombre.setText(TablaCita.getValueAt(ValorTabla, 1).toString());
        TxtApellido.setText(TablaCita.getValueAt(ValorTabla, 2).toString());
        TxtCedula.setText(TablaCita.getValueAt(ValorTabla, 3).toString());
        TxtTelefono.setText(TablaCita.getValueAt(ValorTabla, 4).toString());
       TxtEdad.setText(TablaCita.getValueAt(ValorTabla, 5).toString());
       CbxSexo.setSelectedItem(TablaCita.getValueAt(ValorTabla, 6).toString());
       FechaCita.setDateFormatString(TablaCita.getValueAt(ValorTabla, 7).toString());
        CbxJornada.setSelectedItem(TablaCita.getValueAt(ValorTabla, 8).toString()); 
        TxtHora.setText(TablaCita.getValueAt(ValorTabla, 9).toString());
        CbxCita.setSelectedItem(TablaCita.getValueAt(ValorTabla, 10).toString());
        CbxMedico.setSelectedItem(TablaCita.getValueAt(ValorTabla, 11).toString());
         
        
    }//GEN-LAST:event_TablaCitaMouseClicked

    private void TablaCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaCitaMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
         int Afecha;
        int Mfecha;
        int Dfecha;

        Afecha = FechaCita.getCalendar().get(Calendar.YEAR);
        Mfecha = FechaCita.getCalendar().get(Calendar.MONTH)+1;
        Dfecha = FechaCita.getCalendar().get(Calendar.DAY_OF_MONTH);

        String NfechaCita = Afecha+ "-"+Mfecha+ "-"+Dfecha;
        
            
            if(!"".equals(IdCita.getText()) || !"".equals( TxtNombre.getText()) || !"".equals(TxtApellido.
                    getText()) || !"".equals(TxtCedula.getText())  || !"".equals(TxtTelefono.getText()) || !"".equals(TxtEdad.getText()) || !"".equals(CbxSexo.
                    getSelectedIndex()) || !"".equals(FechaCita.getDate()) || !"".equals(CbxJornada.getSelectedIndex())   || !"".equals(TxtHora.
                            getText()) || !"".equals(CbxMedico.getSelectedIndex()) || !"".equals(CbxCita.getSelectedIndex())){
                
                
                
                objCita.setNombre(TxtNombre.getText());
                objCita.setApellido(TxtApellido.getText());
                objCita.setCedula(TxtCedula.getText());
                objCita.setTelefono(TxtTelefono.getText());
                objCita.setEdad(Integer.parseInt(TxtEdad.getText()));
                objCita.setSexo(CbxSexo.getSelectedItem().toString()); 
                objCita.setFecha(NfechaCita);
                objCita.setJornada(CbxJornada.getSelectedItem().toString());
                objCita.setHora(TxtHora.getText()); 
                objCita.setTipo(CbxCita.getSelectedItem().toString());
                objCita.setMedico(CbxMedico.getSelectedItem().toString());
                
                
                
             
                objCitaDAO.ModificarCita(objCita);
                JOptionPane.showMessageDialog(null, "La cita fue cambiada");
            
           
            }//fin del if
            
            else{
                
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
                
            }//fin del else
            
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setText("");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
         jButton1.setText("Buscar Cita");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setText("");
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
         jButton2.setText("Editar Cambios");
    }//GEN-LAST:event_jButton2MouseEntered

    private void BotonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseExited
       BotonAgregar.setText("");
    }//GEN-LAST:event_BotonAgregarMouseExited

    private void BotonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseEntered
         BotonAgregar.setText("Guardar");
    }//GEN-LAST:event_BotonAgregarMouseEntered

    private void IdCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCitaActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Bcita;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JDialog BuscarCita;
    private javax.swing.JComboBox<String> CbxCita;
    private javax.swing.JComboBox<String> CbxJornada;
    private javax.swing.JComboBox<String> CbxMedico;
    private javax.swing.JComboBox<String> CbxSexo;
    private com.toedter.calendar.JDateChooser FechaCita;
    private javax.swing.JTextField IdCita;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel NombreMedico10;
    private javax.swing.JLabel NombreMedico11;
    private javax.swing.JLabel NombreMedico13;
    private javax.swing.JLabel NombreMedico14;
    private javax.swing.JLabel NombreMedico15;
    private javax.swing.JLabel NombreMedico6;
    private javax.swing.JLabel NombreMedico7;
    private javax.swing.JLabel NombreMedico8;
    private javax.swing.JLabel NombreMedico9;
    private javax.swing.JTable TablaCita;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtHora;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
