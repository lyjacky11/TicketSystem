/*
 * Class: SeatSelect.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Seat Selection for the Ticketing System
 */

import java.text.*;
import javax.swing.*;

public class SeatSelect extends javax.swing.JFrame {

    Object movie, day, time, location;
    String region, currency, language;
    double priceA, priceB, priceC, priceD, total;

    public SeatSelect(Object movies, Object date, Object showtimes, Object venue, String country, String lang) {
        initComponents();
        movie = movies;
        day = date;
        time = showtimes;
        location = venue;
        region = country;
        language = lang;
        setLanguage();
        switch (region) {
            case "Canada":
                priceA = 20.00;
                priceB = 16.25;
                priceC = 13.75;
                priceD = 11.99;
                currency = "CAD";
                break;
            case "United States":
                priceA = 15.25;
                priceB = 12.39;
                priceC = 10.49;
                priceD = 9.25;
                currency = "USD";
                break;
            case "Mexico":
                priceA = 327.55;
                priceB = 266.14;
                priceC = 225.20;
                priceD = 196.37;
                currency = "MXN";
                break;
            default:
                break;
        }
        pricesA.setText(String.format("A Seats: $%.2f%s%s", priceA, " ", currency));
        pricesB.setText("B Seats: $" + priceB + " " + currency);
        pricesC.setText("C Seats: $" + priceC + " " + currency);
        pricesD.setText("D Seats: $" + priceD + " " + currency);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        next = new javax.swing.JButton();
        screenLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        seatLabel = new javax.swing.JLabel();
        seatSelect = new javax.swing.JTextField();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        pricesA = new javax.swing.JLabel();
        pricesB = new javax.swing.JLabel();
        pricesC = new javax.swing.JLabel();
        pricesD = new javax.swing.JLabel();
        regionLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        seats = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reverse SigmaPLΣX® Seats");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Seat Selection");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(50, 20, 630, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Please select your seats below:");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(50, 70, 630, 60);

        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(440, 480, 140, 30);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(250, 550, 120, 40);

        next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(420, 550, 120, 40);

        screenLabel.setBackground(new java.awt.Color(0, 0, 0));
        screenLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        screenLabel.setForeground(new java.awt.Color(255, 255, 255));
        screenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenLabel.setText("SCREEN");
        getContentPane().add(screenLabel);
        screenLabel.setBounds(124, 134, 500, 30);

        aLabel.setBackground(new java.awt.Color(0, 0, 0));
        aLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aLabel.setForeground(new java.awt.Color(255, 255, 255));
        aLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aLabel.setText("A");
        getContentPane().add(aLabel);
        aLabel.setBounds(110, 200, 40, 40);

        bLabel.setBackground(new java.awt.Color(0, 0, 0));
        bLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bLabel.setForeground(new java.awt.Color(255, 255, 255));
        bLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bLabel.setText("B");
        getContentPane().add(bLabel);
        bLabel.setBounds(110, 260, 40, 40);

        cLabel.setBackground(new java.awt.Color(0, 0, 0));
        cLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cLabel.setForeground(new java.awt.Color(255, 255, 255));
        cLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cLabel.setText("C");
        getContentPane().add(cLabel);
        cLabel.setBounds(110, 320, 40, 40);

        dLabel.setBackground(new java.awt.Color(0, 0, 0));
        dLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dLabel.setForeground(new java.awt.Color(255, 255, 255));
        dLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dLabel.setText("D");
        getContentPane().add(dLabel);
        dLabel.setBounds(110, 380, 40, 40);

        seatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seatLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        seatLabel.setText("Seat Selected:");
        getContentPane().add(seatLabel);
        seatLabel.setBounds(30, 480, 190, 30);

        seatSelect.setEditable(false);
        seatSelect.setBackground(new java.awt.Color(0, 102, 204));
        seatSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seatSelect.setForeground(new java.awt.Color(255, 255, 255));
        seatSelect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seatSelect.setBorder(null);
        getContentPane().add(seatSelect);
        seatSelect.setBounds(250, 480, 160, 30);

        a1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a1.setText("A1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1);
        a1.setBounds(200, 200, 50, 30);

        a2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a2.setText("A2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2);
        a2.setBounds(320, 200, 50, 30);

        a3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a3.setText("A3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3);
        a3.setBounds(450, 200, 50, 30);

        a4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a4.setText("A4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4);
        a4.setBounds(570, 200, 50, 30);

        b1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b1.setText("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(200, 260, 50, 30);

        b2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b2.setText("B2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(320, 260, 50, 30);

        b3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b3.setText("B3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(450, 260, 50, 30);

        b4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b4.setText("B4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(570, 260, 50, 30);

        c1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c1.setText("C1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1);
        c1.setBounds(200, 320, 50, 30);

        c2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c2.setText("C2");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2);
        c2.setBounds(320, 320, 50, 30);

        c3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c3.setText("C3");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3);
        c3.setBounds(450, 320, 50, 30);

        c4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c4.setText("C4");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        getContentPane().add(c4);
        c4.setBounds(570, 320, 50, 30);

        d1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d1.setText("D1");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        getContentPane().add(d1);
        d1.setBounds(200, 380, 50, 30);

        d2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d2.setText("D2");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        getContentPane().add(d2);
        d2.setBounds(320, 380, 50, 30);

        d3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d3.setText("D3");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        getContentPane().add(d3);
        d3.setBounds(450, 380, 50, 30);

        d4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d4.setText("D4");
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });
        getContentPane().add(d4);
        d4.setBounds(570, 380, 50, 30);

        pricesA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricesA.setForeground(new java.awt.Color(255, 255, 255));
        pricesA.setText("A Seats: $");
        getContentPane().add(pricesA);
        pricesA.setBounds(30, 520, 220, 30);

        pricesB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricesB.setForeground(new java.awt.Color(255, 255, 255));
        pricesB.setText("B Seats: $");
        getContentPane().add(pricesB);
        pricesB.setBounds(30, 550, 220, 30);

        pricesC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricesC.setForeground(new java.awt.Color(255, 255, 255));
        pricesC.setText("C Seats: $");
        getContentPane().add(pricesC);
        pricesC.setBounds(30, 580, 220, 30);

        pricesD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricesD.setForeground(new java.awt.Color(255, 255, 255));
        pricesD.setText("D Seats: $");
        getContentPane().add(pricesD);
        pricesD.setBounds(30, 610, 220, 30);

        regionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regionLabel.setForeground(new java.awt.Color(255, 255, 255));
        regionLabel.setText("Region: ");
        getContentPane().add(regionLabel);
        regionLabel.setBounds(40, 420, 190, 50);

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noteLabel.setText("NOTICE: The total amount ($) will vary depending on the region selected!");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(250, 420, 460, 50);

        seats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Seats.png"))); // NOI18N
        getContentPane().add(seats);
        seats.setBounds(270, 610, 230, 100);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 737, 763);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if user set the language to French
    private void setLanguage() {
        regionLabel.setText("Region: " + region);
        if (language.equals("French")) {
            title.setText("Sélection de sièges SigmaPLΣX®");
            subTitle.setText("Veuillez sélectionner vos places ci-dessous:");
            noteLabel.setText("AVIS: Le montant total ($) variera en fonction de la région sélectionnée!");
            seatLabel.setText("Siège sélectionné");
            reset.setText("Réinitialiser");
            cancel.setText("Annuler");
            next.setText("Suivant");
        }
    }
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        final double TAX = 1.13;
        String seat = seatSelect.getText();
        if (seat.equals("")) {
            JOptionPane.showMessageDialog(null, "You have not selected a seat!", "No Seat Selected", JOptionPane.ERROR_MESSAGE);
        } else {
            if (seat.contains("A")) {
                total = priceA * TAX;
            } else if (seat.contains("B")) {
                total = priceB * TAX;
            } else if (seat.contains("C")) {
                total = priceC * TAX;
            } else if (seat.contains("D")) {
                total = priceD * TAX;
            }
            this.setVisible(false);
            new Payment(movie, day, time, location, seat, currency, total, language).setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        a1.setEnabled(false);
        seatSelect.setText("A1");
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        a2.setEnabled(false);
        seatSelect.setText("A2");
    }//GEN-LAST:event_a2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        seatSelect.setText("");
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        a4.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        c4.setEnabled(true);
        d1.setEnabled(true);
        d2.setEnabled(true);
        d3.setEnabled(true);
        d4.setEnabled(true);
    }//GEN-LAST:event_resetActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        a3.setEnabled(false);
        seatSelect.setText("A3");
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        a4.setEnabled(false);
        seatSelect.setText("A4");
    }//GEN-LAST:event_a4ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        try {
            this.setVisible(false);
            new MovieSelect(null, region, language).setVisible(true);
        } catch (ParseException e) {}
    }//GEN-LAST:event_cancelActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setEnabled(false);
        seatSelect.setText("B1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setEnabled(false);
        seatSelect.setText("B2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        b3.setEnabled(false);
        seatSelect.setText("B3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        b4.setEnabled(false);
        seatSelect.setText("B4");
    }//GEN-LAST:event_b4ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        c1.setEnabled(false);
        seatSelect.setText("C1");
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        c2.setEnabled(false);
        seatSelect.setText("C2");
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        c3.setEnabled(false);
        seatSelect.setText("C3");
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        c4.setEnabled(false);
        seatSelect.setText("C4");
    }//GEN-LAST:event_c4ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        d1.setEnabled(false);
        seatSelect.setText("D1");
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        d2.setEnabled(false);
        seatSelect.setText("D2");
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        d3.setEnabled(false);
        seatSelect.setText("D3");
    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        d4.setEnabled(false);
        seatSelect.setText("D4");
    }//GEN-LAST:event_d4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SeatSelect(null, null, null, null, "Canada", "English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JLabel aLabel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel bLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JLabel cLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JLabel dLabel;
    private javax.swing.JButton next;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel pricesA;
    private javax.swing.JLabel pricesB;
    private javax.swing.JLabel pricesC;
    private javax.swing.JLabel pricesD;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JButton reset;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JLabel seatLabel;
    private javax.swing.JTextField seatSelect;
    private javax.swing.JLabel seats;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
