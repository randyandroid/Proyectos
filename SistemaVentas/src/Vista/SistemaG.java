/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Reportes.Excel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

/**
 *
 * @author adm
 */
public class SistemaG extends javax.swing.JFrame {

    
    //INSTANCIAS & Declaraciones de Variables
    
 
Cliente objCliente = new Cliente();
ClienteDAO objClienteDAO = new ClienteDAO();
Proveedor objProveedor = new Proveedor();
ProveedorDAO objProveedorDAO = new ProveedorDAO();
Producto objProducto = new Producto();
ProductoDAO objProductoDAO = new ProductoDAO();
Clientes oClienteConsulta = new Clientes();

DefaultTableModel ModeloTabla = new DefaultTableModel();
int item;
double TotalPagar = 0.00; 

    public SistemaG() {
        initComponents();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(CbxProductoSuplidor);
        objProductoDAO.ConsultarProveedor(CbxProductoSuplidor);
        
        
    }

    
    public void ListarCliente(){
        
        List<Cliente> objClienteLista = objClienteDAO.ListarCliente();
        ModeloTabla = (DefaultTableModel) TblClientes.getModel();
        Object[] obj = new Object[6];
        
        for(int i=0; i<objClienteLista.size(); i++){
            
            obj[0] = objClienteLista.get(i).getIdCliente();
            obj[1] = objClienteLista.get(i).getClienteCedula();
            obj[2] = objClienteLista.get(i).getClienteNombre();
            obj[3] = objClienteLista.get(i).getClienteApellido();
            obj[4] = objClienteLista.get(i).getClienteDireccion();
            obj[5] = objClienteLista.get(i).getClienteTelefono();
            
            ModeloTabla.addRow(obj);
            
        }//fin del for
         
        TblClientes.setModel(ModeloTabla);
        
    }//fin del metodo
 
    
       public void ListarProveedor(){
        
        List<Proveedor> objProveedorLista = objProveedorDAO.ListarProveedor();
        ModeloTabla = (DefaultTableModel) TblSuplidor.getModel();
        Object[] objx = new Object[5];
        
        for(int i=0; i<objProveedorLista.size(); i++){
            
            objx[0] = objProveedorLista.get(i).getIdProveedor();
            objx[1] = objProveedorLista.get(i).getProveedorRnc();
            objx[2] = objProveedorLista.get(i).getProveedorNombre();
            objx[3] = objProveedorLista.get(i).getProveedorDireccion();
            objx[4] = objProveedorLista.get(i).getProveedorTelefono();
            
            
            ModeloTabla.addRow(objx);
            
        }//fin del for
         
        TblSuplidor.setModel(ModeloTabla);
        
    }//fin del metodo
    
