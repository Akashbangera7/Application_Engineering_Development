/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MayorRole;


import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Enterprise.GovernmentEnterprise;
import Business.SafetyAdmin.SupplyItemsDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AirAmbulanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author kiran
 */
public class MayorAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MayorAdminWorkAreaJPanel
     */
    JPanel userprocesscontainer;
    GovernmentEnterprise enterprise;
    SupplyItemsDirectory supplydir;
    WorkRequest request;
    UserAccount userAccount;
    
    
    
    public MayorAdminWorkAreaJPanel(JPanel userprocesscontainer,Enterprise enterprise,UserAccount userAccount) {
        initComponents();
        this.userprocesscontainer = userprocesscontainer;
        this.enterprise = (GovernmentEnterprise)enterprise;
        this.supplydir = supplydir;
        this.request=(AirAmbulanceWorkRequest)request;
        this.userAccount = userAccount;
        PopulateTable();
    }
    
    public void PopulateTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) TblMayorProcessWorkRequest.getModel();
        model.setRowCount(0);
        int selectedrow = TblMayorProcessWorkRequest.getSelectedRow();
        
        if (selectedrow<=0 ){
            
        }
        if(enterprise.getSupplydir()== null){
          enterprise.setSupplydir(new SupplyItemsDirectory());
        }
        
        for(WorkRequest w : enterprise.getWorkQueue().getWorkRequestList()){
            if (w instanceof AirAmbulanceWorkRequest){
                
            
        //for(Hospital h : tblPatientDetails.gethospitalList){
       // for (Hospital h : organization.getHospitalDirectory().gethospitalList()){
            
            Object[] row = new Object[6];
            row[0] = w;
         
            row[1] = ((AirAmbulanceWorkRequest) w).getItemSupplier().getDisaster();
            row[2] = ((AirAmbulanceWorkRequest) w).getItemSupplier().getSupplyItems();
            row[3] = ((AirAmbulanceWorkRequest) w).getItemSupplier().getDestination();
            row[4] = w.getSender();
            row[5] =  w.getStatus();
           
            model.addRow(row);
        }
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
        TblMayorProcessWorkRequest = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        BtnMayorProcessRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblMayorProcessWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Disaster", "SupplyItem", "Destination", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblMayorProcessWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 590, 140));

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        BtnMayorProcessRequest.setText("Process Request");
        BtnMayorProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMayorProcessRequestActionPerformed(evt);
            }
        });
        add(BtnMayorProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mayor Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void BtnMayorProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMayorProcessRequestActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) TblMayorProcessWorkRequest.getModel();
        int selectedrow = TblMayorProcessWorkRequest.getSelectedRow();{
        if(selectedrow<0){
            JOptionPane.showMessageDialog(null, "Select Atleast One row");
        }
        else{
            AirAmbulanceWorkRequest w = (AirAmbulanceWorkRequest) TblMayorProcessWorkRequest.getValueAt(selectedrow, 0);
            w.setStatus("processed");
            w.setSender(userAccount);
            PopulateTable();
            JOptionPane.showMessageDialog(null, "Request Completed Successfully");
            
//        dtm.getValueAt(selectedrow, 4).equals("");    
//        dtm.getValueAt(selectedrow, 4).equals("Completed");
//        dtm.getValueAt(selectedrow, 4).equals("");
//        dtm.getValueAt(selectedrow, 3).equals(userAccount);

        }
    }
        
    }//GEN-LAST:event_BtnMayorProcessRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMayorProcessRequest;
    private javax.swing.JTable TblMayorProcessWorkRequest;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}