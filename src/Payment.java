/*
 * Class: Payment.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Payment Page for the Ticketing System
 */

import java.io.*;
import javax.swing.*;

public class Payment extends javax.swing.JFrame {

    String seats, currency, language;
    Object movie, day, time, location;
    double amount;

    public Payment(Object movies, Object date, Object showtimes, Object venue, String seat, String curren, double total, String lang) {
        initComponents();
        movie = movies;
        day = date;
        time = showtimes;
        location = venue;
        seats = seat;
        currency = curren;
        amount = total;
        language = lang;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        amountDue = new javax.swing.JLabel();
        hstLabel = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cardLabel = new javax.swing.JLabel();
        cardField = new javax.swing.JTextField();
        expiryLabel = new javax.swing.JLabel();
        expiryMM = new javax.swing.JComboBox<>();
        expiryYY = new javax.swing.JComboBox<>();
        cvvlabel = new javax.swing.JLabel();
        cvvField = new javax.swing.JPasswordField();
        clear = new javax.swing.JButton();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeSelect = new javax.swing.JComboBox<>();
        payMethods = new javax.swing.JLabel();
        sslSecure = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        payNow = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Information");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Payments");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(60, 10, 630, 70);

        amountDue.setBackground(new java.awt.Color(0, 0, 0));
        amountDue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amountDue.setForeground(new java.awt.Color(255, 255, 255));
        amountDue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountDue.setText("Amount Due: $");
        getContentPane().add(amountDue);
        amountDue.setBounds(190, 80, 380, 60);

        hstLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hstLabel.setForeground(new java.awt.Color(255, 255, 255));
        hstLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hstLabel.setText("Please Note: Ontario HST tax (13%) will be charged.");
        getContentPane().add(hstLabel);
        hstLabel.setBounds(200, 120, 350, 40);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Please enter your payment information:");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(50, 150, 630, 60);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(160, 210, 160, 30);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(330, 210, 240, 30);

        cardLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardLabel.setText("Card Number:");
        getContentPane().add(cardLabel);
        cardLabel.setBounds(160, 260, 150, 30);

