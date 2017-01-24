/*
 * Class: AdminPortal.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Administration for the Ticketing System
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class AdminPortal extends javax.swing.JFrame {

    String language;

    public AdminPortal(String lang) {
        initComponents();
        language = lang;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        resetPass = new javax.swing.JButton();
        changeName = new javax.swing.JButton();
        viewTickets = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        admin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SigmaPLΣX® ADMIN");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Admin Portal");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(60, 20, 630, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Admin Options");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(50, 70, 630, 60);

        resetPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetPass.setText("Change or Reset Customer Passwords");
        resetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassActionPerformed(evt);
            }
        });
        getContentPane().add(resetPass);
        resetPass.setBounds(180, 180, 380, 50);

        changeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeName.setText("Modify Customer Information");
        changeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameActionPerformed(evt);
            }
        });
        getContentPane().add(changeName);
        changeName.setBounds(90, 310, 250, 50);

        viewTickets.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewTickets.setText("View Purchased Tickets");
        viewTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketsActionPerformed(evt);
            }
        });
        getContentPane().add(viewTickets);
        viewTickets.setBounds(410, 310, 240, 50);

        signOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signOut.setText("Log Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        getContentPane().add(signOut);
        signOut.setBounds(130, 500, 160, 60);

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin.png"))); // NOI18N
        getContentPane().add(admin);
        admin.setBounds(410, 420, 240, 250);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 743, 759);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if user set the language to French
    private void setLanguage() {
        if (language.equals("French")) {
            title.setText("SigmaPLΣX® Portail Admin");
            subTitle.setText("Options d'administration");
            resetPass.setText("Modifier les mots de passe");
            changeName.setText("Modifier l'information client");
            viewTickets.setText("Voir les billets achetés");
            signOut.setText("Se déconnecter");
        }
    }

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        int logOut;
        logOut = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Signing out...", JOptionPane.OK_CANCEL_OPTION);
        if (logOut == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            new TicketSystem().setVisible(true);
        }
    }//GEN-LAST:event_signOutActionPerformed

    private void resetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassActionPerformed
        try {
            String name, currentUser, newPass, currentLine;
            int confirm;
            Scanner reader = new Scanner(new File("userInfo.txt"));
            PrintWriter write;

            String username, password, names;
            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds;
            pwds = new ArrayList<>();
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
                currentUser = JOptionPane.showInputDialog(null, "Please enter the current username: ", "Enter Username", JOptionPane.QUESTION_MESSAGE);
                if (!users.contains(currentUser)) {
                    JOptionPane.showMessageDialog(null, "The username entered does not exist!\nPlease try again!", "Invalid Username", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Prompts user for new password
                    newPass = JOptionPane.showInputDialog(null, "Please enter a new password: ", "Reset Password", JOptionPane.QUESTION_MESSAGE);
                    confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset your password?", "Password Reset Request", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        BufferedReader read = new BufferedReader(new FileReader("userInfo.txt"));
                        write = new PrintWriter(new FileWriter("userInfo.txt", true));
                        // Finds the line of their username/password and overwrite it
                        while ((currentLine = read.readLine()) != null) {
                            if (currentLine.contains(currentUser)) {
                                write.println(currentUser + " " + newPass + "\t" + name);
                            }
                            read.close();
                            write.close();
                            JOptionPane.showMessageDialog(null, "The password has been reset successfully!", "Password Reset Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Your password has not been reset!", "Password Reset Aborted", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_resetPassActionPerformed

    private void changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameActionPerformed
        try {
            String name, currentUser, currentPass, newName, currentLine;
            int confirm;
            Scanner reader = new Scanner(new File("userInfo.txt"));
            PrintWriter write;

            String username, password, names;
            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> pwds = new ArrayList<>();
            ArrayList<String> customers = new ArrayList<>();

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
                currentUser = JOptionPane.showInputDialog(null, "Please enter the current username: ", "Enter Username", JOptionPane.QUESTION_MESSAGE);
                if (!users.contains(currentUser)) {
                    JOptionPane.showMessageDialog(null, "The username entered does not exist!\nPlease double-check your spelling and try again!", "Invalid Username", JOptionPane.ERROR_MESSAGE);
                } else {
                    currentPass = JOptionPane.showInputDialog(null, "Please enter the current password: ", "Enter Password", JOptionPane.QUESTION_MESSAGE);
                    if (!pwds.contains(currentPass)) {
                        JOptionPane.showMessageDialog(null, "The password entered is incorrect! \nClick OK to retry!", "Invalid Password", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Prompts user for new name
                        newName = JOptionPane.showInputDialog(null, "Please enter a new name: ", "Change Name", JOptionPane.QUESTION_MESSAGE);
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to change your name on the account?", "Name Change Request", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            BufferedReader read = new BufferedReader(new FileReader("userInfo.txt"));
                            write = new PrintWriter(new FileWriter("userInfo.txt", true));
                            customers.set(customers.indexOf(name), newName);
                            // Finds the line of their username/password and overwrite it
                            while ((currentLine = read.readLine()) != null) {
                                if (currentLine.contains(currentUser))
                                    write.println(currentUser + " " + currentPass + "\t" + newName);
                                read.close();
                                write.close();
                                JOptionPane.showMessageDialog(null, "Your name has been changed successfully!", "Name Change Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Your name has not been changed!", "Name Change Aborted", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_changeNameActionPerformed

    private void viewTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTicketsActionPerformed
        try {
            Scanner reader = new Scanner(new File("ticketInfo.txt"));
            int creedCount = reader.nextInt();
            int furiousCount = reader.nextInt();
            int passengersCount = reader.nextInt();
            int rogueCount = reader.nextInt();
            reader.close();
            
            // Prompts user for which movie details they would like to view
            Object[] possibleMovies = {"Assassin's Creed", "Fast & Furious 7", "Passengers (2016)", "Rogue One: A Star Wars Story"};
            Object selectedMovie = JOptionPane.showInputDialog(null, "Choose the movie you would like to view details:", "Ticket Details", JOptionPane.INFORMATION_MESSAGE, null, possibleMovies, possibleMovies[0]);
            if (selectedMovie.equals(possibleMovies[0])) {
                JOptionPane.showMessageDialog(null, "Number of tickets purchased for\n" + possibleMovies[0] + ": " + creedCount, "Tickets Purchased " + "(" + possibleMovies[0] + ")", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedMovie.equals(possibleMovies[1])) {
                JOptionPane.showMessageDialog(null, "Number of tickets purchased for\n" + possibleMovies[1] + ": " + furiousCount, "Tickets Purchased " + "(" + possibleMovies[1] + ")", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedMovie.equals(possibleMovies[2])) {
                JOptionPane.showMessageDialog(null, "Number of tickets purchased for\n" + possibleMovies[2] + ": " + passengersCount, "Tickets Purchased " + "(" + possibleMovies[2] + ")", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedMovie.equals(possibleMovies[3])) {
                JOptionPane.showMessageDialog(null, "Number of tickets purchased for\n" + possibleMovies[3] + ": " + rogueCount, "Tickets Purchased " + "(" + possibleMovies[3] + ")", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
        }
    }//GEN-LAST:event_viewTicketsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPortal("English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton changeName;
    private javax.swing.JButton resetPass;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewTickets;
    // End of variables declaration//GEN-END:variables
}
