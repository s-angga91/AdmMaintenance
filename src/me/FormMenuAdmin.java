/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author angga
 */
public class FormMenuAdmin extends javax.swing.JFrame {

    Connection c = null;
    Statement s = null;
    ResultSet r = null;

    /**
     * Creates new form FormMenuAdmin
     */
    public FormMenuAdmin() {
        super("Form Admin");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        M_Form_Mesin = new javax.swing.JMenuItem();
        M_Form_Pic = new javax.swing.JMenuItem();
        M_Form_Pekerjaan = new javax.swing.JMenuItem();
        M_User = new javax.swing.JMenuItem();
        M_Exit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        M_Input_Serv_Mesin = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        M_Lap_Per_Mesin = new javax.swing.JMenuItem();
        M_Lap_Serv_Per_Hari = new javax.swing.JMenuItem();
        M_Lap_Per_Periode = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        M_Tabel_Serv_Mesin = new javax.swing.JMenuItem();
        M_Tabel_Det_Service_Mesin = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        M_About_This_App = new javax.swing.JMenuItem();
        M_Logout = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
        setForeground(new java.awt.Color(51, 255, 102));

        jDesktop.setBackground(new java.awt.Color(0, 153, 153));

        jMenu1.setText("Master");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        M_Form_Mesin.setText("Mesin");
        M_Form_Mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Form_MesinActionPerformed(evt);
            }
        });
        jMenu1.add(M_Form_Mesin);

        M_Form_Pic.setText("Teknisi");
        M_Form_Pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Form_PicActionPerformed(evt);
            }
        });
        jMenu1.add(M_Form_Pic);

        M_Form_Pekerjaan.setText("Pekerjaan");
        M_Form_Pekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Form_PekerjaanActionPerformed(evt);
            }
        });
        jMenu1.add(M_Form_Pekerjaan);

        M_User.setText("User");
        M_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_UserActionPerformed(evt);
            }
        });
        jMenu1.add(M_User);

        M_Exit.setText("Exit");
        M_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(M_Exit);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Transaksi");

        M_Input_Serv_Mesin.setText("Service Mesin");
        M_Input_Serv_Mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Input_Serv_MesinActionPerformed(evt);
            }
        });
        jMenu4.add(M_Input_Serv_Mesin);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Laporan");

        M_Lap_Per_Mesin.setText("Laporan Service Per Mesin");
        M_Lap_Per_Mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Lap_Per_MesinActionPerformed(evt);
            }
        });
        jMenu7.add(M_Lap_Per_Mesin);

        M_Lap_Serv_Per_Hari.setText("Laporan Service Per Hari");
        M_Lap_Serv_Per_Hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Lap_Serv_Per_HariActionPerformed(evt);
            }
        });
        jMenu7.add(M_Lap_Serv_Per_Hari);

        M_Lap_Per_Periode.setText("Laporan Service Per Periode");
        M_Lap_Per_Periode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Lap_Per_PeriodeActionPerformed(evt);
            }
        });
        jMenu7.add(M_Lap_Per_Periode);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Tabel");

        M_Tabel_Serv_Mesin.setText("Tabel Service Mesin");
        M_Tabel_Serv_Mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Tabel_Serv_MesinActionPerformed(evt);
            }
        });
        jMenu8.add(M_Tabel_Serv_Mesin);

        M_Tabel_Det_Service_Mesin.setText("Tabel Detil Service Mesin");
        M_Tabel_Det_Service_Mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Tabel_Det_Service_MesinActionPerformed(evt);
            }
        });
        jMenu8.add(M_Tabel_Det_Service_Mesin);

        jMenuBar1.add(jMenu8);

        jMenu10.setText("About App");

        M_About_This_App.setText("About This App");
        M_About_This_App.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_About_This_AppActionPerformed(evt);
            }
        });
        jMenu10.add(M_About_This_App);

        M_Logout.setText("Logout");
        M_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_LogoutActionPerformed(evt);
            }
        });
        jMenu10.add(M_Logout);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void FormMesin() {
        FormMesin fm = new FormMesin();
        fm.setVisible(true);
        jDesktop.add(fm);
        try {
            //membuat internalFrame baru terpilih
            fm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void TabelMesin() {
        TabelMesin tm = new TabelMesin();
        tm.setVisible(true);
        jDesktop.add(tm);
        try {
            tm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }
    private void M_Form_MesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Form_MesinActionPerformed
        FormMesin();
    }//GEN-LAST:event_M_Form_MesinActionPerformed
    private void input_service_mesin() {
        FormServiceMesin fsm = new FormServiceMesin();
        fsm.setVisible(true);
        jDesktop.add(fsm);
        try {
            fsm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void tabelServiceMesin() {
        TabelServiceMesin tsm = new TabelServiceMesin();
        tsm.setVisible(true);
        jDesktop.add(tsm);
        try {
            tsm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void formUser() {
        FormUser fu = new FormUser();
        fu.setVisible(true);
        jDesktop.add(fu);
        try {
            fu.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void tabelDetilServiceMesin() {
        TabelDetilServiceMesin tdsm = new TabelDetilServiceMesin();
        tdsm.setVisible(true);
        jDesktop.add(tdsm);
        try {
            tdsm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }
    private void M_Lap_Serv_Per_HariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Lap_Serv_Per_HariActionPerformed
        formLaporanPerHari();
    }//GEN-LAST:event_M_Lap_Serv_Per_HariActionPerformed

    private void M_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_M_ExitActionPerformed

    private void M_Input_Serv_MesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Input_Serv_MesinActionPerformed
        input_service_mesin();
    }//GEN-LAST:event_M_Input_Serv_MesinActionPerformed

    private void M_Tabel_Serv_MesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Tabel_Serv_MesinActionPerformed
        tabelServiceMesin();
    }//GEN-LAST:event_M_Tabel_Serv_MesinActionPerformed

    private void M_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_UserActionPerformed
        formUser();
    }//GEN-LAST:event_M_UserActionPerformed

    private void M_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_LogoutActionPerformed
        dispose();
        FormLogin fl = new FormLogin();
        fl.setLocationRelativeTo(this);
        fl.setVisible(true);
    }//GEN-LAST:event_M_LogoutActionPerformed
    private void M_Lap_Per_MesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Lap_Per_MesinActionPerformed
        formCetakPerMesin();
    }//GEN-LAST:event_M_Lap_Per_MesinActionPerformed
    private void formCetakPerMesin() {
        FormCetakPerMesin fcpm = new FormCetakPerMesin();
        fcpm.setVisible(true);
        jDesktop.add(fcpm);
        try {
            fcpm.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void formTeknisi() {
        FormTeknisi fP = new FormTeknisi();
        fP.setVisible(true);
        jDesktop.add(fP);
        try {
            fP.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void formPekerjaan() {
        FormPekerjaan fPj = new FormPekerjaan();
        fPj.setVisible(true);
        jDesktop.add(fPj);
        try {
            fPj.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void formLaporanPeriode() {
        FormLaporanPeriode FLP = new FormLaporanPeriode();
        FLP.setVisible(true);
        jDesktop.add(FLP);
        try {
            FLP.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void formLaporanPerHari() {
        FormLaporanPerHari FLPH = new FormLaporanPerHari();
        FLPH.setVisible(true);
        jDesktop.add(FLPH);
        try {
            FLPH.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }
    private void aboutApp(){
    AboutApp aA = new AboutApp();
    aA.setVisible(true);
    jDesktop.add(aA);
    try{
    aA.setSelected(true);
    }catch(java.beans.PropertyVetoException e){
    }
    }
    private void M_Form_PekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Form_PekerjaanActionPerformed
        formPekerjaan();
    }//GEN-LAST:event_M_Form_PekerjaanActionPerformed

    private void M_Form_PicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Form_PicActionPerformed
        formTeknisi();
    }//GEN-LAST:event_M_Form_PicActionPerformed

    private void M_Tabel_Det_Service_MesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Tabel_Det_Service_MesinActionPerformed
        tabelDetilServiceMesin();
    }//GEN-LAST:event_M_Tabel_Det_Service_MesinActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void M_Lap_Per_PeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Lap_Per_PeriodeActionPerformed
        formLaporanPeriode();
    }//GEN-LAST:event_M_Lap_Per_PeriodeActionPerformed

    private void M_About_This_AppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_About_This_AppActionPerformed
        aboutApp();
    }//GEN-LAST:event_M_About_This_AppActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormMenuAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem M_About_This_App;
    private javax.swing.JMenuItem M_Exit;
    private javax.swing.JMenuItem M_Form_Mesin;
    private javax.swing.JMenuItem M_Form_Pekerjaan;
    private javax.swing.JMenuItem M_Form_Pic;
    private javax.swing.JMenuItem M_Input_Serv_Mesin;
    private javax.swing.JMenuItem M_Lap_Per_Mesin;
    private javax.swing.JMenuItem M_Lap_Per_Periode;
    private javax.swing.JMenuItem M_Lap_Serv_Per_Hari;
    private javax.swing.JMenuItem M_Logout;
    private javax.swing.JMenuItem M_Tabel_Det_Service_Mesin;
    private javax.swing.JMenuItem M_Tabel_Serv_Mesin;
    private javax.swing.JMenuItem M_User;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
