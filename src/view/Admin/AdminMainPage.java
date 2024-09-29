package view.Admin;

import controller.FlightController; // Ensure this is your actual path
import model.Flight; // Ensure this is your actual path
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AdminMainPage extends javax.swing.JFrame {

    public AdminMainPage() {
        initComponents();
        loadFlights(); // Load flight data after components are initialized
    }

    private void loadFlights() {
        FlightController flightController = new FlightController();
        List<Flight> flights = flightController.getAllFlights();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing data

        for (Flight flight : flights) {
            model.addRow(new Object[]{
                flight.getFlightCode(),
                flight.getDepartureDate(),
                flight.getDepartureCity(),
                flight.getArrivalCity(),
                flight.getTotalTickets(),
                flight.getTicketStatus()
            });
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DATA TIKET");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
                "flight_code", "departure_date", "departure_city", "arrival_city", "total_tickets", "ticket_status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAddTicket.setText("Tambah Tiket");
        btnAddTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(670, 670, 670)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddTicket)
                .addGap(684, 684, 684))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddTicket)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 510));

        pack();
    }

    private void btnAddTicketActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        view.Admin.AdminAddTicketPage adminAddTicketPage = new view.Admin.AdminAddTicketPage();
        adminAddTicketPage.setVisible(true);
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
