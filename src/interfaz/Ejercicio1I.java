/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Ejercicio1I extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1I
     */
    public Ejercicio1I() {
        initComponents();
        txtPorcentaje1.setEditable(false); 
        txtPorcentaje2.setEditable(false);
        txtPorcentaje3.setEditable(false) ;   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtValor3 = new javax.swing.JTextField();
        txtPorcentaje1 = new javax.swing.JTextField();
        txtPorcentaje2 = new javax.swing.JTextField();
        txtPorcentaje3 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Inversiones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 198, 27));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel2.setText("Persona 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel3.setText("Persona 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel4.setText("Persona 3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor1KeyTyped(evt);
            }
        });
        jPanel1.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 60, -1));

        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });
        jPanel1.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, -1));

        txtValor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor3KeyTyped(evt);
            }
        });
        jPanel1.add(txtValor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, -1));
        jPanel1.add(txtPorcentaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 60, -1));
        jPanel1.add(txtPorcentaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, -1));
        jPanel1.add(txtPorcentaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 60, -1));

        cmdCalcular.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 153, 51));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 90, 30));

        cmdBorrar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(153, 0, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 70, 20));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel5.setText("Valor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel6.setText("Porcentaje");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       String res1,res2,res3;
        double n1,n2,n3,suma,porc1=0,porc2=0,porc3=0;
        if (txtValor1.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(this,"Digite el valor invertido por la persona numerp 1","Erro", JOptionPane.ERROR_MESSAGE);
            txtValor1.requestFocusInWindow();
        }else if (txtValor2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite el valor invertido por la persona numero 2","Error",JOptionPane.ERROR_MESSAGE);
            txtValor2.requestFocusInWindow();
        }else if (txtValor3.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite el valor invertido por la persona numero 3","Error",JOptionPane.ERROR_MESSAGE);
            txtValor3.requestFocusInWindow();
        }
        else {
           try {
           n1 = Double.parseDouble(txtValor1.getText());
           n2 = Double.parseDouble(txtValor2.getText());
           n3= Double.parseDouble(txtValor3.getText());
           suma= n1+n2+n3;
           porc1=(n1*100)/suma;
           porc2=(n2*100)/suma;
           porc3=(n3*100)/suma;}
           catch (Exception e){
              JOptionPane.showMessageDialog(this,"Ingrese numero validos","Erro", JOptionPane.ERROR_MESSAGE);
            txtValor1.requestFocusInWindow();
           } 
           
        }
        res1 = String.valueOf(Math.round(porc1));
        res2 = String.valueOf(Math.round(porc2));
        res3 = String.valueOf(Math.round(porc3));
        txtPorcentaje1.setText(res1+"%");
        txtPorcentaje2.setText(res2+"%");
        txtPorcentaje3.setText(res3+"%");
        txtPorcentaje1.setEditable(false); 
        txtPorcentaje2.setEditable(false);
        txtPorcentaje3.setEditable(false);
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtValor1.setText("");
        txtValor2.setText("");
        txtValor3.setText("");
        txtPorcentaje1.setText("");
        txtPorcentaje2.setText("");
        txtPorcentaje3.setText("");
        txtValor1.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped
         char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtValor1KeyTyped

    private void txtValor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyTyped
      char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtValor2KeyTyped

    private void txtValor3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor3KeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtValor3KeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio1I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1I().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPorcentaje1;
    private javax.swing.JTextField txtPorcentaje2;
    private javax.swing.JTextField txtPorcentaje3;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValor3;
    // End of variables declaration//GEN-END:variables
}
