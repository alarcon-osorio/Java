package c61DeleteAndUpdate;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Formulario extends javax.swing.JFrame {

    
    public Formulario() {
        initComponents();
        cargarDriver();
        setTitle("Update & Delete");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Existe");

        jLabel1.setText("Descripcion de Articulo:");

        jLabel2.setText("Precio");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");

        jLabel4.setText("Codigo de Articulo a Consultar");

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton1)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel5.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        try{
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd1", "root", "");
            Statement comando = (Statement) conexion.createStatement();
            ResultSet registro = comando.executeQuery("select descripcion, precio from articulos where idarticulos =  '"+jTextField3.getText()+"'");
            if (registro.next() == true) {
                jTextField1.setText(registro.getString("descripcion"));
                jTextField2.setText(registro.getString("precio"));
                System.out.println("Consulto");
                jLabel5.setForeground(Color.green);
                jLabel5.setText("Existe");
            }else{
                jLabel5.setForeground(Color.red);
                jLabel5.setText("No existe");
            }
            conexion.close();
        }catch(SQLException ex){
            setTitle(ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel5.setText("");
        System.out.println("entro");
        try{
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd1", "root", "");
            Statement comando = (Statement) conexion.createStatement();
            comando.executeUpdate("insert into articulos(descripcion, precio) values ('"+jTextField1.getText()+"','"+jTextField2.getText()+"')");
            System.out.println("Inserto");
            conexion.close();
            jLabel5.setText("Registrado");
            jTextField1.setText("");
            jTextField2.setText("");
        }catch(SQLException ex){
            setTitle(ex.toString());
            jLabel5.setForeground(Color.red);
            jLabel5.setText("Ingrese datos");
            System.out.println("Error - No envio Insert");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("update articulos set descripcion = '"+ jTextField1.getText() + "', precio = '"+ jTextField2.getText() + "' where idarticulos= " +jTextField3.getText());
            System.out.println("update articulos set descripcion = '"+ jTextField1.getText() + "', precio = '"+ jTextField2.getText() + "' where idarticulos= " +jTextField3.getText());
            conexion.close();
            jLabel5.setText("Actualizado");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }catch(SQLException ex){
            setTitle(ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("delete from articulos where idarticulos = " +jTextField3.getText());
            conexion.close();
            jLabel5.setForeground(Color.red);
            jLabel5.setText("Eliminado");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }catch(SQLException ex){
            setTitle(ex.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void cargarDriver() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            setTitle(ex.toString());
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
