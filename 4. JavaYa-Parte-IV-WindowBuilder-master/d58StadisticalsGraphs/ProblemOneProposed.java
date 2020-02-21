package d58StadisticalsGraphs;

import java.awt.Color;
import java.awt.Graphics;


public class ProblemOneProposed extends javax.swing.JFrame {
    private boolean bandera;

    
    public ProblemOneProposed() {
        initComponents();
        jLabel4.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Partido 1:");

        jLabel2.setText("Partido 2:");

        jLabel3.setText("Partido 3:");

        jTextField1.setText("0");

        jTextField2.setText("0");

        jTextField3.setText("0");

        jToggleButton1.setText("Graficar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3)))
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jToggleButton1)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    public void paint(Graphics g) {
        super.paint(g);
        
        if (bandera == true) {
            
            String text1 = jTextField1.getText();
            String text2 = jTextField2.getText();
            String text3 = jTextField3.getText();
            
            int v1 = Integer.parseInt(text1);
            int v2 = Integer.parseInt(text2);
            int v3 = Integer.parseInt(text3);
            
            int suma = v1+v2+v3;
            
            if (suma == 0) {
                jLabel4.setVisible(true);
                jLabel4.setText("Advertencia: Valores mayores a 0");
            }else{
                int largo1 = v1 * 400/suma;
                int largo2 = v2 * 400/suma;
                int largo3 = v3 * 400/suma;
                int porc1 = v1 * 100/suma;
                int porc2 = v2*100/suma;
                int porc3 = v3*100/suma; 

                g.setColor(Color.red);
                g.fillRect(80, 250, largo1, 35);
                g.setColor(Color.black);
                g.drawString(porc1 + "%", 85, 270);

                g.setColor(Color.blue);
                g.fillRect(80 + largo1, 250, largo2, 35);
                g.setColor(Color.black);
                g.drawString(porc2 + "%", 85 + largo1 , 270);

                g.setColor(Color.green);
                g.fillRect(80 + largo1 + largo2, 250, largo3, 35);
                g.setColor(Color.black);
                g.drawString(porc3 + "%", 85 + largo1 + largo2 , 270);
            }      
            
        }
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemOneProposed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
