/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyAdmin;

import Business.ContingencyAdmin.ContingencyAdmin;
import Business.ContingencyAdmin.ContingencyDirectory;
import Business.Enterprise.AirAmbulanceEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.GovernmentEnterprise;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.SupplyAdmin.SupplyAdmin;
import Business.SupplyAdmin.SupplyAdminDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentWorkRequest;
import javax.swing.JOptionPane;
import utility.Validator;

/**
 *
 * @author kiran
 */
public class SupplyAdminAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyAdminAdminWorkAreaJPanel
     *  
     */
           GovernmentEnterprise enterprise;
           JPanel userprocesscontainer;
           UserAccount userAccount;
           EnterpriseDirectory entdir;
           Enterprise ent;
           
    
    public SupplyAdminAdminWorkAreaJPanel(JPanel userprocesscontainer,Enterprise ent,EnterpriseDirectory entdir,Enterprise enterprise) {
        initComponents();
        this.enterprise = (GovernmentEnterprise)enterprise;
        this.userprocesscontainer = userprocesscontainer;
        this.userAccount = userAccount;
       // this.request = request;
        this.entdir = entdir;
        PopulateTable();
        
    }
    
        public void PopulateTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) TblSupplyAdmin.getModel();
        model.setRowCount(0);
        if(enterprise.getContingencydir()== null){
            enterprise.setContingencydir(new ContingencyDirectory());
        }
        
        
        for(ContingencyAdmin h : enterprise.getContingencydir().getContingencyList()){
        //for(Hospital h : tblPatientDetails.gethospitalList){
       // for (Hospital h : organization.getHospitalDirectory().gethospitalList()){
            
            Object[] row = new Object[5];
            row[0] = h;
         
            row[1] = h.getCasualtyType();
            row[2] = h.getRequirements();
            row[3] = h.getSeverity();
           
            model.addRow(row);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TblSupplyAdmin = new javax.swing.JTable();
        TxtMedicine = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDestination = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        severity = new javax.swing.JLabel();
        TxtVictims = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtRequestMsg = new javax.swing.JTextField();
        BtnSupplyRequest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblSupplyAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblSupplyAdmin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 470, 109));
        add(TxtMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Medicine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 53, -1));

        TxtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtQuantityKeyPressed(evt);
            }
        });
        add(TxtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 79, -1));
        add(TxtDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Destination");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 79, -1));

        severity.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        severity.setText("Victims");
        add(severity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 59, -1));
        add(TxtVictims, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("Message");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 59, -1));
        add(TxtRequestMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 110, -1));

        BtnSupplyRequest.setText("Send Request");
        BtnSupplyRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupplyRequestActionPerformed(evt);
            }
        });
        add(BtnSupplyRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Supply Admin Work Area");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSupplyRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupplyRequestActionPerformed
        // TODO add your handling code here:
        try{
        int selectedrow = TblSupplyAdmin.getSelectedRow();
        
        if (selectedrow<0){
            JOptionPane.showMessageDialog(null, "Select Atleast One row");
        }
        
        else {
            
            ContingencyAdmin con = (ContingencyAdmin)TblSupplyAdmin.getValueAt(selectedrow, 0);
            String disast = con.getDisaster();
            String casualty = con.getCasualtyType();
            String require = con.getRequirements();
            String severity = con.getSeverity();
        
        
        
        
        SupplyAdmin s = new SupplyAdmin();
        String medicine = TxtMedicine.getText();
        String Quantity = TxtQuantity.getText();
        String destination = TxtDestination.getText();
        String victims = TxtVictims.getText();
         if(medicine.equals("")||Quantity==null||destination.equals("")||victims.equals(""))
       {
           JOptionPane.showMessageDialog(null, "Enter some data");
           return;
       }
        s.setMedicine(medicine);
        s.setQuantity(Quantity);
        s.setVictims(victims);
        s.setDestination(destination);
       
        Enterprise ent = null;
        GovernmentWorkRequest request = new GovernmentWorkRequest();
        request.setSender(userAccount);
        request.setMessage(TxtRequestMsg.getText());
        request.setStatus("Pending");
        request.setSupplyadmin(s);
        request.setContingencyadmin(con);
        
        
         if(entdir == null){
           entdir = new EnterpriseDirectory();
            System.out.println("dbc"+ entdir.getEnterpriseList());
        }
        
        for(Enterprise enter : entdir.getEnterpriseList()){
            if(enter instanceof AirAmbulanceEnterprise){
                System.out.println("useri()"+enter.getName());
                 ent = enter;
            }
            
            
            
            if(ent!= null){
            ent.getWorkQueue().getWorkRequestList().add(request);
            //System.out.println("qed " + enterprise.getWorkQueue().getWorkRequestList());
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
            //System.out.println("req" + userAccount.getWorkQueue().getWorkRequestList()+ "pol" + enterprise.getWorkQueue().getWorkRequestList());   
        }
           
        }
          
        System.out.println("qed " + ent.getWorkQueue().getWorkRequestList());
        JOptionPane.showMessageDialog(null, "Request message sent");
        }
        
        }catch(Exception exx)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
    }//GEN-LAST:event_BtnSupplyRequestActionPerformed

    private void TxtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQuantityKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, TxtVictims);
    }//GEN-LAST:event_TxtQuantityKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSupplyRequest;
    private javax.swing.JTable TblSupplyAdmin;
    private javax.swing.JTextField TxtDestination;
    private javax.swing.JTextField TxtMedicine;
    private javax.swing.JTextField TxtQuantity;
    private javax.swing.JTextField TxtRequestMsg;
    private javax.swing.JTextField TxtVictims;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel severity;
    // End of variables declaration//GEN-END:variables
}
