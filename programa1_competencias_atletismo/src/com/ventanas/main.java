package com.ventanas;

import javax.swing.JPanel;
import programa1_competencias_atletismo.*;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLayout(null);
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
        button_disciplinas_agregar = new javax.swing.JButton();
        button_disciplinas_consultar = new javax.swing.JButton();
        button_disciplinas_modificar = new javax.swing.JButton();
        button_disciplinas_borrar = new javax.swing.JButton();
        button_disciplinas_listado = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel_disciplinas_default = new javax.swing.JPanel();
        panel_disciplinas_agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_disciplinas_consultar = new javax.swing.JPanel();
        panel_disciplinas_modificar = new javax.swing.JPanel();
        panel_disciplinas_borrar = new javax.swing.JPanel();
        panel_disciplinas_listado = new javax.swing.JPanel();
        Panel_atletas = new javax.swing.JPanel();
        Panel_competencias = new javax.swing.JPanel();
        Panel_registros = new javax.swing.JPanel();
        Panel_listado = new javax.swing.JPanel();
        Panel_configuracion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 430));
        setSize(new java.awt.Dimension(740, 430));
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
        Panel_menu.setBounds(6, 0, 730, 55);

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
        Paneldefault.setMinimumSize(new java.awt.Dimension(735, 0));
        Paneldefault.setPreferredSize(new java.awt.Dimension(735, 347));

        javax.swing.GroupLayout PaneldefaultLayout = new javax.swing.GroupLayout(Paneldefault);
        Paneldefault.setLayout(PaneldefaultLayout);
        PaneldefaultLayout.setHorizontalGroup(
            PaneldefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        PaneldefaultLayout.setVerticalGroup(
            PaneldefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", Paneldefault);

        Panel_disciplinas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_disciplinas.setLayout(null);

        panel_disciplinastop.setBackground(new java.awt.Color(102, 102, 102));
        panel_disciplinastop.setLayout(null);
        Panel_disciplinas.add(panel_disciplinastop);
        panel_disciplinastop.setBounds(-5, 5, 520, 40);

        Panel_botonesdisciplinas.setLayout(null);

        button_disciplinas_agregar.setText("Agregar");
        button_disciplinas_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_agregarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_agregar);
        button_disciplinas_agregar.setBounds(6, 34, 138, 28);

        button_disciplinas_consultar.setText("Consultar");
        button_disciplinas_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_consultarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_consultar);
        button_disciplinas_consultar.setBounds(6, 80, 138, 28);

        button_disciplinas_modificar.setText("Modificar");
        button_disciplinas_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_modificarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_modificar);
        button_disciplinas_modificar.setBounds(6, 126, 138, 28);

        button_disciplinas_borrar.setText("Borrar");
        button_disciplinas_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_borrarActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_borrar);
        button_disciplinas_borrar.setBounds(6, 172, 138, 28);

        button_disciplinas_listado.setText("Listado");
        button_disciplinas_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_disciplinas_listadoActionPerformed(evt);
            }
        });
        Panel_botonesdisciplinas.add(button_disciplinas_listado);
        button_disciplinas_listado.setBounds(6, 218, 138, 28);

        Panel_disciplinas.add(Panel_botonesdisciplinas);
        Panel_botonesdisciplinas.setBounds(0, 40, 150, 320);

        panel_disciplinas_default.setLayout(null);
        jTabbedPane2.addTab("tab6", panel_disciplinas_default);

        panel_disciplinas_agregar.setLayout(null);

        jLabel1.setText("Nombre de Disciplina:");
        panel_disciplinas_agregar.add(jLabel1);
        jLabel1.setBounds(10, 20, 130, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jTextField1);
        jTextField1.setBounds(140, 10, 120, 28);

        jList1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jList1MouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        panel_disciplinas_agregar.add(jScrollPane1);
        jScrollPane1.setBounds(270, 10, 90, 240);

        jLabel2.setText("Nombre de la Prueba:");
        panel_disciplinas_agregar.add(jLabel2);
        jLabel2.setBounds(10, 100, 140, 16);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jTextField2);
        jTextField2.setBounds(140, 90, 120, 28);

        jLabel3.setText("Género:");
        panel_disciplinas_agregar.add(jLabel3);
        jLabel3.setBounds(90, 140, 90, 16);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jTextField3);
        jTextField3.setBounds(140, 130, 120, 28);

        jLabel4.setText("Categoría:");
        panel_disciplinas_agregar.add(jLabel4);
        jLabel4.setBounds(80, 180, 90, 16);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jTextField4);
        jTextField4.setBounds(140, 170, 120, 28);

        jButton1.setText("Agregar Disciplina");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jButton1);
        jButton1.setBounds(230, 280, 140, 28);

        jButton2.setText("Agregar Prueba");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_disciplinas_agregar.add(jButton2);
        jButton2.setBounds(140, 220, 120, 28);

        jTabbedPane2.addTab("tab1", panel_disciplinas_agregar);

        panel_disciplinas_consultar.setLayout(null);
        jTabbedPane2.addTab("tab2", panel_disciplinas_consultar);

        panel_disciplinas_modificar.setLayout(null);
        jTabbedPane2.addTab("tab3", panel_disciplinas_modificar);

        panel_disciplinas_borrar.setLayout(null);
        jTabbedPane2.addTab("tab4", panel_disciplinas_borrar);

        panel_disciplinas_listado.setLayout(null);
        jTabbedPane2.addTab("tab5", panel_disciplinas_listado);

        Panel_disciplinas.add(jTabbedPane2);
        jTabbedPane2.setBounds(150, 10, 370, 350);

        jTabbedPane1.addTab("tab1", Panel_disciplinas);

        Panel_atletas.setLayout(null);
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
        jTabbedPane1.setBounds(221, 20, 515, 380);

        getContentPane().add(Panel_main);
        Panel_main.setBounds(0, 0, 760, 400);

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

    private void button_disciplinas_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_agregarActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_button_disciplinas_agregarActionPerformed

    private void button_disciplinas_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_consultarActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_button_disciplinas_consultarActionPerformed

    private void button_disciplinas_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_modificarActionPerformed
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_button_disciplinas_modificarActionPerformed

    private void button_disciplinas_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_borrarActionPerformed
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_button_disciplinas_borrarActionPerformed

    private void button_disciplinas_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_disciplinas_listadoActionPerformed
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_button_disciplinas_listadoActionPerformed

    private void button_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_configuracionActionPerformed
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_button_configuracionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jList1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jList1MouseWheelMoved
        //JScrollPane scroll = new JScrollPane(jList1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }//GEN-LAST:event_jList1MouseWheelMoved

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPanel Panel_botonesdisciplinas;
    private javax.swing.JPanel Panel_competencias;
    private javax.swing.JPanel Panel_configuracion;
    private javax.swing.JPanel Panel_disciplinas;
    private javax.swing.JPanel Panel_listado;
    private javax.swing.JPanel Panel_main;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_registros;
    private javax.swing.JPanel Paneldefault;
    private javax.swing.JButton button_atletas;
    private javax.swing.JButton button_competencias;
    private javax.swing.JButton button_configuracion;
    private javax.swing.JButton button_disciplinas;
    private javax.swing.JButton button_disciplinas_agregar;
    private javax.swing.JButton button_disciplinas_borrar;
    private javax.swing.JButton button_disciplinas_consultar;
    private javax.swing.JButton button_disciplinas_listado;
    private javax.swing.JButton button_disciplinas_modificar;
    private javax.swing.JButton button_listadomarcas;
    private javax.swing.JButton button_registromarcas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel label_menuPrincipal;
    private javax.swing.JPanel panel_disciplinas_agregar;
    private javax.swing.JPanel panel_disciplinas_borrar;
    private javax.swing.JPanel panel_disciplinas_consultar;
    private javax.swing.JPanel panel_disciplinas_default;
    private javax.swing.JPanel panel_disciplinas_listado;
    private javax.swing.JPanel panel_disciplinas_modificar;
    private javax.swing.JPanel panel_disciplinastop;
    // End of variables declaration//GEN-END:variables
}