     public void ListarProducto(){
        
        List<Producto> objProductoLista = objProductoDAO.ListarProducto();
        ModeloTabla = (DefaultTableModel) TblProductos.getModel();
        Object[] objy = new Object[7];
        
        for(int i=0; i<objProductoLista.size(); i++){
            
            objy[0] = objProductoLista.get(i).getIdProducto();
            objy[1] = objProductoLista.get(i).getProductoCodigo();
            objy[2] = objProductoLista.get(i).getProductoNombre();
            objy[3] = objProductoLista.get(i).getProductoProveedor();
            objy[4] = objProductoLista.get(i).getProductoCosto();
            objy[5] = objProductoLista.get(i).getProductoPrecio();
            objy[6] = objProductoLista.get(i).getProductoStock();
            
            ModeloTabla.addRow(objy);
            
        }//fin del for
         
        TblProductos.setModel(ModeloTabla);
        
    }//fin del metodo
      
       
       
    
    public void LimpiarTabla(){
        
        for(int i=0; i<ModeloTabla.getRowCount(); i++){
            
            ModeloTabla.removeRow(i);
           
            i = i+1;
            
        }//fin del for
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLateral = new javax.swing.JPanel();
        BtnNuevaVenta = new javax.swing.JButton();
        BtnClientes = new javax.swing.JButton();
        BtnSuplidor = new javax.swing.JButton();
        BtnProductos = new javax.swing.JButton();
        BtnVentas = new javax.swing.JButton();
        BtnInventarios = new javax.swing.JButton();
        BtnConfiguracion = new javax.swing.JButton();
        EncabezadoLabel = new javax.swing.JLabel();
        ContenedorPrincipal = new javax.swing.JTabbedPane();
        PanelFactura = new javax.swing.JPanel();
        LbCodigi = new javax.swing.JLabel();
        LbDescripcion = new javax.swing.JLabel();
        LbCantidad = new javax.swing.JLabel();
        LbPrecio = new javax.swing.JLabel();
        LbInventario = new javax.swing.JLabel();
        BtnEliminarProducto = new javax.swing.JButton();
        TxtCodProdFac = new javax.swing.JTextField();
        TxtDescProdFac = new javax.swing.JTextField();
        TxtCantProdFac = new javax.swing.JTextField();
        TxtPrecProdFac = new javax.swing.JTextField();
        TxtInvProdFac = new javax.swing.JTextField();
        ScrollFactura = new javax.swing.JScrollPane();
        TblFactura = new javax.swing.JTable();
        LbCed = new javax.swing.JLabel();
        LbNombre = new javax.swing.JLabel();
        BtnGuardarFactura = new javax.swing.JButton();
        LbTotalFactura = new javax.swing.JLabel();
        LbTotal = new javax.swing.JLabel();
        TxtClienCedFac = new javax.swing.JTextField();
        TxtNombreClieFac = new javax.swing.JTextField();
        TxtIdProd = new javax.swing.JTextField();
        BuscarProducto = new javax.swing.JButton();
        ContenedorClientes = new javax.swing.JPanel();
        LbCodigoCliente = new javax.swing.JLabel();
        LbRncCliente = new javax.swing.JLabel();
        LbNombreCliente = new javax.swing.JLabel();
        LbDirrCliente = new javax.swing.JLabel();
        LbTelCliente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtCodigoCliente = new javax.swing.JTextField();
        TxtRncCliente = new javax.swing.JTextField();
        TxtApellidoCliente = new javax.swing.JTextField();
        TxtDirrCliente = new javax.swing.JTextField();
        TxtTelCliente = new javax.swing.JTextField();
        ScrollCliente = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        BtnGuardarCliente = new javax.swing.JButton();
        BtnActualizarCliente = new javax.swing.JButton();
        BtnCrearCliente = new javax.swing.JButton();
        BtnEliminarCliente = new javax.swing.JButton();
        LbNombreCliente1 = new javax.swing.JLabel();
        TxtNombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ContenedorProveedor = new javax.swing.JPanel();
        LbRncSup = new javax.swing.JLabel();
        TxtRncSup = new javax.swing.JTextField();
        LbCodigoSup = new javax.swing.JLabel();
        TxtCodigoSup = new javax.swing.JTextField();
        LbNombreSup = new javax.swing.JLabel();
        TxtNombreSup = new javax.swing.JTextField();
        LbDirrSup = new javax.swing.JLabel();
        TxtDirrSup = new javax.swing.JTextField();
        LbTelSup = new javax.swing.JLabel();
        TxtTelefonoSup = new javax.swing.JTextField();
        ScrollSuplidor = new javax.swing.JScrollPane();
        TblSuplidor = new javax.swing.JTable();
        BtnGuardarSup = new javax.swing.JButton();
        BtnActualizarSup = new javax.swing.JButton();
        BtnCrearSup = new javax.swing.JButton();
        BtnEliminarSup = new javax.swing.JButton();
        ContenedorProductos = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        LbDescripcionProducto = new javax.swing.JLabel();
        TxtDescripcionProducto = new javax.swing.JTextField();
        LbCodigoProducto = new javax.swing.JLabel();
        TxtCodigoProd = new javax.swing.JTextField();
        LbSuplidorProducto = new javax.swing.JLabel();
        LbCostoProducto = new javax.swing.JLabel();
        TxtCostoProducto = new javax.swing.JTextField();
        LbPrecioProducto = new javax.swing.JLabel();
        TxtPrecioProd = new javax.swing.JTextField();
        BtnGuardarProducto = new javax.swing.JButton();
        BtnActualizarProducto = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtStockProducto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        TxtidProducto = new javax.swing.JTextField();
        CbxProductoSuplidor = new javax.swing.JComboBox<>();
        ContenedorVentas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TbVentas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TxtIdVen = new javax.swing.JTextField();
        ContenedorConfiguracion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmpresaCorreo = new javax.swing.JTextField();
        EmpresaRNC = new javax.swing.JTextField();
        EmpresaNombre = new javax.swing.JTextField();
        EmpresaDireccion = new javax.swing.JTextField();
        EmpresaTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BtnGuardarConf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLateral.setBackground(new java.awt.Color(0, 51, 204));

        BtnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        BtnNuevaVenta.setText("Nueva Venta");

        BtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clientes.png"))); // NOI18N
        BtnClientes.setText("Clientes");
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnSuplidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        BtnSuplidor.setText("Proveedor");
        BtnSuplidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuplidorActionPerformed(evt);
            }
        });

        BtnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        BtnProductos.setText("Productos");
        BtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductosActionPerformed(evt);
            }
        });

        BtnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/compras.png"))); // NOI18N
        BtnVentas.setText("Ventas");
        BtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentasActionPerformed(evt);
            }
        });

        BtnInventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carrito-de-compras.png"))); // NOI18N
        BtnInventarios.setText("Inventario");

        BtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/config.png"))); // NOI18N
        BtnConfiguracion.setText("Configuracion");
        BtnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSuplidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInventarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(BtnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSuplidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 590));

        EncabezadoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/encabezado.png"))); // NOI18N
        getContentPane().add(EncabezadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 860, 140));

        LbCodigi.setText("CODIGO");
        LbCodigi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LbCodigiFocusGained(evt);
            }
        });

        LbDescripcion.setText("DESCRIPCION");

        LbCantidad.setText("CANTIDAD");

        LbPrecio.setText("PRECIO");

        LbInventario.setText("STOCK");

        BtnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N

        TxtCodProdFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodProdFacActionPerformed(evt);
            }
        });
        TxtCodProdFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCodProdFacKeyPressed(evt);
            }
        });

        TxtDescProdFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescProdFacActionPerformed(evt);
            }
        });

        TxtCantProdFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantProdFacActionPerformed(evt);
            }
        });
        TxtCantProdFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCantProdFacKeyPressed(evt);
            }
        });

        TxtInvProdFac.setEditable(false);
        TxtInvProdFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInvProdFacActionPerformed(evt);
            }
        });

        TblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        ScrollFactura.setViewportView(TblFactura);
        if (TblFactura.getColumnModel().getColumnCount() > 0) {
            TblFactura.getColumnModel().getColumn(0).setPreferredWidth(30);
            TblFactura.getColumnModel().getColumn(1).setPreferredWidth(100);
            TblFactura.getColumnModel().getColumn(2).setPreferredWidth(30);
            TblFactura.getColumnModel().getColumn(3).setPreferredWidth(30);
            TblFactura.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        LbCed.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LbCed.setText("CED/RNC");

        LbNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LbNombre.setText("NOMBRE:");

        BtnGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        BtnGuardarFactura.setText("GUARDAR");

        LbTotalFactura.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LbTotalFactura.setText("RD$: 0.00");

        LbTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LbTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        LbTotal.setText("TOTAL A PAGAR:");

        TxtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdProdActionPerformed(evt);
            }
        });

        BuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        BuscarProducto.setText(" ");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFacturaLayout = new javax.swing.GroupLayout(PanelFactura);
        PanelFactura.setLayout(PanelFacturaLayout);
        PanelFacturaLayout.setHorizontalGroup(
            PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFacturaLayout.createSequentialGroup()
                .addComponent(ScrollFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFacturaLayout.createSequentialGroup()
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(TxtCodProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtDescProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LbCodigi)
                                .addGap(69, 69, 69)
                                .addComponent(LbDescripcion)
                                .addGap(69, 69, 69)))
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addComponent(TxtPrecProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtCantProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFacturaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LbPrecio)
                                .addGap(40, 40, 40)
                                .addComponent(LbCantidad)
                                .addGap(38, 38, 38)))
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtInvProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(LbInventario)))
                        .addGap(141, 141, 141)
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(TxtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelFacturaLayout.createSequentialGroup()
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addComponent(TxtClienCedFac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNombreClieFac, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addComponent(LbCed)
                                .addGap(69, 69, 69)
                                .addComponent(LbNombre)))
                        .addGap(78, 78, 78)
                        .addComponent(BtnGuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LbTotalFactura)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelFacturaLayout.setVerticalGroup(
            PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFacturaLayout.createSequentialGroup()
                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFacturaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnEliminarProducto)
                            .addGroup(PanelFacturaLayout.createSequentialGroup()
                                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LbDescripcion)
                                        .addComponent(LbCantidad)
                                        .addComponent(LbInventario)
                                        .addComponent(LbPrecio))
                                    .addComponent(LbCodigi, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCantProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtInvProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDescProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPrecProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCodProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BuscarProducto))))
                        .addGap(1, 1, 1)
                        .addComponent(ScrollFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbTotal)
                        .addComponent(LbTotalFactura)
                        .addComponent(BtnGuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFacturaLayout.createSequentialGroup()
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNombre)
                            .addComponent(LbCed, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtClienCedFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreClieFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        ContenedorPrincipal.addTab("FACTURA", PanelFactura);

        LbCodigoCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbCodigoCliente.setText("CODIGO:");

        LbRncCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbRncCliente.setText("CED/RNC:");

        LbNombreCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbNombreCliente.setText("NOMBRE:");

        LbDirrCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbDirrCliente.setText("DIRECCION:");

        LbTelCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbTelCliente.setText("TELEFONO:");

        TxtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoClienteActionPerformed(evt);
            }
        });

        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CED/RNC", "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblClientesMouseClicked(evt);
            }
        });
        ScrollCliente.setViewportView(TblClientes);
        if (TblClientes.getColumnModel().getColumnCount() > 0) {
            TblClientes.getColumnModel().getColumn(0).setResizable(false);
            TblClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            TblClientes.getColumnModel().getColumn(1).setResizable(false);
            TblClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            TblClientes.getColumnModel().getColumn(2).setResizable(false);
            TblClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            TblClientes.getColumnModel().getColumn(3).setResizable(false);
            TblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            TblClientes.getColumnModel().getColumn(4).setResizable(false);
            TblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            TblClientes.getColumnModel().getColumn(5).setResizable(false);
            TblClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        BtnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        BtnGuardarCliente.setText("GUARDAR");
        BtnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarClienteActionPerformed(evt);
            }
        });

        BtnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        BtnActualizarCliente.setText("ACTUALIZAR");
        BtnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarClienteActionPerformed(evt);
            }
        });

        BtnCrearCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        BtnCrearCliente.setText("NUEVO");
        BtnCrearCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearClienteActionPerformed(evt);
            }
        });

        BtnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        BtnEliminarCliente.setText("ELIMINAR");
        BtnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarClienteActionPerformed(evt);
            }
        });

        LbNombreCliente1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbNombreCliente1.setText("APELLIDO:");

        TxtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorClientesLayout = new javax.swing.GroupLayout(ContenedorClientes);
        ContenedorClientes.setLayout(ContenedorClientesLayout);
        ContenedorClientesLayout.setHorizontalGroup(
            ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorClientesLayout.createSequentialGroup()
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorClientesLayout.createSequentialGroup()
                                .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbCodigoCliente)
                                    .addComponent(LbRncCliente)
                                    .addComponent(LbNombreCliente))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorClientesLayout.createSequentialGroup()
                                .addComponent(LbDirrCliente)
                                .addGap(18, 18, 18)))
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtRncCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCodigoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDirrCliente)
                            .addComponent(TxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addComponent(LbTelCliente)
                        .addGap(18, 18, 18)
                        .addComponent(TxtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addComponent(LbNombreCliente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(276, 276, 276))))
        );
        ContenedorClientesLayout.setVerticalGroup(
            ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorClientesLayout.createSequentialGroup()
                .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbCodigoCliente)
                            .addComponent(TxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorClientesLayout.createSequentialGroup()
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbRncCliente)
                            .addComponent(TxtRncCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNombreCliente)
                            .addComponent(TxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNombreCliente1)
                            .addComponent(TxtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDirrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbDirrCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTelCliente)
                            .addComponent(TxtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardarCliente)
                            .addComponent(BtnActualizarCliente))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCrearCliente)
                            .addComponent(BtnEliminarCliente)))
                    .addComponent(ScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        ContenedorPrincipal.addTab("CLIENTES", ContenedorClientes);

        LbRncSup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbRncSup.setText("CED/RNC:");

        LbCodigoSup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbCodigoSup.setText("CODIGO:");

        LbNombreSup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbNombreSup.setText("NOMBRE:");

        TxtNombreSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreSupActionPerformed(evt);
            }
        });

        LbDirrSup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbDirrSup.setText("DIRECCION:");

        LbTelSup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbTelSup.setText("TELEFONO:");

        TblSuplidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CED/RNC", "NOMBRE", "DIRECCION", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblSuplidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblSuplidorMouseClicked(evt);
            }
        });
        ScrollSuplidor.setViewportView(TblSuplidor);
        if (TblSuplidor.getColumnModel().getColumnCount() > 0) {
            TblSuplidor.getColumnModel().getColumn(0).setResizable(false);
            TblSuplidor.getColumnModel().getColumn(0).setPreferredWidth(40);
            TblSuplidor.getColumnModel().getColumn(1).setResizable(false);
            TblSuplidor.getColumnModel().getColumn(1).setPreferredWidth(100);
            TblSuplidor.getColumnModel().getColumn(2).setResizable(false);
            TblSuplidor.getColumnModel().getColumn(2).setPreferredWidth(100);
            TblSuplidor.getColumnModel().getColumn(3).setResizable(false);
            TblSuplidor.getColumnModel().getColumn(3).setPreferredWidth(50);
            TblSuplidor.getColumnModel().getColumn(4).setResizable(false);
            TblSuplidor.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        BtnGuardarSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        BtnGuardarSup.setText("GUARDAR");
        BtnGuardarSup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarSupActionPerformed(evt);
            }
        });

        BtnActualizarSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        BtnActualizarSup.setText("ACTUALIZAR");
        BtnActualizarSup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizarSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarSupActionPerformed(evt);
            }
        });

        BtnCrearSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        BtnCrearSup.setText("NUEVO");
        BtnCrearSup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearSupActionPerformed(evt);
            }
        });

        BtnEliminarSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        BtnEliminarSup.setText("ELIMINAR");
        BtnEliminarSup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorProveedorLayout = new javax.swing.GroupLayout(ContenedorProveedor);
        ContenedorProveedor.setLayout(ContenedorProveedorLayout);
        ContenedorProveedorLayout.setHorizontalGroup(
            ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                            .addComponent(LbDirrSup)
                            .addGap(18, 18, 18)
                            .addComponent(TxtDirrSup))
                        .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                            .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbCodigoSup)
                                .addComponent(LbRncSup)
                                .addComponent(LbNombreSup))
                            .addGap(32, 32, 32)
                            .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtRncSup, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNombreSup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCodigoSup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                            .addComponent(LbTelSup)
                            .addGap(18, 18, 18)
                            .addComponent(TxtTelefonoSup, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnGuardarSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCrearSup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnActualizarSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminarSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollSuplidor, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );
        ContenedorProveedorLayout.setVerticalGroup(
            ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbCodigoSup)
                    .addComponent(TxtCodigoSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorProveedorLayout.createSequentialGroup()
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbRncSup)
                            .addComponent(TxtRncSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNombreSup)
                            .addComponent(TxtNombreSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDirrSup)
                            .addComponent(TxtDirrSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTelSup)
                            .addComponent(TxtTelefonoSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardarSup)
                            .addComponent(BtnActualizarSup))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCrearSup)
                            .addComponent(BtnEliminarSup)))
                    .addComponent(ScrollSuplidor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        ContenedorPrincipal.addTab("Proveedores", ContenedorProveedor);

        LbDescripcionProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbDescripcionProducto.setText("DESCRIPCION");

        TxtDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionProductoActionPerformed(evt);
            }
        });

        LbCodigoProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbCodigoProducto.setText("CODIGO:");

        TxtCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoProdActionPerformed(evt);
            }
        });

        LbSuplidorProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbSuplidorProducto.setText("SUPLIDOR");

        LbCostoProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbCostoProducto.setText("COSTO");

        TxtCostoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCostoProductoActionPerformed(evt);
            }
        });

        LbPrecioProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbPrecioProducto.setText("PRECIO");

        TxtPrecioProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioProdActionPerformed(evt);
            }
        });

        BtnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        BtnGuardarProducto.setText("GUARDAR");
        BtnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProductoActionPerformed(evt);
            }
        });

        BtnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        BtnActualizarProducto.setText("ACTUALIZAR");
        BtnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarProductoActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton9.setText("NUEVO");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton10.setText("ELIMINAR");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("INVENTARIO");

        TblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "PROVEEDOR", "COSTO", "PRECIO", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProductosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TblProductos);
        if (TblProductos.getColumnModel().getColumnCount() > 0) {
            TblProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
            TblProductos.getColumnModel().getColumn(1).setPreferredWidth(60);
            TblProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            TblProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
            TblProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
            TblProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
            TblProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excel.png"))); // NOI18N
        jButton1.setText("EXPORTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CbxProductoSuplidor.setEditable(true);
        CbxProductoSuplidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        CbxProductoSuplidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxProductoSuplidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnActualizarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbDescripcionProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbCodigoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbSuplidorProducto, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtDescripcionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TxtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(TxtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(23, 23, 23)
                                                        .addComponent(TxtidProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(CbxProductoSuplidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(BtnGuardarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbCostoProducto)
                                    .addComponent(LbPrecioProducto))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCostoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(TxtPrecioProd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActualizarProducto)
                            .addComponent(jButton1)
                            .addComponent(jButton9)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCodigoProducto)
                            .addComponent(TxtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtidProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDescripcionProducto)
                            .addComponent(TxtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbSuplidorProducto)
                            .addComponent(CbxProductoSuplidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCostoProducto)
                            .addComponent(TxtCostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbPrecioProducto)
                            .addComponent(TxtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardarProducto)
                            .addComponent(jButton10))
                        .addGap(46, 46, 46)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorProductosLayout = new javax.swing.GroupLayout(ContenedorProductos);
        ContenedorProductos.setLayout(ContenedorProductosLayout);
        ContenedorProductosLayout.setHorizontalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ContenedorProductosLayout.setVerticalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ContenedorPrincipal.addTab("PRODUCTOS", ContenedorProductos);

        TbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(TbVentas);
        if (TbVentas.getColumnModel().getColumnCount() > 0) {
            TbVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            TbVentas.getColumnModel().getColumn(1).setPreferredWidth(60);
            TbVentas.getColumnModel().getColumn(2).setPreferredWidth(60);
            TbVentas.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jButton2.setText("EXPORTAR ");

        javax.swing.GroupLayout ContenedorVentasLayout = new javax.swing.GroupLayout(ContenedorVentas);
        ContenedorVentas.setLayout(ContenedorVentasLayout);
        ContenedorVentasLayout.setHorizontalGroup(
            ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorVentasLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorVentasLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIdVen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        ContenedorVentasLayout.setVerticalGroup(
            ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorVentasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(TxtIdVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ContenedorPrincipal.addTab("VENTAS", ContenedorVentas);

        jLabel2.setText("RNC");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("TELEFONO");

        jLabel6.setText("DIRECCION");

        jLabel7.setText("CORREO");

        EmpresaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaCorreoActionPerformed(evt);
            }
        });

        EmpresaDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaDireccionActionPerformed(evt);
            }
        });

        EmpresaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaTelefonoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("DATOS DE LA EMPRESA");

        BtnGuardarConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        BtnGuardarConf.setText("GUARDAR");

        javax.swing.GroupLayout ContenedorConfiguracionLayout = new javax.swing.GroupLayout(ContenedorConfiguracion);
        ContenedorConfiguracion.setLayout(ContenedorConfiguracionLayout);
        ContenedorConfiguracionLayout.setHorizontalGroup(
            ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmpresaRNC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpresaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmpresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenedorConfiguracionLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(BtnGuardarConf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        ContenedorConfiguracionLayout.setVerticalGroup(
            ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorConfiguracionLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(EmpresaRNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorConfiguracionLayout.createSequentialGroup()
                        .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EmpresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(EmpresaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(EmpresaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(EmpresaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(BtnGuardarConf)
                .addGap(32, 32, 32))
        );

        ContenedorPrincipal.addTab("Configuracion", ContenedorConfiguracion);

        getContentPane().add(ContenedorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 840, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        // TODO add your handling code here:
        
        LimpiarTabla();
        ListarCliente();
       ContenedorPrincipal.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnSuplidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuplidorActionPerformed
        // TODO add your handling code here:
        
        
        LimpiarTabla();
        ListarProveedor();
        
       ContenedorPrincipal.setSelectedIndex(2);
        
    }//GEN-LAST:event_BtnSuplidorActionPerformed

    private void BtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductosActionPerformed
        // TODO add your handling code here:
        LimpiarTabla();
        ListarProducto();
        ContenedorPrincipal.setSelectedIndex(3);
        
    }//GEN-LAST:event_BtnProductosActionPerformed

    private void BtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVentasActionPerformed

    private void TxtDescProdFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescProdFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescProdFacActionPerformed

    private void TxtCantProdFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantProdFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantProdFacActionPerformed

    private void TxtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoClienteActionPerformed

    private void TxtNombreSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreSupActionPerformed

    private void BtnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarProductoActionPerformed
        // TODO add your handling code here:
        
        if ("".equals(TxtidProducto.getText())) {
            
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Producto");
            
            
        }//fin del if
        
        else{ 
            
            
            if(!"".equals(TxtCodigoProd.getText()) && !"".equals(TxtDescripcionProducto.getText()) && !"".equals(CbxProductoSuplidor.getSelectedIndex()) && !"".equals(TxtCostoProducto.getText()) && !"".equals(TxtPrecioProd.getText()) && !"".equals(TxtStockProducto.getText()) ){
                
                objProducto.setProductoCodigo(TxtCodigoProd.getText());
                objProducto.setProductoNombre(TxtDescripcionProducto.getText());
                objProducto.setProductoProveedor(CbxProductoSuplidor.getSelectedItem().toString());
                objProducto.setProductoCosto((int) Double.parseDouble(TxtCostoProducto.getText()));
                objProducto.setProductoPrecio((int) Double.parseDouble(TxtPrecioProd.getText()));
                objProducto.setProductoStock(Integer.parseInt(TxtStockProducto.getText()));
                objProducto.setIdProducto(Integer.parseInt(TxtidProducto.getText()));
                
             
                objProductoDAO.ModificarProducto(objProducto);
                
            
            LimpiarTabla();
            ListarProducto();
            LimpiarProducto();
            
            
            }//fin del if
            
            else{
                
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
                
            }//fin del else
            
        }//fin del else
        
        
        
        
        
        
        
    }//GEN-LAST:event_BtnActualizarProductoActionPerformed

    private void TxtCostoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCostoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCostoProductoActionPerformed

    private void TxtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoProdActionPerformed

    private void TxtDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionProductoActionPerformed

    private void TxtPrecioProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioProdActionPerformed

    private void EmpresaCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaCorreoActionPerformed

    private void EmpresaDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaDireccionActionPerformed

    private void EmpresaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaTelefonoActionPerformed

    private void BtnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarClienteActionPerformed
        
        //VALIDO QUE LOS CAMPOS NO ESTEN VACIOS:
        if (!"".equals(TxtRncCliente.getText()) && !"".equals(TxtApellidoCliente.getText()) && !"".equals(TxtDirrCliente.getText()) && !"".equals(TxtTelCliente.getText())) {

            objCliente.setClienteCedula(TxtRncCliente.getText());
            objCliente.setClienteNombre(TxtNombreCliente.getText());
            objCliente.setClienteApellido(TxtApellidoCliente.getText());
            objCliente.setClienteDireccion(TxtDirrCliente.getText());
            objCliente.setClienteTelefono(TxtTelCliente.getText());

            objClienteDAO.RegistrarCliente(objCliente);
              LimpiarTabla();
              ListarCliente();
              LimpiarCliente();
              
              
              
            JOptionPane.showMessageDialog(null, "Los Datos del cliente han sido guardado de manera correcta");

        }//fin del if
        else {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }//fin del else

        
    }//GEN-LAST:event_BtnGuardarClienteActionPerformed

    private void TxtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreClienteActionPerformed

    private void TblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblClientesMouseClicked
        // TODO add your handling code here:
        
        int ValorTabla = TblClientes.rowAtPoint(evt.getPoint());
        
        TxtCodigoCliente.setText(TblClientes.getValueAt(ValorTabla, 0).toString());
        TxtRncCliente.setText(TblClientes.getValueAt(ValorTabla, 1).toString());
        TxtNombreCliente.setText(TblClientes.getValueAt(ValorTabla, 2).toString());
        TxtApellidoCliente.setText(TblClientes.getValueAt(ValorTabla, 3).toString());
        TxtDirrCliente.setText(TblClientes.getValueAt(ValorTabla, 4).toString());
        TxtTelCliente.setText(TblClientes.getValueAt(ValorTabla, 5).toString());
       
    }//GEN-LAST:event_TblClientesMouseClicked

    private void BtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarClienteActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(TxtCodigoCliente.getText())) {
            
            int Confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Borrar este Registro?");
            
            if (Confirmar == 0) {
                
                int id = Integer.parseInt(TxtCodigoCliente.getText());
                objClienteDAO.EliminarCliente(id);
                
                LimpiarTabla();
                ListarCliente();
                LimpiarCliente();
                
            }
            
            
        }
        
    }//GEN-LAST:event_BtnEliminarClienteActionPerformed

    private void BtnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarClienteActionPerformed
        // TODO add your handling code here:
        
        if ("".equals(TxtCodigoCliente.getText())) {
            
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un cliente");
            
            
        }//fin del if
        
        else{ 
            
            
            if(!"".equals(TxtRncCliente.getText()) && !"".equals(TxtNombreCliente.getText()) && !"".equals(TxtApellidoCliente.getText()) && !"".equals(TxtDirrCliente.getText()) && !"".equals(TxtTelCliente.getText()) ){
                
                objCliente.setClienteCedula(TxtRncCliente.getText());
                objCliente.setClienteNombre(TxtNombreCliente.getText());
                objCliente.setClienteApellido(TxtApellidoCliente.getText());
                objCliente.setClienteDireccion(TxtDirrCliente.getText());
                objCliente.setClienteTelefono(TxtTelCliente.getText());
                objCliente.setIdCliente(Integer.parseInt(TxtCodigoCliente.getText()));
                
                
            objClienteDAO.ModificarCliente(objCliente);
            

           
            LimpiarTabla();
            ListarCliente();
            LimpiarCliente();
            
            }//fin del if
            
            else{
                
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
                
            }//fin del else
            
        }//fin del else
        
        
    }//GEN-LAST:event_BtnActualizarClienteActionPerformed

    private void BtnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearClienteActionPerformed
        // TODO add your handling code here:
        
        LimpiarCliente();
    }//GEN-LAST:event_BtnCrearClienteActionPerformed

    private void BtnGuardarSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarSupActionPerformed
        // TODO add your handling code here:
        
        //VALIDO QUE LOS CAMPOS NO ESTEN VACIOS
        
        if(!"".equals(TxtRncSup.getText()) && !"".equals(TxtNombreSup.getText()) && !"".equals(TxtDirrSup.getText()) && !"".equals(TxtTelefonoSup.getText())){
            
            objProveedor.setProveedorRnc(TxtRncSup.getText());
            objProveedor.setProveedorNombre(TxtNombreSup.getText());
            objProveedor.setProveedorDireccion(TxtDirrSup.getText());
            objProveedor.setProveedorTelefono(TxtTelefonoSup.getText());
            
            objProveedorDAO.RegistrarProveedor(objProveedor);
            
            LimpiarTabla();
            ListarProveedor();
            LimpiarProveedor();
           
            
            JOptionPane.showMessageDialog(null,"Los Datos fueron Guardados correctamente");
            
        }else{
            JOptionPane.showMessageDialog(null, "Hay Campos vacios, debe llenar todos los campos");
            
        }//fin del if else
        
        
        
        
    }//GEN-LAST:event_BtnGuardarSupActionPerformed

    private void TblSuplidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblSuplidorMouseClicked
        // TODO add your handling code here:
        
        int ValorTablaSup = TblSuplidor.rowAtPoint(evt.getPoint());
        
        
       TxtCodigoSup.setText(TblSuplidor.getValueAt(ValorTablaSup, 0).toString());
       TxtRncSup.setText(TblSuplidor.getValueAt(ValorTablaSup, 1).toString());
       TxtNombreSup.setText(TblSuplidor.getValueAt(ValorTablaSup, 2).toString());
       TxtDirrSup.setText(TblSuplidor.getValueAt(ValorTablaSup, 3).toString());
       TxtTelefonoSup.setText(TblSuplidor.getValueAt(ValorTablaSup, 4).toString());
        
    }//GEN-LAST:event_TblSuplidorMouseClicked

    private void BtnEliminarSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarSupActionPerformed
        // TODO add your handling code here:
        
     if (!"".equals(TxtCodigoSup.getText())) {
            
            int Confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Borrar este Registro?");
            
            if (Confirmar == 0) {
                
                int id = Integer.parseInt(TxtCodigoSup.getText());
                objProveedorDAO.EliminarProveedor(id);
                
                LimpiarTabla();
                ListarProveedor();
                LimpiarProveedor();
                
                
               
                
            }
            
            
        }
        
        
        
    }//GEN-LAST:event_BtnEliminarSupActionPerformed

    private void BtnCrearSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearSupActionPerformed
        // TODO add your handling code here:
        
        LimpiarProveedor();
    }//GEN-LAST:event_BtnCrearSupActionPerformed

    private void BtnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfiguracionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnConfiguracionActionPerformed

    private void BtnActualizarSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarSupActionPerformed
        // TODO add your handling code here:
        
        if ("".equals(TxtCodigoSup.getText())) {
            
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Proveedor");
            
            
        }//fin del if
        
        else{ 
            
            
            if(!"".equals(TxtRncSup.getText()) && !"".equals(TxtNombreSup.getText()) && !"".equals(TxtDirrSup.getText()) && !"".equals(TxtTelefonoSup.getText())){
                
                objProveedor.setProveedorRnc(TxtRncSup.getText());
                objProveedor.setProveedorNombre(TxtNombreSup.getText());
                objProveedor.setProveedorDireccion(TxtDirrSup.getText());
                objProveedor.setProveedorTelefono(TxtTelefonoSup.getText());        
                objProveedor.setIdProveedor(Integer.parseInt(TxtCodigoSup.getText()));
                
                
            objProveedorDAO.ModificarProveedor(objProveedor);
            
            LimpiarTabla();
            ListarProveedor();
            LimpiarProveedor();
            
            
            }//fin del if
            
            else{
                
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
                
            }//fin del else
            
        }//fin del else
        
        
    }//GEN-LAST:event_BtnActualizarSupActionPerformed

    private void BtnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProductoActionPerformed
        // TODO add your handling code here:
        
          //VALIDO QUE LOS CAMPOS NO ESTEN VACIOS
        
        if(!"".equals(TxtCodigoProd.getText()) && !"".equals(TxtDescripcionProducto.getText()) && !"".equals(CbxProductoSuplidor.getSelectedItem()) && !"".equals(TxtPrecioProd.getText()) && !"".equals(TxtCostoProducto.getText()) && !"".equals(TxtStockProducto.getText())){
            
            objProducto.setProductoCodigo(TxtCodigoProd.getText());
            objProducto.setProductoNombre(TxtDescripcionProducto.getText());
            objProducto.setProductoCosto((int) Double.parseDouble(TxtCostoProducto.getText()));
            objProducto.setProductoPrecio((int) Double.parseDouble(TxtPrecioProd.getText()));
            objProducto.setProductoStock(Integer.parseInt(TxtStockProducto.getText()));
            objProducto.setProductoProveedor(CbxProductoSuplidor.getSelectedItem().toString());
            
           
            
            objProductoDAO.RegistrarProducto(objProducto);
            
            LimpiarTabla();
           ListarProducto();
           LimpiarProducto();
           
            
            JOptionPane.showMessageDialog(null,"Los Datos fueron Guardados correctamente");
            
        }else{
            JOptionPane.showMessageDialog(null, "Hay Campos vacios, debe llenar todos los campos");
            
        }//fin del if else
        
        
        
        
    }//GEN-LAST:event_BtnGuardarProductoActionPerformed

    private void TblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProductosMouseClicked
        // TODO add your handling code here:
        
        
         int ValorTablaProd = TblProductos.rowAtPoint(evt.getPoint());
        
        
       TxtidProducto.setText(TblProductos.getValueAt(ValorTablaProd, 0).toString());
       TxtCodigoProd.setText(TblProductos.getValueAt(ValorTablaProd, 1).toString());
       TxtDescripcionProducto.setText(TblProductos.getValueAt(ValorTablaProd, 2).toString());
       CbxProductoSuplidor.setSelectedItem(TblProductos.getValueAt(ValorTablaProd, 3).toString());
       TxtCostoProducto.setText(TblProductos.getValueAt(ValorTablaProd, 4).toString());
       TxtPrecioProd.setText(TblProductos.getValueAt(ValorTablaProd, 5).toString());
       TxtStockProducto.setText(TblProductos.getValueAt(ValorTablaProd,6).toString());
        
                                           

        
        
        
    }//GEN-LAST:event_TblProductosMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(TxtidProducto.getText())) {
            
            int Confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Borrar este Registro?");
            
            if (Confirmar == 0) {
                
                int id = Integer.parseInt(TxtidProducto.getText());
                objProductoDAO.EliminarProducto(id);
                
                LimpiarTabla();
                ListarProducto();
                ListarProducto();
                              
               
             
            }
            
            
        
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        LimpiarProducto();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        Excel.reporte();
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtCodProdFacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodProdFacKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
            
            if(!"".equals(TxtCodProdFac.getText())){
                
                String Cproducto = TxtCodProdFac.getText();
                objProducto = objProductoDAO.BuscarProducto(Cproducto);
                
                 if(objProducto.getProductoNombre() != null){
                
                TxtDescProdFac.setText("" +objProducto.getProductoNombre());
                TxtPrecProdFac.setText("" +objProducto.getProductoPrecio());
                TxtInvProdFac.setText("" +objProducto.getProductoStock());
                TxtCantProdFac.requestFocus();
               
            }else{
                
                TxtDescProdFac.setText("");
                TxtPrecProdFac.setText("");
                TxtInvProdFac.setText("");
                TxtCodProdFac.requestFocus();
                
            }//fin if else
                
                
            }else{
                    JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto para agregarlo a la factura");
                    TxtCodProdFac.requestFocus();
                    
       }//fin if else
           
            
        }//fin del if
        
        
    }//GEN-LAST:event_TxtCodProdFacKeyPressed

    private void TxtCodProdFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodProdFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodProdFacActionPerformed

    private void TxtCantProdFacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantProdFacKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            if(!"".equals(TxtCantProdFac.getText())){
                
                String Codigo = TxtCodProdFac.getText();
                String Descripcion = TxtDescProdFac.getText();
                int Cantidad = Integer.parseInt(TxtCantProdFac.getText());
                double Precio = Double.parseDouble(TxtPrecProdFac.getText());
                double Total = Cantidad*Precio;
                int Stock = Integer.parseInt(TxtInvProdFac.getText());
                
                if(Stock >= Cantidad && Cantidad >0){
                    
                    item = item+1;
                    ModeloTabla = (DefaultTableModel) TblFactura.getModel();
                   
                    ArrayList ListaArticulos = new ArrayList();
                    
                    ListaArticulos.add(item);
                    ListaArticulos.add(Codigo);
                    ListaArticulos.add(Descripcion);
                    ListaArticulos.add(Cantidad);
                    ListaArticulos.add(Precio);
                    ListaArticulos.add(Total);
                    
                    Object[] oFactura = new Object[5];
                    
                    oFactura[0] = ListaArticulos.get(1);
                    oFactura[1] = ListaArticulos.get(2);
                    oFactura[2] = ListaArticulos.get(3);
                    oFactura[3] = ListaArticulos.get(4);
                    oFactura[4] = ListaArticulos.get(5);
                    
                    ModeloTabla.addRow(oFactura);
                    TblFactura.setModel(ModeloTabla);
                    Total_a_Pagar();
                    LimpilarFactura();
                    TxtCodProdFac.requestFocus();
                    
                    for(int i=0; i<TbVentas.getRowCount(); i++){
                        
                        
                        if(TblFactura.getValueAt(i, 1).equals(TxtDescProdFac.getText())){
                            
                                    JOptionPane.showMessageDialog(null, "El Articulo ya fue agregado a la factura");
                                    
                                   return;
                            
                        }//fin de la validacion de si existe el producto
                        
                    }//fin del ciclo
                    
                }//fin de la validacion del stock
                else{
                    JOptionPane.showMessageDialog(null, "No tiene Existencia suficiente, Stock Disponible: "+Stock);
                }
                
            }//fin de la validacion del campo vacio
            else{
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
            }
            
        }//fin de la validacion de la tecla
        
    }//GEN-LAST:event_TxtCantProdFacKeyPressed

    private void LbCodigiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LbCodigiFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCodigiFocusGained

    private void TxtIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdProdActionPerformed

    private void TxtInvProdFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInvProdFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInvProdFacActionPerformed

    private void CbxProductoSuplidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxProductoSuplidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxProductoSuplidorActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
        // TODO add your handling code here:
        
        Articulos oArticuloConsulta = new Articulos();
        oArticuloConsulta.setVisible(true);
        oArticuloConsulta.setLocationRelativeTo(null);
    }//GEN-LAST:event_BuscarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarCliente;
    private javax.swing.JButton BtnActualizarProducto;
    private javax.swing.JButton BtnActualizarSup;
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnConfiguracion;
    private javax.swing.JButton BtnCrearCliente;
    private javax.swing.JButton BtnCrearSup;
    private javax.swing.JButton BtnEliminarCliente;
    private javax.swing.JButton BtnEliminarProducto;
    private javax.swing.JButton BtnEliminarSup;
    private javax.swing.JButton BtnGuardarCliente;
    private javax.swing.JButton BtnGuardarConf;
    private javax.swing.JButton BtnGuardarFactura;
    private javax.swing.JButton BtnGuardarProducto;
    private javax.swing.JButton BtnGuardarSup;
    private javax.swing.JButton BtnInventarios;
    private javax.swing.JButton BtnNuevaVenta;
    private javax.swing.JButton BtnProductos;
    private javax.swing.JButton BtnSuplidor;
    private javax.swing.JButton BtnVentas;
    private javax.swing.JButton BuscarProducto;
    private javax.swing.JComboBox<String> CbxProductoSuplidor;
    private javax.swing.JPanel ContenedorClientes;
    private javax.swing.JPanel ContenedorConfiguracion;
    private javax.swing.JTabbedPane ContenedorPrincipal;
    private javax.swing.JPanel ContenedorProductos;
    private javax.swing.JPanel ContenedorProveedor;
    private javax.swing.JPanel ContenedorVentas;
    private javax.swing.JTextField EmpresaCorreo;
    private javax.swing.JTextField EmpresaDireccion;
    private javax.swing.JTextField EmpresaNombre;
    private javax.swing.JTextField EmpresaRNC;
    private javax.swing.JTextField EmpresaTelefono;
    private javax.swing.JLabel EncabezadoLabel;
    private javax.swing.JLabel LbCantidad;
    private javax.swing.JLabel LbCed;
    private javax.swing.JLabel LbCodigi;
    private javax.swing.JLabel LbCodigoCliente;
    private javax.swing.JLabel LbCodigoProducto;
    private javax.swing.JLabel LbCodigoSup;
    private javax.swing.JLabel LbCostoProducto;
    private javax.swing.JLabel LbDescripcion;
    private javax.swing.JLabel LbDescripcionProducto;
    private javax.swing.JLabel LbDirrCliente;
    private javax.swing.JLabel LbDirrSup;
    private javax.swing.JLabel LbInventario;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbNombreCliente;
    private javax.swing.JLabel LbNombreCliente1;
    private javax.swing.JLabel LbNombreSup;
    private javax.swing.JLabel LbPrecio;
    private javax.swing.JLabel LbPrecioProducto;
    private javax.swing.JLabel LbRncCliente;
    private javax.swing.JLabel LbRncSup;
    private javax.swing.JLabel LbSuplidorProducto;
    private javax.swing.JLabel LbTelCliente;
    private javax.swing.JLabel LbTelSup;
    private javax.swing.JLabel LbTotal;
    private javax.swing.JLabel LbTotalFactura;
    private javax.swing.JPanel PanelFactura;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JScrollPane ScrollCliente;
    private javax.swing.JScrollPane ScrollFactura;
    private javax.swing.JScrollPane ScrollSuplidor;
    private javax.swing.JTable TbVentas;
    private javax.swing.JTable TblClientes;
    private javax.swing.JTable TblFactura;
    private javax.swing.JTable TblProductos;
    private javax.swing.JTable TblSuplidor;
    private javax.swing.JTextField TxtApellidoCliente;
    private javax.swing.JTextField TxtCantProdFac;
    private javax.swing.JTextField TxtClienCedFac;
    public static javax.swing.JTextField TxtCodProdFac;
    private javax.swing.JTextField TxtCodigoCliente;
    private javax.swing.JTextField TxtCodigoProd;
    private javax.swing.JTextField TxtCodigoSup;
    private javax.swing.JTextField TxtCostoProducto;
    public static javax.swing.JTextField TxtDescProdFac;
    private javax.swing.JTextField TxtDescripcionProducto;
    private javax.swing.JTextField TxtDirrCliente;
    private javax.swing.JTextField TxtDirrSup;
    private javax.swing.JTextField TxtIdProd;
    private javax.swing.JTextField TxtIdVen;
    public static javax.swing.JTextField TxtInvProdFac;
    private javax.swing.JTextField TxtNombreClieFac;
    private javax.swing.JTextField TxtNombreCliente;
    private javax.swing.JTextField TxtNombreSup;
    public static javax.swing.JTextField TxtPrecProdFac;
    private javax.swing.JTextField TxtPrecioProd;
    private javax.swing.JTextField TxtRncCliente;
    private javax.swing.JTextField TxtRncSup;
    private javax.swing.JTextField TxtStockProducto;
    private javax.swing.JTextField TxtTelCliente;
    private javax.swing.JTextField TxtTelefonoSup;
    private javax.swing.JTextField TxtidProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables


    
    private void LimpiarCliente(){
        
        TxtCodigoCliente.setText("");
        TxtRncCliente.setText("");
        TxtNombreCliente.setText("");
        TxtApellidoCliente.setText("");
        TxtDirrCliente.setText("");
        TxtTelCliente.setText("");
        
        
    }

