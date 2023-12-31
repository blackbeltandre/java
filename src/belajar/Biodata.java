/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mac
 */
public class Biodata extends javax.swing.JFrame {
DefaultTableModel tabModel;
ResultSet RsBiodata=null;
  
    public Biodata() {
        initComponents();
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=this.getSize();
        if(frameSize.height > screenSize.height){
        frameSize.height=screenSize.height;
        }
        if(frameSize.width > screenSize.width){
        frameSize.width=screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
        (screenSize.height = screenSize.height) / 20); 
        
        //fungsi Tampil data dan set edit off dijalankan saat aplikasi di run
        tampilData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelJudul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNamaLengkap = new javax.swing.JTextField();
        jTextFieldTempatLahir = new javax.swing.JTextField();
        jTextFieldTanggalLahir = new javax.swing.JTextField();
        jTextFieldNik = new javax.swing.JTextField();
        jTextFieldJurusan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlamat = new javax.swing.JTextArea();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBiodata = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNo_hp = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJudul.setText("FORM BIODATA");

        jLabel1.setText("Nama Lengkap");

        jLabel2.setText("Tempat Lahir");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("Nik");

        jLabel5.setText("Alamat");

        jLabel6.setText("Jurusan");

        jTextFieldNamaLengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaLengkapActionPerformed(evt);
            }
        });

        jTextFieldTanggalLahir.setToolTipText("");

        jTextFieldJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJurusanActionPerformed(evt);
            }
        });

        jTextAreaAlamat.setColumns(20);
        jTextAreaAlamat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAlamat);

        jButtonSimpan.setText("Save");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Cancel");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jTableBiodata.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableBiodata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBiodataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBiodata);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        jLabel8.setText("No.HP");

        jMenu1.setText("File");

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenu1.add(home);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuItem1.setText("List");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(790, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(98, 98, 98))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(92, 92, 92)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(61, 61, 61))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(jButtonSimpan)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(96, 96, 96))
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBatal)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDelete))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNamaLengkap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTempatLahir)
                            .addComponent(jTextFieldTanggalLahir)
                            .addComponent(jTextFieldJurusan)
                            .addComponent(jTextFieldNik)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldNo_hp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(24, 24, 24)
                                .addComponent(jTextFieldTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jTextFieldNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldNo_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSimpan)
                            .addComponent(jButtonBatal)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonUpdate))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tampilData(){
        try{
            Object[] judul_kolom = {"ID","Nama Lengkap", "Tempat Lahir", "Tanggal Lahir", "Nik", "Alamat","Jurusan","No HP","Email"};
            tabModel=new DefaultTableModel(null,judul_kolom);
            jTableBiodata.setModel(tabModel);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsBiodata=stt.executeQuery("SELECT * from biodata order by id desc ");  
            while(RsBiodata.next()){
                Object[] data={
                    RsBiodata.getString("id"),
                    RsBiodata.getString("nama_lengkap"),
                    RsBiodata.getString("tempat_lahir"),
                    RsBiodata.getString("tanggal_lahir"),
                    RsBiodata.getString("nik"),
                    RsBiodata.getString("alamat"),
                    RsBiodata.getString("jurusan"),
                    RsBiodata.getString("no_hp"),
                    RsBiodata.getString("email"),
                };
               
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    private void jTextFieldNamaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaLengkapActionPerformed

    private void jTextFieldJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJurusanActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String NamaLengkap=jTextFieldNamaLengkap.getText();
        String TempatLahir=jTextFieldTempatLahir.getText();
        String TanggalLahir=jTextFieldTanggalLahir.getText();
        String Nik=jTextFieldNik.getText();
        String Alamat=jTextAreaAlamat.getText();
        String Jurusan=jTextFieldJurusan.getText();
        String NoHp=jTextFieldNo_hp.getText();
        String Email=jTextFieldEmail.getText();
        
        if (NamaLengkap.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Nama Lengkap tidak boleh kosong");
            jTextFieldNamaLengkap.requestFocus();
        }
        else if (NoHp.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"No Hp tidak boleh kosong");
            jTextFieldNo_hp.requestFocus();
        }
        else if (Email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Email tidak boleh kosong");
            jTextFieldEmail.requestFocus();
        }
        else if (TanggalLahir.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tanggal Lahir tidak boleh kosong");
            jTextFieldTanggalLahir.requestFocus();
        }
        else if (TempatLahir.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tempat Lahir tidak boleh kosong");
            jTextFieldTempatLahir.requestFocus();
        }
        else if (Nik.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Nik tidak boleh kosong");
            jTextFieldNik.requestFocus();
        }
         else if ( Nik.length()>17) {
            JOptionPane.showMessageDialog(null,"Nik tidak boleh lebih dari 17");
            jTextFieldNik.requestFocus();
        }
        else if (Alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Alamat tidak boleh kosong");
            jTextAreaAlamat.requestFocus();
        }
        else if (Jurusan.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Jurusan tidak boleh kosong");
            jTextFieldJurusan.requestFocus();
        }
        else{
         try{
                Connection conn=(Connection)koneksi.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("insert into biodata(nama_lengkap,tempat_lahir,tanggal_lahir,nik,alamat,jurusan,no_hp,email)"+
                    "VALUES('"+NamaLengkap+"','"+TempatLahir+"','"+TanggalLahir+"','"+Nik+"','"+Alamat+"','"+Jurusan+"','"+NoHp+"','"+Email+"')");
                 JOptionPane.showMessageDialog(this,"Data berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
                    tampilData();} 
            catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Data gagal di simpan\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonSimpanActionPerformed
    }
    private void BersihData(){
        jTextFieldNamaLengkap.setText("");
        jTextFieldTempatLahir.setText("");
        jTextFieldTanggalLahir.setText("");
        jTextFieldNik.setText(""); 
        jTextAreaAlamat.setText("");
        jTextFieldJurusan.setText("");
        jTextFieldNo_hp.setText("");
        jTextFieldEmail.setText("");
    } 
   
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Biodata.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ready");
        new Biodata().setVisible(true);   
    }//GEN-LAST:event_homeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ready");
        new FrmLogin().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String NIK=jTextFieldNik.getText();
        if (NIK.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"NIK tidak boleh kosong");
            jTextFieldNik.requestFocus();
        }else if(JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan menghapus data ini?",
            "Informasi",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.OK_OPTION){
        try{
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            stt.executeUpdate("DELETE FROM biodata WHERE nik='"+NIK+"'");
            BersihData();
            tampilData();
            JOptionPane.showMessageDialog(this,"Data berhasil di hapus","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Delete data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed
 void tblKeForm(){
        jTextFieldNamaLengkap.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),1)+"");
        jTextFieldTempatLahir.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),2)+"");
        jTextFieldTanggalLahir.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),3)+"");
        jTextFieldNik.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),4)+"");
        jTextAreaAlamat.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),5)+"");
        jTextFieldJurusan.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),6)+"");
        jTextFieldNo_hp.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),7)+"");
        jTextFieldEmail.setText(tabModel.getValueAt(jTableBiodata.getSelectedRow(),8)+"");
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonBatal.setEnabled(true);
        jButtonSimpan.setEnabled(false);
    }
   
    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
        BersihData();
        
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jTableBiodataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBiodataMouseClicked
        // TODO add your handling code here:
        seteditOn();
        jTextFieldNik.setEnabled(false);
        tblKeForm();
    }//GEN-LAST:event_jTableBiodataMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String NamaLengkap=jTextFieldNamaLengkap.getText();
        String TempatLahir=jTextFieldTempatLahir.getText();
        String TanggalLahir=jTextFieldTanggalLahir.getText();
        String Nik=jTextFieldNik.getText();
        String Alamat=jTextAreaAlamat.getText();
        String Jurusan=jTextFieldJurusan.getText();
        String NoHp=jTextFieldNo_hp.getText();
        String Email=jTextFieldEmail.getText();
        
        if (NamaLengkap.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Nama Lengkap tidak boleh kosong");
            jTextFieldNamaLengkap.requestFocus();
        }
        else if (NoHp.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"No Hp tidak boleh kosong");
            jTextFieldNo_hp.requestFocus();
        }
        else if (Email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Email tidak boleh kosong");
            jTextFieldEmail.requestFocus();
        }
        else if (TempatLahir.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tempat Lahir tidak boleh kosong");
            jTextFieldTempatLahir.requestFocus();
        }
        else if (TanggalLahir.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tanggal Lahir tidak boleh kosong");
            jTextFieldTanggalLahir.requestFocus();
        }
        else if (Nik.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nik tidak boleh kosong");
            jTextFieldNik.requestFocus();
        }
        else if (Alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Alamat tidak boleh kosong");
            jTextAreaAlamat.requestFocus();
        }
        else if (Jurusan.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Jurusan tidak boleh kosong");
            jTextFieldJurusan.requestFocus();
        }else{
            try{
                Connection conn=(Connection)koneksi.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("UPDATE biodata SET nama_lengkap='"+NamaLengkap+"', tempat_lahir='"+TempatLahir+"', tanggal_lahir='"+TanggalLahir+"',"+
                    "alamat='"+Alamat+"',"+
                    "jurusan='"+Jurusan+"',"+
                    "no_hp='"+NoHp+"',"+
                    "email='"+Email+"' WHERE nik='"+Nik+"'");
                BersihData();
                tampilData();
                JOptionPane.showMessageDialog(this,"Data berhasil diubah","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Ubah data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Biodata.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ready");
        new List().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
 private void seteditOn(){
        jTextFieldNamaLengkap.setEnabled(true);
        jTextFieldTempatLahir.setEnabled(true);
        jTextFieldTanggalLahir.setEnabled(true);
        jTextFieldNik.setEnabled(true);
        jTextAreaAlamat.setEnabled(true);
        jTextFieldJurusan.setEnabled(true);
        jTextFieldNo_hp.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem home;
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableBiodata;
    private javax.swing.JTextArea jTextAreaAlamat;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldJurusan;
    private javax.swing.JTextField jTextFieldNamaLengkap;
    private javax.swing.JTextField jTextFieldNik;
    private javax.swing.JTextField jTextFieldNo_hp;
    private javax.swing.JTextField jTextFieldTanggalLahir;
    private javax.swing.JTextField jTextFieldTempatLahir;
    // End of variables declaration//GEN-END:variables
}
