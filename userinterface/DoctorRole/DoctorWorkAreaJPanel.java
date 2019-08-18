/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

//import Business.Business;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.DoctorOrganization;
import Business.Organization.OrganizationDirectory;
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
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    //private Business business;
    //private Organization organization;
    private UserAccount userAccount;
    private EcoSystem business;
    private EnterpriseDirectory enterprise;
    private Enterprise ent;
    private OrganizationDirectory orgdir;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, EnterpriseDirectory enterprise,Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization =  organization;        
        this.userAccount = account;
        this.enterprise = enterprise;
        this.ent=ent;
        this.orgdir = ent.getOrganizationDirectory();
        
        populateRequestTable();
        PopulatePatientDetails();
    }


    
    public void PopulatePatientDetails()
    {
        try{
        DefaultTableModel model = (DefaultTableModel) tblPatientDetails.getModel();
        
        model.setRowCount(0);
        if(organization.getWorkQueue()==null)
        {
            organization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest request :organization.getWorkQueue().getWorkRequestList()){
            if(request instanceof HospitalWorkRequest)
            {
            Object[] row = new Object[8];
            row[0] = ((HospitalWorkRequest) request).getPatient();
            row[1] = ((HospitalWorkRequest) request).getPatient().getPatientName();
            row[2] = ((HospitalWorkRequest) request).getPatient().getAge();
            row[3] = ((HospitalWorkRequest) request).getPatient().getGender();
            row[4] = ((HospitalWorkRequest) request).getPatient().getDateOfBirth();
            row[5] = ((HospitalWorkRequest) request).getPatient().getIssue();
            row[6] = request;
            row[7] = organization.getName();
            
            
            
//            String result = ((DoctorWorkRequest) request).getTestResult();
//            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
            }
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
    }
    
    public void populateRequestTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        if(userAccount.getWorkQueue()==null)
        {
            userAccount.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof HospitalWorkRequest)
            {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((HospitalWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
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

        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        checkhospitalbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        checkhospitalbtn.setText("Contact Hospital Admin");
        checkhospitalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkhospitalbtnActionPerformed(evt);
            }
        });
        add(checkhospitalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 460, 97));

        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientId", "PatientName", "Age", "Gender", "DateOfBirth", "Issue", "Status", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 142));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        try{
        int selectedrow=tblPatientDetails.getSelectedRow();
        if(selectedrow>=0)
        {
                HospitalWorkRequest request= (HospitalWorkRequest) tblPatientDetails.getValueAt(selectedrow, 6);
                RequestLabTestJPanel muajp = new RequestLabTestJPanel(userProcessContainer, userAccount, business, ent, orgdir,request);
                userProcessContainer.add("RequestLabTestJPanel", muajp);

                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        
        
    }
         else
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void checkhospitalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkhospitalbtnActionPerformed

         
        try{
//        
        RequestHospitalDetailJPanel muajp = new RequestHospitalDetailJPanel(userProcessContainer, userAccount, business, enterprise, orgdir);
        userProcessContainer.add("RequestHospitalDetailJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
//        
        // TODO add your handling code here:
    }//GEN-LAST:event_checkhospitalbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkhospitalbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblPatientDetails;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
