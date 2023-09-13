/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UBER;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class RegisterWindow extends javax.swing.JFrame {

    String name;
    String email;
    String password;
    String confirm;
    String phone;
    String license;
    String vehicle_type;
    String vehicle_model;
    String vehicle_color;
    String vehicle_plate;
    String role;
    ImageIcon icon = new ImageIcon("src/miniuberapp/image/verify.png");

    public RegisterWindow() {
        initComponents();
        driverInfoPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        typeButtonGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        phoneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        confirmPassLabel = new javax.swing.JLabel();
        Phone = new javax.swing.JFormattedTextField();
        driverRadioButton = new javax.swing.JRadioButton();
        passengerRadioButton = new javax.swing.JRadioButton();
        driverInfoPanel = new javax.swing.JPanel();
        vehicleTypeLabel = new javax.swing.JLabel();
        vehicleModelLabel = new javax.swing.JLabel();
        vehicleModel = new javax.swing.JTextField();
        vehicleType = new javax.swing.JComboBox<>();
        vehicleColorLabel = new javax.swing.JLabel();
        vehicleColor = new javax.swing.JTextField();
        vehiclePlateLabel = new javax.swing.JLabel();
        vehiclePlate = new javax.swing.JTextField();
        licenseLabel = new javax.swing.JLabel();
        License = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BackStep = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Uber");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(210, 27, 230)));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(210, 27, 230));
        jLabel2.setText("SIGN UP");

        submitButton.setBackground(new java.awt.Color(210, 27, 230));
        submitButton.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorderPainted(false);
        submitButton.setFocusPainted(false);
        submitButton.setPreferredSize(new java.awt.Dimension(100, 40));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        emailLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        emailLabel.setText("Email :");

        passwordLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        passwordLabel.setText("Password :");

        Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Name.setPreferredSize(new java.awt.Dimension(60, 22));

        Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Email.setPreferredSize(new java.awt.Dimension(60, 22));

        Password.setColumns(12);
        Password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        confirmpass.setColumns(12);
        confirmpass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        phoneLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        phoneLabel.setText("Phone.No :");

        nameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nameLabel.setText("Name :");

        confirmPassLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        confirmPassLabel.setText(" Confirm pass :");

        try {
            Phone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0#-###-######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(confirmPassLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(confirmpass, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(Phone)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneLabel)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Phone)))
                .addContainerGap())
        );

        driverRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        typeButtonGroup.add(driverRadioButton);
        driverRadioButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        driverRadioButton.setForeground(new java.awt.Color(210, 27, 230));
        driverRadioButton.setText("Driver");
        driverRadioButton.setFocusPainted(false);
        driverRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverRadioButtonActionPerformed(evt);
            }
        });

        passengerRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        typeButtonGroup.add(passengerRadioButton);
        passengerRadioButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        passengerRadioButton.setForeground(new java.awt.Color(210, 27, 230));
        passengerRadioButton.setSelected(true);
        passengerRadioButton.setText("Passenger");
        passengerRadioButton.setFocusPainted(false);
        passengerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerRadioButtonActionPerformed(evt);
            }
        });

        driverInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        vehicleTypeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vehicleTypeLabel.setText("Vehicle Type : ");

        vehicleModelLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vehicleModelLabel.setText("Vehicle Model : ");

        vehicleModel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        vehicleModel.setPreferredSize(new java.awt.Dimension(60, 22));

        vehicleType.setEditable(true);
        vehicleType.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        vehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Premium", "Bus", "MotorBike" }));
        vehicleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleTypeActionPerformed(evt);
            }
        });

        vehicleColorLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vehicleColorLabel.setText("Vehicle Color : ");

        vehicleColor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        vehicleColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleColorActionPerformed(evt);
            }
        });

        vehiclePlateLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vehiclePlateLabel.setText("Vehicle Plate : ");

        vehiclePlate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        licenseLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        licenseLabel.setText("License : ");

        License.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        License.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout driverInfoPanelLayout = new javax.swing.GroupLayout(driverInfoPanel);
        driverInfoPanel.setLayout(driverInfoPanelLayout);
        driverInfoPanelLayout.setHorizontalGroup(
            driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverInfoPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vehicleModelLabel)
                        .addComponent(vehiclePlateLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(vehicleTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vehicleColorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(licenseLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicleModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleType, 0, 242, Short.MAX_VALUE)
                    .addComponent(vehicleColor)
                    .addComponent(vehiclePlate)
                    .addComponent(License)))
        );
        driverInfoPanelLayout.setVerticalGroup(
            driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(licenseLabel)
                    .addGroup(driverInfoPanelLayout.createSequentialGroup()
                        .addComponent(License)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleTypeLabel)
                    .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleModelLabel)
                    .addComponent(vehicleModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleColorLabel)
                    .addComponent(vehicleColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(driverInfoPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(vehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(vehiclePlateLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(driverRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(passengerRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(driverInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driverInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/Sign up.png"))); // NOI18N

        BackStep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/arrow-left.png"))); // NOI18N
        BackStep.setFocusable(false);
        BackStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackStepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BackStep, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BackStep, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passengerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerRadioButtonActionPerformed
        // TODO add your handling code here:
        passengerRadioButton.addActionListener(e -> {
            // Hide the panel if the passenger radio button is selected
            driverInfoPanel.setVisible(false);
            role = "passenger";
        });
    }//GEN-LAST:event_passengerRadioButtonActionPerformed

    private void driverRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverRadioButtonActionPerformed
        // TODO add your handling code here:
        driverRadioButton.addActionListener(e -> {
            driverInfoPanel.setVisible(true);
            role = "driver";
        });
    }//GEN-LAST:event_driverRadioButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        String flag = "";
        name = Name.getText();
        email = Email.getText();
        password = String.valueOf(Password.getPassword());
        confirm = String.valueOf(confirmpass.getPassword());
        phone = Phone.getText();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || phone.equals("0 -   -      ")) {
            JOptionPane.showMessageDialog(this, "Please, Enter all Data.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Register userRegister = new Register();
            if (driverRadioButton.isSelected()) {
                license = License.getText();
                vehicle_type = (String) vehicleType.getSelectedItem();
                vehicle_model = vehicleModel.getText();
                vehicle_color = vehicleColor.getText();
                vehicle_plate = vehiclePlate.getText();
                if (license.isEmpty() || vehicle_model.isEmpty() || vehicle_color.isEmpty() || vehicle_plate.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Please, Enter all driver Data.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    flag = userRegister.register(name, email, password, confirm, phone, license, vehicle_type, vehicle_model, vehicle_color, vehicle_plate);
                }
            } else if (passengerRadioButton.isSelected()) {
                flag = userRegister.register(name, email, password, confirm, phone);
            }

            switch (flag) {
                case "done":
                    // if there is no errors
                    Data userInf;
                    userInf = Data.getInstance();
                    userInf.SetInDatabase(name, email, password, phone, role, license, vehicle_type, vehicle_model, vehicle_color, vehicle_plate);
                    JOptionPane.showMessageDialog(this, "congratulation, your account has been successfully created", "Registered", JOptionPane.INFORMATION_MESSAGE, icon);
                    clearFields();
                    CurrentUser currentphone = CurrentUser.getInstance();
                    currentphone.setCurrentPhone(phone);
                    if (driverRadioButton.isSelected()) {
                        //phoneDriver = phone;
                        DriverWindow Home = new DriverWindow();
                        Home.setVisible(true);
                        this.setVisible(false);
                    } else if (passengerRadioButton.isSelected()) {
                        //phonePassenger = phone;
                        PassengerWindow Home = new PassengerWindow();
                        Home.setVisible(true);
                        this.setVisible(false);
                    }
                    break;
                case "emailNotValid":     // email is not a valid email format
                    JOptionPane.showMessageDialog(this, "your email is not a valid email format.", "Error", JOptionPane.ERROR_MESSAGE);

                    break;
                case "emailExists":     // email are already exist in database
                    JOptionPane.showMessageDialog(this, "your email is already exist.", "Error", JOptionPane.ERROR_MESSAGE);

                    break;
                case "passwordNotValid":     // password and confirmPassword fielde is not equals
                    JOptionPane.showMessageDialog(this, "your password is not a valid password as it is not correct.", "Error", JOptionPane.ERROR_MESSAGE);

                    break;
                case "phoneExists":     // return 4 =>phone number are already exist in database
                    JOptionPane.showMessageDialog(this, "your phone number is already exist.", "Error", JOptionPane.ERROR_MESSAGE);

                    break;
                default:
                    break;

            }
        }

    }//GEN-LAST:event_submitButtonActionPerformed
    private void clearFields() {
        Name.setText("");
        Email.setText("");
        Phone.setText("");
        Password.setText("");
        confirmpass.setText("");
        vehicleType.setSelectedIndex(0);
        vehicleModel.setText("");
    }
    private void vehicleTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleTypeActionPerformed

    private void vehicleColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleColorActionPerformed

    private void LicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LicenseActionPerformed

    private void BackStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackStepMouseClicked
        Intro back = new Intro();
        back.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_BackStepMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterWindow().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackStep;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField License;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JFormattedTextField Phone;
    private javax.swing.JLabel confirmPassLabel;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JPanel driverInfoPanel;
    private javax.swing.JRadioButton driverRadioButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton passengerRadioButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.ButtonGroup typeButtonGroup;
    private javax.swing.JTextField vehicleColor;
    private javax.swing.JLabel vehicleColorLabel;
    private javax.swing.JTextField vehicleModel;
    private javax.swing.JLabel vehicleModelLabel;
    private javax.swing.JTextField vehiclePlate;
    private javax.swing.JLabel vehiclePlateLabel;
    private javax.swing.JComboBox<String> vehicleType;
    private javax.swing.JLabel vehicleTypeLabel;
    // End of variables declaration//GEN-END:variables
}
