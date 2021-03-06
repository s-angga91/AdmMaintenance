/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

import java.io.File;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author angga
 */
public class FormLaporanPerHari extends javax.swing.JInternalFrame {
private JTable table = null;
Connection c = null;
    ResultSet r = null;
    /**
     * Creates new form FormLaporanPerHari
     */
    public FormLaporanPerHari() {
        initComponents();
        this.setLocation(100, 50);
        tampilTabel();
        tPath.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bTutup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tLokasiFile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bUse = new javax.swing.JButton();
        bInputPath = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tInputPath = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tPath = new javax.swing.JTextField();
        date1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 255, 204));
        setTitle("Laporan Per Hari");

        bCetak.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bCetak.setText("cetak");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Masukkan Tanggal Service Mesin yang ingin dicetak !");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Tanggal Service :");

        bTutup.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/tutup.png"))); // NOI18N
        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Lokasi File");

        tLokasiFile.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tLokasiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLokasiFileActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Nama Lokasi");

        bUse.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        bUse.setText("Use");
        bUse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        bUse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUseActionPerformed(evt);
            }
        });

        bInputPath.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bInputPath.setText("Input Lokasi");
        bInputPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInputPathActionPerformed(evt);
            }
        });

        jScrollPane.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        tInputPath.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tInputPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tInputPathActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Pilih Lokasi File Jasper atau input baru !");

        tPath.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(bUse, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tLokasiFile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bInputPath)))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bTutup)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tPath, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(bCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(tPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tLokasiFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(bInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bUse)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void BukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/maintenance", "root", "");
            System.out.println("Koneksi sukses");
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
        try {
            String FileName = tPath.getText(); //"E:/myProg/admMaintenance/src/me/PerHari.jasper";
            HashMap parameters = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/maintenance", "root", "");
            parameters.put("tgl_repair", date1.getDate());
            File reportfile = new File(FileName);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(reportfile.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak" + e);
        }
    }//GEN-LAST:event_bCetakActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void tLokasiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLokasiFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLokasiFileActionPerformed

    private void bUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUseActionPerformed
        // TODO add your handling code here:
        String nama = table.getValueAt(table.getSelectedRow(), 1).toString();

        String lok = table.getValueAt(table.getSelectedRow(), 2).toString();
        tPath.setText(lok);
    }//GEN-LAST:event_bUseActionPerformed

    private void bInputPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInputPathActionPerformed
        BukaKoneksi();
        try {
            PreparedStatement pStatement = c.prepareStatement("INSERT INTO lokasi_file_jasper"
                    + "(nm_lokasi,classpath)" + "VALUES (?,?)");
            pStatement.setString(1, tInputPath.getText());
            pStatement.setString(2, tLokasiFile.getText());
            if (pStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this,
                        "Penambahan sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
                tampilTabel();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Penambahan gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
            tampilTabel();
        }
    }//GEN-LAST:event_bInputPathActionPerformed
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

            c = (com.mysql.jdbc.Connection) DriverManager.getConnection(urlValue);

            Statement st = c.createStatement();
            r = st.executeQuery(
                    "Select * from lokasi_file_jasper");

            r.last();
            int rowCount = r.getRow();
            r.beforeFirst();

            data1 = new Object[rowCount][3];
            int no = -1, angka = 1;
            while (r.next()) {
                no = no + 1;
                data1[no][0] = angka + ".";
                data1[no][1] = r.getString("nm_lokasi");
                data1[no][2] = r.getString("classpath");
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

        String[] columnNames = {"No.", "Nama Lokasi", "Path"};

        table = new JTable(
                getData(), columnNames);

        jScrollPane.setViewportView(table);
    }
    private void tInputPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tInputPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tInputPathActionPerformed

    private void tPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPathActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bInputPath;
    private javax.swing.JButton bTutup;
    private javax.swing.JButton bUse;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField tInputPath;
    private javax.swing.JTextField tLokasiFile;
    private javax.swing.JTextField tPath;
    // End of variables declaration//GEN-END:variables
}
