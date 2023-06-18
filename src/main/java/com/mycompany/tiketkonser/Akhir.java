/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiketkonser;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALYA MUTIARA
 */
public class Akhir extends javax.swing.JFrame {
    
    String [] jenis_tiket = new String [10];
    int [] harga_tiket = new int [10];
    int [] jumlah_pembelian_tiket = new int [20];
    int [] total = new int [10];
    int index = -1;
    TransaksiTiket tk = new TransaksiTiket();

    /**
     * Creates new form NewJFrame
     */
    public Akhir() {
        initComponents();
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
        TxtNamleng = new javax.swing.JTextField();
        TxtNik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JComboBox<>();
        Bulan = new javax.swing.JComboBox<>();
        Tahun = new javax.swing.JComboBox<>();
        Jenistiket = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtHartik = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JcbJumtik = new javax.swing.JComboBox<>();
        JbOke = new javax.swing.JButton();
        JbBack = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        tJenisTiket = new javax.swing.JComboBox<>();
        jbTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FORM PEMESANAN TIKET");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ALDI TAHER MUSIC CONCERT");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Lengkap");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nomer Identitas (KTP/ID Lainnya}");

        TxtNamleng.setBackground(new java.awt.Color(255, 255, 255));
        TxtNamleng.setForeground(new java.awt.Color(0, 0, 0));
        TxtNamleng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamlengActionPerformed(evt);
            }
        });

        TxtNik.setBackground(new java.awt.Color(255, 255, 255));
        TxtNik.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tanggal Lahir");

        Tanggal.setBackground(new java.awt.Color(255, 255, 255));
        Tanggal.setEditable(true);
        Tanggal.setForeground(new java.awt.Color(0, 0, 0));
        Tanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalActionPerformed(evt);
            }
        });

        Bulan.setBackground(new java.awt.Color(255, 255, 255));
        Bulan.setEditable(true);
        Bulan.setForeground(new java.awt.Color(0, 0, 0));
        Bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        Bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulanActionPerformed(evt);
            }
        });

        Tahun.setBackground(new java.awt.Color(255, 255, 255));
        Tahun.setEditable(true);
        Tahun.setForeground(new java.awt.Color(0, 0, 0));
        Tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", " " }));
        Tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TahunActionPerformed(evt);
            }
        });

        Jenistiket.setForeground(new java.awt.Color(0, 0, 0));
        Jenistiket.setText("Jenis Tiket");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Harga Tiket");

        TxtHartik.setBackground(new java.awt.Color(255, 255, 255));
        TxtHartik.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Jumlah Tiket");

        JcbJumtik.setBackground(new java.awt.Color(255, 255, 255));
        JcbJumtik.setEditable(true);
        JcbJumtik.setForeground(new java.awt.Color(0, 0, 0));
        JcbJumtik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        JcbJumtik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbJumtikActionPerformed(evt);
            }
        });

        JbOke.setText("Cetak");
        JbOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbOkeActionPerformed(evt);
            }
        });

        JbBack.setText("Back");
        JbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBackActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        tJenisTiket.setBackground(new java.awt.Color(255, 255, 255));
        tJenisTiket.setEditable(true);
        tJenisTiket.setForeground(new java.awt.Color(0, 0, 0));
        tJenisTiket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "FESTIVAL", "CAT1", "CAT2", "CAT3" }));
        tJenisTiket.setToolTipText("");
        tJenisTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJenisTiketActionPerformed(evt);
            }
        });

        jbTambah.setText("Tambah");
        jbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(Jenistiket)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNamleng, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tJenisTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JcbJumtik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHartik, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JbOke)
                    .addComponent(jbTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbBack)
                    .addComponent(Close))
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TxtNamleng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(TxtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jenistiket)
                    .addComponent(tJenisTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHartik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JcbJumtik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbBack)
                    .addComponent(jbTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(JbOke))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBackActionPerformed
        Formtiket q = new Formtiket();
        q.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_JbBackActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
     
    }//GEN-LAST:event_CloseActionPerformed

    private void JcbJumtikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbJumtikActionPerformed
        int jumlah = Integer.parseInt(JcbJumtik.getSelectedItem().toString());
        int harga = Integer.parseInt(TxtHartik.getText());
        int total = jumlah * harga;
        
        
        
    }//GEN-LAST:event_JcbJumtikActionPerformed

    private void tJenisTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJenisTiketActionPerformed
        String jenis = (String) tJenisTiket.getSelectedItem();
        Tiket tkt = new Tiket();
        tkt.setJenis_tiket(jenis);
        TxtHartik.setText(Integer.toString(tkt.getHarga_tiket()));
        
        
    }//GEN-LAST:event_tJenisTiketActionPerformed
    public String tgl(){
        String tanggl = (String) Tanggal.getSelectedItem();
        return tanggl;
    }
    
    public String bln(){
        String bulan = (String) Bulan.getSelectedItem();
        return bulan;
    }
    
    public String tahun (){
        String tahn = (String) Tahun.getSelectedItem();
        return tahn;
    }
  
    private void JbOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbOkeActionPerformed
        Output out = new Output();
        
        
        for (int i = 0; i < jenis_tiket.length; i++){
            String jnsTiket = jenis_tiket[i];
            int hrgTiket = harga_tiket [i];
            int jmlhBeli = jumlah_pembelian_tiket[i];
            int totl = harga_tiket [i]*jumlah_pembelian_tiket[i];
            if (jnsTiket != null) {
                DefaultTableModel model = (DefaultTableModel) out.tableOutput.getModel();
                model.addRow (new Object[] {jnsTiket, hrgTiket, jmlhBeli, totl});
                out.setVisible(true);
                this.dispose();
            }
        }
        
        
        
        
