/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;

import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Karyawan extends javax.swing.JFrame {

    private void kosongkan_form(){
        txtNIK.setEditable(true);
        txtNIK.setText(null);
        txtNama.setText(null);
        cbJabatan.setSelectedItem(this);
        txtAlamat.setText(null);
        txtEmail.setText(null);
        txtTelp.setText(null);
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("NIP");
        model.addColumn("Nama Karyawan");
        model.addColumn("Jabatan");
        model.addColumn("Alamat");
        model.addColumn("Email");
        model.addColumn("No. Telpon");
        
        try{
            int no = 1;
            String sql= "SELECT * FROM karyawan";
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
                
            }
            tabelKaryawan.setModel(model);
                    
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    /**
     * Creates new form Karyawan
     */
    public Karyawan() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNIK = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cbJabatan = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Karyawan");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA KARYAWAN");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 604, -1));

        jLabel2.setText("NIK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 59, -1, -1));

        jLabel3.setText("Nama Karyawan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 97, -1, -1));

        jLabel4.setText("Jabatan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 135, -1, -1));

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 176, -1, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 214, -1, -1));

        jLabel7.setText("No. Telpon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 252, -1, -1));
        getContentPane().add(txtNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 56, 188, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 94, 409, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 173, 409, -1));

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT Engginer", "Network Administrator", "Database Administrator" }));
        getContentPane().add(cbJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 132, 409, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 211, 409, -1));
        getContentPane().add(txtTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 249, 409, -1));

        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelKaryawan);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 574, 116));

        tbTambah.setText("Tambah Data");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 287, -1, -1));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 287, -1, -1));

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 287, -1, -1));

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 287, -1, -1));

        tbBatal.setText("Batal");
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 287, -1, -1));

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 287, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO karyawan VALUES ('"+txtNIK.getText()+"','"+txtNama.getText()+"','"+cbJabatan.getSelectedItem()+"','"+txtAlamat.getText()+"','"+txtEmail.getText()+"','"+txtTelp.getText()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm =conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil..");
            tampilkan_data();
            kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage()); 
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        // TODO add your handling code here:
        int baris = tabelKaryawan.rowAtPoint(evt.getPoint());
        String nik = tabelKaryawan.getValueAt(baris, 1).toString();
        txtNIK.setText(nik);
        
        String nama = tabelKaryawan.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String jab = tabelKaryawan.getValueAt(baris, 3).toString();
        cbJabatan.setSelectedItem(jab);
        
        String alamat = tabelKaryawan.getValueAt(baris, 4).toString();
        txtAlamat.setText(alamat);
        
        String email = tabelKaryawan.getValueAt(baris, 5).toString();
        txtEmail.setText(email);
        
        String telp = tabelKaryawan.getValueAt(baris, 6).toString();
        txtTelp.setText(telp);
    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="UPDATE karyawan SET nik = '"+txtNIK.getText()+"', nama = '"+txtNama.getText()+"', jabatan = '"+cbJabatan.getSelectedItem()+"',alamat = '"+txtAlamat.getText()+"',email = '"+txtEmail.getText()+"',telp = '"+txtTelp.getText()+"' WHERE nik = '"+txtNIK.getText()+"'";
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM karyawan WHERE nik='"+txtNIK.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm =conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage()); 
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.Panel panel1;
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
