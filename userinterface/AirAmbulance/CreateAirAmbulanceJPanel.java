/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AirAmbulance;

import Business.AirAmbulance.AirAmbulance;
import Business.AirAmbulance.AirAmbulanceDirectory;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author Pornima
 */
public class CreateAirAmbulanceJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private AirAmbulanceDirectory airambulancedir;

    /**
     * Creates new form CheckHospitalJPanel
     */
    

    CreateAirAmbulanceJPanel(JPanel userProcessContainer, Enterprise enterprise) {
      initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.airambulancedir = enterprise.getAirambulancedir();
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
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirAmbulancel_ID", "AirAmbulance_Name", "Patient_Capacity", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 570, 122));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));
        add(TxtFldHospitalId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("AirAmbulance_ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("AirAmbulance_Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 184, -1, 10));
        add(TxtFldHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, -1));
        add(TxtFldLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 140, -1));
        add(TxtFldTreatmentAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 140, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Patient Capacity");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("Availability");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        btnHospitalSubmit.setText("Submit");
        btnHospitalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalSubmitActionPerformed(evt);
            }
        });
        add(btnHospitalSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        btnDelete.setText("Delete record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Create AirAmbulance");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -270, -1, 1170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalSubmitActionPerformed
        // TODO add your handling code here:
        try{
        AirAmbulance airambulance = new AirAmbulance();
      if(enterprise.getAirambulancedir()==null)
      {
          enterprise.setAirambulancedir(new AirAmbulanceDirectory());
      }
      
      for(AirAmbulance a:enterprise.getAirambulancedir().getAmbulanceList())
      {
          if(a.getAmbulanceId().equalsIgnoreCase(TxtFldHospitalId.getText()) 
                  && a.getAmbulanceName().equalsIgnoreCase(TxtFldHospitalName.getText()) 
                  && a.getAvailability().equalsIgnoreCase(TxtFldTreatmentAvailability.getText())&& 
                  a.getPatientCapacity()==Integer.parseInt(TxtFldLocation.getText()))
          {
              JOptionPane.showMessageDialog(null, "please add different value");
                return;
          }
      }
      airambulancedir=enterprise.getAirambulancedir();
        airambulance = airambulancedir.addAirAmbulance();
        airambulance.setAmbulanceId(TxtFldHospitalId.getText());
        airambulance.setAmbulanceName(TxtFldHospitalName.getText());
        airambulance.setPatientCapacity(Integer.parseInt(TxtFldLocation.getText()));
        airambulance.setAvailability(TxtFldTreatmentAvailability.getText());
        
        populateTable();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
    }//GEN-LAST:event_btnHospitalSubmitActionPerformed

    public void populateTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        
        model.setRowCount(0);
        if(airambulancedir!=null)
        {
            
        
        for(AirAmbulance h : airambulancedir.getAmbulanceList()){
       
            
            Object[] row = new Object[4];
            row[0] = h;
            row[1] = h.getAmbulanceName();
            row[2] = h.getPatientCapacity();
            row[3] = h.getAvailability();
     
            model.addRow(row);
        }
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
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
        AirAmbulance h = (AirAmbulance) tblHospital.getValueAt(selectedrow, 0);

        airambulancedir.deleteVitals(h);
       
        
        JOptionPane.showMessageDialog(null, "Record has been deleted..");
        populateTable();
         
    }                                             

        else
        
                JOptionPane.showMessageDialog(null,"Please select any row.");
    }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    // End of variables declaration//GEN-END:variables
}
