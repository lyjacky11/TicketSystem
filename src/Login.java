/*
 * Class: Login.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Login Page for the Ticketing System
 */

import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    String country, language;

    public Login(String region, String lang) {
        initComponents();
        country = region;
        language = lang;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.ButtonGroup();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        adminOption = new javax.swing.JRadioButton();
        userOption = new javax.swing.JRadioButton();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        login = new javax.swing.JButton();
        createAcc = new javax.swing.JButton();
        changeUser = new javax.swing.JButton();
        changePass = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SigmaPLΣX® Sign-In");
        getContentPane().setLayout(null);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(30, 270, 130, 130);

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Account");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(40, 40, 630, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Sign in to your SigmaPLΣX® Account");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(40, 90, 630, 60);

        accType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accType.setForeground(new java.awt.Color(255, 255, 255));
        accType.setText("Account Type:");
        getContentPane().add(accType);
        accType.setBounds(190, 230, 130, 30);

        adminOption.setBackground(new java.awt.Color(0, 0, 0));
        userType.add(adminOption);
        adminOption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminOption.setForeground(new java.awt.Color(255, 255, 255));
        adminOption.setText("Admin");
        getContentPane().add(adminOption);
        adminOption.setBounds(380, 230, 70, 30);

        userOption.setBackground(new java.awt.Color(0, 0, 0));
        userType.add(userOption);
        userOption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userOption.setForeground(new java.awt.Color(255, 255, 255));
        userOption.setSelected(true);
        userOption.setText("User");
        getContentPane().add(userOption);
        userOption.setBounds(490, 230, 60, 30);

        userLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Username:");
        getContentPane().add(userLabel);
        userLabel.setBounds(190, 290, 160, 30);

        passLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password:");
        getContentPane().add(passLabel);
        passLabel.setBounds(190, 340, 150, 30);

        userField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(userField);
        userField.setBounds(380, 290, 170, 30);

        passField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(passField);
        passField.setBounds(380, 340, 170, 30);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(210, 410, 130, 40);

        login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(410, 410, 120, 40);

        createAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createAcc.setText("Don't have an account yet? Click here to create a new account!");
        createAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccActionPerformed(evt);
            }
        });
        getContentPane().add(createAcc);
        createAcc.setBounds(120, 580, 500, 40);

        changeUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        changeUser.setText("Change Your Username");
        changeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUserActionPerformed(evt);
            }
        });
        getContentPane().add(changeUser);
        changeUser.setBounds(120, 510, 220, 30);

        changePass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        changePass.setText("Change Your Password");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        getContentPane().add(changePass);
        changePass.setBounds(380, 510, 240, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -140, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 729, 768);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if the user set the language to French
    private void setLanguage() {
        if (language.equals("French")) {
            title.setText("Compte SigmaPLΣX®");
            subTitle.setText("Connectez-vous à votre compte SigmaPLΣX®");
            accType.setText("Type de compte:");
            cancel.setText("Annuler");
            login.setText("S'identifier");
            changeUser.setText("Modifier votre nom d'utilisateur");
            changePass.setText("Changez votre mot de passe");
            createAcc.setText("Vous n'avez pas encore de compte? Cliquez ici pour créer un nouveau compte!");
        }
    }

    // Sets the fields to null (reset)
    public void clearFields() {
        userField.setText("");
        passField.setText("");
    }

    // Redirects user to new account page
    public void newAcc() {
        this.setVisible(false);
        new CreateAcc(language).setVisible(true);
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            Scanner reader = new Scanner(new File("userInfo.txt"));
            String user = userField.getText();
            String pass = passField.getText();
            String username, password, names;

            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds = new ArrayList<>();
            ArrayList<String> customers;
            customers = new ArrayList<>();

            // Checks if the file has anymore users left
            while (reader.hasNextLine()) {
                username = reader.next();
                users.add(username);
                password = reader.next();
                pwds.add(password);
                names = reader.nextLine();
                customers.add(names);
            }
            reader.close();

            // Checks if the username/password is correct
            if (user.equals("") && pass.equals("")) {
                JOptionPane.showMessageDialog(null, "No username/password has been entered!\nPlease check your credentials and try again!", "No Credentials Entered", JOptionPane.ERROR_MESSAGE);
            }
            else if (user.contains(" ") || pass.contains(" ")) {
                JOptionPane.showMessageDialog(null, "No spaces are allowed in the fields!\nPlease try again!", "Invalid Field(s)", JOptionPane.ERROR_MESSAGE);
                clearFields();
            }
            else if (userOption.isSelected() && !users.contains(user)) {
                JOptionPane.showMessageDialog(null, "The username you entered does not exist!\nPlease create an account!", "Username Not Exist", JOptionPane.WARNING_MESSAGE);
                newAcc();
            } else {
                // Signs in the user if it is correct
                if (adminOption.isSelected() && user.equalsIgnoreCase("Admin") && pass.equals("admin1234")) {
                    this.setVisible(false);
                    new AdminPortal(language).setVisible(true);
                } else if (userOption.isSelected() && users.contains(user) &&  pwds.contains(pass)) {
                    this.setVisible(false);
                    new MovieSelect(user, country, language).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "The password you entered is incorrect!\nClick OK to try again!", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
                    clearFields();
                }
            }
        } catch (IOException | ParseException e) {
        }
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        new TicketSystem().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void createAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccActionPerformed
        newAcc();
    }//GEN-LAST:event_createAccActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        try {
            String name, currentUser, currentPass, newPass, currentLine;
            int confirm;
            Scanner reader = new Scanner(new File("userInfo.txt"));
            PrintWriter write;

            String username, password, names;
            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds = new ArrayList<>();
            ArrayList<String> customers;
            customers = new ArrayList<>();

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

            // Prompts user for their information
            name = JOptionPane.showInputDialog(null, "Please enter the name on the account: ", "Name", JOptionPane.QUESTION_MESSAGE);
            if (name.equals("")) {
                JOptionPane.showInputDialog(null, "No name has been entered! Please try again!", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            } else {
                currentUser = JOptionPane.showInputDialog(null, "Please enter your current username: ", "Enter Username", JOptionPane.QUESTION_MESSAGE);
                if (!users.contains(currentUser)) {
                    JOptionPane.showMessageDialog(null, "The username you entered does not exist!\nPlease double-check your spelling and try again!", "Invalid Username", JOptionPane.ERROR_MESSAGE);
                } else {
                    currentPass = JOptionPane.showInputDialog(null, "Please enter your current password: ", "Enter Password", JOptionPane.QUESTION_MESSAGE);
                    if (!pwds.contains(currentPass)) {
                        JOptionPane.showMessageDialog(null, "The password you entered is incorrect! \nClick OK to retry!", "Invalid Password", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Prompt user for new password
                        newPass = JOptionPane.showInputDialog(null, "Please enter a new password: ", "Change Password", JOptionPane.QUESTION_MESSAGE);
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to change your password?", "Password Change Request", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            BufferedReader read = new BufferedReader(new FileReader("userInfo.txt"));
                            write = new PrintWriter(new FileWriter("userInfo.txt", true));
                            pwds.set(pwds.indexOf(currentPass), newPass);
                            // Finds the line of their username/password and overwrite it
                            while ((currentLine = read.readLine()) != null) {
                                if (currentLine.contains(currentUser)) {
                                    write.println(currentUser + " " + newPass + "\t" + name);
                                }
                                read.close();
                                write.close();
                                JOptionPane.showMessageDialog(null, "Your password has been changed successfully!", "Password Change Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Your password has not been changed!", "Password Change Aborted", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_changePassActionPerformed

    private void changeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUserActionPerformed
        try {
            String name, currentUser, currentPass, newUser, currentLine;
            int confirm;

            Scanner reader = new Scanner(new File("userInfo.txt"));
            PrintWriter write;

            String username, password, names;
            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds = new ArrayList<>();
            ArrayList<String> customers;
            customers = new ArrayList<>();

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

            // Prompts user for their information
            name = JOptionPane.showInputDialog(null, "Please enter the name on the account: ", "Name", JOptionPane.QUESTION_MESSAGE);
            if (name.equals("")) {
                JOptionPane.showInputDialog(null, "No name has been entered! Please try again!", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            } else {
                currentUser = JOptionPane.showInputDialog(null, "Please enter your current username: ", "Enter Username", JOptionPane.QUESTION_MESSAGE);
                if (!users.contains(currentUser)) {
                    JOptionPane.showMessageDialog(null, "The username you entered does not exist! \nPlease double-check your spelling and try again!", "Invalid Username", JOptionPane.ERROR_MESSAGE);
                } else {
                    currentPass = JOptionPane.showInputDialog(null, "Please enter your current password: ", "Enter Password", JOptionPane.QUESTION_MESSAGE);
                    if (!pwds.contains(currentPass)) {
                        JOptionPane.showMessageDialog(null, "The password you entered is incorrect!\nClick OK to retry!", "Invalid Password", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Prompts user for new username
                        newUser = JOptionPane.showInputDialog(null, "Please enter a new username: ", "Change Username", JOptionPane.QUESTION_MESSAGE);
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to change your username?", "Username Change Request", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            BufferedReader read = new BufferedReader(new FileReader("userInfo.txt"));
                            write = new PrintWriter(new FileWriter("userInfo.txt", true));
                            users.set(users.indexOf(currentUser), newUser);
                            // Finds the line of their username/password and overwrite it
                            while ((currentLine = read.readLine()) != null) {
                                if (currentLine.contains(currentUser)) {
                                    write.println(newUser + " " + currentPass + "\t" + name);
                                }
                                read.close();
                                write.close();
                                JOptionPane.showMessageDialog(null, "Your username has been changed successfully!", "Username Change Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Your username has not been changed!", "Username Change Aborted", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_changeUserActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login("Canada", "English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accType;
    private javax.swing.JRadioButton adminOption;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton changePass;
    private javax.swing.JButton changeUser;
    private javax.swing.JButton createAcc;
    private javax.swing.JLabel icon;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JRadioButton userOption;
    private javax.swing.ButtonGroup userType;
    // End of variables declaration//GEN-END:variables
}
