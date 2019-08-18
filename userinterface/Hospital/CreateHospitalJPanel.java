/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;


import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author Pornima
 */
public class CreateHospitalJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private OrganizationDirectory orgdir;
    private EcoSystem business;
    private Enterprise enterprise;
    private DoctorOrganization organization;
    private HospitalDirectory hospitaldir;
    private Hospital hospital;

    /**
     * Creates new form CheckHospitalJPanel
     */
   

   

    CreateHospitalJPanel(JPanel userProcessContainer, Enterprise enterprise) {
      initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.hospitaldir = enterprise.getHospitalDirectory();
       // this.orgdir = enterprise.getOrganizationDirectory(); // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    populateTable();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        TxtFldHospitalId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFldHospitalName = new javax.swing.JTextField();
        TxtFldLocation = new javax.swing.JTextField();
        TxtFldTreatmentAvailability = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHospitalSubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtFldDepartment = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(900, 500));
        jLabel6.setMinimumSize(new java.awt.Dimension(990, 500));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital_ID", "Hospital_Name", "Location", "Treatment_availability", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospital);
        if (tblHospital.getColumnModel().getColumnCount() > 0) {
            tblHospital.getColumnModel().getColumn(0).setResizable(false);
            tblHospital.getColumnModel().getColumn(1).setResizable(false);
            tblHospital.getColumnModel().getColumn(2).setResizable(false);
            tblHospital.getColumnModel().getColumn(3).setResizable(false);
            tblHospital.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 800, 122));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));
        add(TxtFldHospitalId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Hospital_ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("Hospital Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        add(TxtFldHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));
        add(TxtFldLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, -1));

        TxtFldTreatmentAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldTreatmentAvailabilityActionPerformed(evt);
            }
        });
        add(TxtFldTreatmentAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Location");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("Treatment Availability");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btnHospitalSubmit.setText("Submit");
        btnHospitalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalSubmitActionPerformed(evt);
            }
        });
        add(btnHospitalSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("Department");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        add(TxtFldDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, -1));

        btnDelete.setText("Delete record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Create Hospital");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalSubmitActionPerformed
        // TODO add your handling code here:
        try{
        Hospital hospital = new Hospital();
      if(enterprise.getHospitalDirectory() == null){
          enterprise.setHospitalDirectory(new HospitalDirectory());
          hospitaldir= enterprise.getHospitalDirectory();
          System.out.println("usernullhos");
      }
      
      for(Hospital hosp:hospitaldir.gethospitalList())
      {
          if(hosp.getHospitalId().equalsIgnoreCase(TxtFldHospitalId.getText())
                  && hosp.getHospitalName().equalsIgnoreCase(TxtFldHospitalName.getText())
                  &&hosp.getHospitalLocation().equalsIgnoreCase(TxtFldLocation.getText()) 
                  && hosp.getHospitalDept().equalsIgnoreCase(TxtFldDepartment.getText()) 
                  && hosp.getHospitalTreatAvailability().equalsIgnoreCase(TxtFldTreatmentAvailability.getText()))
      {
          JOptionPane.showMessageDialog(null, "please add different value");
          return;
      }
      }
        hospital = hospitaldir.addHospital();
        hospital.setHospitalId(TxtFldHospitalId.getText().toString());
        hospital.setHospitalLocation(TxtFldLocation.getText().toString());
        hospital.setHospitalName(TxtFldHospitalName.getText().toString());
        hospital.setHospitalTreatAvailability(TxtFldTreatmentAvailability.getText().toString());
        hospital.setHospitalDept(TxtFldDepartment.getText().toString());
        //hospital = hospitaldir.addHospital();
        
        populateTable();
        TxtFldDepartment.setText("");
        TxtFldHospitalId.setText("");
        TxtFldHospitalName.setText("");
        TxtFldLocation.setText("");
        TxtFldTreatmentAvailability.setText("");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "System is down..contact system admin");
        }
        
    }//GEN-LAST:event_btnHospitalSubmitActionPerformed

    public void populateTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        
        model.setRowCount(0);
        for(Hospital h : hospitaldir.gethospitalList()){
       // for (Hospital h : organization.getHospitalDirectory().gethospitalList()){
            
            Object[] row = new Object[5];
            row[0] = h;
            row[1] = h.getHospitalName();
            row[2] = h.getHospitalLocation();
            row[3] = h.getHospitalTreatAvailability();
            row[4] = h.getHospitalDept();
            model.addRow(row);
        }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "System is down..contact system admin");
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
      int p = JOptionPane.showConfirmDialog(null, "Confirm delete?","Delete",JOptionPane.YES_NO_OPTION);
      if(p==0){
      
      
      
        int selectedrow = tblHospital.getSelectedRow();
        
        if(selectedrow >= 0)
        {
        Hospital h = (Hospital) tblHospital.getValueAt(selectedrow, 0);

        hospitaldir.deleteVitals(h);
       
        
        JOptionPane.showMessageDialog(null, "Record has been deleted..");
        populateTable();
         
    }                                             

        else
        
                JOptionPane.showMessageDialog(null,"Please select any row.");
    }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "System is down..contact system admin");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TxtFldTreatmentAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldTreatmentAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldTreatmentAvailabilityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtFldDepartment;
    private javax.swing.JTextField TxtFldHospitalId;
    private javax.swing.JTextField TxtFldHospitalName;
    private javax.swing.JTextField TxtFldLocation;
    private javax.swing.JTextField TxtFldTreatmentAvailability;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHospitalSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    // End of variables declaration//GEN-END:variables
}