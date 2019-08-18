/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ContingencyAdmin;

import Business.SupplyAdmin.SupplyAdminDirectory;
import Business.ContingencyAdmin.ContingencyDirectory;
import javax.swing.JPanel;
import Business.Enterprise.GovernmentEnterprise;
import Business.ContingencyAdmin.ContingencyAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kiran
 */
public class ContingencyAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContingencyAdminWorkAreaJPanel
     */
    JPanel userprocesscontainer;
    GovernmentEnterprise enterprise;
    
    SupplyAdminDirectory supplyadmindir;
   // ContingencyDirectory contingencydir;
    
    
    public ContingencyAdminWorkAreaJPanel(JPanel userprocesscontainer,GovernmentEnterprise enterprise ) {
        initComponents();
        this.enterprise = (GovernmentEnterprise)enterprise;
        this.userprocesscontainer = userprocesscontainer;
       // this.contingencydir = contingencydir;
       PopulateTable();
    }
    
     public void PopulateTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) TblContingency.getModel();
        model.setRowCount(0);
        System.out.println("abc" + enterprise);
        if(enterprise.getContingencydir()== null){
            
            enterprise.setContingencydir(new ContingencyDirectory());
                System.out.println("bnm" + enterprise.getContingencydir());
        }
        
        
        for(ContingencyAdmin h : enterprise.getContingencydir().getContingencyList()){
        //for(Hospital h : tblPatientDetails.gethospitalList){
       // for (Hospital h : organization.getHospitalDirectory().gethospitalList()){
            
            Object[] row = new Object[4];
            row[0] = h;
         
            row[1] = h.getCasualtyType();
            row[2] = h.getRequirements();
            row[3] = h.getSeverity();
           
            model.addRow(row);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Contact system admin");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtContingencyDisaster = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtCasualtyType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtRequire = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        severity = new javax.swing.JLabel();
        TxtSeverity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblContingency = new javax.swing.JTable();
        BtnContingencySubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(TxtContingencyDisaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 140, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Disaster");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 53, -1));
        add(TxtCasualtyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("CasualtyType");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 79, -1));
        add(TxtRequire, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 140, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Requirements");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 79, -1));

        severity.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        severity.setText("Severity");
        add(severity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 59, -1));

        TxtSeverity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSeverityActionPerformed(evt);
            }
        });
        add(TxtSeverity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 140, -1));

        TblContingency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disaster", "CasualtyType", "Requirements", "Severity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblContingency);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 420, 109));

        BtnContingencySubmit.setText("Submit");
        BtnContingencySubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContingencySubmitActionPerformed(evt);
            }
        });
        add(BtnContingencySubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Contingecy Admin Work Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContingencySubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContingencySubmitActionPerformed
        // TODO add your handling code here:
       try{
        if(enterprise.getContingencydir()== null)
        {
            enterprise.setContingencydir(new ContingencyDirectory());
            System.out.println("qwqe" + enterprise.getContingencydir());
        }
        
        ContingencyAdmin co = enterprise.getContingencydir().addContingency();
        
        co.setCasualtyType(TxtCasualtyType.getText());
        co.setDisaster(TxtContingencyDisaster.getText());
        co.setRequirements(TxtRequire.getText());
        co.setSeverity(TxtSeverity.getText());
        
        PopulateTable();
        
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, "Contact system admin");
       }
    }//GEN-LAST:event_BtnContingencySubmitActionPerformed

    private void TxtSeverityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSeverityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSeverityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContingencySubmit;
    private javax.swing.JTable TblContingency;
    private javax.swing.JTextField TxtCasualtyType;
    private javax.swing.JTextField TxtContingencyDisaster;
    private javax.swing.JTextField TxtRequire;
    private javax.swing.JTextField TxtSeverity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel severity;
    // End of variables declaration//GEN-END:variables
}
