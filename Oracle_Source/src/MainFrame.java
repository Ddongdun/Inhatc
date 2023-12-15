/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SDJ
 */
public class MainFrame extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From CarInfo ";
    /**
     * Creates new form MainFrame
     */ 
    public MainFrame() {
        initComponents();
        try{
            DBM.dbOpen();
            getDBData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    public final void getDBData(String strQuery) {
        String strOutput = "번호\t차종\t배기량\t연비\t가격\n";
        jTextArea1.setText(strOutput);
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput = "";
                strOutput += DBM.DB_rs.getString("No") + "\t";
                strOutput += DBM.DB_rs.getString("Type") + "\t";
                strOutput += DBM.DB_rs.getString("Displacement") + "\t";
                strOutput += DBM.DB_rs.getString("Performance") + "\t";
                strOutput += DBM.DB_rs.getString("Price")+ "\n";
                jTextArea1.append(strOutput);
            }
            DBM.DB_rs.close();
        }catch(Exception e){
            System.out.println("SQLException :" + e.getMessage());
        }
    }
    
    public String makeSQLWhere(String strQuery){
        switch(cboSearch.getSelectedIndex()){
            case 0:
                strQuery += "Where CarInfo.No = '" + txtNo.getText() + "'";
                break;
            case 1:
                strQuery += "Where CarInfo.Type = '" + txtCarType.getText() + "'";
                break;
            case 2:
                strQuery += "Where CarInfo.Displacement = '" + txtCC.getText() + "'";
                break;
            case 3:
                strQuery += "Where CarInfo.Performance = '" + txtKM.getText() + "'";
                break;
            case 4:
                strQuery += "Where CarInfo.Price = '" + txtPrice.getText() + "'";
                break;
            default:
                strQuery += "Select * from CarInfo";
                break;
        }
        return strQuery;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblCarType = new javax.swing.JLabel();
        lblCC = new javax.swing.JLabel();
        lblKM = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblSQL = new javax.swing.JLabel();
        txtCarType = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSQL = new javax.swing.JTextField();
        cboSearch = new javax.swing.JComboBox<>();
        btnSelect = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelect = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnExecute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("자동차 정보 관리");

        lblNo.setText("번호");

        lblSearch.setText("검색 기준");

        lblCarType.setText("차종");

        lblCC.setText("배기량");

        lblKM.setText("연비");

        lblPrice.setText("가격");

        lblSQL.setText("SQL문");

        txtSQL.setText("SELECT * FROM Car");

        cboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "번호", "차종", "배기량", "연비", "가격" }));

        btnSelect.setText("검색");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnInsert.setText("추가");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("수정");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelect.setText("삭제");
        btnDelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelectActionPerformed(evt);
            }
        });

        btnExit.setText("종료");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnExecute.setText("실행");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSQL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSQL))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPrice)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrice))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblKM)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKM))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCarType)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCarType))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelect)
                                    .addComponent(btnInsert)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnDelect)
                                    .addComponent(btnExit)
                                    .addComponent(btnExecute)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblTitle)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNo)
                                .addComponent(txtNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSearch)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarType)
                            .addComponent(txtCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCC)
                            .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKM)
                            .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSQL)
                            .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)
                        .addGap(9, 9, 9)
                        .addComponent(btnExecute)
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        strSQL = "Select * From CarInfo ";
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()){
                txtNo.setText(DBM.DB_rs.getString("No"));
                txtCarType.setText(DBM.DB_rs.getString("Type"));
                txtCC.setText(DBM.DB_rs.getString("Displacement"));
                txtKM.setText(DBM.DB_rs.getString("Performance"));
                txtPrice.setText(DBM.DB_rs.getString("Price"));
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        strSQL = "Insert into CarInfo Values(";
        strSQL += "'" + txtNo.getText() + "',";
        strSQL += "'" + txtCarType.getText() + "',";
        strSQL += "'" + txtCC.getText() + "',";
        strSQL += "'" + txtKM.getText() + "',";
        strSQL += "'" + txtPrice.getText() + "')";
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * from CarInfo";
            getDBData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        strSQL = "Update CarInfo Set ";
        strSQL += "NO = '" + txtNo.getText() + "',";
        strSQL += "TYPE ='" + txtCarType.getText() + "',";
        strSQL += "Displacement ='" + txtCC.getText() + "',";
        strSQL += "Performance ='" + txtKM.getText() + "',";
        strSQL += "Price ='" + txtPrice.getText() + "' ";
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * from CarInfo ";
            getDBData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelectActionPerformed
        strSQL = "Delete From CarInfo ";
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * from CarInfo";
            getDBData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDelectActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        String strData = "Select * From CarInfo ";
        strSQL = txtSQL.getText();
        strData = strSQL.toUpperCase();
        try{
            DBM.dbOpen();
            if(strData.contains("SELECT"))
                getDBData(strSQL);
            else
                DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnExecuteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelect;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblCarType;
    private javax.swing.JLabel lblKM;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSQL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCarType;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables

    
}