private void LimpiarProveedor(){
        
        TxtCodigoSup.setText("");
        TxtRncSup.setText("");
        TxtNombreSup.setText("");
        TxtDirrSup.setText("");
        TxtTelefonoSup.setText("");
       
       
    }  


private void LimpiarProducto(){
    
    TxtidProducto.setText("");
    TxtCodigoProd.setText("");
    TxtDescripcionProducto.setText("");
    TxtCostoProducto.setText("");
    TxtPrecioProd.setText("");
    TxtStockProducto.setText("");
    CbxProductoSuplidor.setSelectedItem("");
    
}

private void Total_a_Pagar(){
    
    TotalPagar = 0.00;
    int NumeroArticulos = TblFactura.getRowCount();
    
  for(int i=0; i<NumeroArticulos; i++){
      
     double Calcular =Double.parseDouble(String.valueOf(TblFactura.getModel().getValueAt(i, 4)));
      
      TotalPagar=TotalPagar+Calcular;
     
  }
  
  LbTotalFactura.setText(String.format("%.2f", TotalPagar));
    
    
}

private void LimpilarFactura(){
    
    TxtCodProdFac.setText("");
    TxtCantProdFac.setText("");
    TxtDescProdFac.setText("");
    TxtInvProdFac.setText("");
    TxtPrecProdFac.setText("");
    
    
}


    
}