//        """
//        
//        TransaksiTiket tk = new TransaksiTiket();
//        tk.setPembeli(TxtNamleng.getText());
//        tk.setNIK(Integer.parseInt(TxtNik.getText()));
//        
//        System.out.println(Tanggal.getSelectedItem());
//        System.out.println(Bulan.getSelectedItem());
//        System.out.println(Tahun.getSelectedItem());
//        
//        for (int i = 0; i < jenis_tiket.length; i++) {
//            String jnsTiket = jenis_tiket[i];
//            int hrgTiket = harga_tiket [i];
//            int jmlhBliTiket = jumlah_pembelian_tiket [i];
//            int sbTotal = total [i];
//            
//            if (jnsTiket != null){
//                DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
//                model.addRow (new Object[]{jenis_tiket, harga_tiket, jumlah_pembelian_tiket, total});
//            }
//        }   
//        """
           
    }//GEN-LAST:event_JbOkeActionPerformed



    private void TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalActionPerformed
        // TODO add your handling code here:
        String tgl = (String) Tanggal.getSelectedItem();
    }//GEN-LAST:event_TanggalActionPerformed

    private void BulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulanActionPerformed
        // TODO add your handling code here:
        String bulan = (String) Bulan.getSelectedItem();
    }//GEN-LAST:event_BulanActionPerformed

    private void TahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TahunActionPerformed
        // TODO add your handling code here:
        String thun = (String) Tahun.getSelectedItem();
    }//GEN-LAST:event_TahunActionPerformed

    private void jbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahActionPerformed
         if (this.index == jenis_tiket.length -1) {
             return;
         }
         
         int currentIndex = ++this.index;
         this.jenis_tiket[currentIndex] = (String) tJenisTiket.getSelectedItem();
         this.harga_tiket [currentIndex] = Integer.parseInt(TxtHartik.getText());
         this.jumlah_pembelian_tiket [currentIndex] =Integer.parseInt((String) JcbJumtik.getSelectedItem());
        
         
         
         // setting ulang text field menjadi kosong
         tJenisTiket.setSelectedIndex(0);
         TxtHartik.setText(Integer.toString(0));
         JcbJumtik.setSelectedIndex(0);
    }//GEN-LAST:event_jbTambahActionPerformed

    private void TxtNamlengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamlengActionPerformed
        // TODO add your handling code here:
        tk.setPembeli(TxtNamleng.getText());
    }//GEN-LAST:event_TxtNamlengActionPerformed

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
            java.util.logging.Logger.getLogger(Akhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Akhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Akhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Akhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Akhir().setVisible(true);
                new Akhir().setSize(600, 600);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bulan;
    private javax.swing.JButton Close;
    private javax.swing.JButton JbBack;
    private javax.swing.JButton JbOke;
    private javax.swing.JComboBox<String> JcbJumtik;
    private javax.swing.JLabel Jenistiket;
    private javax.swing.JComboBox<String> Tahun;
    private javax.swing.JComboBox<String> Tanggal;
    private javax.swing.JTextField TxtHartik;
    private javax.swing.JTextField TxtNamleng;
    private javax.swing.JTextField TxtNik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbTambah;
    private javax.swing.JComboBox<String> tJenisTiket;
    // End of variables declaration//GEN-END:variables

    private int String(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
