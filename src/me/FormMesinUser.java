/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author angga
 */
public class FormMesinUser extends javax.swing.JInternalFrame {
Connection c = null;
    ResultSet r = null;
    private JTable table = null;
    /**
     * Creates new form FormMesinUser
     */
    public FormMesinUser() {
        initComponents();
        textFalse();
        tombolFalse();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tNoSeri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tMesinId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tNmMesin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tTglMasuk = new javax.swing.JTextField();
        bBatal = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        bPerbarui = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 204));
        setIconifiable(true);
        setTitle("Form User");

        tNoSeri.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tNoSeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNoSeriActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("Mesin Id");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Tanggal Masuk");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Nama Mesin");

        tMesinId.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tMesinId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMesinIdActionPerformed(evt);
            }
        });
        tMesinId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMesinIdKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("No. Seri");

        tNmMesin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tNmMesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNmMesinActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Mesin");

        tTglMasuk.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tTglMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTglMasukActionPerformed(evt);
            }
        });
        tTglMasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTglMasukKeyTyped(evt);
            }
        });

        bBatal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/ikon batal.png"))); // NOI18N
        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        bTutup.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/tutup.png"))); // NOI18N
        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        bSimpan.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/ikon save.png"))); // NOI18N
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bTambah.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/ikon tambah.png"))); // NOI18N
        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        jScrollPane.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 588, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(551, 551, 551))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bTambah)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(bBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bTutup))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tMesinId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNmMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(108, 108, 108)
                                        .addComponent(tNoSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(bPerbarui)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(732, Short.MAX_VALUE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMesinId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(tNoSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tNmMesin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSimpan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bBatal)
                        .addComponent(bTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(bPerbarui, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(101, 101, 101))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void tombolFalse() {
        bSimpan.setEnabled(false);
        bBatal.setEnabled(false);
        bTutup.setEnabled(true);
    }

    private void textFalse() {
        tMesinId.setEnabled(true);
        tNmMesin.setEnabled(false);
        tNoSeri.setEnabled(false);
        tTglMasuk.setEnabled(false);
    }

    private void textTrue() {
        tMesinId.setEnabled(true);
        tNmMesin.setEnabled(true);
        tNoSeri.setEnabled(true);
        tTglMasuk.setEnabled(true);
    }

    private void BersihField() {
        tMesinId.setText("");
        tNmMesin.setText("");
        tNoSeri.setText("");
        tTglMasuk.setText("");
    }

    private void BukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/maintenance", "root", "");
            System.out.println("Koneksi sukses");
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String tanggal() {
        SimpleDateFormat tgl = new SimpleDateFormat("yyyy-MM-dd");
        return tgl.format(new java.util.Date());
    }
    private void Simpan() {
        String mesinId = tMesinId.getText();
        try {
            PreparedStatement pStatement = c.prepareStatement("INSERT INTO mesin"
                    + "(mesin_id,nm_mesin,no_seri,tgl_masuk)" + "VALUES (?,?,?,?)");
            pStatement.setString(1, tMesinId.getText());
            pStatement.setString(2, tNmMesin.getText());
            pStatement.setString(3, tNoSeri.getText());
            pStatement.setString(4, tTglMasuk.getText());
            if (pStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this,
                        "Penambahan sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
                BersihField();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Penambahan gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
            JOptionPane.showMessageDialog(null, "Gagal menyimpan \nMesin Id kembar :" + "\nMesinId [ " + mesinId + " ] telah ada, "
                    + "atau data yang Anda masukkan tidak sesuai format dengan yang diminta !");
            tMesinId.setFocusable(true);
        }
    }
    private void tNoSeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNoSeriActionPerformed
        if (tNoSeri.getText().length() <= 20) {
            tTglMasuk.requestFocus();
        } else if (tNoSeri.getText().length() >= 20) {
            JOptionPane.showMessageDialog(null, "maksimal 20 karakter !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tNoSeri.requestFocus();
        }
    }//GEN-LAST:event_tNoSeriActionPerformed

    private void tMesinIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMesinIdActionPerformed
        if (tMesinId.getText().length() <= 7) {
            tNmMesin.requestFocus();
        } else if (tMesinId.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "maksimal 7 karakter !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tMesinId.requestFocus();
        }
    }//GEN-LAST:event_tMesinIdActionPerformed

    private void tMesinIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMesinIdKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_tMesinIdKeyTyped

    private void tNmMesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNmMesinActionPerformed
        if (tNmMesin.getText().length() <= 15) {
            tNoSeri.requestFocus();
        } else if (tNmMesin.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "maksimal 15 karakter !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tNmMesin.requestFocus();
        }
    }//GEN-LAST:event_tNmMesinActionPerformed

    private void tTglMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTglMasukActionPerformed
        if (tTglMasuk.getText().length() == 10) {
            bSimpan.requestFocus();
        } else if (tTglMasuk.getText().length() > 10 || tTglMasuk.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "harus 2 karakter, format tanggal : yyyy/MM/dd !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tTglMasuk.requestFocus();
        }
    }//GEN-LAST:event_tTglMasukActionPerformed

    private void tTglMasukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTglMasukKeyTyped
        char karakter = evt.getKeyChar();
        if (!(Character.isDigit(karakter) || karakter == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tTglMasukKeyTyped

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        BersihField();
        textFalse();
        tombolFalse();
        bTutup.setEnabled(true);
    }//GEN-LAST:event_bBatalActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        bTutup.setEnabled(false);
        BukaKoneksi();
        if (tMesinId.getText().equals("") || tNmMesin.getText().equals("")
                || tNoSeri.getText().equals("") || tTglMasuk.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi semua data !");
        } else {
            Simpan();
            BersihField();
            textFalse();
            tombolFalse();
            bTambah.setEnabled(true);
            bTutup.setEnabled(true);
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        BersihField();
        textTrue();
        tMesinId.setText("MC");
        tTglMasuk.setText(tanggal());
        bSimpan.setEnabled(true);
        bBatal.setEnabled(true);
        tMesinId.requestFocus();
    }//GEN-LAST:event_bTambahActionPerformed

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

            c = (Connection) DriverManager.getConnection(urlValue);

            Statement st = c.createStatement();
            r = st.executeQuery(
                    "Select * from mesin");

            r.last();
            int rowCount = r.getRow();
            r.beforeFirst();

            data1 = new Object[rowCount][5];
            int no = -1, angka = 1;
            while (r.next()) {
                no = no + 1;
                data1[no][0] = angka + ".";
                data1[no][1] = r.getString("mesin_id");
                data1[no][2] = r.getString("nm_mesin");
                data1[no][3] = r.getString("no_seri");
                data1[no][4] = r.getString("tgl_masuk");
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

        String[] columnNames = {"No.", "MESIN ID", "NAMA MESIN", "No. SERI", "TANGGAL MASUK"};

        table = new JTable(
                getData(), columnNames);

        jScrollPane.setViewportView(table);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bPerbarui;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField tMesinId;
    private javax.swing.JTextField tNmMesin;
    private javax.swing.JTextField tNoSeri;
    private javax.swing.JTextField tTglMasuk;
    // End of variables declaration//GEN-END:variables
}
