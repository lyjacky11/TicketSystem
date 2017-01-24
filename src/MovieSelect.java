/*
 * Class: MovieSelect.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Movie Selection for the Ticketing System
 */

import java.util.*;
import java.text.*;
import javax.swing.*;

public class MovieSelect extends javax.swing.JFrame {

    String name, region, currency, language;
    int logOut;
    double price;

    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM DD, YYYY");
    SimpleDateFormat timeDate = new SimpleDateFormat("MMM-DD-YYYY HH:mm:ss");

    Calendar cal = Calendar.getInstance();
    Date date = new Date();
    String today = new Date().toString();
//    String[] dates = new String[5];

    public MovieSelect(String user, String country, String lang) throws ParseException {
        initComponents();
        name = user;
        language = lang;
        region = country;
        setLanguage();
//        dates[0] = dateFormat.format(date);
//        dates[1] = changeDate(1);
//        dates[2] = changeDate(2);
//        dates[3] = changeDate(3);
//        dates[4] = changeDate(4);
        switch (region) {
            case "Canada":
                price = 11.99;
                currency = "CAD";
                break;
            case "United States":
                price = 9.25;
                currency = "USD";
                break;
            case "Mexico":
                price = 196.37;
                currency = "MXN";
                break;
            default:
                break;
        }
        if (language.equals("English")) {
            priceLabel.setText("Prices starting from: $" + price + " " + currency);
        } else if (language.equals("French")) {
            priceLabel.setText("Prix à partir de: " + price + " $ " + currency);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        assassinCreed = new javax.swing.JLabel();
        furious7 = new javax.swing.JLabel();
        passengers = new javax.swing.JLabel();
        rogueOne = new javax.swing.JLabel();
        movieLabel = new javax.swing.JLabel();
        movieSelect = new javax.swing.JComboBox<>();
        dayLabel = new javax.swing.JLabel();
        daySelect = new javax.swing.JComboBox<>();
        timeLabel = new javax.swing.JLabel();
        timeSelect = new javax.swing.JComboBox<>();
        locationLabel = new javax.swing.JLabel();
        locationSelect = new javax.swing.JComboBox<>();
        proceed = new javax.swing.JButton();
        regionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SigmaPLΣX® - " + dateFormat.format(date));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Tickets");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(30, 20, 670, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Welcome! Please order your SigmaPLΣX® tickets below:");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(60, 80, 630, 60);

        dateTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateTime.setForeground(new java.awt.Color(255, 255, 255));
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("Order Date: " + timeDate.format(date));
        dateTime.setToolTipText("");
        getContentPane().add(dateTime);
        dateTime.setBounds(0, 120, 720, 60);

        assassinCreed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Assassin's Creed.jpg"))); // NOI18N
        assassinCreed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assassinCreedMouseClicked(evt);
            }
        });
        getContentPane().add(assassinCreed);
        assassinCreed.setBounds(20, 180, 150, 220);

        furious7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Furious 7.jpg"))); // NOI18N
        furious7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                furious7MouseClicked(evt);
            }
        });
        getContentPane().add(furious7);
        furious7.setBounds(200, 180, 140, 220);

        passengers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Passengers.jpg"))); // NOI18N
        passengers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengersMouseClicked(evt);
            }
        });
        getContentPane().add(passengers);
        passengers.setBounds(360, 180, 150, 220);

        rogueOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rogue One.jpg"))); // NOI18N
        rogueOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rogueOneMouseClicked(evt);
            }
        });
        getContentPane().add(rogueOne);
        rogueOne.setBounds(540, 170, 150, 240);

        movieLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        movieLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieLabel.setText("Movie");
        getContentPane().add(movieLabel);
        movieLabel.setBounds(50, 470, 130, 30);

        movieSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        movieSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assassin's Creed", "Fast & Furious 7", "Passengers (2016)", "Rogue One: A Star Wars Story" }));
        movieSelect.setToolTipText("");
        getContentPane().add(movieSelect);
        movieSelect.setBounds(50, 500, 240, 30);

        dayLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dayLabel.setText("Day Selection");
        getContentPane().add(dayLabel);
        dayLabel.setBounds(340, 470, 130, 30);

        daySelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        daySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sat, Jan 21, 2017", "Sun, Jan 22, 2017", "Mon, Jan 23, 2017", "Tue, Jan 24, 2017", "Wed, Jan 25, 2017" }));
        daySelect.setToolTipText("");
        getContentPane().add(daySelect);
        daySelect.setBounds(340, 500, 160, 30);

        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("Showtimes");
        getContentPane().add(timeLabel);
        timeLabel.setBounds(550, 470, 120, 30);

        timeSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:30 PM", "3:30 PM", "4:10 PM", "6:45 PM", "7:20 PM", "10:30 PM" }));
        timeSelect.setToolTipText("");
        getContentPane().add(timeSelect);
        timeSelect.setBounds(550, 500, 120, 30);

        locationLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(255, 255, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationLabel.setText("Location");
        getContentPane().add(locationLabel);
        locationLabel.setBounds(290, 540, 130, 30);

        locationSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        locationSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinemas Yorkdale", "Toronto Theatre", "VIP Yonge-Eglintion", "Odeon Town Centre" }));
        locationSelect.setToolTipText("");
        getContentPane().add(locationSelect);
        locationSelect.setBounds(260, 580, 210, 30);

        proceed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed);
        proceed.setBounds(390, 640, 120, 40);

        regionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regionLabel.setForeground(new java.awt.Color(255, 255, 255));
        regionLabel.setText("Region: ");
        getContentPane().add(regionLabel);
        regionLabel.setBounds(20, 410, 210, 50);

        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Tickets starting from:");
        getContentPane().add(priceLabel);
        priceLabel.setBounds(20, 540, 250, 40);

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noteLabel.setText("NOTICE: The total amount ($) will vary depending on the region selected!");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(230, 410, 460, 50);

        signOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signOut.setText("Log Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        getContentPane().add(signOut);
        signOut.setBounds(200, 640, 130, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 736, 761);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if user set the language to French
    private void setLanguage() {
        regionLabel.setText("Region: " + region);
        if (language.equals("English")) {
            subTitle.setText("Welcome " + name + "! Please order your SigmaPLΣX® tickets below:");
        } else if (language.equals("French")) {
            title.setText("Billets SigmaPLΣX®");
            subTitle.setText("Bienvenue " + name + "! Commander vos billets SigmaPLΣX® ci-dessous:");
            noteLabel.setText("AVIS: Le montant total ($) variera en fonction de la région sélectionnée!");
            signOut.setText("Se déconnecter");
            proceed.setText("Procéder");
        }
    }
    
    // Converts date and increase the date based on parameter
    private String changeDate(int days) throws ParseException {
        Date newDate = dateFormat.parse(today);
        cal.setTime(newDate);
        cal.add(Calendar.DATE, days);
        newDate = cal.getTime();
        return dateFormat.format(newDate);
    }
    
    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        Object movie = movieSelect.getSelectedItem();
        Object day = daySelect.getSelectedItem();
        Object time = timeSelect.getSelectedItem();
        Object location = locationSelect.getSelectedItem();

        this.setVisible(false);
        new SeatSelect(movie, day, time, location, region, language).setVisible(true);
    }//GEN-LAST:event_proceedActionPerformed

    private void assassinCreedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assassinCreedMouseClicked
        movieSelect.setSelectedIndex(0);
    }//GEN-LAST:event_assassinCreedMouseClicked

    private void furious7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_furious7MouseClicked
        movieSelect.setSelectedIndex(1);
    }//GEN-LAST:event_furious7MouseClicked

    private void passengersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengersMouseClicked
        movieSelect.setSelectedIndex(2);
    }//GEN-LAST:event_passengersMouseClicked

    private void rogueOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rogueOneMouseClicked
        movieSelect.setSelectedIndex(3);
    }//GEN-LAST:event_rogueOneMouseClicked

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        logOut = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Signing out...", JOptionPane.OK_CANCEL_OPTION);
        if (logOut == JOptionPane.OK_OPTION) {
            JOptionPane.showConfirmDialog(null, "You have been logged out successfully!\nThank you for using SigmaPLΣX®!", "Account Signed Out", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            new TicketSystem().setVisible(true);
        }
    }//GEN-LAST:event_signOutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MovieSelect("", "Canada", "English").setVisible(true);
                } catch (ParseException e) {}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assassinCreed;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JComboBox<String> daySelect;
    private javax.swing.JLabel furious7;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JComboBox<String> locationSelect;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JComboBox<String> movieSelect;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel passengers;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JLabel rogueOne;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JComboBox<String> timeSelect;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
