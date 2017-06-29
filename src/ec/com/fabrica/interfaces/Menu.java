/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.fabrica.interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author julio
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        jDesktopPane1.setBorder(new ImagenFondo1());
        this.setExtendedState(Menu.MAXIMIZED_BOTH);
        menPrincipal.setVisible(true);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ec/com/fabrica/imagenes/logo.png"));
        return retValue;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menPrincipal = new javax.swing.JMenuBar();
        menArchivo = new javax.swing.JMenu();
        itmEmpleados = new javax.swing.JMenuItem();
        itmClientes = new javax.swing.JMenuItem();
        itmProveedores = new javax.swing.JMenuItem();
        itmRoles = new javax.swing.JMenuItem();
        itmCompras = new javax.swing.JMenuItem();
        itmVentas = new javax.swing.JMenuItem();
        menReportes = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        menArchivo.setText("Archivo");

        itmEmpleados.setText("Empleados");
        itmEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmpleadosActionPerformed(evt);
            }
        });
        menArchivo.add(itmEmpleados);

        itmClientes.setText("Clientes");
        itmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmClientesActionPerformed(evt);
            }
        });
        menArchivo.add(itmClientes);

        itmProveedores.setText("Proveedores");
        menArchivo.add(itmProveedores);

        itmRoles.setText("Roles de Pago");
        menArchivo.add(itmRoles);

        itmCompras.setText("Compras");
        menArchivo.add(itmCompras);

        itmVentas.setText("Ventas");
        menArchivo.add(itmVentas);

        menPrincipal.add(menArchivo);

        menReportes.setText("Reportes");
        menReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menReportesActionPerformed(evt);
            }
        });
        menPrincipal.add(menReportes);

        setJMenuBar(menPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menReportesActionPerformed
        
    }//GEN-LAST:event_menReportesActionPerformed

    private void itmEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmpleadosActionPerformed
        // TODO add your handling code here:
        Empleados e = new Empleados();
        jDesktopPane1.add(e);
        e.show();
    }//GEN-LAST:event_itmEmpleadosActionPerformed

    private void itmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmClientesActionPerformed
        // TODO add your handling code here:
        Clientes e = new Clientes();
        jDesktopPane1.add(e);
        e.show();
    }//GEN-LAST:event_itmClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmClientes;
    private javax.swing.JMenuItem itmCompras;
    private javax.swing.JMenuItem itmEmpleados;
    private javax.swing.JMenuItem itmProveedores;
    private javax.swing.JMenuItem itmRoles;
    private javax.swing.JMenuItem itmVentas;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menArchivo;
    private javax.swing.JMenuBar menPrincipal;
    public static javax.swing.JMenu menReportes;
    // End of variables declaration//GEN-END:variables
}
