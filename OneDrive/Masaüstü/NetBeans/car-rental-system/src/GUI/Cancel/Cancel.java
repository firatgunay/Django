/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Cancel;

import GUI.Cars.DisplayCar;
import GUI.Customers.DisplayCustomer;
import GUI.RentingCar.RentingInformation;
import classes.Person;
import classes.SystemClass;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author firatgunay
 */
public class Cancel extends javax.swing.JFrame {

    /**
     * Creates new form Cancel
     */
    public Cancel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelImportant2 = new javax.swing.JPanel();
        jButtonRentCar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonCustomers = new javax.swing.JButton();
        jButtonCars = new javax.swing.JButton();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelModel = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabelBrand = new javax.swing.JLabel();
        jTextFieldBrand = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jLabelTL = new javax.swing.JLabel();
        jLabelCancel = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelImportant2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelImportant2Layout = new javax.swing.GroupLayout(jPanelImportant2);
        jPanelImportant2.setLayout(jPanelImportant2Layout);
        jPanelImportant2Layout.setHorizontalGroup(
            jPanelImportant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanelImportant2Layout.setVerticalGroup(
            jPanelImportant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jButtonRentCar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRentCar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonRentCar.setText("Rent a Car");
        jButtonRentCar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentCarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel the Reservation");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonCustomers.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCustomers.setText("Customers");
        jButtonCustomers.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomersActionPerformed(evt);
            }
        });

        jButtonCars.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCars.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCars.setText("Cars");
        jButtonCars.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarsActionPerformed(evt);
            }
        });

        jPanelCustomers.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCustomers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelSearch.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jLabelSearch.setText("Search by Customer's ID Number, Car's Model and Brand:");

        jComboBoxSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabelID.setText("ID Number");

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        jTextFieldID.setBorder(BorderFactory.createCompoundBorder(border,
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelName.setText("Name");

    jTextFieldName.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelSurname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelSurname.setText("Surname");

jTextFieldSurname.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelModel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelModel.setText("Model");

    jTextFieldModel.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelBrand.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelBrand.setText("Brand");

jTextFieldBrand.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelPrice.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelPrice.setText("Total Price");

    jTextFieldPrice.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jButtonCancel.setBackground(new java.awt.Color(0, 0, 0));
jButtonCancel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
jButtonCancel.setText("CANCEL RESERVATION");
jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
    }
    });

    jLabelTL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelTL.setText("₺/day");
    jLabelTL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
    jPanelCustomers.setLayout(jPanelCustomersLayout);
    jPanelCustomersLayout.setHorizontalGroup(
        jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCustomersLayout.createSequentialGroup()
            .addContainerGap(86, Short.MAX_VALUE)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addComponent(jLabelSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelBrand)
                                        .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPrice)
                                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                                            .addComponent(jTextFieldPrice)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelTL))))
                                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSurname)
                                        .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelModel)
                                        .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelID)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelName)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGap(64, 64, 64))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(215, 215, 215))))
    );
    jPanelCustomersLayout.setVerticalGroup(
        jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCustomersLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelID)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelName)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(28, 28, 28)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelSurname)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelModel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(26, 26, 26)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelBrand)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addComponent(jLabelPrice)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(24, 24, 24))
    );

    jTextFieldID.setEnabled(false);
    jTextFieldName.setEnabled(false);
    jTextFieldSurname.setEnabled(false);
    jTextFieldModel.setEnabled(false);
    jTextFieldBrand.setEnabled(false);
    jTextFieldPrice.setEnabled(false);

    jLabelCancel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
    jLabelCancel.setText("Please update the page.");

    jButtonUpdate.setBackground(new java.awt.Color(0, 0, 0));
    jButtonUpdate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
    jButtonUpdate.setText("UPDATE");
    jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonUpdateActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelImportant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jButtonRentCar)
            .addGap(29, 29, 29)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButtonCars)
            .addGap(32, 32, 32))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabelCancel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(151, 151, 151))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanelImportant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonCars, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(61, 61, 61)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4))
                .addComponent(jLabelCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(65, 65, 65))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentCarActionPerformed
        RentingInformation RentingInformation = new RentingInformation();
        RentingInformation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRentCarActionPerformed

    private void jButtonCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomersActionPerformed
        DisplayCustomer displayCustomer = new DisplayCustomer();
        displayCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCustomersActionPerformed

    private void jButtonCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarsActionPerformed
        DisplayCar displayCar = new DisplayCar();
        displayCar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCarsActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
       jComboBoxSearch.removeAllItems();
        for (Person customer : SystemClass.customers) {
            if(!customer.rentedCars.isEmpty()){
                jComboBoxSearch.insertItemAt(customer.getIdNumber() + " " + customer.rentedCars.get(0).getBrand() + " " + customer.rentedCars.get(0).getModel(), 0);
            }
        }
        
        jLabelCancel.setText("Cancel Reservation");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        int position = 0;
        int i = 0;
        for (Person customer : SystemClass.customers) {
            if(!customer.rentedCars.isEmpty()){
                if(jComboBoxSearch.getSelectedItem().equals(customer.getIdNumber() + " " + customer.rentedCars.get(0).getBrand() + " " + customer.rentedCars.get(0).getModel())){
                    position = i;
                }
            }
            i++;
        }

        jTextFieldName.setText(SystemClass.customers.get(position).getName());
        jTextFieldSurname.setText(SystemClass.customers.get(position).getSurname());
        jTextFieldID.setText(SystemClass.customers.get(position).getIdNumber());
        jTextFieldBrand.setText(SystemClass.customers.get(position).rentedCars.get(0).getBrand());
        jTextFieldModel.setText(SystemClass.customers.get(position).rentedCars.get(0).getModel());
        
        for (String price : SystemClass.customers.get(position).rentedCars.get(0).rentedPrice) {
            if(price.contains(SystemClass.customers.get(position).getName())){
                String[] array = price.split("/");
                jTextFieldPrice.setText(array[1]);
            }
        }
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        if(SystemClass.cancelReservation(jTextFieldID)){
            jTextFieldName.setText("");
            jTextFieldSurname.setText("");
            jTextFieldID.setText("");
            jTextFieldBrand.setText("");
            jTextFieldModel.setText("");
            jTextFieldPrice.setText("");
            
            JOptionPane.showMessageDialog(this, "Reservation was canceled successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); 

            RentingInformation RentingInformation = new RentingInformation();
            RentingInformation.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "The reservation could not be canceled.", "ERROR", JOptionPane.ERROR); 
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCars;
    private javax.swing.JButton jButtonCustomers;
    private javax.swing.JButton jButtonRentCar;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JLabel jLabelTL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelImportant2;
    private javax.swing.JTextField jTextFieldBrand;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}
