/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Admin;

import controller.TicketController;
import java.awt.HeadlessException;
import model.Ticket;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tango
 */
public class AdminAddTicketPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminAddTicketPage
     */
    public AdminAddTicketPage() {
        initComponents();
        initCustomComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fieldflightcode = new javax.swing.JTextField();
        fieldDeparture = new javax.swing.JTextField();
        fieldArrival = new javax.swing.JTextField();
        DateDeparture = new com.toedter.calendar.JDateChooser();
        fieldAvailableseats = new javax.swing.JTextField();
        CmbTicketStatus = new javax.swing.JComboBox<>();
        btnAddTicket = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Departure City");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flight Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrival City");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Flight Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Seats");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 121, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ticket Status");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 121, -1));

        Fieldflightcode.setText("PENS-578");
        Fieldflightcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldflightcodeActionPerformed(evt);
            }
        });
        jPanel1.add(Fieldflightcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 132, 184, 40));

        fieldDeparture.setText("Surabaya");
        fieldDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDepartureActionPerformed(evt);
            }
        });
        jPanel1.add(fieldDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 202, 40));

        fieldArrival.setText("Jakarta");
        fieldArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldArrivalActionPerformed(evt);
            }
        });
        jPanel1.add(fieldArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 202, 40));
        jPanel1.add(DateDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 202, 40));

        fieldAvailableseats.setText("20");
        fieldAvailableseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAvailableseatsActionPerformed(evt);
            }
        });
        jPanel1.add(fieldAvailableseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 90, 40));

        CmbTicketStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "sold_out" }));
        jPanel1.add(CmbTicketStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 230, 50));

        btnAddTicket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddTicket.setText("Add Ticket");
        btnAddTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 740, 140, 50));

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\semester 3\\oop\\Project_UTS\\Tiket_Pesawat\\src\\main\\java\\img\\low-angle-shot-airplane-flying-closer-daytime (3).jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initCustomComponents() {
        btnAddTicket.addActionListener(evt -> btnAddTicketActionPerformed(evt));
        btnBack.addActionListener(evt -> btnBackActionPerformed(evt));
    }
    
    private void FieldflightcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldflightcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldflightcodeActionPerformed

    private void fieldDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDepartureActionPerformed

    private void fieldArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldArrivalActionPerformed

    private void fieldAvailableseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAvailableseatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAvailableseatsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        view.Admin.AdminMainPage adminMain = new view.Admin.AdminMainPage();
        
        adminMain.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTicketActionPerformed
        // TODO add your handling code here:
        try {
            // Mengambil data dari inputan
            String flightCode = Fieldflightcode.getText().trim();
            String departureCity = fieldDeparture.getText().trim();
            String arrivalCity = fieldArrival.getText().trim();
            Date departureDate = DateDeparture.getDate(); // Mengambil tanggal dari JDateChooser
            
            // Validasi input totalTickets
            int totalTickets;
            try {
                totalTickets = Integer.parseInt(fieldAvailableseats.getText().trim());
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Jumlah kursi tersedia harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String ticketStatus = (String) CmbTicketStatus.getSelectedItem();

            // Validasi input
            if (flightCode.isEmpty() || departureCity.isEmpty() || arrivalCity.isEmpty() || departureDate == null) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Membuat objek Ticket
            Ticket ticket = new Ticket(flightCode, departureCity, arrivalCity, departureDate, totalTickets, ticketStatus);

            // Menggunakan TicketController untuk menambahkan tiket
            TicketController ticketController = new TicketController();
            boolean success = ticketController.addTicket(ticket);

            // Menampilkan pesan berdasarkan hasil
            if (success) {
                JOptionPane.showMessageDialog(this, "Tiket berhasil ditambahkan!");
                clearFields(); // Menambahkan fungsi untuk membersihkan field setelah sukses
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan tiket. Silakan coba lagi.");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnAddTicketActionPerformed



     private void clearFields() {
        Fieldflightcode.setText("");
        fieldDeparture.setText("");
        fieldArrival.setText("");
        fieldAvailableseats.setText("");
        DateDeparture.setDate(null);
        CmbTicketStatus.setSelectedIndex(0); // Reset ke pilihan default
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminAddTicketPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddTicketPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddTicketPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddTicketPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddTicketPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbTicketStatus;
    private com.toedter.calendar.JDateChooser DateDeparture;
    private javax.swing.JTextField Fieldflightcode;
    private javax.swing.JButton btnAddTicket;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField fieldArrival;
    private javax.swing.JTextField fieldAvailableseats;
    private javax.swing.JTextField fieldDeparture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
