/*
 * Class: TicketSystem.java
 * Name: Jacky Ly
 * Date: Jan. 23, 2017
 * Desc: Homepage for the Ticketing System
 */

import javax.swing.*;

public class TicketSystem extends javax.swing.JFrame {

    String language, region;

    public TicketSystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        english = new javax.swing.JButton();
        french = new javax.swing.JButton();
        countryLabel = new javax.swing.JLabel();
        countrySelect = new javax.swing.JComboBox<>();
        exit = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SigmaPLΣX®");
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Bienvenue à SigmaPLΣX®!");
        title.setToolTipText("");
        getContentPane().add(title);
        title.setBounds(50, 80, 630, 60);

        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        subTitle.setForeground(new java.awt.Color(255, 255, 255));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Welcome to SigmaPLΣX®!");
        subTitle.setToolTipText("");
        getContentPane().add(subTitle);
        subTitle.setBounds(40, 30, 630, 60);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film.gif"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(250, 170, 200, 170);

        english.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        english.setText("English");
        english.setAutoscrolls(true);
        english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishActionPerformed(evt);
            }
        });
        getContentPane().add(english);
        english.setBounds(130, 380, 160, 50);

        french.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        french.setText("Français");
        french.setAutoscrolls(true);
        french.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchActionPerformed(evt);
            }
        });
        getContentPane().add(french);
        french.setBounds(410, 380, 160, 50);

        countryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("Country/Région:");
        getContentPane().add(countryLabel);
        countryLabel.setBounds(260, 480, 130, 30);

        countrySelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        countrySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canada", "United States", "Mexico" }));
        getContentPane().add(countrySelect);
        countrySelect.setBounds(260, 510, 210, 30);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setText("Exit - Sortie");
        exit.setAutoscrolls(true);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(280, 600, 150, 40);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background1.jpg"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, 140, 730, 750);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -140, 730, 750);

        setBounds(0, 0, 734, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void frenchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchActionPerformed
        Object country = countrySelect.getSelectedItem();
        region = country.toString();
        language = "French";
        this.setVisible(false);
        new Login(region, language).setVisible(true);
    }//GEN-LAST:event_frenchActionPerformed

    private void englishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishActionPerformed
        Object country = countrySelect.getSelectedItem();
        region = country.toString();
        language = "English";
        this.setVisible(false);
        new Login(region, language).setVisible(true);
    }//GEN-LAST:event_englishActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JOptionPane.showMessageDialog(null, "Thank you for using SigmaPLΣX® and we hope to see you again soon!", "Thanks for choosing SigmaPLΣX®", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicketSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JComboBox<String> countrySelect;
    private javax.swing.JButton english;
    private javax.swing.JButton exit;
    private javax.swing.JButton french;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
