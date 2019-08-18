/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AirAmbulance;

import Business.Enterprise.Enterprise;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



/**
 *
 * @author adith
 */
public class DestiantionHospitalLocationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DestiantionHospitalLocationJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;
    /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;
    public DestiantionHospitalLocationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        populateMap();
        
    }
    
    public void populateMap()
    {
        try{
    //public static void main(String[] args) {
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);

       JButton zoomInButton = new JButton("Zoom In");
       zoomInButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (zoomValue < MAX_ZOOM) {
                   browser.executeJavaScript("map.setZoom(" + ++zoomValue + ")");
               }
           }
       });

       JButton zoomOutButton = new JButton("Zoom Out");
       zoomOutButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (zoomValue > MIN_ZOOM) {
                   browser.executeJavaScript("map.setZoom(" + --zoomValue + ")");
               }
           }
       });

       JButton setMarkerButton = new JButton("Set Location");
       setMarkerButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               browser.executeJavaScript("var myLatlng = new google.maps.LatLng(48.4431727,23.0488126);\n" +
                       "var marker = new google.maps.Marker({\n" +
                       "    position: myLatlng,\n" +
                       "    map: map,\n" +
                       "    title: 'Destination Hospital Location'\n" +
                       "});");
           }
       });

       JPanel toolBar = new JPanel();
       toolBar.add(zoomInButton);
       toolBar.add(zoomOutButton);
       toolBar.add(setMarkerButton);

       JFrame frame = new JFrame("map.html");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.add(toolBar, BorderLayout.SOUTH);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);

      
   

        browser.loadURL("C:\\Users\\adith\\AED_LAB_DEMO\\aed_group_assignments\\google\\samples\\map.html");
        }catch(Exception e)
        {
            System.out.println("system is down please contact system admin");
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/68577077-light-blue-wallpapers.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, -310, 2040, 1110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}