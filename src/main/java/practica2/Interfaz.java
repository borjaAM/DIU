/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 6
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Practica2
     */
    private boolean isEuroToDollar = true;
    
    public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(216, 177, 238));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleApp = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        titleChange = new javax.swing.JLabel();
        simbolFrom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        simbolTo = new javax.swing.JLabel();
        tasa = new javax.swing.JTextField();
        changeMode = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setBackground(new java.awt.Color(216, 177, 238));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);

        titleApp.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        titleApp.setText("Currency Converter");

        calcular.setText("Calculate");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel1.setText("1 Euro is equal to:");

        jLabel2.setText("Dollars");

        jLabel3.setText("Amount:");

        amount.setForeground(new java.awt.Color(153, 153, 153));
        amount.setText("ej: 3.15");
        amount.setToolTipText("");
        amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountMouseClicked(evt);
            }
        });

        titleChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titleChange.setText("From Euro to Dollar");

        simbolFrom.setText("Euro (€)");

        jLabel6.setText("Equality:");

        result.setEditable(false);

        simbolTo.setText("Dollar ($)");

        tasa.setForeground(new java.awt.Color(153, 153, 153));
        tasa.setText("ej: 5.4");
        tasa.setToolTipText("");
        tasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasaMouseClicked(evt);
            }
        });

        changeMode.setText("Change");
        changeMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result)
                            .addComponent(amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(simbolFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simbolTo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleChange)
                        .addGap(18, 18, 18)
                        .addComponent(changeMode)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tasa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(calcular)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleApp)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleApp)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleChange)
                    .addComponent(changeMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simbolFrom, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbolTo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(calcular)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        String amountT = amount.getText();
        String tasaT = tasa.getText();
            
        if(isValid(amountT) && isValid(tasaT)){
            float  amountA= Float.parseFloat(amountT);
            float tasaA = Float.parseFloat(tasaT);
            CurrencyConverter converter = new CurrencyConverter(amountA, tasaA);
            result.setText(converter.toString(converter.calcularEquivalencia(isEuroToDollar)));
        } else {
            result.setText("");
            if(isValid(amountT)== false){
                amount.setBackground(Color.RED);
            }
            if(isValid(tasaT) == false){
                tasa.setBackground(Color.RED);
            }
            JOptionPane.showMessageDialog(Interfaz.this, "Debe introducir valores numéricos no negativos.");
            
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void changeModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeModeActionPerformed
        if(isEuroToDollar){
           isEuroToDollar = false;
           titleChange.setText("From Dollar to Euro");
           simbolFrom.setText("Dollar ($)");
           simbolTo.setText("Euro (€)");
        }else{
           isEuroToDollar = true;
           titleChange.setText("From Euro to Dollar");
           simbolFrom.setText("Euro (€)");
           simbolTo.setText("Dollar ($)");
        }
    }//GEN-LAST:event_changeModeActionPerformed

    private void tasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasaMouseClicked
        // TODO add your handling code here:
        tasa.setText("");
        tasa.setForeground(Color.black);
        tasa.setBackground(Color.WHITE);
    }//GEN-LAST:event_tasaMouseClicked

    private void amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountMouseClicked
        // TODO add your handling code here:
        amount.setText("");
        amount.setForeground(Color.black);
        amount.setBackground(Color.WHITE);
    }//GEN-LAST:event_amountMouseClicked
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton calcular;
    private javax.swing.JButton changeMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField result;
    private javax.swing.JLabel simbolFrom;
    private javax.swing.JLabel simbolTo;
    private javax.swing.JTextField tasa;
    private javax.swing.JLabel titleApp;
    private javax.swing.JLabel titleChange;
    // End of variables declaration//GEN-END:variables

    private boolean isValid(String number) { 
        try{
            return Float.parseFloat(number) >= 0;
        }catch(NumberFormatException e){
            return false;
        }   
    }
}
