/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;

/**
 *
 * @author dell
 */
public class DriverWindow extends javax.swing.JFrame {

    CurrentUser currentphone = CurrentUser.getInstance();
    public String phoneDriver = currentphone.getCurrentPhone();
    public Driver driver = drivers.get(phoneDriver);
    public String name = driver.getUsername();

    public DriverWindow() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewRequests = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Driver Window");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(210, 27, 230)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/City driver-bro 3.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(210, 27, 230));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/comment (1).png"))); // NOI18N
        jButton1.setText("View  Complaint  ");
        jButton1.setBorderPainted(false);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setFocusable(false);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewRequests.setBackground(new java.awt.Color(210, 27, 230));
        viewRequests.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        viewRequests.setForeground(new java.awt.Color(255, 255, 255));
        viewRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/location (5).png"))); // NOI18N
        viewRequests.setText("View Requests  ");
        viewRequests.setActionCommand("View Requests");
        viewRequests.setBorderPainted(false);
        viewRequests.setFocusTraversalPolicyProvider(true);
        viewRequests.setFocusable(false);
        viewRequests.setHideActionText(true);
        viewRequests.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        viewRequests.setVerifyInputWhenFocusTarget(false);
        viewRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(210, 27, 230));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 27, 230));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/service (1).png"))); // NOI18N
        jLabel3.setText("Welcome");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 27, 230));
        jLabel1.setText(name);
        jLabel1.setFocusable(false);

        logout.setBackground(new java.awt.Color(210, 27, 230));
        logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/logout.png"))); // NOI18N
        logout.setText("Logout  ");
        logout.setToolTipText("");
        logout.setAlignmentX(1.0F);
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        logout.setDefaultCapable(false);
        logout.setFocusTraversalPolicyProvider(true);
        logout.setFocusable(false);
        logout.setHideActionText(true);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        logout.setIconTextGap(0);
        logout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout.setMultiClickThreshhold(3L);
        logout.setRequestFocusEnabled(false);
        logout.setRolloverEnabled(false);
        logout.setVerifyInputWhenFocusTarget(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Intro Logout = new Intro();
        Logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DriverTicketWindow dt = new DriverTicketWindow();
        this.setVisible(false);
        this.dispose();
        dt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        ViewRequests myview = new ViewRequests();
        myview.setVisible(true);

    }//GEN-LAST:event_viewRequestsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewRequests;
    // End of variables declaration//GEN-END:variables
}
