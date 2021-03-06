/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

import java.sql.*;
import javax.swing.JTable;

/**
 *
 * @author angga
 */
public class TabelServiceMesin extends javax.swing.JInternalFrame {

    Connection c = null;
    ResultSet r = null;

    /**
     * Creates new form TabelServiceMesin
     */
    public TabelServiceMesin() {
        initComponents();
        this.setLocation(150, 0);
        tampilTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        bTutup = new javax.swing.JButton();
        bPerbarui = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 204));
        setIconifiable(true);
        setTitle("Tabel Service Mesin");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabel Service Mesin");

        jScrollPane.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        bTutup.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/tutup.png"))); // NOI18N
        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        bPerbarui.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bPerbarui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/ikon refresh.png"))); // NOI18N
        bPerbarui.setText("Perbarui");
        bPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerbaruiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(bPerbarui)
                        .addGap(144, 144, 144)
                        .addComponent(bTutup)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPerbarui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bTutup))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void bPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerbaruiActionPerformed
        tampilTabel();
    }//GEN-LAST:event_bPerbaruiActionPerformed
    private Object[][] getData() {

        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "maintenance";

        Object[][] data1 = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String urlValue = "jdbc:mysql://" + host + "/"
                    + db + "?user=" + user
                    + "&password=" + pwd;

            c = DriverManager.getConnection(urlValue);

            Statement st = c.createStatement();
            r = st.executeQuery(
                    "SELECT kd_service,mesin_id,nik,kd_pekerjaan,mesin_stop FROM service_mesin");

            r.last();
            int rowCount = r.getRow();
            r.beforeFirst();

            data1 = new Object[rowCount][6];
            int no = -1, angka = 1;
            while (r.next()) {
                no = no + 1;
                data1[no][0] = angka + ".";
                data1[no][1] = r.getString("kd_service");
                data1[no][2] = r.getString("mesin_id");
                data1[no][3] = r.getString("nik");
                data1[no][4] = r.getString("kd_pekerjaan");
                data1[no][5] = r.getString("mesin_stop");
                angka = angka + 1;
            }

            st.close();
            c.close();

        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());

        }

        return data1;
    }

    private void tampilTabel() {

        String[] columnNames = {"No.", "Kode Service", "Mesin Id", "NIK Teknisi", "Kode Pekerjaan", "Mesin Stop"};

        JTable table = new JTable(
                getData(), columnNames);

        jScrollPane.setViewportView(table);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPerbarui;
    private javax.swing.JButton bTutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
