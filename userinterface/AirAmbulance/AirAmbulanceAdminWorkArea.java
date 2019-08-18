/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AirAmbulance;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Hospital.Hospital;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AirAmbulanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adith
 */
public class AirAmbulanceAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AirAmbulanceAdminWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    //Network network;
//    UserAccount userAccount;
//    Hospital hospital;
//    OrganizationDirectory orgdir;
//    EcoSystem business;
    //OrganizationDirectory directory;
    public AirAmbulanceAdminWorkArea(JPanel userProcessContainer,  Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        //this.network=network;
        //this.directory=directory;
//        this.userAccount=userAccount;
//        this.hospital=hospital;
//        this.orgdir=orgdir;
//        this.business=business;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospitalDetails.getModel();

        model.setRowCount(0);
        System.out.println("HI not in the for loop"+enterprise.getName());
        System.out.println("Hsize"+enterprise.getWorkQueue().getWorkRequestList().size());
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            System.out.println("HI in the for loop"+enterprise.getName());
            if(request instanceof AirAmbulanceWorkRequest)
                System.out.println("HI in the for loop");
            {
            Object[] row = new Object[7];
            row[0] = ((AirAmbulanceWorkRequest) request).getHospital();
            row[1] = ((AirAmbulanceWorkRequest) request).getHospital().getHospitalName();
            row[2] = ((AirAmbulanceWorkRequest) request).getHospital().getHospitalDept();
            row[3] = ((AirAmbulanceWorkRequest) request).getHospital().getHospitalLocation();
            row[4] = ((AirAmbulanceWorkRequest) request).getHospital().getHospitalTreatAvailability();
            
            row[5] = request.getMessage();
            row[6] = request;
            
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            

            model.addRow(row);
        
        }
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

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnCreateAmbulance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalDetails = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AirAmbulance Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 21, -1, -1));

        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, -1));

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 71, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 81, 130, 20));

        btnCreateAmbulance.setText("Create Ambulance");
        btnCreateAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAmbulanceActionPerformed(evt);
            }
        });
        add(btnCreateAmbulance, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, -1));

        tblHospitalDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Id", "Hospital Name", "Department", "Location", "Treatment Available", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitalDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        AirAmbulanceManageEmployeeJPanel manageEmployeeJPanel = new AirAmbulanceManageEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AirAmbulanceManageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        AirAmbulanceOrganizationJPanel manageOrganizationJPanel = new AirAmbulanceOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AirAmbulanceOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        AirAmbulanceManageUserJPanel muajp = new AirAmbulanceManageUserJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AirAmbulanceManageUserJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void btnCreateAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAmbulanceActionPerformed
        // TODO add your handling code here:
        CreateAirAmbulanceJPanel checkhospitalJPanel = new CreateAirAmbulanceJPanel(userProcessContainer,  enterprise);
        userProcessContainer.add("CreateAirAmbulanceJPanel", checkhospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAmbulance;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JTable tblHospitalDetails;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
