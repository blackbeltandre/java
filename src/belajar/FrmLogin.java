package belajar;

import javax.swing.JLabel;
import java.sql.Connection;
import java.net.URL;
import javax.swing.JOptionPane;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FrmLogin extends javax.swing.JFrame implements Runnable{
    String user = "admin";
     String pass = "123";
    
   private Connection con;
   JLabel pic;
    Timer tm;
     Thread T;
    boolean kanan = true; 
    boolean kiri = false ;
    boolean berjalan = true;
    int z, a;
    int x = 0;
     String[] list = {
                     ""
                    };
        public void SetImageSize(int i){
       
    }
    public FrmLogin() {
        pic = new JLabel();
        pic.setBounds(20, 30, 550, 440);
       SetImageSize(2);
        tm = new Timer(3000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       initComponents();
        this.setLocationRelativeTo(this);
        z = sambutan.getX();
        a = sambutan.getY();
        T = new Thread(this);
        T.start();
       
          txtPassword.setEchoChar('*');
    }
    @Override
    public void run(){
         JOptionPane.showMessageDialog(null, " Administrator Area,silahkan masuk untuk memulai!");
        while(true){
            if(berjalan){
                if(z >= jPanel1.getWidth()-310){  // Sesuaikan dengan ukuran text kalian
                    kiri = true;
                    kanan = false;
                } 
                if(kiri){
                    z -- ;
                    sambutan.setLocation(z,a);
                }
                if(z<=5){
                    kanan = true;
                    kiri = false;
                }
                if(kanan){
                    z++;
                    sambutan.setLocation(z,a);
                }
            }
            try {
                Thread.sleep(10);
            }catch (InterruptedException ex){
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE,null, ex);
            }
            repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        ClearForm = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        checkTampilPassword = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        sambutan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        lbJudul = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel1.setFont(new java.awt.Font("David", 1, 10)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("David", 1, 10)); // NOI18N
        jLabel2.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        ClearForm.setText("Clear");
        ClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFormActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        checkTampilPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkTampilPassword.setText("Show Password");
        checkTampilPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTampilPasswordActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        sambutan.setText("Silahkan masukkan username dan password anda !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkTampilPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sambutan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ClearForm)))
                        .addGap(18, 18, 18)
                        .addComponent(Exit)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTampilPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(ClearForm)
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sambutan))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 570, -1));
        jPanel1.getAccessibleContext().setAccessibleName("Please Login First!");

        jLabel4.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N
        jLabel4.setText("Copyright No Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 197, 53));
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 6, -1, 468));

        lbJudul.setBackground(new java.awt.Color(0, 0, 0));
        lbJudul.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbJudul.setForeground(new java.awt.Color(102, 102, 102));
        lbJudul.setText("Login Form");
        getContentPane().add(lbJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 407, -1));

        progressbar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1028, 481, 68, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 6, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, -40, -1, -1));
        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("Administrator Area");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
                      
        if (txtUsername.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username harus di isi.", "Login Gagal", JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
            progressbar.setValue(100);
            progressbar.setVisible(true);
            }
        
            else if (txtPassword.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pasword harus di isi.", "Login Gagal", JOptionPane.WARNING_MESSAGE);
            txtPassword.requestFocus();
            progressbar.setValue(100);
            progressbar.setVisible(true);
            }
            else if(user.equalsIgnoreCase(txtUsername.getText()) && pass.equalsIgnoreCase(txtPassword.getText())){
               JOptionPane.showMessageDialog(null, "Username & password sesuai ,tekan ok untuk melanjutkan.", "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                progressbar.setValue(100);
                progressbar.setVisible(true);
                 this.setVisible(false);
                this.dispose();
                new Biodata().setVisible(true);
                  JOptionPane.showMessageDialog(null, "Selamat datang.", "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                } 
                else
                {
                JOptionPane.showMessageDialog(null, "Username dan password salah.", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                txtUsername.setText("");
                txtUsername.requestFocus();
                txtPassword.setText("");
                txtPassword.requestFocus();
                progressbar.setValue(100);
            progressbar.setVisible(true);
            }      
         
    }//GEN-LAST:event_btnLoginActionPerformed

    private void ClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFormActionPerformed
        // TODO add your handling code here:
                txtUsername.setText("");
                txtUsername.requestFocus();
                txtPassword.setText("");
                txtPassword.requestFocus();
                
    }//GEN-LAST:event_ClearFormActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    int selectedOption = JOptionPane.showConfirmDialog(null,
    "Anda ingin menutup program?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
    if (selectedOption == JOptionPane.YES_OPTION) {
    System.exit(0);
    }
    }//GEN-LAST:event_ExitActionPerformed

    private void checkTampilPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTampilPasswordActionPerformed
        if (checkTampilPassword.isSelected())
        {
            txtPassword.setEchoChar((char)0); 
        }
        else
        {
            txtPassword.setEchoChar('*');
        }          
    }//GEN-LAST:event_checkTampilPasswordActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
if (txtUsername.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username harus di isi.", "Login Gagal", JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
             progressbar.setValue(100);
            progressbar.setVisible(true);
            }
            else if (txtPassword.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pasword harus di isi.", "Login Gagal", JOptionPane.WARNING_MESSAGE);
            txtPassword.requestFocus();
             progressbar.setValue(100);
            progressbar.setVisible(true);
            }
            else if(user.equalsIgnoreCase(txtUsername.getText()) && pass.equalsIgnoreCase(txtPassword.getText())){
                 progressbar.setValue(100);
            progressbar.setVisible(true);
               JOptionPane.showMessageDialog(null, "Username & password sesuai ,tekan ok untuk melanjutkan.", "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.dispose();
                new Biodata().setVisible(true);
                 JOptionPane.showMessageDialog(null, "'"+user+"'"+" ,Selamat datang ");
                dispose();
                
                } 
                else
                {
                JOptionPane.showMessageDialog(null, "Username dan password salah.", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                txtUsername.setText("");
                txtUsername.requestFocus();
                txtPassword.setText("");
                txtPassword.requestFocus();
            }              // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try {
               //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
             //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            // start the demo application
            
            new FrmLogin();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // end main
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearForm;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkTampilPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbJudul;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel sambutan;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