        cardField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cardField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardFieldKeyTyped(evt);
            }
        });
        getContentPane().add(cardField);
        cardField.setBounds(330, 260, 240, 30);

        expiryLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expiryLabel.setForeground(new java.awt.Color(255, 255, 255));
        expiryLabel.setText("Expiry Date:");
        getContentPane().add(expiryLabel);
        expiryLabel.setBounds(160, 310, 160, 30);

        expiryMM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        expiryMM.setMaximumRowCount(5);
        expiryMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(expiryMM);
        expiryMM.setBounds(330, 310, 50, 30);

        expiryYY.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        expiryYY.setMaximumRowCount(5);
        expiryYY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        getContentPane().add(expiryYY);
        expiryYY.setBounds(410, 310, 70, 30);

        cvvlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvvlabel.setForeground(new java.awt.Color(255, 255, 255));
        cvvlabel.setText("CVV:");
        getContentPane().add(cvvlabel);
        cvvlabel.setBounds(160, 360, 160, 30);

        cvvField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvvFieldKeyTyped(evt);
            }
        });
        getContentPane().add(cvvField);
        cvvField.setBounds(330, 360, 80, 30);

        clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(470, 360, 100, 30);

        cardTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardTypeLabel.setText("Card Type:");
        getContentPane().add(cardTypeLabel);
        cardTypeLabel.setBounds(160, 420, 150, 30);

        cardTypeSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardTypeSelect.setMaximumRowCount(5);
        cardTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MasterCard", "Discover", "VISA Debit", "Prepaid VISA/MasterCard" }));
        getContentPane().add(cardTypeSelect);
        cardTypeSelect.setBounds(330, 420, 160, 30);

        payMethods.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Payment.png"))); // NOI18N
        getContentPane().add(payMethods);
        payMethods.setBounds(220, 460, 280, 90);

        sslSecure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sslSecure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SSL.png"))); // NOI18N
        getContentPane().add(sslSecure);
        sslSecure.setBounds(0, 531, 200, 199);

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Go Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(220, 570, 140, 50);

        payNow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        payNow.setText("Pay Now");
        payNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowActionPerformed(evt);
            }
        });
        getContentPane().add(payNow);
        payNow.setBounds(420, 570, 140, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 734, 770);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if user set the language to French
    private void setLanguage() {
        if (language.equals("English")) {
            amountDue.setText(String.format("Amount Due: $%.2f %s", amount, currency));
        } else if (language.equals("French")) {
            title.setText("Paiements SigmaPLΣX®");
            amountDue.setText(String.format("Montant dû: $%.2f %s", amount, currency));
            hstLabel.setText("La TVH de l'Ontario (13%) sera facturée.");
            subTitle.setText("Veuillez saisir vos informations de paiement:");
            nameLabel.setText("Nom:");
            cardLabel.setText("Numéro de carte");
            expiryLabel.setText("Date d'expiration");
            clear.setText("Effacer");
            cardTypeLabel.setText("Type de carte:");
            back.setText("Retourner");
            payNow.setText("Payer");
        }
    }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new SeatSelect(movie, day, time, location, currency, language).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void payNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payNowActionPerformed
        String name = nameField.getText();
        String card = cardField.getText();
        String cvv = cvvField.getText();
        int confirm;
        
        // Checks if fields are empty
        if (name.equals("") || card.equals("") || cvv.equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields have not been completed!\nClick OK to try again!", "Incomplete Field(s)", JOptionPane.ERROR_MESSAGE);
            clearActionPerformed(evt);
        } else if ((card.length() == 16) && (cvv.length() == 3)) {
            confirm = JOptionPane.showConfirmDialog(null, "Please confirm your payment of the amount due listed above.\nClick OK to pay now, otherwise click Cancel.", "Confirm Payment", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    JOptionPane.showMessageDialog(null, "Please wait a moment...\nYour payment is being processed...", "Processing Payment...", JOptionPane.INFORMATION_MESSAGE);
                    Thread.sleep(1500);
                    this.setVisible(false);
                    new Receipt(movie, day, time, location, seats, currency, amount, language).setVisible(true);
                    JOptionPane.showMessageDialog(null, "Your payment has been completed!\nWe hope you enjoy your movie!", "Thanks for choosing SigmaPLΣX®", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | InterruptedException e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your card number/CVV is not 16-digits long or 3-digits long!\nPlease try again!", "Incomplete Card/CVV Field(s)", JOptionPane.ERROR_MESSAGE);
            clearActionPerformed(evt);
        }
    }//GEN-LAST:event_payNowActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        nameField.setText("");
        cardField.setText("");
        expiryMM.setSelectedIndex(0);
        expiryYY.setSelectedIndex(0);
        cvvField.setText("");
        cardTypeSelect.setSelectedIndex(0);
    }//GEN-LAST:event_clearActionPerformed

    private void cardFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardFieldKeyTyped
        if (cardField.getText().length() >= 16) {
            evt.consume();
        }
    }//GEN-LAST:event_cardFieldKeyTyped

    private void cvvFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvFieldKeyTyped
        if (cvvField.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_cvvFieldKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Payment(null, null, null, null, "", "CAD", 0.0, "English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountDue;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JTextField cardField;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JComboBox<String> cardTypeSelect;
    private javax.swing.JButton clear;
    private javax.swing.JPasswordField cvvField;
    private javax.swing.JLabel cvvlabel;
    private javax.swing.JLabel expiryLabel;
    private javax.swing.JComboBox<String> expiryMM;
    private javax.swing.JComboBox<String> expiryYY;
    private javax.swing.JLabel hstLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel payMethods;
    private javax.swing.JButton payNow;
    private javax.swing.JLabel sslSecure;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
