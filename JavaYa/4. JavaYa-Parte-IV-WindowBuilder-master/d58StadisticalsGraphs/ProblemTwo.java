
package d58StadisticalsGraphs;

import java.awt.Color;
import java.awt.Graphics;


public class ProblemTwo extends javax.swing.JFrame {
    private boolean bandera = false;

    
    public ProblemTwo() {
        initComponents();
        jLabel4.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("0");

        jTextField2.setText("0");

        jTextField3.setText("0");

        jLabel1.setText("Partido 1");

        jLabel2.setText("Partido 2");

        jLabel3.setText("Partido 3");

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void paint(Graphics g) {    
        super.paint(g);           
        
        if (bandera == true) {           
            
            System.out.println("Entro 1 ");
            String text1 = jTextField1.getText();
            String text2 = jTextField2.getText();
            String text3 = jTextField3.getText();
                        
            int v1 = Integer.parseInt(text1);
            int v2 = Integer.parseInt(text2);
            int v3 = Integer.parseInt(text3);
            retornarMayor(v1, v2, v3);
            
            if (v1 == 0 && v2 == 0 && v3 == 0 ) {
                jLabel4.setVisible(true);
                jLabel4.setForeground(Color.red);
                jLabel4.setText("Por favor aumente los valores de los partidos");
            }else{
                
               g.setColor(Color.red);
               g.fillRect(80, 250, v1, 35);
               g.drawString("Partido 1: ", 15, 270);

               g.setColor(Color.blue);
               g.fillRect(80, 290, v2, 35);
               g.drawString("Partido 2: ", 15, 310);

               g.setColor(Color.green);
               g.fillRect(80, 330, v3, 35);
               g.drawString("Partido 3: ", 15, 350);            
            }          
            
        }
       
    }
    
    private void retornarMayor(int v1, int v2, int v3) {
        if (v1 > v2 && v1 > v3) {
            jLabel4.setForeground(Color.red);
            jLabel4.setText("El mayor es: Partido 1");
        }else{
            if (v2 > v3) {
                jLabel4.setForeground(Color.blue);
                jLabel4.setText("El mayor es: Partido 2");
            }else{
                jLabel4.setForeground(Color.green);
                jLabel4.setText("El mayor es: Partido 3");
            }
        }
    }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
