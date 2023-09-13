/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import static UBER.SavingData.passengers;
import static UBER.SavingData.requests;

/**
 *
 * @author Tukaa
 */
public class RequestPage extends javax.swing.JFrame {

    ImageIcon confirm = new ImageIcon("src/miniuberapp/image/verify.png");
//     Passenger d =new Passenger();
    CurrentUser currentphone = CurrentUser.getInstance();
    public String phonePassenger = currentphone.getCurrentPhone();
    Passenger d = passengers.get(phonePassenger);

    public void init(boolean visa) {
        VisaNumField.setVisible(visa);
        VisaNumber.setVisible(visa);
    }
    boolean visa;
    String paytype;
    String ridetype;
    String myvisanum;

    /**
     * Creates new form RequestPage
     */
    public RequestPage() {
        initComponents();
        init(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupRideType = new javax.swing.ButtonGroup();
        GroupPayType = new javax.swing.ButtonGroup();
        RequestFrame = new javax.swing.JPanel();
        RequestForm = new javax.swing.JLabel();
        Location = new javax.swing.JLabel();
        Destination = new javax.swing.JLabel();
        PayType = new javax.swing.JLabel();
        RideType = new javax.swing.JLabel();
        Visa = new javax.swing.JRadioButton();
        Cash = new javax.swing.JRadioButton();
        MotorBike = new javax.swing.JRadioButton();
        Bus = new javax.swing.JRadioButton();
        PremiumCar = new javax.swing.JRadioButton();
        NormalCar = new javax.swing.JRadioButton();
        Cashimage = new javax.swing.JLabel();
        VisaImage = new javax.swing.JLabel();
        DesignImage = new javax.swing.JLabel();
        ForNext = new javax.swing.JButton();
        MotoBike_img = new javax.swing.JLabel();
        Bus_img = new javax.swing.JLabel();
        Premium_img = new javax.swing.JLabel();
        Normal_img = new javax.swing.JLabel();
        VisaNumber = new javax.swing.JLabel();
        VisaNumField = new javax.swing.JTextField();
        DestinationField = new javax.swing.JComboBox<>();
        LocationField = new javax.swing.JComboBox<>();
        BackStep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Request");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        RequestFrame.setBackground(new java.awt.Color(255, 255, 255));
        RequestFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 27, 230)));
        RequestFrame.setMaximumSize(new java.awt.Dimension(1000, 600));
        RequestFrame.setMinimumSize(new java.awt.Dimension(823, 569));
        RequestFrame.setPreferredSize(new java.awt.Dimension(1000, 600));

        RequestForm.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        RequestForm.setForeground(new java.awt.Color(210, 27, 230));
        RequestForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RequestForm.setText("Request Information");
        RequestForm.setAlignmentY(0.0F);

        Location.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Location.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Location.setText("Location ");

        Destination.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Destination.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Destination.setText("Destination ");

        PayType.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        PayType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PayType.setText("Pay Type ");

        RideType.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        RideType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RideType.setText("Ride Type ");

        Visa.setBackground(new java.awt.Color(255, 255, 255));
        GroupPayType.add(Visa);
        Visa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Visa.setForeground(new java.awt.Color(210, 27, 230));
        Visa.setText("Visa");
        Visa.setIconTextGap(3);
        Visa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisaMouseClicked(evt);
            }
        });
        Visa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaActionPerformed(evt);
            }
        });

        Cash.setBackground(new java.awt.Color(255, 255, 255));
        GroupPayType.add(Cash);
        Cash.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Cash.setForeground(new java.awt.Color(210, 27, 230));
        Cash.setSelected(true);
        Cash.setText("Cash");
        Cash.setIconTextGap(3);
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        MotorBike.setBackground(new java.awt.Color(255, 255, 255));
        GroupRideType.add(MotorBike);
        MotorBike.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        MotorBike.setForeground(new java.awt.Color(210, 27, 230));
        MotorBike.setText("MotorBike"); // NOI18N
        MotorBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorBikeActionPerformed(evt);
            }
        });

        Bus.setBackground(new java.awt.Color(255, 255, 255));
        GroupRideType.add(Bus);
        Bus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Bus.setForeground(new java.awt.Color(210, 27, 230));
        Bus.setText("Bus");
        Bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusActionPerformed(evt);
            }
        });

        PremiumCar.setBackground(new java.awt.Color(255, 255, 255));
        GroupRideType.add(PremiumCar);
        PremiumCar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        PremiumCar.setForeground(new java.awt.Color(210, 27, 230));
        PremiumCar.setText("Premium Car");
        PremiumCar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 27, 230), 1, true));
        PremiumCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PremiumCar.setIconTextGap(3);
        PremiumCar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PremiumCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PremiumCarMousePressed(evt);
            }
        });
        PremiumCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumCarActionPerformed(evt);
            }
        });

        NormalCar.setBackground(new java.awt.Color(255, 255, 255));
        GroupRideType.add(NormalCar);
        NormalCar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        NormalCar.setForeground(new java.awt.Color(210, 27, 230));
        NormalCar.setText("Normal Car");
        NormalCar.setIconTextGap(3);
        NormalCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalCarActionPerformed(evt);
            }
        });

        Cashimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/money-41-32.png"))); // NOI18N
        Cashimage.setLabelFor(Cash);

        VisaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/credit-card-38-32.png"))); // NOI18N
        VisaImage.setToolTipText("");

        DesignImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DesignImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/Taxi_Price_Comparison-1-removebg-preview.png"))); // NOI18N
        DesignImage.setName(""); // NOI18N

        ForNext.setBackground(new java.awt.Color(210, 27, 230));
        ForNext.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        ForNext.setForeground(new java.awt.Color(255, 255, 255));
        ForNext.setText("Next");
        ForNext.setBorderPainted(false);
        ForNext.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ForNext.setFocusable(false);
        ForNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ForNext.setInheritsPopupMenu(true);
        ForNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForNextMouseClicked(evt);
            }
        });
        ForNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForNextActionPerformed(evt);
            }
        });

        MotoBike_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/motorcycle-6-64.png"))); // NOI18N
        MotoBike_img.setLabelFor(MotorBike);

        Bus_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/Bus.png"))); // NOI18N
        Bus_img.setLabelFor(Bus);

        Premium_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/PremiumCar-removebg-preview (2).png"))); // NOI18N

        Normal_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/NormalCarRemove.png"))); // NOI18N

        VisaNumber.setBackground(new java.awt.Color(255, 255, 255));
        VisaNumber.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        VisaNumber.setLabelFor(VisaNumField);
        VisaNumber.setText("Visa Number");
        VisaNumber.setToolTipText("");

        VisaNumField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        VisaNumField.setForeground(new java.awt.Color(210, 27, 230));
        VisaNumField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        VisaNumField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VisaNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaNumFieldActionPerformed(evt);
            }
        });

        DestinationField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DestinationField.setForeground(new java.awt.Color(210, 27, 230));
        DestinationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Obour_City", "Aswan", "Nasr_City", "Giza", "Qalyubia", "Suez", "El_Mansoura", "Tanta", "Asyut", "Fayoum", "Zagazig", "Ismailia", "Damanhur", "Damietta", "Luxor", "El_Marg", "El_Maadi", "Minya" }));
        DestinationField.setAlignmentX(0.0F);
        DestinationField.setAlignmentY(0.0F);
        DestinationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DestinationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationFieldActionPerformed(evt);
            }
        });

        LocationField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LocationField.setForeground(new java.awt.Color(210, 27, 230));
        LocationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Obour_City", "Aswan", "Nasr_City", "Giza", "Qalyubia", "Suez", "El_Mansoura", "Tanta", "Asyut", "Fayoum", "Zagazig", "Ismailia", "Damanhur", "Damietta", "Luxor", "El_Marg", "El_Maadi", "Minya" }));
        LocationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LocationField.setNextFocusableComponent(DestinationField);
        LocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationFieldActionPerformed(evt);
            }
        });

        BackStep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/arrow-left.png"))); // NOI18N
        BackStep.setFocusable(false);
        BackStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackStepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RequestFrameLayout = new javax.swing.GroupLayout(RequestFrame);
        RequestFrame.setLayout(RequestFrameLayout);
        RequestFrameLayout.setHorizontalGroup(
            RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestFrameLayout.createSequentialGroup()
                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestFrameLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RequestFrameLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(MotorBike)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MotoBike_img)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NormalCar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addComponent(Bus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bus_img)
                                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(PremiumCar))
                                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RideType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Premium_img)
                                    .addComponent(Normal_img))
                                .addGap(43, 43, 43))
                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Destination)
                                    .addComponent(PayType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RequestFrameLayout.createSequentialGroup()
                                        .addComponent(Visa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VisaImage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                        .addComponent(Cash)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cashimage)
                                        .addGap(114, 114, 114))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LocationField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DestinationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32))))))
                    .addGroup(RequestFrameLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(VisaNumber)
                        .addGap(34, 34, 34)
                        .addComponent(VisaNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestFrameLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(ForNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                        .addComponent(DesignImage, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(RequestFrameLayout.createSequentialGroup()
                .addComponent(BackStep, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RequestForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RequestFrameLayout.setVerticalGroup(
            RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestFrameLayout.createSequentialGroup()
                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RequestForm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackStep, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestFrameLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addComponent(Premium_img)
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addComponent(RideType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PremiumCar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)))
                                .addComponent(NormalCar)
                                .addGap(13, 13, 13))
                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(Bus)
                                .addGap(0, 104, Short.MAX_VALUE)))
                        .addGap(9, 9, 9))
                    .addGroup(RequestFrameLayout.createSequentialGroup()
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                .addGap(0, 188, Short.MAX_VALUE)
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Visa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PayType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addComponent(VisaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cashimage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(Cash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)))
                                .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(VisaNumber)
                                    .addComponent(VisaNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(Bus_img, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(RequestFrameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DesignImage, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Normal_img, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RequestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(MotorBike, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MotoBike_img, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestFrameLayout.createSequentialGroup()
                                .addComponent(ForNext)
                                .addGap(4, 4, 4)))))
                .addGap(34, 34, 34))
        );

        getContentPane().add(RequestFrame, java.awt.BorderLayout.CENTER);
        RequestFrame.getAccessibleContext().setAccessibleName("Request");
        RequestFrame.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   // visa
    private void VisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaActionPerformed
        visa = true;
        init(visa);
        Visa.addActionListener(e -> {
            paytype = "Visa";
        });


    }//GEN-LAST:event_VisaActionPerformed
    // cash
    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        visa = false;
        init(visa);
        Cash.addActionListener(e -> {
            paytype = "Cash";
        });


    }//GEN-LAST:event_CashActionPerformed

    private void ForNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForNextActionPerformed
        String Paymentway = "";
        myvisanum = VisaNumField.getText();
        Request r = null;
        if (ridetype == null || LocationField.getSelectedItem().toString().equals(DestinationField.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, " invalid request");
        } else {
            if (paytype == null) {
                JOptionPane.showMessageDialog(this, "UnChoosen Payment type");
            } else if (paytype.equals("Visa")) {
                r = new Request(DestinationField.getSelectedItem().toString(), LocationField.getSelectedItem().toString(), ridetype, paytype, d.getPhoneNumber());
                Paymentway = "Visa \n Visa num is => " + VisaNumField.getText();
            } else {
                r = new Request(DestinationField.getSelectedItem().toString(), LocationField.getSelectedItem().toString(), ridetype, paytype, d.getPhoneNumber());
                Paymentway = paytype;
            }
            double finalprice = d.MakeReq(r, d.getPhoneNumber());
            JOptionPane mypane = new JOptionPane();
            int n = JOptionPane.showConfirmDialog(this,
                    "  location is => " + LocationField.getSelectedItem().toString() + "\n Destination is =>  " + DestinationField.getSelectedItem().toString() + "\n paying by " + Paymentway + " \n Ride type is : " + ridetype + " \n Then  Total price is =>  " + finalprice + " pounds \n  Will you Confirm The request ? ", "Confirm Request",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    confirm);
            //            mypane.setSize(new Dimension(1000,700));
            if (n == JOptionPane.YES_OPTION) {
                setVisible(false);
                WaitingPage waiting = new WaitingPage();
                waiting.setUploading();
                waiting.setVisible(true);
                d.ConfirmRequest(r);
            }
        }

        }//GEN-LAST:event_ForNextActionPerformed

    private void PremiumCarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PremiumCarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PremiumCarMousePressed

    private void PremiumCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumCarActionPerformed
        PremiumCar.addActionListener(e -> {
            ridetype = "Premium";
        });

    }//GEN-LAST:event_PremiumCarActionPerformed

    private void VisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VisaMouseClicked

    private void ForNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForNextMouseClicked
        String Paymentway;
        myvisanum = VisaNumField.getText();
        Request r;
        if (ridetype == null || LocationField.getSelectedItem().toString().equals(DestinationField.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, " invalid request", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (paytype == null) {
                JOptionPane.showMessageDialog(this, "UnChoosen Payment type", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (paytype == "Visa") {
                r = new Request(DestinationField.getSelectedItem().toString(), LocationField.getSelectedItem().toString(), ridetype, paytype, d.getPhoneNumber());
                Paymentway = "Visa \n Visa num is => " + VisaNumField.getText();
                double finalprice = d.MakeReq(r, d.getPhoneNumber());

                JOptionPane mypane = new JOptionPane();
                int n = JOptionPane.showConfirmDialog(this,
                        " The Total price is =>  " + finalprice + "pounds \n location is => " + LocationField.getSelectedItem().toString() + "\n Destination is =>  " + DestinationField.getSelectedItem().toString() + "\n paying by " + Paymentway + " \n Ride type is : " + ridetype + "\n  Are you Sure ? ", "Confirm Request",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        confirm);

                if (n == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    WaitingPage waiting = new WaitingPage();
                    waiting.setUploading();
                    waiting.setVisible(true);
                    this.setVisible(false);
                }

            } else {
                r = new Request(DestinationField.getSelectedItem().toString(), LocationField.getSelectedItem().toString(), ridetype, paytype, d.getPhoneNumber());
                Paymentway = paytype;
                double finalprice = d.MakeReq(r, d.getPhoneNumber());

                JOptionPane mypane = new JOptionPane();
                int n = JOptionPane.showConfirmDialog(this,
                        "  location is => " + LocationField.getSelectedItem().toString() + "\n Destination is =>  " + DestinationField.getSelectedItem().toString() + "\n paying by " + Paymentway + " \n Ride type is : " + ridetype + " \n Then  Total price is =>  " + finalprice + " pounds \n  Will you Confirm The request ? ", "Confirm Request",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        confirm);
//            mypane.setSize(new Dimension(1000,700));
                if (n == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    WaitingPage waiting = new WaitingPage();
                    waiting.setUploading();
                    waiting.setVisible(true);
                    d.ConfirmRequest(r);
                }
            }

        }
        System.out.println(d.getPhoneNumber());
        System.out.println(d.getUsername());

    }//GEN-LAST:event_ForNextMouseClicked

    private void VisaNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaNumFieldActionPerformed

    }//GEN-LAST:event_VisaNumFieldActionPerformed

    private void NormalCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalCarActionPerformed
        NormalCar.addActionListener(e -> {
            ridetype = "Normal";
        });    }//GEN-LAST:event_NormalCarActionPerformed

    private void BusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusActionPerformed
        Bus.addActionListener(e -> {
            ridetype = "Bus";
        });    }//GEN-LAST:event_BusActionPerformed

    private void MotorBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorBikeActionPerformed
        MotorBike.addActionListener(e -> {
            ridetype = "MotorBike";
        });    }//GEN-LAST:event_MotorBikeActionPerformed

    private void LocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationFieldActionPerformed

    private void DestinationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationFieldActionPerformed

    private void BackStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackStepMouseClicked
        PassengerWindow pass = new PassengerWindow();
        pass.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_BackStepMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RequestPage myrequest = new RequestPage();
                myrequest.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackStep;
    private javax.swing.JRadioButton Bus;
    private javax.swing.JLabel Bus_img;
    private javax.swing.JRadioButton Cash;
    private javax.swing.JLabel Cashimage;
    private javax.swing.JLabel DesignImage;
    private javax.swing.JLabel Destination;
    private javax.swing.JComboBox<String> DestinationField;
    private javax.swing.JButton ForNext;
    private javax.swing.ButtonGroup GroupPayType;
    private javax.swing.ButtonGroup GroupRideType;
    private javax.swing.JLabel Location;
    private javax.swing.JComboBox<String> LocationField;
    private javax.swing.JLabel MotoBike_img;
    private javax.swing.JRadioButton MotorBike;
    private javax.swing.JRadioButton NormalCar;
    private javax.swing.JLabel Normal_img;
    private javax.swing.JLabel PayType;
    private javax.swing.JRadioButton PremiumCar;
    private javax.swing.JLabel Premium_img;
    private javax.swing.JLabel RequestForm;
    private javax.swing.JPanel RequestFrame;
    private javax.swing.JLabel RideType;
    private javax.swing.JRadioButton Visa;
    private javax.swing.JLabel VisaImage;
    private javax.swing.JTextField VisaNumField;
    private javax.swing.JLabel VisaNumber;
    // End of variables declaration//GEN-END:variables
}

