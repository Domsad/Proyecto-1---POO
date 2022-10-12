package com.ventanas;

import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import programa1_competencias_atletismo.*;

public class main extends javax.swing.JFrame {
    private RegistroMarcas mainregister = new RegistroMarcas();
    private ArrayList<String> categorias = new ArrayList<>();
    private ArrayList<Prueba> pruebasDisciplina = new ArrayList<>();
    private DefaultListModel modelopruebasDisciplina = new DefaultListModel();
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLayout(null);
        categorias.add("Mayor");
        categorias.add("Master");
        categorias.add("U15");
        categorias.add("U18");
        categorias.add("U20");
        jComboBox6.addItem("Masculino");
        jComboBox6.addItem("Femenino");
        jComboBox6.addItem("Ambos");
        mainregister.getRegistroDisciplinas().add(new Disciplina("Carreras de Velocidad","Tiempo"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Medio Fondo","Tiempo"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Fondo","Tiempo"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Saltos","Tiempo"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Marcha","Tiempo"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Salto","Distancia"));
        mainregister.getRegistroDisciplinas().add(new Disciplina("Lanzamiento","Distancia"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_main = new javax.swing.JPanel();
        Panel_menu = new javax.swing.JPanel();
        label_menuPrincipal = new javax.swing.JLabel();
        Panel_botones = new javax.swing.JPanel();
        button_disciplinas = new javax.swing.JButton();
        button_atletas = new javax.swing.JButton();
        button_competencias = new javax.swing.JButton();
        button_registromarcas = new javax.swing.JButton();
        button_listadomarcas = new javax.swing.JButton();
        button_configuracion = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Paneldefault = new javax.swing.JPanel();
        Panel_disciplinas = new javax.swing.JPanel();
        panel_disciplinastop = new javax.swing.JPanel();
        Panel_botonesdisciplinas = new javax.swing.JPanel();
        button_disciplinas_modificarpruebas = new javax.swing.JButton();
        button_disciplinas_consultar = new javax.swing.JButton();
        button_disciplinas_modificarnombre = new javax.swing.JButton();
        button_disciplinas_borrar = new javax.swing.JButton();
        button_disciplinas_agregardisciplina = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel_disciplinas_default = new javax.swing.JPanel();
        panel_disciplinas_agregar = new javax.swing.JPanel();
        label_agregar_nombredisciplina = new javax.swing.JLabel();
        textfield_agregar_nombredisciplina = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panel_disciplinas_consultar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        panel_disciplinas_modificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel_disciplinas_borrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        panel_disciplinas_modificarpruebas = new javax.swing.JPanel();
        scrollpane_pruebasdisciplina = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        label_agregar_nombreprueba = new javax.swing.JLabel();
        textfield_agregar_nombreprueba = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button_agregarprueba = new javax.swing.JButton();
        button_eliminarprueba = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        Panel_atletas = new javax.swing.JPanel();
        panel_atletastop = new javax.swing.JPanel();
        Panel_botonesatletas = new javax.swing.JPanel();
        button_atletas_agregar = new javax.swing.JButton();
        button_atletas_consultar = new javax.swing.JButton();
        button_atletas_modificar = new javax.swing.JButton();
        button_atletas_borrar = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        panel_atletas_default = new javax.swing.JPanel();
        panel_atletas_agregar = new javax.swing.JPanel();
        panel_atletas_consultar = new javax.swing.JPanel();
        panel_atletas_modificar = new javax.swing.JPanel();
        panel_atletas_borrar = new javax.swing.JPanel();
        Panel_competencias = new javax.swing.JPanel();
        Panel_registros = new javax.swing.JPanel();
        Panel_listado = new javax.swing.JPanel();
        Panel_configuracion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 430));
        setPreferredSize(new java.awt.Dimension(800, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 430));
        getContentPane().setLayout(null);

        Panel_main.setBackground(new java.awt.Color(51, 51, 51));
        Panel_main.setMinimumSize(new java.awt.Dimension(800, 430));
        Panel_main.setName(""); // NOI18N
        Panel_main.setPreferredSize(new java.awt.Dimension(800, 430));
        Panel_main.setLayout(null);

        Panel_menu.setBackground(new java.awt.Color(0, 0, 0));
        Panel_menu.setMinimumSize(new java.awt.Dimension(735, 55));
        Panel_menu.setPreferredSize(new java.awt.Dimension(735, 55));
        Panel_menu.setLayout(null);

        label_menuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        label_menuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_menuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        label_menuPrincipal.setText("Menú Principal");
        Panel_menu.add(label_menuPrincipal);
        label_menuPrincipal.setBounds(281, 6, 211, 32);

        Panel_main.add(Panel_menu);
        Panel_menu.setBounds(6, 0, 890, 55);

        Panel_botones.setBackground(new java.awt.Color(102, 102, 102));
        Panel_botones.setLayout(null);

        button_disciplinas.setBackground(new java.awt.Color(0, 102, 102));
        button_disciplinas.setForeground(new java.awt.Color(255, 255, 255));
        button_disciplinas.setText("Disciplinas y Pruebas");
        button_disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinasActionPerformed(evt);
            }
        });
        Panel_botones.add(button_disciplinas);
        button_disciplinas.setBounds(10, 10, 200, 45);

        button_atletas.setBackground(new java.awt.Color(0, 102, 102));
        button_atletas.setForeground(new java.awt.Color(255, 255, 255));
        button_atletas.setText("Atletas");
        button_atletas.setMaximumSize(new java.awt.Dimension(148, 28));
        button_atletas.setMinimumSize(new java.awt.Dimension(148, 28));
        button_atletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletasActionPerformed(evt);
            }
        });
        Panel_botones.add(button_atletas);
        button_atletas.setBounds(10, 70, 200, 40);

        button_competencias.setBackground(new java.awt.Color(0, 102, 102));
        button_competencias.setForeground(new java.awt.Color(255, 255, 255));
        button_competencias.setText("Competencias y Pruebas");
        button_competencias.setMaximumSize(new java.awt.Dimension(148, 28));
        button_competencias.setMinimumSize(new java.awt.Dimension(148, 28));
        button_competencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_competenciasActionPerformed(evt);
            }
        });
        Panel_botones.add(button_competencias);
        button_competencias.setBounds(10, 120, 200, 39);

        button_registromarcas.setBackground(new java.awt.Color(0, 102, 102));
        button_registromarcas.setForeground(new java.awt.Color(255, 255, 255));
        button_registromarcas.setText("Registros de Marcas");
        button_registromarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registromarcasActionPerformed(evt);
            }
        });
        Panel_botones.add(button_registromarcas);
        button_registromarcas.setBounds(10, 180, 200, 40);

        button_listadomarcas.setBackground(new java.awt.Color(0, 102, 102));
        button_listadomarcas.setForeground(new java.awt.Color(255, 255, 255));
        button_listadomarcas.setText("Listado de Marcas");
        button_listadomarcas.setMaximumSize(new java.awt.Dimension(148, 28));
        button_listadomarcas.setMinimumSize(new java.awt.Dimension(148, 28));
        button_listadomarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_listadomarcasActionPerformed(evt);
            }
        });
        Panel_botones.add(button_listadomarcas);
        button_listadomarcas.setBounds(10, 240, 200, 38);

        button_configuracion.setBackground(new java.awt.Color(0, 102, 102));
        button_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        button_configuracion.setText("Configuración");
        button_configuracion.setMaximumSize(new java.awt.Dimension(148, 28));
        button_configuracion.setMinimumSize(new java.awt.Dimension(148, 28));
        button_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_configuracionActionPerformed(evt);
            }
        });
        Panel_botones.add(button_configuracion);
        button_configuracion.setBounds(10, 290, 200, 38);

        Panel_main.add(Panel_botones);
        Panel_botones.setBounds(0, 55, 230, 345);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        Paneldefault.setBackground(new java.awt.Color(102, 102, 102));
        Paneldefault.setMinimumSize(new java.awt.Dimension(800, 0));
        Paneldefault.setPreferredSize(new java.awt.Dimension(800, 347));
        Paneldefault.setLayout(null);
        jTabbedPane1.addTab("tab6", Paneldefault);

        Panel_disciplinas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_disciplinas.setLayout(null);

        panel_disciplinastop.setBackground(new java.awt.Color(102, 102, 102));
        panel_disciplinastop.setLayout(null);
        Panel_disciplinas.add(panel_disciplinastop);
        panel_disciplinastop.setBounds(5, 5, 570, 40);

        Panel_botonesdisciplinas.setLayout(null);

        button_disciplinas_modificarpruebas.setText("Modificar Pruebas");
        button_disciplinas_modificarpruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_modificarpruebasActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_modificarpruebas);
        button_disciplinas_modificarpruebas.setBounds(10, 140, 140, 28);

        button_disciplinas_consultar.setText("Consultar y Listado");
        button_disciplinas_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_consultarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_consultar);
        button_disciplinas_consultar.setBounds(10, 80, 140, 28);

        button_disciplinas_modificarnombre.setText("Modificar Nombre");
        button_disciplinas_modificarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_modificarnombreActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_modificarnombre);
        button_disciplinas_modificarnombre.setBounds(10, 200, 138, 28);

        button_disciplinas_borrar.setText("Borrar");
        button_disciplinas_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_borrarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_borrar);
        button_disciplinas_borrar.setBounds(10, 250, 140, 28);

        button_disciplinas_agregardisciplina.setText("Agregar Disciplina");
        button_disciplinas_agregardisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_agregardisciplinaActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_agregardisciplina);
        button_disciplinas_agregardisciplina.setBounds(10, 30, 140, 28);

        Panel_disciplinas.add(Panel_botonesdisciplinas);
        Panel_botonesdisciplinas.setBounds(0, 40, 160, 320);

        panel_disciplinas_default.setLayout(null);
        jTabbedPane2.addTab("tab6", panel_disciplinas_default);

        panel_disciplinas_agregar.setPreferredSize(new java.awt.Dimension(360, 500));
        panel_disciplinas_agregar.setLayout(null);

        label_agregar_nombredisciplina.setText("Nombre de Disciplina:");
        panel_disciplinas_agregar.add(label_agregar_nombredisciplina);
        label_agregar_nombredisciplina.setBounds(40, 60, 130, 16);

        textfield_agregar_nombredisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_agregar_nombredisciplinaActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(textfield_agregar_nombredisciplina);
        textfield_agregar_nombredisciplina.setBounds(180, 50, 120, 28);

        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jComboBox7);
        jComboBox7.setBounds(180, 110, 120, 26);

        jLabel8.setText("Medida: ");
        panel_disciplinas_agregar.add(jLabel8);
        jLabel8.setBounds(120, 120, 80, 16);

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jButton3);
        jButton3.setBounds(150, 180, 120, 28);

        jTabbedPane2.addTab("tab1", panel_disciplinas_agregar);

        panel_disciplinas_consultar.setLayout(null);

        jLabel1.setText("Disciplina:");
        panel_disciplinas_consultar.add(jLabel1);
        jLabel1.setBounds(20, 70, 110, 16);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panel_disciplinas_consultar.add(jComboBox1);
        jComboBox1.setBounds(100, 60, 240, 40);
        panel_disciplinas_consultar.add(jComboBox2);
        jComboBox2.setBounds(100, 180, 240, 40);

        jLabel2.setText("Pruebas:");
        panel_disciplinas_consultar.add(jLabel2);
        jLabel2.setBounds(20, 190, 70, 16);

        jTabbedPane2.addTab("tab2", panel_disciplinas_consultar);

        panel_disciplinas_modificar.setLayout(null);

        jLabel5.setText("Disciplina:");
        panel_disciplinas_modificar.add(jLabel5);
        jLabel5.setBounds(30, 60, 130, 16);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        panel_disciplinas_modificar.add(jComboBox3);
        jComboBox3.setBounds(130, 50, 210, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel_disciplinas_modificar.add(jTextField1);
        jTextField1.setBounds(130, 120, 210, 28);

        jLabel6.setText("Nuevo Nombre:");
        panel_disciplinas_modificar.add(jLabel6);
        jLabel6.setBounds(20, 130, 100, 16);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Cambiar Nombre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_disciplinas_modificar.add(jButton1);
        jButton1.setBounds(130, 200, 150, 28);

        jTabbedPane2.addTab("tab3", panel_disciplinas_modificar);

        panel_disciplinas_borrar.setLayout(null);

        jLabel7.setText("Disciplina:");
        panel_disciplinas_borrar.add(jLabel7);
        jLabel7.setBounds(20, 60, 110, 16);

        panel_disciplinas_borrar.add(jComboBox4);
        jComboBox4.setBounds(100, 50, 240, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_disciplinas_borrar.add(jButton2);
        jButton2.setBounds(160, 120, 120, 28);

        jTabbedPane2.addTab("tab4", panel_disciplinas_borrar);

        panel_disciplinas_modificarpruebas.setLayout(null);

        jList1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jList1MouseWheelMoved(evt);
            }
        });
        scrollpane_pruebasdisciplina.setViewportView(jList1);

        panel_disciplinas_modificarpruebas.add(scrollpane_pruebasdisciplina);
        scrollpane_pruebasdisciplina.setBounds(270, 20, 130, 260);

        label_agregar_nombreprueba.setText("Nombre de la Prueba:");
        panel_disciplinas_modificarpruebas.add(label_agregar_nombreprueba);
        label_agregar_nombreprueba.setBounds(10, 100, 140, 16);

        textfield_agregar_nombreprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_agregar_nombrepruebaActionPerformed(evt);
            }
        });
        panel_disciplinas_modificarpruebas.add(textfield_agregar_nombreprueba);
        textfield_agregar_nombreprueba.setBounds(140, 100, 120, 28);

        jLabel3.setText("Género:");
        panel_disciplinas_modificarpruebas.add(jLabel3);
        jLabel3.setBounds(90, 140, 90, 16);

        jLabel4.setText("Categoría:");
        panel_disciplinas_modificarpruebas.add(jLabel4);
        jLabel4.setBounds(80, 180, 90, 16);

        button_agregarprueba.setBackground(new java.awt.Color(0, 204, 0));
        button_agregarprueba.setText("Agregar Prueba");
        button_agregarprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_agregarpruebaActionPerformed(evt);
            }
        });
        panel_disciplinas_modificarpruebas.add(button_agregarprueba);
        button_agregarprueba.setBounds(30, 230, 130, 30);

        button_eliminarprueba.setBackground(new java.awt.Color(204, 0, 51));
        button_eliminarprueba.setText("Eliminar Prueba");
        button_eliminarprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminarpruebaActionPerformed(evt);
            }
        });
        panel_disciplinas_modificarpruebas.add(button_eliminarprueba);
        button_eliminarprueba.setBounds(30, 270, 130, 28);

        panel_disciplinas_modificarpruebas.add(jComboBox5);
        jComboBox5.setBounds(140, 180, 120, 26);

        panel_disciplinas_modificarpruebas.add(jComboBox6);
        jComboBox6.setBounds(140, 140, 120, 26);

        jLabel9.setText("Disciplina:");
        panel_disciplinas_modificarpruebas.add(jLabel9);
        jLabel9.setBounds(20, 26, 80, 20);

        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        panel_disciplinas_modificarpruebas.add(jComboBox8);
        jComboBox8.setBounds(80, 20, 180, 26);

        jTabbedPane2.addTab("tab5", panel_disciplinas_modificarpruebas);

        Panel_disciplinas.add(jTabbedPane2);
        jTabbedPane2.setBounds(150, 10, 420, 350);

        jTabbedPane1.addTab("tab1", Panel_disciplinas);

        Panel_atletas.setLayout(null);

        panel_atletastop.setBackground(new java.awt.Color(102, 102, 102));
        panel_atletastop.setLayout(null);
        Panel_atletas.add(panel_atletastop);
        panel_atletastop.setBounds(5, 5, 510, 40);

        Panel_botonesatletas.setLayout(null);

        button_atletas_agregar.setText("Agregar");
        button_atletas_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletas_agregarActionPerformed(evt);
            }
        });
        Panel_botonesatletas.add(button_atletas_agregar);
        button_atletas_agregar.setBounds(10, 40, 138, 28);

        button_atletas_consultar.setText("Consultar y Listado");
        button_atletas_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletas_consultarActionPerformed(evt);
            }
        });
        Panel_botonesatletas.add(button_atletas_consultar);
        button_atletas_consultar.setBounds(10, 100, 138, 28);

        button_atletas_modificar.setText("Modificar");
        button_atletas_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletas_modificarActionPerformed(evt);
            }
        });
        Panel_botonesatletas.add(button_atletas_modificar);
        button_atletas_modificar.setBounds(10, 160, 138, 28);

        button_atletas_borrar.setText("Borrar");
        button_atletas_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletas_borrarActionPerformed(evt);
            }
        });
        Panel_botonesatletas.add(button_atletas_borrar);
        button_atletas_borrar.setBounds(10, 210, 138, 28);

        Panel_atletas.add(Panel_botonesatletas);
        Panel_botonesatletas.setBounds(0, 40, 150, 320);

        panel_atletas_default.setLayout(null);
        jTabbedPane3.addTab("tab6", panel_atletas_default);

        panel_atletas_agregar.setPreferredSize(new java.awt.Dimension(360, 500));
        panel_atletas_agregar.setLayout(null);
        jTabbedPane3.addTab("tab1", panel_atletas_agregar);

        panel_atletas_consultar.setLayout(null);
        jTabbedPane3.addTab("tab2", panel_atletas_consultar);

        panel_atletas_modificar.setLayout(null);
        jTabbedPane3.addTab("tab3", panel_atletas_modificar);

        panel_atletas_borrar.setLayout(null);
        jTabbedPane3.addTab("tab4", panel_atletas_borrar);

        Panel_atletas.add(jTabbedPane3);
        jTabbedPane3.setBounds(150, 10, 370, 350);

        jTabbedPane1.addTab("tab2", Panel_atletas);

        Panel_competencias.setLayout(null);
        jTabbedPane1.addTab("tab3", Panel_competencias);

        Panel_registros.setLayout(null);
        jTabbedPane1.addTab("tab4", Panel_registros);

        Panel_listado.setLayout(null);
        jTabbedPane1.addTab("tab5", Panel_listado);

        Panel_configuracion.setLayout(null);
        jTabbedPane1.addTab("tab5", Panel_configuracion);

        Panel_main.add(jTabbedPane1);
        jTabbedPane1.setBounds(221, 20, 580, 380);

        getContentPane().add(Panel_main);
        Panel_main.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_disciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinasActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_button_disciplinasActionPerformed

    private void button_registromarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registromarcasActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_button_registromarcasActionPerformed

    private void button_atletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletasActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_button_atletasActionPerformed

    private void button_competenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_competenciasActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_button_competenciasActionPerformed

    private void button_listadomarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_listadomarcasActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_button_listadomarcasActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void button_disciplinas_modificarpruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_modificarpruebasActionPerformed
        jTabbedPane2.setSelectedIndex(5);
        ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
        jComboBox8.removeAllItems();
        for(Disciplina disciplina:disciplinas){
            jComboBox8.addItem(disciplina.toString());
        }
        jComboBox5.removeAllItems();
        for(String categoria:categorias){
            jComboBox5.addItem(categoria);
        }
    }//GEN-LAST:event_button_disciplinas_modificarpruebasActionPerformed

    private void button_disciplinas_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_consultarActionPerformed
        jTabbedPane2.setSelectedIndex(2);
        ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
        jComboBox1.removeAllItems();
        for(Disciplina disciplina:disciplinas){
            jComboBox1.addItem(disciplina.toString());
        }
    }//GEN-LAST:event_button_disciplinas_consultarActionPerformed

    private void button_disciplinas_modificarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_modificarnombreActionPerformed
        jTabbedPane2.setSelectedIndex(3);
        ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
        jComboBox3.removeAllItems();
        for(Disciplina disciplina:disciplinas){
            jComboBox3.addItem(disciplina.toString());
        }
    }//GEN-LAST:event_button_disciplinas_modificarnombreActionPerformed

    private void button_disciplinas_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_borrarActionPerformed
        jTabbedPane2.setSelectedIndex(4);
        ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
        jComboBox4.removeAllItems();
        for(Disciplina disciplina:disciplinas){
            jComboBox4.addItem(disciplina.toString());
        }
    }//GEN-LAST:event_button_disciplinas_borrarActionPerformed

    private void button_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_configuracionActionPerformed
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_button_configuracionActionPerformed

    private void textfield_agregar_nombredisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_agregar_nombredisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_agregar_nombredisciplinaActionPerformed

    private void jList1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jList1MouseWheelMoved
        //JScrollPane scroll = new JScrollPane(jList1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }//GEN-LAST:event_jList1MouseWheelMoved

    private void textfield_agregar_nombrepruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_agregar_nombrepruebaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_agregar_nombrepruebaActionPerformed

    public boolean ExisteEnLista(ArrayList<Prueba> pruebas,String nombre,String genero,String categoria){
        boolean flag = false;
        for(Prueba prueba:pruebas){
            if(prueba.getNombre().toLowerCase().equals(nombre.toLowerCase()) && 
                prueba.getGenero().toLowerCase().equals(genero.toLowerCase()) && 
                prueba.getCategoria().toLowerCase().equals(categoria.toLowerCase())){
                flag = true;
            }
        }
        return flag;
    }

    private void button_agregarpruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_agregarpruebaActionPerformed
        if(textfield_agregar_nombreprueba.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe definir un nombre de prueba!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!ExisteEnLista(pruebasDisciplina,textfield_agregar_nombreprueba.getText(),
            jComboBox6.getSelectedItem().toString(),jComboBox5.getSelectedItem().toString())){
                    Prueba nueva = new Prueba(textfield_agregar_nombreprueba.getText(),
                    jComboBox6.getSelectedItem().toString(),jComboBox5.getSelectedItem().toString());
                    pruebasDisciplina.add(nueva);
                    modelopruebasDisciplina.addElement(nueva.toString());
                    jList1.setModel(modelopruebasDisciplina);
                    JOptionPane.showMessageDialog(null,"Prueba agregada con exito!");
                    textfield_agregar_nombreprueba.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Esa prueba ya esta agregada!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_agregarpruebaActionPerformed

    private void button_eliminarpruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminarpruebaActionPerformed
        try{
            String prueba = (String)modelopruebasDisciplina.getElementAt(jList1.getSelectedIndex());
            for(Prueba actual:pruebasDisciplina){
                if(actual.toString().equals(prueba)){
                    pruebasDisciplina.remove(actual);
                    modelopruebasDisciplina.removeElementAt(jList1.getSelectedIndex());
                    JOptionPane.showMessageDialog(null,"Prueba Eliminada con exito!");
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe elegir una prueba antes de eliminar",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_eliminarpruebaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem() != null){
            jComboBox2.removeAllItems();
            ArrayList<Prueba> pruebas = new ArrayList<>();
            for(Disciplina disciplina:mainregister.getRegistroDisciplinas()){
                if(disciplina.toString().equals(jComboBox1.getSelectedItem().toString())){
                    pruebas = disciplina.getListaPruebas();
                    break;
                }
            }
            for(Prueba prueba: pruebas){
                jComboBox2.addItem(prueba.toString());
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().equals(""))
            return;
        if(jComboBox1.getSelectedItem() != null){
            Disciplina temp = new Disciplina("","");
            boolean repetido = false;
            for(Disciplina disciplina:mainregister.getRegistroDisciplinas()){
                if(disciplina.getNombre().equals(jTextField1.getText()))
                    repetido = true;
                if(disciplina.toString().equals(jComboBox3.getSelectedItem().toString()))
                    temp = disciplina;
            }
            if(!repetido && temp != null){
               temp.setNombre(jTextField1.getText());
               jTextField1.setText("");
                ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
                jComboBox3.removeAllItems();
                for(Disciplina disciplina:disciplinas){
                    jComboBox3.addItem(disciplina.toString());
                }
               JOptionPane.showMessageDialog(null,"Nombre cambiado con exito!");
            }else{
                JOptionPane.showMessageDialog(null, "Ese nombre ya existe!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(jComboBox4.getSelectedItem() != null){
            ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
            for(Disciplina disciplina:disciplinas){
                if(disciplina.toString().equals(jComboBox4.getSelectedItem().toString())){
                    int result = JOptionPane.showConfirmDialog(null,"Desea eliminar?");
                    if (result == JOptionPane.YES_OPTION){
                        disciplinas.remove(disciplina);
                        
                        jComboBox4.removeAllItems();
                        for(Disciplina disciplina2:disciplinas){
                            jComboBox4.addItem(disciplina2.toString());
                        }
                        
                        JOptionPane.showMessageDialog(null,"Disciplinada eliminada con exito!");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button_atletas_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_atletas_agregarActionPerformed

    private void button_atletas_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_atletas_consultarActionPerformed

    private void button_atletas_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_atletas_modificarActionPerformed

    private void button_atletas_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_atletas_borrarActionPerformed

    private void button_disciplinas_agregardisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_agregardisciplinaActionPerformed
        jTabbedPane2.setSelectedIndex(1);
        jComboBox7.removeAllItems();
        jComboBox7.addItem("Distancia");
        jComboBox7.addItem("Tiempo");       
    }//GEN-LAST:event_button_disciplinas_agregardisciplinaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<Disciplina> disciplinas = mainregister.getRegistroDisciplinas();
        if(textfield_agregar_nombredisciplina.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe definir un nombre de disciplina!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean existenombre = false;
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getNombre().equals(textfield_agregar_nombredisciplina.getText())){
                    existenombre = true;
                    JOptionPane.showMessageDialog(null, "Esa disciplina ya existe!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(!existenombre){
                disciplinas.add(new Disciplina(textfield_agregar_nombredisciplina.getText(),
                jComboBox7.getSelectedItem().toString()));
                JOptionPane.showMessageDialog(null,"Disciplina agregada al registro de disciplinas!");
                textfield_agregar_nombredisciplina.setText("");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        Disciplina aux = new Disciplina("","");
        for(Disciplina disciplina:mainregister.getRegistroDisciplinas()){
            if(disciplina.toString() == jComboBox8.getSelectedItem()){
                aux = disciplina;
                break;
            }
        }
        pruebasDisciplina = aux.getListaPruebas();
        jList1.removeAll();
        modelopruebasDisciplina = new DefaultListModel();
        for(Prueba prueba:aux.getListaPruebas()){
            modelopruebasDisciplina.addElement(prueba.toString());
        }
        jList1.setModel(modelopruebasDisciplina);
    }//GEN-LAST:event_jComboBox8ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_atletas;
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JPanel Panel_botonesatletas;
    private javax.swing.JPanel Panel_botonesdisciplinas;
    private javax.swing.JPanel Panel_competencias;
    private javax.swing.JPanel Panel_configuracion;
    private javax.swing.JPanel Panel_disciplinas;
    private javax.swing.JPanel Panel_listado;
    private javax.swing.JPanel Panel_main;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_registros;
    private javax.swing.JPanel Paneldefault;
    private javax.swing.JButton button_agregarprueba;
    private javax.swing.JButton button_atletas;
    private javax.swing.JButton button_atletas_agregar;
    private javax.swing.JButton button_atletas_borrar;
    private javax.swing.JButton button_atletas_consultar;
    private javax.swing.JButton button_atletas_modificar;
    private javax.swing.JButton button_competencias;
    private javax.swing.JButton button_configuracion;
    private javax.swing.JButton button_disciplinas;
    private javax.swing.JButton button_disciplinas_agregardisciplina;
    private javax.swing.JButton button_disciplinas_borrar;
    private javax.swing.JButton button_disciplinas_consultar;
    private javax.swing.JButton button_disciplinas_modificarnombre;
    private javax.swing.JButton button_disciplinas_modificarpruebas;
    private javax.swing.JButton button_eliminarprueba;
    private javax.swing.JButton button_listadomarcas;
    private javax.swing.JButton button_registromarcas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_agregar_nombredisciplina;
    private javax.swing.JLabel label_agregar_nombreprueba;
    private javax.swing.JLabel label_menuPrincipal;
    private javax.swing.JPanel panel_atletas_agregar;
    private javax.swing.JPanel panel_atletas_borrar;
    private javax.swing.JPanel panel_atletas_consultar;
    private javax.swing.JPanel panel_atletas_default;
    private javax.swing.JPanel panel_atletas_modificar;
    private javax.swing.JPanel panel_atletastop;
    private javax.swing.JPanel panel_disciplinas_agregar;
    private javax.swing.JPanel panel_disciplinas_borrar;
    private javax.swing.JPanel panel_disciplinas_consultar;
    private javax.swing.JPanel panel_disciplinas_default;
    private javax.swing.JPanel panel_disciplinas_modificar;
    private javax.swing.JPanel panel_disciplinas_modificarpruebas;
    private javax.swing.JPanel panel_disciplinastop;
    private javax.swing.JScrollPane scrollpane_pruebasdisciplina;
    private javax.swing.JTextField textfield_agregar_nombredisciplina;
    private javax.swing.JTextField textfield_agregar_nombreprueba;
    // End of variables declaration//GEN-END:variables
}
