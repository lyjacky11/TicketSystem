/*
 * Class: Receipt.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Confirmation for the Ticketing System
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Receipt extends javax.swing.JFrame {

    Scanner reader;
    PrintWriter writer;
    String movie, day, time, location, seats, currency, language;
    double amount;
    int creedCount, furiousCount, passengersCount, rogueCount;

    public Receipt(Object movies, Object date, Object showtimes, Object venue, String seat, String curren, double total, String lang) throws IOException {
        initComponents();
        movie = movies.toString();
        day = date.toString();
        time = showtimes.toString();
        location = venue.toString();
        seats = seat;
        currency = curren;
        amount = total;
        language = lang;
        setLanguage();
        updateTickets();

        movieField.setText(movie);
        dayField.setText(day);
        timeField.setText(time);
        venueField.setText(location);
        seatField.setText(seats);
        amountField.setText(String.format("$%.2f%s%s", amount, " ", currency));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        movieLabel = new javax.swing.JLabel();
        movieField = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        dayField = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        timeField = new javax.swing.JLabel();
        venueLabel = new javax.swing.JLabel();
        venueField = new javax.swing.JLabel();
        seatLabel = new javax.swing.JLabel();
        seatField = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        seatsIcon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Confirmation");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SigmaPLΣX® Confirmation");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(60, 10, 630, 70);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Print This Page for your Confirmation!");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(60, 50, 630, 60);

        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(280, 500, 140, 50);

        movieLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        movieLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        movieLabel.setText("Movie:");
        getContentPane().add(movieLabel);
        movieLabel.setBounds(30, 150, 160, 30);

        movieField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movieField.setForeground(new java.awt.Color(255, 255, 255));
        movieField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        movieField.setText("<insert movie value here>");
        movieField.setToolTipText("");
        getContentPane().add(movieField);
        movieField.setBounds(260, 150, 350, 30);

        dayLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dayLabel.setText("Day:");
        getContentPane().add(dayLabel);
        dayLabel.setBounds(30, 200, 160, 30);

        dayField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dayField.setForeground(new java.awt.Color(255, 255, 255));
        dayField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dayField.setText("<insert day value here>");
        dayField.setToolTipText("");
        getContentPane().add(dayField);
        dayField.setBounds(260, 200, 350, 30);

        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("Start Time:");
        getContentPane().add(timeLabel);
        timeLabel.setBounds(30, 250, 160, 30);

        timeField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeField.setForeground(new java.awt.Color(255, 255, 255));
        timeField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeField.setText("<insert time value here>");
        timeField.setToolTipText("");
        getContentPane().add(timeField);
        timeField.setBounds(260, 250, 350, 30);

        venueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        venueLabel.setForeground(new java.awt.Color(255, 255, 255));
        venueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        venueLabel.setText("Venue:");
        getContentPane().add(venueLabel);
        venueLabel.setBounds(30, 300, 160, 30);

        venueField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        venueField.setForeground(new java.awt.Color(255, 255, 255));
        venueField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        venueField.setText("<insert location value here>");
        venueField.setToolTipText("");
        getContentPane().add(venueField);
        venueField.setBounds(260, 300, 350, 30);

        seatLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seatLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        seatLabel.setText("Seat:");
        getContentPane().add(seatLabel);
        seatLabel.setBounds(30, 350, 160, 30);

        seatField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seatField.setForeground(new java.awt.Color(255, 255, 255));
        seatField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seatField.setText("<insert seat value here>");
        seatField.setToolTipText("");
        getContentPane().add(seatField);
        seatField.setBounds(260, 350, 350, 30);

        amountLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amountLabel.setText("Amount Paid:");
        getContentPane().add(amountLabel);
        amountLabel.setBounds(30, 400, 160, 30);

        amountField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amountField.setForeground(new java.awt.Color(255, 255, 255));
        amountField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amountField.setText("<insert total amount here>");
        amountField.setToolTipText("");
        getContentPane().add(amountField);
        amountField.setBounds(260, 400, 350, 30);

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noteLabel.setText("Thank you for your business! Enjoy your movie and we hope to see you again soon!");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(50, 570, 610, 60);

        seatsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Receipt.jpg"))); // NOI18N
        getContentPane().add(seatsIcon);
        seatsIcon.setBounds(480, 350, 210, 200);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 730, 750);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        setBounds(0, 0, 744, 763);
    }// </editor-fold>//GEN-END:initComponents

    // Checks if user set the language to French
    private void setLanguage() {
        if (language.equals("French")) {
            subTitle.setText("Imprimer cette page pour votre confirmation!");
            movieLabel.setText("Film:");
            dayLabel.setText("Jour:");
            timeLabel.setText("Heure de départ:");
            venueLabel.setText("Lieu:");
            seatLabel.setText("Siège:");
            amountLabel.setText("Le montant payé:");
            noteLabel.setText("Merci pour votre entreprise! Profitez de votre film et nous espérons vous revoir bientôt!");
            close.setText("Fermer");
        }
    }
    
    // Update the amount of tickets purchased for each movie
    private void updateTickets() throws IOException {
        reader = new Scanner(new File("ticketInfo.txt"));
        creedCount = reader.nextInt();
        furiousCount = reader.nextInt();
        passengersCount = reader.nextInt();
        rogueCount = reader.nextInt();
        reader.close();
        switch (movie) {
            case "Assassin's Creed":
                creedCount++;
                break;
            case "Fast & Furious 7":
                furiousCount++;
                break;
            case "Passengers (2016)":
                passengersCount++;
                break;
            case "Rogue One: A Star Wars Story":
                rogueCount++;
                break;
            default:
                break;
        }
        writer = new PrintWriter(new FileWriter("ticketInfo.txt"));
        writer.print(creedCount + " " + furiousCount + " " + passengersCount + " " + rogueCount);
        writer.close();
    }
    
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        JOptionPane.showMessageDialog(null, "Thank you for your purchase and we hope to see you again soon!", "Thanks for choosing SigmaPLΣX®", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Receipt("", "", "", "", "", "CAD", 0.0, "English").setVisible(true);
                } catch (IOException e) {}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton close;
    private javax.swing.JLabel dayField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JLabel movieField;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel seatField;
    private javax.swing.JLabel seatLabel;
    private javax.swing.JLabel seatsIcon;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel timeField;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel venueField;
    private javax.swing.JLabel venueLabel;
    // End of variables declaration//GEN-END:variables
}
