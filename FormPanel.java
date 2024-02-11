/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jalan
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    JPanel bottomPanel;
    private String imagePath;
    
    public FormPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();
        remarksLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextField = new javax.swing.JTextArea();
        genderLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        dropDown = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient Registration Details");

        nameLabel.setText("Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("Email:-");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        imageLabel.setText("Image:-");

        imageButton.setText("ImgUpload");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        remarksLabel.setText("Remarks:-");

        remarksTextField.setColumns(20);
        remarksTextField.setRows(5);
        jScrollPane1.setViewportView(remarksTextField);

        genderLabel.setText("Gender:-");

        patientLabel.setText("Patient Type");

        radioButtonGroup.add(option1);
        option1.setText("Male");
        option1.setActionCommand("MALE");

        radioButtonGroup.add(option3);
        option3.setText("Others");
        option3.setActionCommand("OTHERS");

        radioButtonGroup.add(option2);
        option2.setText("Female");
        option2.setActionCommand("FEMALE");

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acute", "Chronic", "" }));

        dateLabel.setText("Date :-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(lastNameLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(nameLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(option1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(genderLabel)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option3)
                                    .addComponent(option2))))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageLabel)
                                    .addComponent(dateLabel))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(remarksLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientLabel)
                                .addGap(33, 33, 33)
                                .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameLabel))
                                    .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(ageLabel)
                                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(remarksLabel))
                                                .addGap(18, 18, 18)
                                                .addComponent(emailLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(22, 22, 22)
                                        .addComponent(option1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(genderLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(option2)))
                                .addGap(18, 18, 18)
                                .addComponent(option3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(100, 100, 100))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(imageButton)
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(patientLabel)
                                    .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(nameLabel)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
         String name = nameTextField.getText();
         String lName = lastNameTextField.getText();
         String age = ageTextField.getText();
         String email = emailTextField.getText();
         ButtonModel selectedRadioButton = radioButtonGroup.getSelection();
         String selectedDropDownItem = dropDown.getSelectedItem().toString();
         String remarks = remarksTextField.getText();
         java.util.Date selectedDate = dateChooser.getDate();
          
        if (selectedDate == null) {
        JOptionPane.showMessageDialog(null, "Please choose a date", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
        }
         
          if (remarks.isEmpty()) {
        JOptionPane.showMessageDialog(null, "remarks cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (!remarks.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(null, "remarks must contain only alphabets", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (remarks.length() > 100) {
        JOptionPane.showMessageDialog(null, "remarks cannot exceed 100 characters", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    // Validation logic
    if (selectedDropDownItem.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select an item from the drop-down", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    // Validation logic
    if (selectedRadioButton == null) {
        JOptionPane.showMessageDialog(null, "Please select a gender", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    // Validation logic
    if (email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Email cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    // Regular expression pattern for a basic email validation
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    
    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(null, "Enter a valid email address", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
         
         if (age.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Age cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (!age.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Age must contain only digits", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (age.length() > 2) {
        JOptionPane.showMessageDialog(null, "Age cannot exceed 2 digits", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    // Validation logic
    if (name.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (!name.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(null, "Name must contain only alphabets", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (name.length() > 20) {
        JOptionPane.showMessageDialog(null, "Name cannot exceed 20 characters", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    
    if (lName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Last Name cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (!lName.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(null, "Last Name must contain only alphabets", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
    if (lName.length() > 20) {
        JOptionPane.showMessageDialog(null, "Last Name cannot exceed 20 characters", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Validation failed, return without further processing
    }
        ImageIcon icon = new ImageIcon(imagePath);
        Image image= icon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        
        User user = new User();
        user.setName(name);
        user.setLastName(lName);
        user.setAge(age);
        user.setEmail(email);
        user.setGender(selectedRadioButton.getActionCommand());
        user.setPatientType(selectedDropDownItem);
        user.setRemarks(remarks);
        user.setDate(selectedDate.toString());
        
        ViewPanel viewObj = new ViewPanel(user,bottomPanel,scaledIcon);
        bottomPanel.add(viewObj);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        
        if(result== JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
        }
    }//GEN-LAST:event_imageButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton imageButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JLabel patientLabel;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JLabel remarksLabel;
    private javax.swing.JTextArea remarksTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}