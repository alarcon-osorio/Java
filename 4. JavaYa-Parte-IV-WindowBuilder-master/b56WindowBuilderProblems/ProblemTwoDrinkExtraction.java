package b56WindowBuilderProblems;

import java.awt.Color;

public class ProblemTwoDrinkExtraction extends javax.swing.JFrame {
    private String pesos = "0", centavos = "0", total = "0";    
    int combopesos = 0, combocentavos = 0;
    
    public ProblemTwoDrinkExtraction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        lblpesos = new javax.swing.JLabel();
        lblcent = new javax.swing.JLabel();
        btnextraer = new javax.swing.JButton();
        lbltituloresult = new javax.swing.JLabel();
        lblresult = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radio1);
        radio1.setSelected(true);
        radio1.setText("Bebida A");

        buttonGroup1.add(radio2);
        radio2.setText("Bebida B");

        buttonGroup1.add(radio3);
        radio3.setText("Bebida C");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30", "40", "50" }));

        lblpesos.setText("Pesos");

        lblcent.setText("Centavos");

        btnextraer.setText("Extraer");
        btnextraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnextraerActionPerformed(evt);
            }
        });

        lbltituloresult.setText("Resultado:");

        lblresult.setText("0");

        jLabel1.setText("Seleccione:");

        lblvalor.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radio3)
                    .addComponent(radio2)
                    .addComponent(radio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcent)
                    .addComponent(lblpesos))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnextraer)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblvalor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltituloresult)
                        .addGap(18, 18, 18)
                        .addComponent(lblresult)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpesos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio2)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcent))
                .addGap(18, 18, 18)
                .addComponent(radio3)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnextraer)
                    .addComponent(lbltituloresult)
                    .addComponent(lblresult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblvalor))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnextraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnextraerActionPerformed
        if (radio1.isSelected()) {
            pesos = "0";
            centavos = "50";            
            total = pesos + "," +  centavos; 
            String sumadecombos = combo1.getSelectedItem() + "," + combo2.getSelectedItem();
            if (total.equals(sumadecombos)) {
                lblresult.setBackground(Color.GREEN);
                lblresult.setText("Precio: " + sumadecombos);
            }else{
                lblresult.setBackground(Color.RED);
                lblresult.setText("Valor incorrecto");
                lblvalor.setText(total);
            }
        }
        if (radio2.isSelected()) {
            pesos = "1";
            centavos = "20";            
            total = pesos + "," +  centavos; 
            String sumadecombos = combo1.getSelectedItem() + "," + combo2.getSelectedItem();
            if (total.equals(sumadecombos)) {
                lblresult.setBackground(Color.GREEN);
                lblresult.setText("Precio: " + sumadecombos);
            }else{
                lblresult.setBackground(Color.RED);
                lblresult.setText("Valor incorrecto");
                lblvalor.setText(total);
            }
        }
        if (radio3.isSelected()) {
            pesos = "3";
            centavos = "10";            
            total = pesos + "," +  centavos; 
            String sumadecombos = combo1.getSelectedItem() + "," + combo2.getSelectedItem();
            if (total.equals(sumadecombos)) {
                lblresult.setBackground(Color.GREEN);
                lblresult.setText("Precio: " + sumadecombos);
            }else{
                lblresult.setBackground(Color.RED);
                lblresult.setText("Valor incorrecto");
                lblvalor.setText(total);
            }
        }            
    }//GEN-LAST:event_btnextraerActionPerformed
  
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemTwoDrinkExtraction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnextraer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcent;
    private javax.swing.JLabel lblpesos;
    private javax.swing.JLabel lblresult;
    private javax.swing.JLabel lbltituloresult;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables
}
