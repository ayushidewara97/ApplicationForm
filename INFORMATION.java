/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appform;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayushi
 */
public class INFORMATION extends javax.swing.JFrame {

   Connection con;
   Statement stmt;
   ResultSet rs;
   int CurRow = 0;
   int a = 0;
    public INFORMATION() {
        initComponents();
        DoConnect();
    }

   public void DoConnect(){
         try{
        String host = "jdbc:derby://localhost:1527/PersonInfo";
        String uName = "Ayushi";
        String uPass = "123";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT* FROM INFORMATION";
        rs = stmt.executeQuery(sql);
        
        rs.next();
        int id_col = rs.getInt("ID");
        String id = Integer.toString(id_col);
        String name = rs.getString("NAME");
        String gender = rs.getString("GENDER");
        String status = rs.getString("MARITAL_STATUS");
        String city = rs.getString("CITY");
        String state = rs.getString("STATE");
        
        textId.setText(id);
        textName.setText(name);
        textGender.setText(gender);
        textStatus.setText(status);
        textCity.setText(city);
        textState.setText(state);
        
    }
        catch(SQLException err){
           JOptionPane.showMessageDialog(INFORMATION.this,err.getMessage());
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelCity = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textGender = new javax.swing.JTextField();
        textStatus = new javax.swing.JTextField();
        textCity = new javax.swing.JTextField();
        textState = new javax.swing.JTextField();
        tSearch = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bFirst = new javax.swing.JButton();
        bLast = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bPrev = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelId.setText("ID");

        labelName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelName.setText("NAME");

        labelGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelGender.setText("GENDER");

        labelStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelStatus.setText("MARITAL STATUS");

        labelCity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCity.setText("CITY");

        labelState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelState.setText("STATE");

        bSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGender)
                            .addComponent(labelStatus)
                            .addComponent(labelCity)
                            .addComponent(labelState)
                            .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textState, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(textCity)
                            .addComponent(textStatus)
                            .addComponent(textGender)
                            .addComponent(textName)
                            .addComponent(textId))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(textGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCity)
                    .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelState)
                    .addComponent(textState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        bFirst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bFirst.setText("First");
        bFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFirstActionPerformed(evt);
            }
        });

        bLast.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bLast.setText("Last");
        bLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLastActionPerformed(evt);
            }
        });

        bNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bNext.setText("Next");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bPrev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPrev.setText("Previous");
        bPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrevActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bUpdate.setText("Update Record");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDelete.setText("Delete Record");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bNew.setText("New Record");
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        bSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSave.setText("Save New Record");
        bSave.setEnabled(false);
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCancel.setText("Cancel New Record");
        bCancel.setEnabled(false);
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bSave)
                .addGap(57, 57, 57)
                .addComponent(bCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bFirst)
                        .addGap(89, 89, 89)
                        .addComponent(bLast))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(bUpdate)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bNext)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bNew))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bPrev)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFirst)
                    .addComponent(bLast)
                    .addComponent(bNext)
                    .addComponent(bPrev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate)
                    .addComponent(bDelete)
                    .addComponent(bNew))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(bCancel))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        try{
            if(rs.next()){
                  int id_col = rs.getInt("ID");
                  String id = Integer.toString(id_col);
                  String name = rs.getString("NAME");
                  String gender = rs.getString("GENDER");
                  String status = rs.getString("MARITAL_STATUS");
                  String city = rs.getString("CITY");
                  String state = rs.getString("STATE");
        
                  textId.setText(id);
                  textName.setText(name);
                  textGender.setText(gender);
                  textStatus.setText(status);
                  textCity.setText(city);
                  textState.setText(state);
            }
            else{
                rs.previous();
                JOptionPane.showMessageDialog(INFORMATION.this,"END OF FILE");
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(INFORMATION.this,err.getMessage());
        }
    }//GEN-LAST:event_bNextActionPerformed

    private void bPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrevActionPerformed
         try{
            if(rs.previous()){
                  int id_col = rs.getInt("ID");
                  String id = Integer.toString(id_col);
                  String name = rs.getString("NAME");
                  String gender = rs.getString("GENDER");
                  String status = rs.getString("MARITAL_STATUS");
                  String city = rs.getString("CITY");
                  String state = rs.getString("STATE");
        
                  textId.setText(id);
                  textName.setText(name);
                  textGender.setText(gender);
                  textStatus.setText(status);
                  textCity.setText(city);
                  textState.setText(state);
            }
            else{
                rs.next();
                JOptionPane.showMessageDialog(INFORMATION.this,"START OF FILE");
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(INFORMATION.this,err.getMessage());
        }
    }//GEN-LAST:event_bPrevActionPerformed

    private void bFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFirstActionPerformed
        try{ 
            rs.next();
            int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String name = rs.getString("NAME");
            String gender = rs.getString("GENDER");
            String status = rs.getString("MARITAL_STATUS");
            String city = rs.getString("CITY");
            String state = rs.getString("STATE");
        
            textId.setText(id);
            textName.setText(name);
            textGender.setText(gender);
            textStatus.setText(status);
            textCity.setText(city);
            textState.setText(state);
        
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(INFORMATION.this,err.getMessage());
        }
    }//GEN-LAST:event_bFirstActionPerformed

    private void bLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLastActionPerformed
        try{ 
            rs.last();
            int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String name = rs.getString("NAME");
            String gender = rs.getString("GENDER");
            String status = rs.getString("MARITAL_STATUS");
            String city = rs.getString("CITY");
            String state = rs.getString("STATE");
        
            textId.setText(id);
            textName.setText(name);
            textGender.setText(gender);
            textStatus.setText(status);
            textCity.setText(city);
            textState.setText(state);
        
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(INFORMATION.this,err.getMessage());
        }
    }//GEN-LAST:event_bLastActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        String id = textId.getText();
        int newId = Integer.parseInt(id);
         String name = textName.getText();
          String gender = textGender.getText();
           String status = textStatus.getText();
            String city = textCity.getText();
             String state = textState.getText();
             
             try{
                 rs.updateInt("ID", newId);
                 rs.updateString("NAME", name);
                 rs.updateString("GENDER", gender);
                 rs.updateString("MARITAL STATUS", status);
                 rs.updateString("CITY", city);
                 rs.updateString("STATE", state);
                 
                 rs.updateRow();
                 JOptionPane.showMessageDialog(INFORMATION.this, "Updated");
                 
               }
             catch(SQLException err){
                JOptionPane.showMessageDialog(INFORMATION.this, err.getMessage());
             }
        
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        try{
            CurRow = rs.getRow();
            textId.setText("");
            textName.setText("");
            textGender.setText("");
            textStatus.setText("");
            textCity.setText("");
            textState.setText("");
            
        bFirst.setEnabled(false);
         bLast.setEnabled(false);
          bNext.setEnabled(false);
           bPrev.setEnabled(false);
            bUpdate.setEnabled(false);
             bDelete.setEnabled(false);
              bNew.setEnabled(false);
              
               bSave.setEnabled(true);
                bCancel.setEnabled(true);
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(INFORMATION.this, err.getMessage()); 
        }
               
               
        
    }//GEN-LAST:event_bNewActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
      try{
        rs.deleteRow();
       stmt.close();
       rs.close();
       stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       String sql = "SELECT* FROM INFORMATION";
       rs = stmt.executeQuery(sql);
       
       rs.next();
          int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String name = rs.getString("NAME");
            String gender = rs.getString("GENDER");
            String status = rs.getString("MARITAL_STATUS");
            String city = rs.getString("CITY");
            String state = rs.getString("STATE");
        
            textId.setText(id);
            textName.setText(name);
            textGender.setText(gender);
            textStatus.setText(status);
            textCity.setText(city);
            textState.setText(state);
       
       
      }
      catch(SQLException err){
            JOptionPane.showMessageDialog(INFORMATION.this, err.getMessage());
      }
       
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        try{
        rs.absolute(CurRow);
        
        textId.setText(Integer.toString(rs.getInt("ID")));
        textName.setText(rs.getString("NAME"));
        textGender.setText(rs.getString("GENDER"));
        textStatus.setText(rs.getString("MARITAL_STATUS"));
        textCity.setText(rs.getString("CITY"));
        textState.setText(rs.getString("STATE"));
        
         bFirst.setEnabled(true);
         bLast.setEnabled(true);
          bNext.setEnabled(true);
           bPrev.setEnabled(true);
            bUpdate.setEnabled(true);
             bDelete.setEnabled(true);
              bNew.setEnabled(true);
              
               bSave.setEnabled(false);
                bCancel.setEnabled(false);
        }
        catch(SQLException err){
          JOptionPane.showMessageDialog(INFORMATION.this, err.getMessage());
        }
    }//GEN-LAST:event_bCancelActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        
             String Id_col = textId.getText();
            int NewId = Integer.parseInt(Id_col);
            String Newname = textName.getText();
            String Newgender = textGender.getText();
            String Newstatus = textStatus.getText();
            String Newcity = textCity.getText();
            String Newstate = textState.getText();
            try{
                rs.moveToInsertRow();
                
                rs.updateInt("ID", NewId);
                rs.updateString("NAME", Newname);
                rs.updateString("GENDER", Newgender);
                rs.updateString("MARITAL_STATUS", Newstatus);
                rs.updateString("CITY", Newcity);
                rs.updateString("STATE", Newstate);
                rs.insertRow();
                stmt.close();
                rs.close();
                
                 Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                 String sql = "SELECT* FROM INFORMATION";
                 rs = stmt.executeQuery(sql);
                rs.next();
                
                 int id_col = rs.getInt("ID");
                  String id = Integer.toString(id_col);
                  String name = rs.getString("NAME");
                  String gender = rs.getString("GENDER");
                  String status = rs.getString("MARITAL_STATUS");
                  String city = rs.getString("CITY");
                  String state = rs.getString("STATE");
        
                  textId.setText(id);
                  textName.setText(name);
                  textGender.setText(gender);
                  textStatus.setText(status);
                  textCity.setText(city);
                  textState.setText(state);
                
            }
        catch(SQLException err){
            JOptionPane.showMessageDialog(INFORMATION.this, err.getMessage());
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        a++;
        try{
            String Sname = tSearch.getText();
           
            if(Sname.matches(rs.getString("NAME"))){
                rs.absolute(CurRow);
                rs.getRow();
                  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                 String sql = "SELECT* FROM INFORMATION WHERE NAME = Sname";
                 rs = stmt.executeQuery(sql); 
               
                 int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String name = rs.getString("NAME");
            String gender = rs.getString("GENDER");
            String status = rs.getString("MARITAL_STATUS");
            String city = rs.getString("CITY");
            String state = rs.getString("STATE");
        
            textId.setText(id);
            textName.setText(name);
            textGender.setText(gender);
            textStatus.setText(status);
            textCity.setText(city);
            textState.setText(state);
            
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(INFORMATION.this, "Invalid Input");
        }
    }//GEN-LAST:event_bSearchActionPerformed

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
            java.util.logging.Logger.getLogger(INFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INFORMATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bFirst;
    private javax.swing.JButton bLast;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPrev;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textGender;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textState;
    private javax.swing.JTextField textStatus;
    // End of variables declaration//GEN-END:variables
}
