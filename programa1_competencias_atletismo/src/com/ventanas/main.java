package com.ventanas;


import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import programa1_competencias_atletismo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main extends javax.swing.JFrame {
    private RegistroMarcas mainregister = new RegistroMarcas();
    private ArrayList<String> categorias = new ArrayList<>();
    private ArrayList<Prueba> pruebasDisciplina = new ArrayList<>();
    static ArrayList<Marca> marcas = new ArrayList<>();
    private DefaultListModel modelopruebasDisciplina = new DefaultListModel();
    private int secuencialCompetencia = 1;
    private int cantatletas = 0;
    
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
        Disciplina temp = new Disciplina("Lanzamiento","Distancia");
        temp.getListaPruebas().add(new Prueba("100m","Ambos","Master"));
        mainregister.getRegistroDisciplinas().add(temp);
        Atleta atl1 = new Atleta("Alonso","Casares","Aguirre","123456789"
        ,"CRC","10/11/2004","alonso@gmail.com","12345678912345678900");
        mainregister.agregarAtleta(atl1);
        Atleta atl2 = new Atleta("Harlen","Viquez","Monge","987654321"
        ,"CRC","10/11/2004","alonso@gmail.com","12345678912345678900");
        mainregister.agregarAtleta(atl2);
        Atleta atl3 = new Atleta("Mariana","Navarro","Carillo","123123123"
        ,"CRC","10/11/2004","alonso@gmail.com","12345678912345678900");
        mainregister.agregarAtleta(atl3);
        Competencia temp2 = new Competencia("Competencia1",1,"CRC","Cartago","10/11/2004","11/11/2004");
        temp2.getRegistroDisciplinas().add(temp);
        mainregister.getRegistroCompetencias().add(temp2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NombreAtletaTextField = new javax.swing.JTextField();
        Apellido1TextField = new javax.swing.JTextField();
        Apellido2TextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        IdentificacionTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PaisTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        NacimientoTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CorreoTextField = new javax.swing.JTextField();
        TelefonoTextField = new javax.swing.JTextField();
        BottonAgregarAtleta = new javax.swing.JButton();
        panel_atletas_consultar = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panel_atletas_modificar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        panel_atletas_borrar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox<>();
        Panel_competencias = new javax.swing.JPanel();
        Panel_competenciastop = new javax.swing.JPanel();
        Panel_botonescompetencias = new javax.swing.JPanel();
        button_competencias_agregar = new javax.swing.JButton();
        button_competencias_consultar = new javax.swing.JButton();
        button_competencias_modificar = new javax.swing.JButton();
        button_competencias_borrar = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        panel_competencias_default = new javax.swing.JPanel();
        panel_competencias_agregar = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        button_agregar_competencia = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        panel_competencias_consultar = new javax.swing.JPanel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel_competencias_modificar = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jList3 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        panel_competencias_borrar = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        Panel_registros = new javax.swing.JPanel();
        Panel_registrotop = new javax.swing.JPanel();
        Panel_botonesregistro = new javax.swing.JPanel();
        button_registro_agregar = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        panel_registro_default = new javax.swing.JPanel();
        panel_registro_agregar = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        Panel_configuracion = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        Panel_listado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        jLabel33.setText("jLabel33");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 430));
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
        button_competencias.setText("Competencias");
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
        panel_atletastop.setBounds(5, 5, 570, 40);

        Panel_botonesatletas.setLayout(null);

        button_atletas_agregar.setText("Agregar");
        button_atletas_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atletas_agregarActionPerformed(evt);
            }
        });
        Panel_botonesatletas.add(button_atletas_agregar);
        button_atletas_agregar.setBounds(10, 40, 138, 28);

        button_atletas_consultar.setText("Consultar");
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

        jLabel10.setText("Nombre:");
        panel_atletas_agregar.add(jLabel10);
        jLabel10.setBounds(100, 30, 90, 20);

        jLabel11.setText("Apellido 1:");
        panel_atletas_agregar.add(jLabel11);
        jLabel11.setBounds(90, 60, 100, 20);

        jLabel12.setText("Apellido 2:");
        panel_atletas_agregar.add(jLabel12);
        jLabel12.setBounds(90, 90, 90, 20);

        NombreAtletaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAtletaTextFieldActionPerformed(evt);
            }
        });
        panel_atletas_agregar.add(NombreAtletaTextField);
        NombreAtletaTextField.setBounds(180, 30, 170, 28);
        panel_atletas_agregar.add(Apellido1TextField);
        Apellido1TextField.setBounds(180, 60, 170, 28);
        panel_atletas_agregar.add(Apellido2TextField);
        Apellido2TextField.setBounds(180, 90, 170, 28);

        jLabel13.setText("Identificacion:");
        panel_atletas_agregar.add(jLabel13);
        jLabel13.setBounds(70, 120, 110, 20);
        panel_atletas_agregar.add(IdentificacionTextField);
        IdentificacionTextField.setBounds(180, 120, 170, 28);

        jLabel14.setText("Pais de Origen:");
        panel_atletas_agregar.add(jLabel14);
        jLabel14.setBounds(60, 150, 120, 20);
        panel_atletas_agregar.add(PaisTextField);
        PaisTextField.setBounds(180, 150, 170, 28);

        jLabel15.setText("Fecha de nacimiento:");
        panel_atletas_agregar.add(jLabel15);
        jLabel15.setBounds(30, 180, 150, 20);
        panel_atletas_agregar.add(NacimientoTextField);
        NacimientoTextField.setBounds(180, 180, 170, 28);

        jLabel16.setText("Correo:");
        panel_atletas_agregar.add(jLabel16);
        jLabel16.setBounds(99, 210, 80, 20);

        jLabel17.setText("Telefono:");
        panel_atletas_agregar.add(jLabel17);
        jLabel17.setBounds(89, 240, 90, 20);
        panel_atletas_agregar.add(CorreoTextField);
        CorreoTextField.setBounds(180, 210, 170, 28);
        panel_atletas_agregar.add(TelefonoTextField);
        TelefonoTextField.setBounds(180, 240, 170, 28);

        BottonAgregarAtleta.setBackground(new java.awt.Color(102, 255, 51));
        BottonAgregarAtleta.setText("Agregar");
        BottonAgregarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonAgregarAtletaActionPerformed(evt);
            }
        });
        panel_atletas_agregar.add(BottonAgregarAtleta);
        BottonAgregarAtleta.setBounds(190, 270, 120, 28);

        jTabbedPane3.addTab("tab1", panel_atletas_agregar);

        panel_atletas_consultar.setLayout(null);

        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        panel_atletas_consultar.add(jComboBox9);
        jComboBox9.setBounds(60, 40, 270, 26);

        jLabel18.setText("Identificacion de Atletas");
        panel_atletas_consultar.add(jLabel18);
        jLabel18.setBounds(120, 20, 190, 16);

        jLabel19.setText("1");
        panel_atletas_consultar.add(jLabel19);
        jLabel19.setBounds(40, 120, 310, 20);

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_atletas_consultar.add(jButton4);
        jButton4.setBounds(130, 70, 110, 28);

        jLabel20.setText("jLabel20");
        panel_atletas_consultar.add(jLabel20);
        jLabel20.setBounds(40, 150, 310, 20);

        jLabel21.setText("jLabel21");
        panel_atletas_consultar.add(jLabel21);
        jLabel21.setBounds(40, 180, 300, 16);

        jLabel22.setText("jLabel22");
        panel_atletas_consultar.add(jLabel22);
        jLabel22.setBounds(40, 210, 330, 16);

        jLabel23.setText("jLabel23");
        panel_atletas_consultar.add(jLabel23);
        jLabel23.setBounds(40, 240, 320, 16);

        jTabbedPane3.addTab("tab2", panel_atletas_consultar);

        panel_atletas_modificar.setLayout(null);

        jLabel25.setText("Identificacion del atleta");
        panel_atletas_modificar.add(jLabel25);
        jLabel25.setBounds(140, 10, 130, 20);

        panel_atletas_modificar.add(jComboBox11);
        jComboBox11.setBounds(120, 30, 180, 26);

        jButton6.setBackground(new java.awt.Color(0, 204, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel_atletas_modificar.add(jButton6);
        jButton6.setBounds(140, 260, 130, 28);

        jLabel26.setText("Nombre");
        panel_atletas_modificar.add(jLabel26);
        jLabel26.setBounds(70, 70, 90, 20);

        jLabel27.setText("Apellido 1");
        panel_atletas_modificar.add(jLabel27);
        jLabel27.setBounds(60, 100, 80, 20);

        jLabel28.setText("Apellido 2");
        panel_atletas_modificar.add(jLabel28);
        jLabel28.setBounds(60, 130, 70, 20);

        jLabel29.setText("Fecha de nacimiento");
        panel_atletas_modificar.add(jLabel29);
        jLabel29.setBounds(10, 160, 150, 20);

        jLabel30.setText("Correo");
        panel_atletas_modificar.add(jLabel30);
        jLabel30.setBounds(80, 190, 60, 20);

        jLabel31.setText("Telefono");
        panel_atletas_modificar.add(jLabel31);
        jLabel31.setBounds(70, 220, 90, 20);
        panel_atletas_modificar.add(jTextField2);
        jTextField2.setBounds(130, 70, 210, 28);
        panel_atletas_modificar.add(jTextField3);
        jTextField3.setBounds(130, 100, 210, 28);

        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        panel_atletas_modificar.add(jTextField4);
        jTextField4.setBounds(130, 130, 210, 28);
        panel_atletas_modificar.add(jTextField5);
        jTextField5.setBounds(130, 160, 210, 28);
        panel_atletas_modificar.add(jTextField6);
        jTextField6.setBounds(130, 190, 210, 28);
        panel_atletas_modificar.add(jTextField7);
        jTextField7.setBounds(130, 220, 210, 28);

        jTabbedPane3.addTab("tab3", panel_atletas_modificar);

        panel_atletas_borrar.setLayout(null);

        jLabel24.setText("Identificacion de Atletas");
        panel_atletas_borrar.add(jLabel24);
        jLabel24.setBounds(110, 80, 150, 16);

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_atletas_borrar.add(jButton5);
        jButton5.setBounds(140, 150, 75, 28);

        panel_atletas_borrar.add(jComboBox10);
        jComboBox10.setBounds(90, 110, 180, 26);

        jTabbedPane3.addTab("tab4", panel_atletas_borrar);

        Panel_atletas.add(jTabbedPane3);
        jTabbedPane3.setBounds(150, 10, 370, 350);

        jTabbedPane1.addTab("tab2", Panel_atletas);

        Panel_competencias.setLayout(null);

        Panel_competenciastop.setBackground(new java.awt.Color(102, 102, 102));
        Panel_competenciastop.setLayout(null);
        Panel_competencias.add(Panel_competenciastop);
        Panel_competenciastop.setBounds(5, 5, 570, 40);

        Panel_botonescompetencias.setLayout(null);

        button_competencias_agregar.setText("Agregar");
        button_competencias_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_competencias_agregarActionPerformed(evt);
            }
        });
        Panel_botonescompetencias.add(button_competencias_agregar);
        button_competencias_agregar.setBounds(10, 40, 138, 28);

        button_competencias_consultar.setText("Consultar ");
        button_competencias_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_competencias_consultarActionPerformed(evt);
            }
        });
        Panel_botonescompetencias.add(button_competencias_consultar);
        button_competencias_consultar.setBounds(10, 100, 138, 28);

        button_competencias_modificar.setText("Modificar");
        button_competencias_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_competencias_modificarActionPerformed(evt);
            }
        });
        Panel_botonescompetencias.add(button_competencias_modificar);
        button_competencias_modificar.setBounds(10, 160, 138, 28);

        button_competencias_borrar.setText("Borrar");
        button_competencias_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_competencias_borrarActionPerformed(evt);
            }
        });
        Panel_botonescompetencias.add(button_competencias_borrar);
        button_competencias_borrar.setBounds(10, 210, 138, 28);

        Panel_competencias.add(Panel_botonescompetencias);
        Panel_botonescompetencias.setBounds(0, 40, 150, 320);

        panel_competencias_default.setLayout(null);
        jTabbedPane4.addTab("tab1", panel_competencias_default);

        panel_competencias_agregar.setLayout(null);

        jLabel32.setText("Nombre:");
        panel_competencias_agregar.add(jLabel32);
        jLabel32.setBounds(57, 30, 60, 16);
        panel_competencias_agregar.add(jTextField9);
        jTextField9.setBounds(120, 20, 200, 28);

        jLabel34.setText("Identificación:");
        panel_competencias_agregar.add(jLabel34);
        jLabel34.setBounds(50, 70, 80, 10);
        panel_competencias_agregar.add(jTextField11);
        jTextField11.setBounds(120, 100, 200, 28);

        jLabel35.setText("País:");
        panel_competencias_agregar.add(jLabel35);
        jLabel35.setBounds(70, 110, 48, 16);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        panel_competencias_agregar.add(jTextField12);
        jTextField12.setBounds(120, 140, 200, 28);

        jLabel36.setText("Lugar:");
        panel_competencias_agregar.add(jLabel36);
        jLabel36.setBounds(60, 150, 48, 16);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        panel_competencias_agregar.add(jTextField13);
        jTextField13.setBounds(120, 180, 200, 28);

        jLabel37.setText("Fecha Inicial:");
        panel_competencias_agregar.add(jLabel37);
        jLabel37.setBounds(40, 190, 90, 16);

        button_agregar_competencia.setBackground(new java.awt.Color(0, 204, 0));
        button_agregar_competencia.setText("Agregar");
        button_agregar_competencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_agregar_competenciaActionPerformed(evt);
            }
        });
        panel_competencias_agregar.add(button_agregar_competencia);
        button_agregar_competencia.setBounds(167, 270, 100, 28);

        jLabel38.setText("Fecha Final:");
        panel_competencias_agregar.add(jLabel38);
        jLabel38.setBounds(40, 230, 90, 16);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        panel_competencias_agregar.add(jTextField14);
        jTextField14.setBounds(120, 220, 200, 28);

        jLabel43.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel43.setText("0");
        jLabel43.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel43AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panel_competencias_agregar.add(jLabel43);
        jLabel43.setBounds(210, 70, 48, 16);

        jTabbedPane4.addTab("tab2", panel_competencias_agregar);

        panel_competencias_consultar.setLayout(null);

        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        panel_competencias_consultar.add(jComboBox12);
        jComboBox12.setBounds(100, 20, 200, 26);

        jLabel40.setText("Competencia:");
        panel_competencias_consultar.add(jLabel40);
        jLabel40.setBounds(10, 20, 90, 20);

        panel_competencias_consultar.add(jComboBox13);
        jComboBox13.setBounds(100, 100, 200, 26);

        jLabel44.setText("Disciplinas:");
        panel_competencias_consultar.add(jLabel44);
        jLabel44.setBounds(20, 100, 80, 16);

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setText("Consultar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel_competencias_consultar.add(jButton8);
        jButton8.setBounds(150, 60, 90, 28);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(null);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        panel_competencias_consultar.add(jScrollPane2);
        jScrollPane2.setBounds(10, 140, 360, 160);

        jTabbedPane4.addTab("tab3", panel_competencias_consultar);

        panel_competencias_modificar.setLayout(null);

        jLabel45.setText("Competencia:");
        panel_competencias_modificar.add(jLabel45);
        jLabel45.setBounds(10, 40, 100, 16);

        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jComboBox14);
        jComboBox14.setBounds(90, 30, 130, 26);
        panel_competencias_modificar.add(jList3);
        jList3.setBounds(230, 80, 130, 170);

        jButton9.setBackground(new java.awt.Color(0, 255, 0));
        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jButton9);
        jButton9.setBounds(210, 270, 80, 28);

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setText("Eliminar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jButton10);
        jButton10.setBounds(290, 270, 80, 28);

        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jComboBox15);
        jComboBox15.setBounds(230, 30, 140, 26);

        jLabel46.setText("Disciplina");
        panel_competencias_modificar.add(jLabel46);
        jLabel46.setBounds(270, 10, 80, 16);

        jLabel47.setText("País:");
        panel_competencias_modificar.add(jLabel47);
        jLabel47.setBounds(30, 120, 50, 16);
        panel_competencias_modificar.add(jTextField15);
        jTextField15.setBounds(90, 120, 120, 28);

        jLabel48.setText("Lugar:");
        panel_competencias_modificar.add(jLabel48);
        jLabel48.setBounds(30, 160, 50, 16);

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jTextField16);
        jTextField16.setBounds(90, 150, 120, 28);

        jLabel49.setText("Fecha Inicial:");
        panel_competencias_modificar.add(jLabel49);
        jLabel49.setBounds(10, 190, 100, 16);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jTextField17);
        jTextField17.setBounds(90, 180, 120, 28);

        jLabel50.setText("Fecha Final:");
        panel_competencias_modificar.add(jLabel50);
        jLabel50.setBounds(10, 230, 90, 16);

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jTextField18);
        jTextField18.setBounds(90, 220, 120, 28);

        jLabel51.setText("Nombre:");
        panel_competencias_modificar.add(jLabel51);
        jLabel51.setBounds(20, 80, 60, 16);
        panel_competencias_modificar.add(jTextField10);
        jTextField10.setBounds(90, 80, 120, 28);

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setText("Guardar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panel_competencias_modificar.add(jButton11);
        jButton11.setBounds(50, 270, 140, 28);

        jTabbedPane4.addTab("tab4", panel_competencias_modificar);

        panel_competencias_borrar.setLayout(null);

        jLabel52.setText("Competencia:");
        panel_competencias_borrar.add(jLabel52);
        jLabel52.setBounds(10, 100, 110, 16);

        panel_competencias_borrar.add(jComboBox16);
        jComboBox16.setBounds(100, 86, 240, 40);

        jButton12.setBackground(new java.awt.Color(204, 0, 51));
        jButton12.setText("Eliminar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panel_competencias_borrar.add(jButton12);
        jButton12.setBounds(140, 160, 110, 30);

        jTabbedPane4.addTab("tab5", panel_competencias_borrar);

        Panel_competencias.add(jTabbedPane4);
        jTabbedPane4.setBounds(180, 10, 390, 340);

        jTabbedPane1.addTab("tab3", Panel_competencias);

        Panel_registros.setLayout(null);

        Panel_registrotop.setBackground(new java.awt.Color(102, 102, 102));
        Panel_registrotop.setLayout(null);
        Panel_registros.add(Panel_registrotop);
        Panel_registrotop.setBounds(5, 5, 570, 40);

        Panel_botonesregistro.setLayout(null);

        button_registro_agregar.setText("Agregar");
        button_registro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registro_agregarActionPerformed(evt);
            }
        });
        Panel_botonesregistro.add(button_registro_agregar);
        button_registro_agregar.setBounds(10, 140, 138, 28);

        Panel_registros.add(Panel_botonesregistro);
        Panel_botonesregistro.setBounds(0, 40, 150, 320);

        panel_registro_default.setLayout(null);
        jTabbedPane5.addTab("tab1", panel_registro_default);

        panel_registro_agregar.setLayout(null);

        jLabel53.setText("Identificacion del Atleta");
        panel_registro_agregar.add(jLabel53);
        jLabel53.setBounds(10, 30, 170, 20);

        panel_registro_agregar.add(jComboBox17);
        jComboBox17.setBounds(170, 30, 200, 26);

        jLabel54.setText("Competencia");
        panel_registro_agregar.add(jLabel54);
        jLabel54.setBounds(10, 80, 160, 20);

        panel_registro_agregar.add(jComboBox18);
        jComboBox18.setBounds(100, 80, 180, 26);

        jLabel55.setText("Disciplina");
        panel_registro_agregar.add(jLabel55);
        jLabel55.setBounds(30, 130, 120, 20);

        panel_registro_agregar.add(jComboBox19);
        jComboBox19.setBounds(100, 130, 180, 26);

        jLabel56.setText("Prueba");
        panel_registro_agregar.add(jLabel56);
        jLabel56.setBounds(90, 180, 120, 20);

        panel_registro_agregar.add(jComboBox20);
        jComboBox20.setBounds(170, 180, 200, 26);

        jLabel57.setText("Marca");
        panel_registro_agregar.add(jLabel57);
        jLabel57.setBounds(40, 230, 60, 20);

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        panel_registro_agregar.add(jTextField19);
        jTextField19.setBounds(90, 230, 90, 28);

        jButton13.setBackground(new java.awt.Color(0, 204, 0));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Agregar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panel_registro_agregar.add(jButton13);
        jButton13.setBounds(110, 270, 140, 28);

        jButton14.setBackground(new java.awt.Color(0, 153, 255));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Seleccionar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panel_registro_agregar.add(jButton14);
        jButton14.setBounds(290, 80, 100, 28);

        jButton17.setBackground(new java.awt.Color(0, 153, 255));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Seleccionar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        panel_registro_agregar.add(jButton17);
        jButton17.setBounds(290, 130, 100, 28);

        jLabel58.setText("Dorsal");
        panel_registro_agregar.add(jLabel58);
        jLabel58.setBounds(210, 230, 60, 20);
        panel_registro_agregar.add(jTextField20);
        jTextField20.setBounds(260, 230, 110, 28);

        jTabbedPane5.addTab("tab2", panel_registro_agregar);

        Panel_registros.add(jTabbedPane5);
        jTabbedPane5.setBounds(180, 10, 390, 340);

        jTabbedPane1.addTab("tab4", Panel_registros);

        Panel_configuracion.setLayout(null);

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel39.setText("Cantidad de Atletas a desplegar:");
        Panel_configuracion.add(jLabel39);
        jLabel39.setBounds(40, 190, 390, 40);

        jLabel41.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel41.setText("Secuencial  de Competencia:");
        Panel_configuracion.add(jLabel41);
        jLabel41.setBounds(60, 50, 370, 40);

        jLabel42.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel42.setText("0");
        Panel_configuracion.add(jLabel42);
        jLabel42.setBounds(440, 50, 30, 50);

        jTextField8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        Panel_configuracion.add(jTextField8);
        jTextField8.setBounds(410, 190, 80, 40);

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_configuracion.add(jButton7);
        jButton7.setBounds(230, 280, 120, 30);

        jTabbedPane1.addTab("tab7", Panel_configuracion);

        Panel_listado.setLayout(null);

        jPanel2.setLayout(null);

        jButton18.setText("Atleta");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(0, 30, 120, 28);

        jButton15.setText("Competencia");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(0, 80, 120, 28);

        jButton16.setText("Mejores");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);
        jButton16.setBounds(0, 140, 120, 28);

        jButton19.setText("Prueba");
        jPanel2.add(jButton19);
        jButton19.setBounds(0, 200, 120, 28);

        Panel_listado.add(jPanel2);
        jPanel2.setBounds(10, 50, 120, 300);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);
        Panel_listado.add(jPanel3);
        jPanel3.setBounds(0, 0, 580, 50);

        jPanel4.setLayout(null);
        jTabbedPane6.addTab("tab1", jPanel4);

        jPanel5.setLayout(null);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCursor(null);
        jTextArea2.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 430, 300);

        jTabbedPane6.addTab("tab2", jPanel5);

        jPanel6.setLayout(null);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setCursor(null);
        jTextArea4.setFocusable(false);
        jScrollPane5.setViewportView(jTextArea4);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 430, 300);

        jTabbedPane6.addTab("tab3", jPanel6);

        jPanel7.setLayout(null);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setCursor(null);
        jTextArea5.setFocusable(false);
        jScrollPane6.setViewportView(jTextArea5);

        jPanel7.add(jScrollPane6);
        jScrollPane6.setBounds(0, 0, 430, 300);

        jTabbedPane6.addTab("tab4", jPanel7);

        jPanel8.setLayout(null);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setCursor(null);
        jTextArea6.setFocusable(false);
        jScrollPane7.setViewportView(jTextArea6);

        jPanel8.add(jScrollPane7);
        jScrollPane7.setBounds(0, 0, 430, 300);

        jTabbedPane6.addTab("tab5", jPanel8);

        Panel_listado.add(jTabbedPane6);
        jTabbedPane6.setBounds(130, 20, 430, 330);

        jTabbedPane1.addTab("tab5", Panel_listado);

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
        jTabbedPane1.setSelectedIndex(6);
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
        jTabbedPane1.setSelectedIndex(5);
        jLabel42.setText(secuencialCompetencia +"");
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
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_button_atletas_agregarActionPerformed

    private void button_atletas_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_consultarActionPerformed
        jTabbedPane3.setSelectedIndex(2);
        jLabel19.setText("");
        jLabel20.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
    }//GEN-LAST:event_button_atletas_consultarActionPerformed

    private void button_atletas_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_modificarActionPerformed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_button_atletas_modificarActionPerformed

    private void button_atletas_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atletas_borrarActionPerformed
        jTabbedPane3.setSelectedIndex(4);
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

    public boolean validarFecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public boolean validarFormatoCorreo(String correo){
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar
        Matcher mather = pattern.matcher(correo);

        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
    
    private void BottonAgregarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonAgregarAtletaActionPerformed
        boolean bandera = true;
        if(NombreAtletaTextField.getText().equals("") || Apellido1TextField.getText().equals("") 
           || Apellido2TextField.getText().equals("") || IdentificacionTextField.getText().equals("")
           || PaisTextField.getText().equals("") || NacimientoTextField.getText().equals("") ||
           CorreoTextField.getText().equals("") || TelefonoTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje espacios en blanco!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String nombre = "";
            String apellido = "";
            String apellido2 = "";
            String identificacion = "";
            String correo = "";
            String fecha = "";
            String telefono = "";
            String pais = "";
                           
            
            //Validacion Nombre
            if(NombreAtletaTextField.getText().length()<2 || NombreAtletaTextField.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El nombre del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                nombre = NombreAtletaTextField.getText();
            }
            
            //Validacion Apellido 1
            if(Apellido1TextField.getText().length()<2 || Apellido1TextField.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El apellido 1 del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                apellido = Apellido1TextField.getText();
            }
            
            //Validacion Apellido 2
            if(Apellido2TextField.getText().length()<2 || Apellido2TextField.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El apellido 2 del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                 apellido2 = Apellido2TextField.getText();
            }
            
            //Validacion Identificacion
            if(IdentificacionTextField.getText().length()<9 || IdentificacionTextField.getText().length()>20){
                JOptionPane.showMessageDialog(null, "La identificacion del atleta debe contener de 9 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                if(mainregister.verificarIdentificacionRepetida(IdentificacionTextField.getText())){
                  JOptionPane.showMessageDialog(null, "La identificacion ya existe!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
                }
                else{
                     identificacion = IdentificacionTextField.getText();
                }
            }
            
            //Validacion del Pais
            if(PaisTextField.getText().length() != 3){
                JOptionPane.showMessageDialog(null, "El pais debe tener 3 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                pais = PaisTextField.getText();
            }
            
            //Validacion fecha
            if(!validarFecha(NacimientoTextField.getText())){
                JOptionPane.showMessageDialog(null, "Fecha invalida!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 fecha = NacimientoTextField.getText();
            }
            
            //Validacion correo
            if(!validarFormatoCorreo(CorreoTextField.getText())){
                JOptionPane.showMessageDialog(null, "Correo invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 correo = CorreoTextField.getText();
            }
                      
            //Validacion telefono
            if(TelefonoTextField.getText().length() != 20){
                JOptionPane.showMessageDialog(null, "El telefono debe tener 20 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 telefono = TelefonoTextField.getText();
            }
            
            //Agregar Atleta
            if(bandera){
                Atleta atleta = new Atleta(nombre,apellido,apellido2,identificacion, pais, fecha, correo, telefono);
                mainregister.agregarAtleta(atleta);
                JOptionPane.showMessageDialog(null, "ATLETA AGREGADO CON EXITO!",
                    "EXITO", JOptionPane.INFORMATION_MESSAGE);
                
                NombreAtletaTextField.setText("");
                Apellido1TextField.setText("");
                Apellido2TextField.setText("");
                IdentificacionTextField.setText("");
                NacimientoTextField.setText("");
                PaisTextField.setText("");
                CorreoTextField.setText("");
                TelefonoTextField.setText("");
                
                jComboBox9.removeAllItems();
                jComboBox10.removeAllItems();
                jComboBox11.removeAllItems();
                jComboBox17.removeAllItems();
                
                ArrayList<Atleta> atletas = mainregister.getRegistroAtletas();
       
                for(Atleta atleta1: atletas){
                    jComboBox9.addItem(atleta1.getIdentificacion());
                    jComboBox10.addItem(atleta1.getIdentificacion());
                    jComboBox11.addItem(atleta1.getIdentificacion());
                    jComboBox17.addItem(atleta1.getIdentificacion());

                }
                
            }
 
        }
    }//GEN-LAST:event_BottonAgregarAtletaActionPerformed

    private void NombreAtletaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAtletaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAtletaTextFieldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String pIdentificacion = jComboBox9.getSelectedItem().toString();
        ArrayList<Atleta> atletas = mainregister.getRegistroAtletas();
        for(Atleta atleta1: atletas){
            if(atleta1.getIdentificacion().equals(pIdentificacion)){
                jLabel19.setText("Nombre: "+ atleta1.getNombreCompleto());
                jLabel20.setText("Pais: "+ atleta1.getPais());
                jLabel21.setText("Nacimiento: "+ atleta1.getFecha());
                jLabel22.setText("Correo: "+ atleta1.getCorreo());
                jLabel23.setText("Telefono: "+ atleta1.getTelefono());
               
           }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed

    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String pIdentificacion = jComboBox10.getSelectedItem().toString();
        mainregister.eliminarAtleta(pIdentificacion);
        jComboBox9.removeAllItems();
        jComboBox10.removeAllItems();
        jComboBox11.removeAllItems();
        jComboBox17.removeAllItems();


        ArrayList<Atleta> atletas = mainregister.getRegistroAtletas();

        for(Atleta atleta1: atletas){
            jComboBox9.addItem(atleta1.getIdentificacion());
            jComboBox10.addItem(atleta1.getIdentificacion());
            jComboBox11.addItem(atleta1.getIdentificacion());
            jComboBox17.addItem(atleta1.getIdentificacion());
        }
        
        JOptionPane.showMessageDialog(null, "ATLETA ELIMIINADO CON EXITO!",
        "EXITO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
              
        boolean bandera = true;
            String nombre = "";
            String apellido = "";
            String apellido2 = "";
            String correo = "";
            String fecha = "";
            String telefono = "";
            String pais = "";
                           
            
            //Validacion Nombre
            if(jTextField2.getText().length()<2 || jTextField2.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El nombre del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                nombre = jTextField2.getText();
            }
            
            //Validacion Apellido 1
            if(jTextField3.getText().length()<2 || jTextField3.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El apellido 1 del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                apellido = jTextField3.getText();
            }
            
            //Validacion Apellido 2
            if(jTextField4.getText().length()<2 || jTextField4.getText().length()>20){
                JOptionPane.showMessageDialog(null, "El apellido 2 del atleta debe contener de 2 a 20 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
            else{
                 apellido2 = jTextField4.getText();
            }
                                
            //Validacion fecha
            if(!validarFecha(jTextField5.getText())){
                JOptionPane.showMessageDialog(null, "Fecha invalida!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 fecha = jTextField5.getText();
            }
            
            //Validacion correo
            if(!validarFormatoCorreo(jTextField6.getText())){
                JOptionPane.showMessageDialog(null, "Correo invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 correo = jTextField6.getText();
            }
                      
            //Validacion telefono
            if(jTextField7.getText().length() != 20){
                JOptionPane.showMessageDialog(null, "El telefono debe tener 20 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
            }
            else{
                 telefono = jTextField7.getText();
            }
            
            //Agregar Atleta
            if(bandera){
                ArrayList<Atleta> atleta = mainregister.getRegistroAtletas();
                for(Atleta atleta1: atleta){
                    if(atleta1.getIdentificacion().equals(jComboBox11.getSelectedItem().toString())){
                        atleta1.setNombre(nombre);
                        atleta1.setApellido1(apellido);
                        atleta1.setApellido2(apellido2);
                        atleta1.setFecha(fecha);
                        atleta1.setCorreo(correo);
                        atleta1.setTelefono(telefono);
                        break;
                    }
                }
                
                JOptionPane.showMessageDialog(null, "ATLETA MODIFICADO CON EXITO!",
                    "EXITO", JOptionPane.INFORMATION_MESSAGE);
                
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
                jComboBox9.removeAllItems();
                jComboBox10.removeAllItems();
                jComboBox11.removeAllItems();
                
                ArrayList<Atleta> atletas = mainregister.getRegistroAtletas();
       
                for(Atleta atleta1: atletas){
                    jComboBox9.addItem(atleta1.getIdentificacion());
                    jComboBox10.addItem(atleta1.getIdentificacion());
                    jComboBox11.addItem(atleta1.getIdentificacion());
                }
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void button_competencias_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_competencias_agregarActionPerformed
        jTabbedPane4.setSelectedIndex(1);
        jLabel43.setText(secuencialCompetencia + "");
        
        

    }//GEN-LAST:event_button_competencias_agregarActionPerformed

    private void button_competencias_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_competencias_consultarActionPerformed
        jTabbedPane4.setSelectedIndex(2);
        jTextArea1.setText("");
        jComboBox12.removeAllItems();
        for (Competencia competencia:mainregister.getRegistroCompetencias()){
           jComboBox12.addItem(competencia.getNombre());
        }
    }//GEN-LAST:event_button_competencias_consultarActionPerformed

    private void button_competencias_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_competencias_modificarActionPerformed
        jTabbedPane4.setSelectedIndex(3);
        jComboBox14.removeAllItems();
        for (Competencia competencia:mainregister.getRegistroCompetencias()){
           jComboBox14.addItem(competencia.getNombre());
        }
    }//GEN-LAST:event_button_competencias_modificarActionPerformed

    private void button_competencias_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_competencias_borrarActionPerformed
        jTabbedPane4.setSelectedIndex(4);
        jComboBox16.removeAllItems();
        for(Competencia competencia:mainregister.getRegistroCompetencias()){
            jComboBox16.addItem(competencia.getNombre());
        }
    }//GEN-LAST:event_button_competencias_borrarActionPerformed
     
    public void definirSecuencial(){
        int cont = 1;
        boolean flag = true;
        while(true){
            for(Competencia competencia: mainregister.getRegistroCompetencias()){
                if(competencia.getIdentificacion() == cont){
                    flag = false;
                }
            }
            if(flag){
                secuencialCompetencia = cont;
                break;
            }else{
                flag = true;
                cont++;
            }
        }
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jTextField8.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe escribir una cantidad!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(Integer.parseInt(jTextField8.getText()) > 50 ||
               Integer.parseInt(jTextField8.getText()) < 0){
                JOptionPane.showMessageDialog(null, "La cantidad debe estar entre 0 y 50!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                cantatletas = Integer.parseInt(jTextField8.getText());
                jTextField8.setText("");
                JOptionPane.showMessageDialog(null,"Configuración Guardada con Éxito!");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        String numero= jTextField8.getText();
        int size = numero.length();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(size<2){
                jTextField8.setEditable(true);
            }else{
                jTextField8.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE ||
                evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                jTextField8.setEditable(true);
            }else{
                jTextField8.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try{
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox14.getSelectedItem().toString())){
                    selected = competencia;
                    break;
                }
            }
            DefaultListModel modelo = new DefaultListModel(); 
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                modelo.addElement(disciplina);
            }
            String eliminar = modelo.getElementAt(jList3.getSelectedIndex()).toString();
            for (Disciplina disciplina:selected.getRegistroDisciplinas()){
                if(disciplina.toString().equals(eliminar)){
                    selected.getRegistroDisciplinas().remove(disciplina);
                    modelo.removeElementAt(jList3.getSelectedIndex());
                    jList3.setModel(modelo);
                    JOptionPane.showMessageDialog(null,"Disciplina Eliminada con exito!");
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe elegir una disciplina antes de eliminar",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jComboBox15.getSelectedItem() != null){
            Disciplina disciplinaselected = new Disciplina("","");
            for(Disciplina disciplina: mainregister.getRegistroDisciplinas()){
                if(disciplina.getNombre().equals(jComboBox15.getSelectedItem().toString())){
                    disciplinaselected = disciplina;
                    break;
                }
            }
            Competencia competenciaselected = new Competencia();
            for(Competencia competencia: mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox14.getSelectedItem().toString())){
                    competenciaselected = competencia;
                }
            }
            boolean existe = false;
            for(Disciplina disciplina:competenciaselected.getRegistroDisciplinas()){
                if(disciplina.getNombre().equals(disciplinaselected.getNombre())){
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Esa disciplina ya está en la competencia!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(!existe){
                competenciaselected.getRegistroDisciplinas().add(disciplinaselected);
                DefaultListModel modelo = new DefaultListModel(); 
                for(Disciplina disciplina:competenciaselected.getRegistroDisciplinas()){
                    modelo.addElement(disciplina);
                }
                jList3.setModel(modelo);
                JOptionPane.showMessageDialog(null, "Disciplina Agregada con éxito!");
            }  
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        if(jComboBox14.getSelectedItem() != null){
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
               if(competencia.getNombre().equals(jComboBox14.getSelectedItem().toString())){
                   selected = competencia;
                   break;
                }
            }
            jComboBox15.removeAllItems();
            for(Disciplina disciplina:mainregister.getRegistroDisciplinas()){
                jComboBox15.addItem(disciplina.toString());
            }
            DefaultListModel modelo = new DefaultListModel(); 
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                modelo.addElement(disciplina);
            }
            jList3.setModel(modelo);  
        }

    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try{
            jComboBox14.getSelectedItem().equals(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una competencia primero!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = "";
        String pais = "";
        String lugar = "";
        String fechainicial = "";
        String fechafinal = "";
        boolean flag = true;
        if(!jTextField10.getText().equals("")){
            if(jTextField10.getText().length() < 5 || jTextField10.getText().length() > 60){
                JOptionPane.showMessageDialog(null, "El nombre de la competencia debe contener de 5 a 60 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                nombre = jTextField10.getText();
            }
        }
        if(!jTextField15.getText().equals("")){
            if(jTextField15.getText().length() != 3){
                JOptionPane.showMessageDialog(null, "El pais debe tener 3 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                pais = jTextField15.getText();
            }
        }
        if(!jTextField16.getText().equals("")){
            if(jTextField16.getText().length() < 5 || jTextField16.getText().length() > 60){
                JOptionPane.showMessageDialog(null, "El lugar debe tener de 5 a 60 caracteres!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                lugar = jTextField16.getText();
            }
        }
        if(!jTextField17.getText().equals("")){
            if(!validarFecha(jTextField17.getText())){
                JOptionPane.showMessageDialog(null, " Formato de Fecha Incial invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    flag = false;
            }
            else{
                fechainicial = jTextField17.getText();
            }
        }
        if(!jTextField18.getText().equals("")){
            if(!validarFecha(jTextField18.getText())){
                JOptionPane.showMessageDialog(null, " Formato de Fecha Incial invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    flag = false;
            }
            else{
                fechafinal = jTextField18.getText();
            }
        }
        if(flag){
            Competencia selected = new Competencia();
            for(Competencia competencia :mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(nombre)){
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Esa competencia ya existe!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                if(competencia.getNombre().equals(jComboBox14.getSelectedItem().toString())){
                    selected = competencia;
                }
            }
            if(flag){
                //crea los objetos de tipo fecha con java.time
                if(fechainicial.equals("")){
                    fechainicial = selected.getFechaInicial();
                }
                if(fechafinal.equals("")){
                    fechafinal = selected.getFechaFinal();
                }
                LocalDate Finicial = LocalDate.parse(fechainicial, DateTimeFormatter.ofPattern("d/M/yyyy"));;
                LocalDate Ffinal = LocalDate.parse(fechafinal, DateTimeFormatter.ofPattern("d/M/yyyy") );
                if(Ffinal.isBefore(Finicial)){
                    JOptionPane.showMessageDialog(null, " La fecha inicial debe ser menor o igual a la final!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(flag){
                        if(!nombre.equals("")){
                            selected.setNombre(nombre);
                        }
                        if(!pais.equals("")){
                            selected.setPais(pais);
                        } 
                        if(!lugar.equals("")){
                            selected.setLugar(lugar);
                        }
                        if(!fechainicial.equals("")){
                            selected.setFechaInicial(fechainicial);
                        }
                        if(!fechafinal.equals("")){
                            selected.setFechaFinal(fechafinal);
                        }
                        jComboBox15.removeAllItems();
                        jList3.setModel(new DefaultListModel());
                        jComboBox14.removeAllItems();
                        for (Competencia competencia:mainregister.getRegistroCompetencias()){
                           jComboBox14.addItem(competencia.getNombre());
                        }
                        jTextField10.setText("");
                        jTextField15.setText("");
                        jTextField16.setText("");
                        jTextField17.setText("");
                        jTextField18.setText("");
                        JOptionPane.showMessageDialog(null, "Competencia Modificada con Éxito!");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(jComboBox16.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Competencia!",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Competencia selected = new Competencia();
        for(Competencia competencia:mainregister.getRegistroCompetencias()){
            if(competencia.getNombre().equals(jComboBox16.getSelectedItem().toString())){
                selected = competencia;
                break;
            }
        }
        mainregister.getRegistroCompetencias().remove(selected);
        jComboBox16.removeAllItems();
        for(Competencia competencia:mainregister.getRegistroCompetencias()){
            jComboBox16.addItem(competencia.getNombre());
        }
        definirSecuencial();
        JOptionPane.showMessageDialog(null, "Competencia Eliminada con Éxito!");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void button_registro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registro_agregarActionPerformed
        jTabbedPane5.setSelectedIndex(1);
        jComboBox17.removeAllItems();
        for(Atleta atl:mainregister.getRegistroAtletas()){
            jComboBox17.addItem(atl.getIdentificacion());
        }
        jComboBox18.removeAllItems();
        for (Competencia competencia:mainregister.getRegistroCompetencias()){
           jComboBox18.addItem(competencia.getNombre());
        }
        ArrayList<Competencia> competencias = mainregister.getRegistroCompetencias();      
    }//GEN-LAST:event_button_registro_agregarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jComboBox12.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una Competencia para consultar!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox12.getSelectedItem())){
                    selected = competencia;
                    break;
                }
            }
            jComboBox13.removeAllItems();
            
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                jComboBox13.addItem(disciplina.getNombre());
            }
            jTextArea1.setText(selected.toString());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void button_agregar_competenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_agregar_competenciaActionPerformed
        boolean flag = true;

        if(jTextField9.getText().equals("") ||
            jTextField11.getText().equals("") || jTextField12.getText().equals("")||
            jTextField13.getText().equals("") || jTextField14.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No deje espacios en blanco!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            String nombre = "";
            String pais = "";
            String lugar = "";
            String fechainicial = "";
            String fechafinal = "";

            if(jTextField9.getText().length() < 5 || jTextField9.getText().length() > 60){
                JOptionPane.showMessageDialog(null, "El nombre de la competencia debe contener de 5 a 60 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                nombre = jTextField9.getText();
            }

            if(jTextField11.getText().length() != 3){
                JOptionPane.showMessageDialog(null, "El pais debe tener 3 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                pais = jTextField11.getText();
            }

            if(jTextField12.getText().length() < 5 || jTextField12.getText().length() > 60){
                JOptionPane.showMessageDialog(null, "El lugar debe tener de 5 a 60 caracteres!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }else{
                lugar = jTextField12.getText();
            }

            if(!validarFecha(jTextField13.getText())){
                JOptionPane.showMessageDialog(null, " Formato de Fecha Incial invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }
            else{
                fechainicial = jTextField13.getText();
            }

            if(!validarFecha(jTextField14.getText())){
                JOptionPane.showMessageDialog(null, " Formato de Fecha Incial invalido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }
            else{
                fechafinal = jTextField14.getText();
            }

            if(flag){
                //crea los objetos de tipo fecha con java.time
                LocalDate Finicial = LocalDate.parse(fechainicial, DateTimeFormatter.ofPattern("d/M/yyyy"));;
                LocalDate Ffinal = LocalDate.parse(fechafinal, DateTimeFormatter.ofPattern("d/M/yyyy") );
                if(Ffinal.isBefore(Finicial)){
                    JOptionPane.showMessageDialog(null, " La fecha inicial debe ser menor o igual a la final!",
                        "ERROR", JOptionPane.ERROR_MESSAGE);

                }else{
                    for(Competencia competencia :mainregister.getRegistroCompetencias()){
                        if(competencia.getNombre().equals(nombre)){
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Esa competencia ya existe!",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(flag){
                        Competencia nueva = new Competencia(nombre,secuencialCompetencia,pais,lugar,fechainicial,fechafinal);
                        mainregister.getRegistroCompetencias().add(nueva);
                        jTextField9.setText("");
                        jTextField11.setText("");
                        jTextField12.setText("");
                        jTextField13.setText("");
                        jTextField14.setText("");
                        definirSecuencial();
                        jLabel43.setText(secuencialCompetencia + "");
                        JOptionPane.showMessageDialog(null, "Competencia Añadida con Éxito!");
                    }
                }
            }
        }
    }//GEN-LAST:event_button_agregar_competenciaActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jLabel43AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel43AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43AncestorAdded

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(jComboBox18.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una Competencia para consultar!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox18.getSelectedItem())){
                    selected = competencia;
                    break;
                }
            }
            jComboBox19.removeAllItems();
            
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                jComboBox19.addItem(disciplina.getNombre());
            }
            
        }        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(jComboBox18.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una Competencia para consultar!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox18.getSelectedItem())){
                    selected = competencia;
                    break;
                }
            }
                        
            Disciplina selected2 = new Disciplina();
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                if(disciplina.getNombre().equals(jComboBox19.getSelectedItem())){
                    selected2 = disciplina;
                }
            }
            
            jComboBox20.removeAllItems();
            for(Prueba prueba:selected2.getListaPruebas()){
                jComboBox20.addItem(prueba.getNombre());
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    public boolean verificarDorsal(int Dorsal, int idCompetencia, String identificacion, Prueba prueba){
        for(Marca marca:marcas){
            if(marca.getCompetencia().getIdentificacion()== idCompetencia && 
                    marca.getDorsal() == Dorsal && 
                    marca.getAtleta().getIdentificacion().equals(identificacion) && 
                    marca.getPrueba().getNombre().equals(prueba.getNombre())){
                return true;
            }
        }
        return false; 
    }
    
    public boolean verificarParticipacion(int Dorsal, String pIdentificacion){
        if (marcas.isEmpty()){
            return true;
        }
        boolean existe = false;
        for(Marca marca:marcas){
            if(marca.getAtleta().getIdentificacion().equals(pIdentificacion))
                existe = true;
            if (marca.getAtleta().getIdentificacion().equals(pIdentificacion) && marca.getDorsal() == Dorsal){
                return true;
            } 
        }
        if (existe)
            return false;
        else{return true;}
    }
    
    public void ordenarlugares(Competencia competencia, Prueba prueba, int lugar){
        boolean existelugar;
        int actual = lugar;
        Atleta anterior = null;
        while(true){
            existelugar = false;
            for(Marca marca:marcas){
                if(marca.getCompetencia().equals(competencia) && marca.getPrueba().equals(prueba)){
                    if(marca.getLugar() == actual  && anterior == null){
                        anterior = marca.getAtleta();
                        existelugar = true;
                        marca.setLugar(actual + 1);
                        continue;
                    }
                    if(marca.getLugar() == actual && anterior != marca.getAtleta()){
                        anterior = marca.getAtleta();
                        existelugar = true;
                        marca.setLugar(actual + 1);
                        continue;
                    }else if(marca.getLugar() != actual){
                        continue;
                    }else{
                        existelugar =false;
                        break;
                    }
                }
            }
            if(!existelugar){
                break;
            }else{
                ++actual;
            }
        }
    }
    
    public int getLugar(Competencia competencia, Prueba prueba, Atleta atleta, String medida,String marca){
        int lugar = 1;
        if(marcas.isEmpty()){
            return lugar;
        }
        for(Marca marcanow: marcas){
            if(marcanow.getCompetencia().equals(competencia) && 
                marcanow.getPrueba().equals(prueba) &&
                !marcanow.getAtleta().equals(atleta)){
                if(medida.equals("tiempo")){
                    int hrs = Integer.parseInt((marcanow.getMarca().substring(0,2)));
                    int mins = Integer.parseInt((marcanow.getMarca().substring(3,5)));
                    int segs = Integer.parseInt((marcanow.getMarca().substring(6)));
                    
                    int hrs2 = Integer.parseInt((marca.substring(0,2)));
                    int mins2 = Integer.parseInt((marca.substring(3,5)));
                    int segs2 = Integer.parseInt((marca.substring(6)));
                    
                    if(hrs2 > hrs){
                        lugar = marcanow.getLugar();
                        ordenarlugares(competencia,prueba,lugar);
                    }else if (hrs2 == hrs && mins2 > mins ){
                        lugar = marcanow.getLugar();
                        ordenarlugares(competencia,prueba,lugar);
                    }else  if( hrs2 == hrs &&  mins2 == mins && segs2 > segs){
                        lugar = marcanow.getLugar();
                        ordenarlugares(competencia,prueba,lugar);
                    }else{
                        lugar = (marcanow.getLugar()) + 1;
                        ordenarlugares(competencia,prueba,lugar);
                    }
                }else if(medida.toLowerCase().equals("distancia")){
                    String strentera = "";
                    boolean buildstrentera = true;
                    String strdecimal = "";
                    for(int i = 0; i < marcanow.getMarca().length(); i++){
                        if(marcanow.getMarca().charAt(i) == '.'){
                           buildstrentera = false;
                        }else if(buildstrentera){
                            strentera += marcanow.getMarca().charAt(i);
                        }else{
                            strdecimal += marcanow.getMarca().charAt(i);
                        }
                    }
                    String strentera2 = "";
                    buildstrentera = true;
                    String strdecimal2 = "";
                    for(int i = 0; i < marca.length(); i++){
                        if(marca.charAt(i) == '.'){
                           buildstrentera = false;
                        }else if(buildstrentera){
                            strentera2 += marca.charAt(i);
                        }else{
                            strdecimal2 += marca.charAt(i);
                        }
                    }
                    if(Integer.parseInt(strentera) < Integer.parseInt(strentera2)){
                        lugar = marcanow.getLugar();
                        ordenarlugares(competencia,prueba,lugar);
                       
                    }else if(Integer.parseInt(strentera) == Integer.parseInt(strentera2) &&
                            Integer.parseInt(strdecimal) < Integer.parseInt(strdecimal2)){
                        lugar = marcanow.getLugar();
                        ordenarlugares(competencia,prueba,lugar);
                    }else{
                        lugar = marcanow.getLugar() + 1;
                        ordenarlugares(competencia,prueba,lugar);
                    }
                }
            }   
        }
        return lugar;
    }
      
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(jComboBox17.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una atleta!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (jComboBox18.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una competencia!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (jComboBox19.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una disciplina!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (jComboBox20.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe selecccionar una prueba!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(jTextField19.getText())){
            JOptionPane.showMessageDialog(null, "Debe registar una marca!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(jTextField20.getText())){
           JOptionPane.showMessageDialog(null, "Debe registar un dorsal!",
                "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else if(Integer.parseInt(jTextField20.getText()) <1 || Integer.parseInt(jTextField20.getText())>10000){
            JOptionPane.showMessageDialog(null, "El dorsal debe estar entre 1 y 1000!",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }     
        else{
            //identificacion atleta
            String identificacion = jComboBox17.getSelectedItem().toString();
            
            Competencia selected = new Competencia();
            for(Competencia competencia:mainregister.getRegistroCompetencias()){
                if(competencia.getNombre().equals(jComboBox18.getSelectedItem())){
                    selected = competencia;
                    break;
                }
            }
            Disciplina selected2 = new Disciplina();
            for(Disciplina disciplina:selected.getRegistroDisciplinas()){
                if(disciplina.getNombre().equals(jComboBox19.getSelectedItem())){
                    selected2 = disciplina;
                }
            }
            Prueba selected3 = new Prueba();
            for(Prueba prueba:selected2.getListaPruebas()){
                if(prueba.getNombre().equals(jComboBox20.getSelectedItem())){
                    selected3 = prueba;
                }
            }
            
            Atleta selected4 = new Atleta();
            for(Atleta atleta:mainregister.getRegistroAtletas()){
                if(identificacion.equals(atleta.getIdentificacion())){
                    selected4 = atleta;
                }
            }    
            String medida = selected2.getMedida();
            String marca = jTextField19.getText();
            boolean flag = true;
            if (medida.toLowerCase().equals("distancia")){
;
               for(int i = 0; i<marca.length(); i++){
                   if (marca.charAt(i) == ':'){
                      JOptionPane.showMessageDialog(null, "La disciplina se mide en distancia!",
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                      flag = false;
                   }
               }     
            }else{
                for(int i = 0; i<marca.length(); i++){
                   if (marca.charAt(i) == '.'){
                      JOptionPane.showMessageDialog(null, "La disciplina se mide en tiempo!",
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                      flag = false;
                   }
               } 
            }      
            int idCompetencia = selected.getIdentificacion();
            int dorsal = Integer.parseInt(jTextField20.getText());
                        
            if(flag){
                if(verificarParticipacion(dorsal,identificacion)){
                    if(!verificarDorsal(dorsal, idCompetencia, identificacion,selected3)){
                        int lugar = getLugar(selected,selected3, selected4, medida,marca);
                        Marca marcaObj = new Marca(selected,selected2,selected3,marca,dorsal,selected4,lugar);
                        marcas.add(marcaObj);
                        JOptionPane.showMessageDialog(null, "Marca Registrada!",
                        "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        jTextField20.setText("");
                        jTextField19.setText("");
                        for(Marca temp: marcas){
                            System.out.println(temp.getAtleta().getNombreCompleto() + " " + temp.getLugar());
                        }
                    } else{
                       JOptionPane.showMessageDialog(null, "Ese numero de dorsal ya se encuentra ocupado en esa"
                               + " prueba!",
                       "ERROR", JOptionPane.ERROR_MESSAGE); 
                    }
                }
                else{
                   JOptionPane.showMessageDialog(null, "Ese numero de dorsal no corresponde al atleta!",
                   "ERROR", JOptionPane.ERROR_MESSAGE);   
                }              
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTabbedPane6.setSelectedIndex(1);
        if(marcas.isEmpty()){
            jTextArea2.setText("");
            return;
        }
        jTextArea2.setText("");
        int cont = 0;
        ArrayList<Atleta> atletas = new ArrayList<>();
        for(Marca marca:marcas){
            if(cantatletas != 0){
                if(cont == cantatletas){
                    break;
                }   
            }
            if(!atletas.contains(marca.getAtleta())){
                jTextArea2.append("Atleta: " + marca.getAtleta().getNombreCompleto()+"\n");
                ArrayList<Prueba> pruebas = new ArrayList<>();
                ArrayList<Competencia> competencias = new ArrayList<>();
                //ArrayList<ArrayList<Marca>> marcasatleta = new ArrayList<>();
                
                for(Marca marca2:marcas){
                    if(marca2.getAtleta().getIdentificacion().equals(marca.getAtleta().getIdentificacion())){
                        if(!pruebas.contains(marca2.getPrueba())){
                            jTextArea2.append("Prueba: " + marca2.getPrueba().getNombre()+"\n");
                            for(Marca marca3:marcas){
                                if(marca3.getAtleta().getIdentificacion().equals(marca.getAtleta().getIdentificacion())
                                   && marca3.getPrueba().equals(marca2.getPrueba())){
                                    jTextArea2.append("Competencia: " + marca3.getCompetencia().getNombre() + "\n");
                                    for(Marca marca4:marcas){
                                        if(marca4.getAtleta().getIdentificacion()
                                            .equals(marca.getAtleta().getIdentificacion()) &&
                                            marca4.getCompetencia().equals(marca3.getCompetencia())&&
                                            marca4.getPrueba().getNombre()
                                            .equals(marca2.getPrueba().getNombre())){
                                            jTextArea2.append("Marca:  " + marca4.getMarca()  + "  Lugar: " + marca4.getLugar()+ "\n");
                                        }
                                    }
                                    jTextArea2.append("\n");
                                }
                            }
                            jTextArea2.append("\n");
                            pruebas.add(marca2.getPrueba()); 
                        }   
                    }
                }
                jTextArea2.append("\n");
                atletas.add(marca.getAtleta());
            }
            cont++;
        }  
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTabbedPane6.setSelectedIndex(2);
        if(marcas.isEmpty()){
            jTextArea4.setText("");
            return;
        }
        jTextArea4.setText("");
        int cont = 0;
        ArrayList<Competencia> competencias = new ArrayList<>();
        for(Marca marca:marcas){
            if(cantatletas != 0){
                if(cont == cantatletas){
                    break;
                }   
            }
            if(!competencias.contains(marca.getCompetencia())){
                jTextArea4.append("Competencia: " + marca.getCompetencia().getNombre() + "\n");
                ArrayList<Prueba> pruebas = new ArrayList<>();
                for(Marca marca2:marcas){
                    if(!pruebas.contains(marca2.getPrueba())){
                        jTextArea4.append("Prueba: " + marca2.getPrueba().getNombre() + "\n");
                        int lugarbuscar = 1;
                        while(true){
                            boolean existe = false;
                            for(Marca marca3:marcas){
                                if(marca3.getLugar() == lugarbuscar &&
                                marca3.getCompetencia().getNombre().equals(marca.getCompetencia().getNombre()) &&
                                marca3.getPrueba().getNombre().equals(marca2.getPrueba().getNombre())){
                                    jTextArea4.append("Atleta: " + 
                                    marca3.getAtleta().getNombreCompleto() + 
                                    "  Dorsal:  " + marca3.getDorsal() +
                                    "  Marca:  " + marca3.getMarca() + 
                                    "  Lugar:  " + lugarbuscar + "\n" );
                                    existe = true;
                                }
                            }
                            if(!existe){
                                break;
                            }else{
                                lugarbuscar++;
                            }
                        }
                        pruebas.add(marca2.getPrueba());
                    }
                }
                competencias.add(marca.getCompetencia());
            }
            cont++;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTabbedPane6.setSelectedIndex(3);
        if(marcas.isEmpty()){
            jTextArea5.setText("");
            return;
        }
        jTextArea5.setText("");
        int cont = 0;
        ArrayList<Atleta> atletas = new ArrayList<>();
        for(Marca marca:marcas){
            if(cantatletas != 0){
                if(cont == cantatletas){
                    break;
                }   
            }
            if(!atletas.contains(marca.getAtleta())){
                jTextArea5.append("Atleta: " + marca.getAtleta().getNombreCompleto()+"\n");
                ArrayList<Prueba> pruebas = new ArrayList<>();
                ArrayList<Competencia> competencias = new ArrayList<>();
                //ArrayList<ArrayList<Marca>> marcasatleta = new ArrayList<>();
                
                for(Marca marca2:marcas){
                    if(marca2.getAtleta().getIdentificacion().equals(marca.getAtleta().getIdentificacion())){
                        if(!pruebas.contains(marca2.getPrueba())){
                            jTextArea5.append("Prueba: " + marca2.getPrueba().getNombre()+"\n");
                            for(Marca marca3:marcas){
                                if(marca3.getAtleta().getIdentificacion().equals(marca.getAtleta().getIdentificacion())
                                   && marca3.getPrueba().equals(marca2.getPrueba())){
                                    jTextArea5.append("Competencia: " + marca3.getCompetencia().getNombre() + "\n");
                                    for(Marca marca4:marcas){
                                        if(marca4.getAtleta().getIdentificacion()
                                            .equals(marca.getAtleta().getIdentificacion()) &&
                                            marca4.getCompetencia().equals(marca3.getCompetencia())&&
                                            marca4.getPrueba().getNombre()
                                            .equals(marca2.getPrueba().getNombre())){
                                            if(marca4.getLugar() == 1 || marca4.getLugar() == 1 || marca4.getLugar() == 3){
                                                jTextArea5.append("Marca:  " + marca4.getMarca() +
                                                                  "  Lugar: " + marca4.getLugar() + "\n");
                                            }
                                        }
                                    }
                                    jTextArea5.append("\n");
                                }
                            }
                            jTextArea5.append("\n");
                            pruebas.add(marca2.getPrueba()); 
                        }   
                    }
                }
                jTextArea5.append("\n");
                atletas.add(marca.getAtleta());
            }
            cont++;
        }  
    }//GEN-LAST:event_jButton16ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1TextField;
    private javax.swing.JTextField Apellido2TextField;
    private javax.swing.JButton BottonAgregarAtleta;
    private javax.swing.JTextField CorreoTextField;
    private javax.swing.JTextField IdentificacionTextField;
    private javax.swing.JTextField NacimientoTextField;
    private javax.swing.JTextField NombreAtletaTextField;
    private javax.swing.JTextField PaisTextField;
    private javax.swing.JPanel Panel_atletas;
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JPanel Panel_botonesatletas;
    private javax.swing.JPanel Panel_botonescompetencias;
    private javax.swing.JPanel Panel_botonesdisciplinas;
    private javax.swing.JPanel Panel_botonesregistro;
    private javax.swing.JPanel Panel_competencias;
    private javax.swing.JPanel Panel_competenciastop;
    private javax.swing.JPanel Panel_configuracion;
    private javax.swing.JPanel Panel_disciplinas;
    private javax.swing.JPanel Panel_listado;
    private javax.swing.JPanel Panel_main;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_registros;
    private javax.swing.JPanel Panel_registrotop;
    private javax.swing.JPanel Paneldefault;
    private javax.swing.JTextField TelefonoTextField;
    private javax.swing.JButton button_agregar_competencia;
    private javax.swing.JButton button_agregarprueba;
    private javax.swing.JButton button_atletas;
    private javax.swing.JButton button_atletas_agregar;
    private javax.swing.JButton button_atletas_borrar;
    private javax.swing.JButton button_atletas_consultar;
    private javax.swing.JButton button_atletas_modificar;
    private javax.swing.JButton button_competencias;
    private javax.swing.JButton button_competencias_agregar;
    private javax.swing.JButton button_competencias_borrar;
    private javax.swing.JButton button_competencias_consultar;
    private javax.swing.JButton button_competencias_modificar;
    private javax.swing.JButton button_configuracion;
    private javax.swing.JButton button_disciplinas;
    private javax.swing.JButton button_disciplinas_agregardisciplina;
    private javax.swing.JButton button_disciplinas_borrar;
    private javax.swing.JButton button_disciplinas_consultar;
    private javax.swing.JButton button_disciplinas_modificarnombre;
    private javax.swing.JButton button_disciplinas_modificarpruebas;
    private javax.swing.JButton button_eliminarprueba;
    private javax.swing.JButton button_listadomarcas;
    private javax.swing.JButton button_registro_agregar;
    private javax.swing.JButton button_registromarcas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label_agregar_nombredisciplina;
    private javax.swing.JLabel label_agregar_nombreprueba;
    private javax.swing.JLabel label_menuPrincipal;
    private javax.swing.JPanel panel_atletas_agregar;
    private javax.swing.JPanel panel_atletas_borrar;
    private javax.swing.JPanel panel_atletas_consultar;
    private javax.swing.JPanel panel_atletas_default;
    private javax.swing.JPanel panel_atletas_modificar;
    private javax.swing.JPanel panel_atletastop;
    private javax.swing.JPanel panel_competencias_agregar;
    private javax.swing.JPanel panel_competencias_borrar;
    private javax.swing.JPanel panel_competencias_consultar;
    private javax.swing.JPanel panel_competencias_default;
    private javax.swing.JPanel panel_competencias_modificar;
    private javax.swing.JPanel panel_disciplinas_agregar;
    private javax.swing.JPanel panel_disciplinas_borrar;
    private javax.swing.JPanel panel_disciplinas_consultar;
    private javax.swing.JPanel panel_disciplinas_default;
    private javax.swing.JPanel panel_disciplinas_modificar;
    private javax.swing.JPanel panel_disciplinas_modificarpruebas;
    private javax.swing.JPanel panel_disciplinastop;
    private javax.swing.JPanel panel_registro_agregar;
    private javax.swing.JPanel panel_registro_default;
    private javax.swing.JScrollPane scrollpane_pruebasdisciplina;
    private javax.swing.JTextField textfield_agregar_nombredisciplina;
    private javax.swing.JTextField textfield_agregar_nombreprueba;
    // End of variables declaration//GEN-END:variables
}
