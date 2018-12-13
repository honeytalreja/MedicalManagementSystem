
package home;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        UL = new javax.swing.JLabel();
        PL = new javax.swing.JLabel();
        LogIn = new javax.swing.JButton();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adarsh Medical");
        setBounds(new java.awt.Rectangle(250, 250, 0, 0));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        Login.setBackground(new java.awt.Color(89, 110, 222));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        Password.setPreferredSize(new java.awt.Dimension(10, 32));

        UL.setBackground(new java.awt.Color(255, 255, 255));
        UL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        UL.setForeground(new java.awt.Color(255, 255, 255));
        UL.setText("Username :");

        PL.setBackground(new java.awt.Color(255, 255, 255));
        PL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PL.setForeground(new java.awt.Color(255, 255, 255));
        PL.setText("Password :");

        LogIn.setBackground(new java.awt.Color(51, 0, 153));
        LogIn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LogIn.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.setText("LogIn");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        LogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LogInKeyReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout LoginLayout = new org.jdesktop.layout.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginLayout.createSequentialGroup()
                        .add(UL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(94, 94, 94))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginLayout.createSequentialGroup()
                        .add(Username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)))
                .add(LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LoginLayout.createSequentialGroup()
                        .add(Password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(LogIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(27, 27, 27))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(PL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(UL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(LoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LogIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(61, 61, 61))
        );

        Image.setBackground(new java.awt.Color(34, 30, 159));
        Image.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/ss.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout bgLayout = new org.jdesktop.layout.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Login, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Image, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, bgLayout.createSequentialGroup()
                .add(43, 43, 43)
                .add(Login, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE)
                .add(Image)
                .add(0, 0, 0))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_UsernameActionPerformed

  private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
    // TODO add your handling code here:
		String un = Username.getText();
		String pw = Password.getText();
		if(un.equals("root") && pw.equals("root")) {
			Home h = null;
        try {
            h = new Home();
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
			h.setVisible(true);
			h.setSize(1280, 700);
//                        h.ExpModule.start();
//                        h.SearchModule.start();
			
			
		}
  }//GEN-LAST:event_LogInActionPerformed

    private void LogInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogInKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LogInKeyReleased

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton LogIn;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel PL;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel UL;
    private javax.swing.JTextField Username;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables

}
