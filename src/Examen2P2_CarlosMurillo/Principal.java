/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2P2_CarlosMurillo;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jafeth
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<String> nombres = new ArrayList();
    
    ArrayList<Carro> carros = new ArrayList();
    

    public Principal() {
        
        initComponents();
        boton.setOpaque(true);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
        
        p_em_crear.setVisible(false);
        p_em_eliminar.setVisible(false);
        
        p_car_crear.setVisible(false);
        p_car_listar.setVisible(false);
        p_car_modificar.setVisible(false);
        
        
        
        cargarempleados();
        cargarcarros();
        
        
        
    }
    
    public void cargarempleados(){
        String archivo2 = "./archivos/Empleados/Nombres.lis";
        Admin_nombres emp2 = new Admin_nombres(archivo2);
        emp2.cargarArchivo();
        nombres = emp2.getLista();
        
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        for (int i = 0; i < nombres.size(); i++) {
            String archivo = "./archivos/Empleados/";
            String nombre = nombres.get(i);
            archivo+=nombre+".emp";
            Admin_Empleados emp = new Admin_Empleados(archivo);
            emp.cargarArchivo();
            Empleado empleado = emp.getEmpleado();
            modelo1.addElement(empleado.getNombre());
        }
        combo_empleados.setModel(modelo1);
        combo_empleado.setModel(modelo1);
    }
    
    public void cargarcarros(){
        String archivo2 = "./archivos/Carros.car";
        Admin_Carros emp2 = new Admin_Carros(archivo2);
        emp2.cargarArchivo();
        carros = emp2.getLista();
        
        tabla_carros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "A??o de fabricacion", "Costo de reparacion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableModel modelo1 = (DefaultTableModel) tabla_carros.getModel();
        for (int i = 0; i < carros.size(); i++) {
            String marca = carros.get(i).getMarca();
            String modelo = carros.get(i).getModelo();
            String estado = carros.get(i).getEstado();
            int a??o = carros.get(i).getA??o();
            int costo = carros.get(i).getCosto();
            Object [] newrow = {marca,modelo,a??o,costo,estado};
            modelo1.addRow(newrow);
        }
        tabla_carros.setModel(modelo1);
        
        tabla_carros2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableModel modelo2 = (DefaultTableModel) tabla_carros2.getModel();
        DefaultTableModel modelo5 = (DefaultTableModel) tabla_carros2.getModel();
        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel();
        DefaultComboBoxModel modelo4 = new DefaultComboBoxModel();
        for (int i = 0; i < carros.size(); i++) {
            int id = i+1;
            String marca = carros.get(i).getMarca();
            String estad = carros.get(i).getEstado();
            if(estad.equals("Reparado")){
                
            }else{
                Object [] newrow = {id,marca};
                modelo2.addRow(newrow);
                modelo3.addElement(id);
            }
            Object [] newrow = {id,marca};
            modelo5.addRow(newrow);
            modelo4.addElement(id);
            
        }
        combo_carro.setModel(modelo3);
        tabla_carros2.setModel(modelo2);
        combo_carro2.setModel(modelo4);
        tabla_carros3.setModel(modelo5);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        panel_empleados = new javax.swing.JPanel();
        p_em_crear = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        t_emp_nom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_emp_edad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        t_emp_identidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        p_em_eliminar = new javax.swing.JPanel();
        combo_empleados = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        p_b_emp_crear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p_b_emp_eliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_carros = new javax.swing.JPanel();
        p_b_car_crear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        p_b_car_modificar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        p_b_car_listar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        p_car_crear = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        t_car_marca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t_car_modelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t_car_fabricacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_car_reparacion = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        p_car_listar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_carros = new javax.swing.JTable();
        p_car_modificar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        t_car_marca2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t_car_modelo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t_car_fabricacion2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        t_car_reparacion2 = new javax.swing.JSpinner();
        combo_carro2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_carros3 = new javax.swing.JTable();
        panel_simulacion = new javax.swing.JPanel();
        combo_empleado = new javax.swing.JComboBox<>();
        combo_carro = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        estado_final = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_carros2 = new javax.swing.JTable();
        barra = new javax.swing.JProgressBar();
        boton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panel_reparaciones = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Nombre");

        t_emp_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_emp_nomActionPerformed(evt);
            }
        });

        jLabel9.setText("Edad");

        jLabel10.setText("Numero de identidad");

        jButton2.setText("Crear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_em_crearLayout = new javax.swing.GroupLayout(p_em_crear);
        p_em_crear.setLayout(p_em_crearLayout);
        p_em_crearLayout.setHorizontalGroup(
            p_em_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_em_crearLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p_em_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(t_emp_nom)
                    .addComponent(t_emp_edad)
                    .addComponent(t_emp_identidad)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        p_em_crearLayout.setVerticalGroup(
            p_em_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_em_crearLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_emp_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_emp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_emp_identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        panel_empleados.add(p_em_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 560, 330));

        jButton1.setText("Eliminar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_em_eliminarLayout = new javax.swing.GroupLayout(p_em_eliminar);
        p_em_eliminar.setLayout(p_em_eliminarLayout);
        p_em_eliminarLayout.setHorizontalGroup(
            p_em_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_em_eliminarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(p_em_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_empleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        p_em_eliminarLayout.setVerticalGroup(
            p_em_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_em_eliminarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(combo_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        panel_empleados.add(p_em_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 560, 330));

        p_b_emp_crear.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Crear");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_b_emp_crearLayout = new javax.swing.GroupLayout(p_b_emp_crear);
        p_b_emp_crear.setLayout(p_b_emp_crearLayout);
        p_b_emp_crearLayout.setHorizontalGroup(
            p_b_emp_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_b_emp_crearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_b_emp_crearLayout.setVerticalGroup(
            p_b_emp_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_b_emp_crearLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_empleados.add(p_b_emp_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 30));

        p_b_emp_eliminar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Eliminar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_b_emp_eliminarLayout = new javax.swing.GroupLayout(p_b_emp_eliminar);
        p_b_emp_eliminar.setLayout(p_b_emp_eliminarLayout);
        p_b_emp_eliminarLayout.setHorizontalGroup(
            p_b_emp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_b_emp_eliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_b_emp_eliminarLayout.setVerticalGroup(
            p_b_emp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_b_emp_eliminarLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_empleados.add(p_b_emp_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 30));

        panel.addTab("Empleados", panel_empleados);

        panel_carros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_b_car_crear.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Crear");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_b_car_crearLayout = new javax.swing.GroupLayout(p_b_car_crear);
        p_b_car_crear.setLayout(p_b_car_crearLayout);
        p_b_car_crearLayout.setHorizontalGroup(
            p_b_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_b_car_crearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_b_car_crearLayout.setVerticalGroup(
            p_b_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_b_car_crearLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_carros.add(p_b_car_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 30));

        p_b_car_modificar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Modificar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_b_car_modificarLayout = new javax.swing.GroupLayout(p_b_car_modificar);
        p_b_car_modificar.setLayout(p_b_car_modificarLayout);
        p_b_car_modificarLayout.setHorizontalGroup(
            p_b_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_b_car_modificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_b_car_modificarLayout.setVerticalGroup(
            p_b_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_b_car_modificarLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_carros.add(p_b_car_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 30));

        p_b_car_listar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Listar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_b_car_listarLayout = new javax.swing.GroupLayout(p_b_car_listar);
        p_b_car_listar.setLayout(p_b_car_listarLayout);
        p_b_car_listarLayout.setHorizontalGroup(
            p_b_car_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_b_car_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_b_car_listarLayout.setVerticalGroup(
            p_b_car_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_b_car_listarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_carros.add(p_b_car_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, 30));

        jLabel11.setText("Marca");

        jLabel12.setText("Modelo");

        jLabel13.setText("A??o de fabricacion");

        jLabel14.setText("Costo de reparacion");

        jButton3.setText("Crear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_car_crearLayout = new javax.swing.GroupLayout(p_car_crear);
        p_car_crear.setLayout(p_car_crearLayout);
        p_car_crearLayout.setHorizontalGroup(
            p_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_crearLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(p_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(t_car_marca)
                    .addComponent(t_car_modelo)
                    .addComponent(t_car_fabricacion)
                    .addComponent(t_car_reparacion, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        p_car_crearLayout.setVerticalGroup(
            p_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_crearLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_car_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_car_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_car_fabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_car_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_car_reparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panel_carros.add(p_car_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, -1, 333));

        jLabel5.setText("Lista de Carros");

        tabla_carros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "A??o de fabricacion", "Costo de reparacion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_carros);

        javax.swing.GroupLayout p_car_listarLayout = new javax.swing.GroupLayout(p_car_listar);
        p_car_listar.setLayout(p_car_listarLayout);
        p_car_listarLayout.setHorizontalGroup(
            p_car_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_listarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_car_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_car_listarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_car_listarLayout.setVerticalGroup(
            p_car_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_listarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_carros.add(p_car_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, -1, 333));

        jLabel15.setText("Marca");

        jLabel16.setText("Modelo");

        jLabel17.setText("A??o de fabricacion");

        jLabel18.setText("Costo de reparacion");

        jLabel4.setText("Elija el id del carro a modificar");

        jButton4.setText("Modificar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        tabla_carros3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_carros3);

        javax.swing.GroupLayout p_car_modificarLayout = new javax.swing.GroupLayout(p_car_modificar);
        p_car_modificar.setLayout(p_car_modificarLayout);
        p_car_modificarLayout.setHorizontalGroup(
            p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_modificarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(t_car_marca2)
                    .addComponent(t_car_modelo2)
                    .addComponent(t_car_fabricacion2)
                    .addComponent(t_car_reparacion2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_carro2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p_car_modificarLayout.setVerticalGroup(
            p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_car_modificarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_car_marca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_carro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_car_modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_car_fabricacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_car_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_car_reparacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_car_modificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_carros.add(p_car_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, -1, 333));

        panel.addTab("Carros", panel_carros);

        jButton5.setText("Reparar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estado_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estado_final, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla_carros2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_carros2);

        boton.setOpaque(false);
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_simulacionLayout = new javax.swing.GroupLayout(panel_simulacion);
        panel_simulacion.setLayout(panel_simulacionLayout);
        panel_simulacionLayout.setHorizontalGroup(
            panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_simulacionLayout.createSequentialGroup()
                .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_simulacionLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_simulacionLayout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_simulacionLayout.createSequentialGroup()
                                .addComponent(combo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_simulacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton)))
                .addContainerGap(305, Short.MAX_VALUE))
            .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_simulacionLayout.createSequentialGroup()
                    .addContainerGap(389, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panel_simulacionLayout.setVerticalGroup(
            panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_simulacionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(boton)
                .addContainerGap())
            .addGroup(panel_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_simulacionLayout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        panel.addTab("Simulacion", panel_simulacion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        panel.addTab("Pagos", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        panel.addTab("Entregas", jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout panel_reparacionesLayout = new javax.swing.GroupLayout(panel_reparaciones);
        panel_reparaciones.setLayout(panel_reparacionesLayout);
        panel_reparacionesLayout.setHorizontalGroup(
            panel_reparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reparacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_reparacionesLayout.setVerticalGroup(
            panel_reparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reparacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );

        panel.addTab("Reparaciones", panel_reparaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        p_em_crear.setVisible(true);
        p_em_eliminar.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        p_em_eliminar.setVisible(true);
        p_em_crear.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        p_car_crear.setVisible(true);
        p_car_listar.setVisible(false);
        p_car_modificar.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        p_car_crear.setVisible(false);
        p_car_listar.setVisible(false);
        p_car_modificar.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        p_car_crear.setVisible(false);
        p_car_listar.setVisible(true);
        p_car_modificar.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void t_emp_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_emp_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_emp_nomActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        p_b_car_crear.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        p_b_car_crear.setBackground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        p_b_car_modificar.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        p_b_car_modificar.setBackground(Color.white);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        p_b_car_listar.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        p_b_car_listar.setBackground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        p_b_emp_crear.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        p_b_emp_crear.setBackground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        p_b_emp_eliminar.setBackground(Color.gray);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        p_b_emp_eliminar.setBackground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String archivo = "./archivos/Empleados/";
        String nombre = t_emp_nom.getText();
        archivo+=nombre+".emp";
        Admin_Empleados emp = new Admin_Empleados(archivo);
        
        
        int edad = (int) t_emp_edad.getValue();
        String identidad = t_emp_identidad.getText();
        int reparados = 0;
        
        emp.cargarArchivo();
        Empleado empleado = new Empleado(nombre, edad, identidad, reparados);
        emp.setEmpleado(empleado);
        emp.escribirArchivo();
        
        
        
        String archivo2 = "./archivos/Empleados/Nombres.lis";
        Admin_nombres emp2 = new Admin_nombres(archivo2);
        emp2.cargarArchivo();
        nombres = emp2.getLista();
        nombres.add(nombre);
        emp2.setLista(nombres);
        emp2.escribirArchivo();
        
        cargarempleados();
        
        t_emp_nom.setText("");
        t_emp_edad.setValue(0);
        t_emp_identidad.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nombre = combo_empleados.getSelectedItem().toString();
        
        File file = new File("./archivos/Empleados/"+nombre+".emp");
        file.delete();
        
        String archivo2 = "./archivos/Empleados/Nombres.lis";
        Admin_nombres emp2 = new Admin_nombres(archivo2);
        emp2.cargarArchivo();
        nombres = emp2.getLista();
        for (int i = 0; i < nombres.size(); i++) {
            String nombre2 = nombres.get(i);
            if(nombre.equals(nombre2)){
                nombres.remove(i);
            }
        }
        emp2.setLista(nombres);
        emp2.escribirArchivo();
        
        cargarempleados();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String archivo = "./archivos/Carros.car";
        Admin_Carros emp = new Admin_Carros(archivo);
        
        String marca = t_car_marca.getText();
        String modelo = t_car_modelo.getText();
        int fabricacion = Integer.parseInt(t_car_fabricacion.getText());
        String estado = "en espera de entrar a reparaci??n";
        int reparacion = (int) t_car_reparacion.getValue();
        
        emp.cargarArchivo();
        Carro carro = new Carro(marca, modelo, fabricacion, estado, reparacion);
        emp.setCarro(carro);
        emp.escribirArchivo();
        
        
        t_car_marca.setText("");
        t_car_reparacion.setValue(0);
        t_car_fabricacion.setText("");
        t_car_modelo.setText("");
        cargarcarros();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        estado_final.setText("");
        
        int id = Integer.parseInt(combo_carro.getSelectedItem().toString());
        
        String nombre = combo_empleados.getSelectedItem().toString();
        
        Admin_Empleados emp = new Admin_Empleados("./archivos/Empleados/"+nombre+".emp");
        emp.cargarArchivo();
        Empleado empleado = emp.getEmpleado();
        int au_rep = empleado.getReparados();
        System.out.println(au_rep);
        
        
        Hilo hilo = new Hilo(barra, 5000, au_rep, estado_final, nombre, id, boton);
        
        hilo.start();
        cargarcarros();
    }//GEN-LAST:event_jButton5MouseClicked

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        cargarcarros();
    }//GEN-LAST:event_botonActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int id = Integer.parseInt(combo_carro2.getSelectedItem().toString());
        
        String marca = t_car_marca2.getText();
        String modelo = t_car_modelo2.getText();
        int fabricacion = Integer.parseInt(t_car_fabricacion2.getText());
        int reparacion = (int) t_car_reparacion2.getValue();
        
        Admin_Carros car = new Admin_Carros("./archivos/Carros.car");
        car.cargarArchivo();
        ArrayList<Carro> carros = car.getLista();
        carros.get(id-1).setMarca(marca);
        carros.get(id-1).setModelo(modelo);
        carros.get(id-1).setA??o(fabricacion);
        carros.get(id-1).setCosto(reparacion);
        car.setLista(carros);
        car.escribirArchivo();
        
        t_car_marca2.setText("");
        t_car_modelo2.setText("");
        t_car_fabricacion2.setText("");
        t_car_reparacion2.setValue(0);
        cargarcarros();
    }//GEN-LAST:event_jButton4MouseClicked

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
                if ("wimdows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton boton;
    private javax.swing.JComboBox<String> combo_carro;
    private javax.swing.JComboBox<String> combo_carro2;
    private javax.swing.JComboBox<String> combo_empleado;
    private javax.swing.JComboBox<String> combo_empleados;
    private javax.swing.JLabel estado_final;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel p_b_car_crear;
    private javax.swing.JPanel p_b_car_listar;
    private javax.swing.JPanel p_b_car_modificar;
    private javax.swing.JPanel p_b_emp_crear;
    private javax.swing.JPanel p_b_emp_eliminar;
    private javax.swing.JPanel p_car_crear;
    private javax.swing.JPanel p_car_listar;
    private javax.swing.JPanel p_car_modificar;
    private javax.swing.JPanel p_em_crear;
    private javax.swing.JPanel p_em_eliminar;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JPanel panel_carros;
    private javax.swing.JPanel panel_empleados;
    private javax.swing.JPanel panel_reparaciones;
    private javax.swing.JPanel panel_simulacion;
    private javax.swing.JTextField t_car_fabricacion;
    private javax.swing.JTextField t_car_fabricacion2;
    private javax.swing.JTextField t_car_marca;
    private javax.swing.JTextField t_car_marca2;
    private javax.swing.JTextField t_car_modelo;
    private javax.swing.JTextField t_car_modelo2;
    private javax.swing.JSpinner t_car_reparacion;
    private javax.swing.JSpinner t_car_reparacion2;
    private javax.swing.JSpinner t_emp_edad;
    private javax.swing.JTextField t_emp_identidad;
    private javax.swing.JTextField t_emp_nom;
    private javax.swing.JTable tabla_carros;
    private javax.swing.JTable tabla_carros2;
    private javax.swing.JTable tabla_carros3;
    // End of variables declaration//GEN-END:variables
}
