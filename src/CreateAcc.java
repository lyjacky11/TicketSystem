/*
 * Class: CreateAcc.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: New Account Page for the Ticketing System
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class CreateAcc extends javax.swing.JFrame {

    String language;

    public CreateAcc(String lang) {
        initComponents();
        language = lang;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        confirmLabel = new javax.swing.JLabel();
        passConfirm = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        account = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SigmaPLΣX® Sign-Up");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Account");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(50, 30, 630, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Create a SigmaPLΣX® account today!");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(60, 80, 630, 60);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(150, 160, 160, 30);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(320, 160, 210, 30);

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Username:");
        getContentPane().add(userLabel);
        userLabel.setBounds(150, 210, 150, 30);

        userField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(userField);
        userField.setBounds(320, 210, 210, 30);

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password:");
        getContentPane().add(passLabel);
        passLabel.setBounds(150, 260, 160, 30);

        passField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(passField);
        passField.setBounds(320, 260, 210, 30);

        confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmLabel.setText("Confirm Password:");
        getContentPane().add(confirmLabel);
        confirmLabel.setBounds(150, 310, 160, 30);

        passConfirm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(passConfirm);
        passConfirm.setBounds(320, 310, 210, 30);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(120, 390, 130, 50);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(330, 400, 80, 30);

        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(480, 390, 130, 50);

        account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Account.png"))); // NOI18N
        getContentPane().add(account);
        account.setBounds(260, 500, 190, 190);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 728, 764);
    }// </editor-fold>//GEN-END:initComponents
    
    // Checks if the user set the language to French
    private void setLanguage() {
        if (language.equals("French")) {
            title.setText("Compte SigmaPLΣX®");
            subTitle.setText("Créez un compte SigmaPLΣX® dès aujourd'hui!");
            nameLabel.setText("Nom:");
            cancel.setText("Annuler");
            clear.setText("Effacer");
            submit.setText("Soumettre");
        }
    }
    
    // Sets user field to null (reset)
    public void clearUser() {
        nameField.setText("");
        userField.setText("");
    }
    
    // Sets password field to null (reset)
    public void clearPwd() {
        passField.setText("");
        passConfirm.setText("");
    }
    
    // Redirect user to the signIn screen
    public void signIn() {
        this.setVisible(false);
        new TicketSystem().setVisible(true);
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearUser();
        clearPwd();
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        signIn();
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            Scanner reader = new Scanner(new File("userInfo.txt"));
            PrintWriter output;

            String name = nameField.getText();
            String user = userField.getText();
            String pass = passField.getText();
            String confirm = passConfirm.getText();
            String username, password, names;

            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds = new ArrayList<>();
            ArrayList<String> customers = new ArrayList<>();
            
            // Checks if file has anymore users left
            while (reader.hasNextLine()) {
                username = reader.next();
                users.add(username);
                password = reader.next();
                pwds.add(password);
                names = reader.nextLine();
                customers.add(names);
            }
            reader.close();
            
            // Checks if field is blank and other conditions
            if (name.equals("") || user.equals("") || pass.equals("") || confirm.equals("")) {
                JOptionPane.showMessageDialog(null, "One or more fields have not been completed!\nClick OK to try again!", "Incomplete Field(s)", JOptionPane.ERROR_MESSAGE);
                clearPwd();
            }
            else if (name.contains(" ") || user.contains(" ") || pass.contains(" ") || confirm.contains(" ")) {
                JOptionPane.showMessageDialog(null, "No spaces are allowed in the fields!\nPlease try again!", "Invalid Field(s)", JOptionPane.ERROR_MESSAGE);
                clearUser();
                clearPwd();
            }
            else if (!pass.equals(confirm)) {
                JOptionPane.showMessageDialog(null, "The passwords you entered do not match!\nPlease double-check your spelling and try again!", "Invalid Password", JOptionPane.ERROR_MESSAGE);
                clearPwd();
            } else {
                if ((users.contains(user)) && !pwds.contains(pass)) {
                    JOptionPane.showMessageDialog(null, "Sorry, this username already exists!\nPlease choose a different name!", "Username Exists", JOptionPane.WARNING_MESSAGE);
                    clearActionPerformed(evt);
                } else if ((customers.contains(name) || users.contains(user)) && pwds.contains(pass)) {
                    JOptionPane.showMessageDialog(null, "An account has been already created with these credentials!\nPlease login with the existing account!", "Account Already Exists", JOptionPane.WARNING_MESSAGE);
                    signIn();
                } else {
                    // Sign the user in if credentials is correct
                    output = new PrintWriter(new FileWriter("userInfo.txt", true));
                    output.println(user + " " + pass + "\t" + name);
                    output.close();
                    JOptionPane.showMessageDialog(null, "Your account has been successfully created!", "Account Creation Success", JOptionPane.INFORMATION_MESSAGE);
                    signIn();
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_submitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateAcc("English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passConfirm;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel subTitle;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
