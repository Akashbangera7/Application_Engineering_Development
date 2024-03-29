/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnician;


import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adith
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
   

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, LabOrganization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.labOrganization = (LabOrganization) organization;
        this.enterprise = enterprise;
       

        populateTable();
        
    }

    public void populateTable() {
        try{
        DefaultTableModel model = (DefaultTableModel) tblPatientDetails.getModel();

        model.setRowCount(0);
        if(labOrganization.getWorkQueue()==null)
        {
            labOrganization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {
            if(request instanceof HospitalWorkRequest)
            {
            Object[] row = new Object[8];
            row[0] = ((HospitalWorkRequest) request).getPatient();
            row[1] = ((HospitalWorkRequest) request).getPatient().getPatientName();
            row[2] = ((HospitalWorkRequest) request).getPatient().getAge();
            row[3] = ((HospitalWorkRequest) request).getPatient().getGender();
            row[4] = ((HospitalWorkRequest) request).getPatient().getDateOfBirth();
            row[5] = ((HospitalWorkRequest) request).getPatient().getIssue();
            row[7] = request.getMessage();
            row[6] = request;
            
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            

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

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientId", "PatientName", "Age", "Gender", "DateOfBirth", "Issue", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPatientDetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 570, 142));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Lab Technician Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        try{
        int selectedRow = tblPatientDetails.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblPatientDetails.getValueAt(selectedRow, 6);
            if (request.getMessage().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateTable();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
            return;
        }

        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        try{
        int selectedRow = tblPatientDetails.getSelectedRow();

        if (selectedRow >= 0) {
            HospitalWorkRequest request = (HospitalWorkRequest) tblPatientDetails.getValueAt(selectedRow, 6);

            request.setStatus("Processing");

            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
        }catch(Exception exx)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblPatientDetails;
    // End of variables declaration//GEN-END:variables
}
