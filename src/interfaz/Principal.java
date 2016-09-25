/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoAuto = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOpciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos principales:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 102, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Numero de filas:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Numero de columnas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNumeroFilas.setBackground(new java.awt.Color(255, 204, 153));
        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 50, 30));

        txtNumeroColumnas.setBackground(new java.awt.Color(255, 204, 153));
        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 300, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(204, 204, 255));
        cmdCrear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 40));

        cmdLlenadoAuto.setBackground(new java.awt.Color(204, 204, 255));
        cmdLlenadoAuto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdLlenadoAuto.setText("Llenado automatico");
        cmdLlenadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 40));

        cmdOperacion.setBackground(new java.awt.Color(204, 204, 255));
        cmdOperacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdOperacion.setText("Operación");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 40));

        cmdLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        cmdLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 330, 150));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("MATRICES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        tblTablaInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, 270));

        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal segundaria", "Triaungular superior", "Triaungular inferior", "Transpuesta", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel1.add(cmbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 140, 30));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 430, 270));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 102, 51))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setEditable(false);
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 450, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 540, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1073, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf,nc;
        DefaultTableModel tm, tm2;
        
        if (txtNumeroColumnas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite el numero de columnas","Error",JOptionPane.ERROR_MESSAGE);
            txtNumeroColumnas.requestFocusInWindow();
            
        } else if (txtNumeroFilas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite el numero de filas","Error",JOptionPane.ERROR_MESSAGE);
            txtNumeroFilas.requestFocusInWindow();
            
        } else {
        
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt (txtNumeroColumnas.getText());
           
            
            tm = (DefaultTableModel)tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();
            
            tm.setRowCount (nf);
            tm.setColumnCount (nc);
            
            tm2.setRowCount(nf);
            tm2.setColumnCount(nc);
        }
      
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op,nf,nc,aux;
        
        op = cmbOpciones.getSelectedIndex();
        nf = tblTablaInicial.getRowCount();
        nc= tblTablaInicial.getColumnCount();
        
        switch (op){
            
            case 0:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (nf-1-i==j){
                            tblTablaResultado.setValueAt(aux,i,j);
                        }
                    }
                }
                    break;
            
               case 1:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i<j){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
             
               case 2:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i>j){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            
                case 3:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i>j){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            
                case 4:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||j==nc-1||i==0||i==(nf-1)/2){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
             case 5:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i==0||nf-1-i==j||i==nf-1){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            
            case 6:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i==0||j==(nc/2)){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
                
                case 7:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==i/2||j==nf-1-i/2){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            case 8:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||i==0||i==(nf-1)/2||i==nf-1){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
           case 9:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||i==0||i==(nf-1)/2){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            case 10:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||i==0||i==(nf-1)/2||j==(nc-1)/4){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
            case 11:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==nc/2){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
              case 12:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||i==j||j==nc-1){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
               case 13:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (j==0||i==j||j==nc-1){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
              case 14:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {
                        aux = (int) tblTablaInicial.getValueAt (i,j);
                        if (i==j||nf-1-i==j){
                            tblTablaResultado.setValueAt(aux,i,j);
                            
                        }
                    }
                }
                    break;
        }
        
        
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLlenadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutoActionPerformed
        int nf,nc,n;
        
        nc = tblTablaInicial.getColumnCount();
        nf =  tblTablaInicial.getRowCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
              n = (int) (Math.random()*50 + 1); 
              tblTablaInicial.setValueAt(n,i,j);
            }
        }
    }//GEN-LAST:event_cmdLlenadoAutoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
      int nf,nc;
      nc=tblTablaInicial.getColumnCount();
      nf=tblTablaInicial.getRowCount();
      DefaultTableModel tm,tm2;
      
      txtNumeroColumnas.setText("");
      txtNumeroFilas.setText("");
      cmbOpciones.setSelectedIndex(0);
      
      tm=(DefaultTableModel) tblTablaInicial.getModel();
      tm2=(DefaultTableModel) tblTablaResultado.getModel();
      
       tm.setRowCount(0);
       tm.setColumnCount(0);
       
       tm2.setRowCount(0);
       tm2.setColumnCount(0);
      
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          } 
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          } 
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOpciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAuto;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
