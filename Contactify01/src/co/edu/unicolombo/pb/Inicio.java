
package co.edu.unicolombo.pb;

import Conexion.conexionSQL;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Inicio extends javax.swing.JFrame {
    
    conexionSQL cc=new conexionSQL();
    Connection ubd=cc.conexion();
    
    int xMouse, yMouse; 
    public Inicio() {
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

        jLabel7 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Usertxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Contraseñatxt = new javax.swing.JPasswordField();
        ExitButton = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        EntrBtn = new javax.swing.JPanel();
        EntrTxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        registroTxt = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LogoM (1).png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(72, 72));
        jLabel5.setMinimumSize(new java.awt.Dimension(72, 72));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, 110));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FoodScout");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LogoM (2).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo-pinceladas-azules.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 0, 170, 310));

        Usertxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Usertxt.setForeground(new java.awt.Color(204, 204, 204));
        Usertxt.setText("Ingrese su nombre de usuario");
        Usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsertxtMousePressed(evt);
            }
        });
        jPanel1.add(Usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("Usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Contraseñatxt.setForeground(new java.awt.Color(204, 204, 204));
        Contraseñatxt.setText("***************");
        Contraseñatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñatxtMousePressed(evt);
            }
        });
        Contraseñatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñatxtActionPerformed(evt);
            }
        });
        jPanel1.add(Contraseñatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });

        ExitTxt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("x");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ExitButtonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ExitButtonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        barraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        EntrBtn.setBackground(new java.awt.Color(46, 49, 146));
        EntrBtn.setForeground(new java.awt.Color(220, 249, 255));
        EntrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrBtnMouseEntered(evt);
            }
        });

        EntrTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        EntrTxt.setForeground(new java.awt.Color(255, 255, 255));
        EntrTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrTxt.setText("ENTRAR");
        EntrTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EntrBtnLayout = new javax.swing.GroupLayout(EntrBtn);
        EntrBtn.setLayout(EntrBtnLayout);
        EntrBtnLayout.setHorizontalGroup(
            EntrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntrBtnLayout.createSequentialGroup()
                .addComponent(EntrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EntrBtnLayout.setVerticalGroup(
            EntrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntrBtnLayout.createSequentialGroup()
                .addComponent(EntrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(EntrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        registroTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        registroTxt.setForeground(new java.awt.Color(51, 51, 255));
        registroTxt.setText("Registrarse");
        registroTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroTxtMouseClicked(evt);
            }
        });
        jPanel1.add(registroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ValidarUsuario(){
       
        int resultado=0;
        String pass = String.valueOf(Contraseñatxt.getPassword());
        String usuario = Usertxt.getText();
        String SQL = "select * from usuarios where usuario = '"+usuario+"' and contraseña='"+pass+"'";
        
        try{
            
            Statement st=(Statement) ubd.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if (rs.next()){
                
                resultado=1;
                
                if(resultado==1){
                    Contac cnt = new Contac();
                    cnt.setVisible(true);
                    this.setVisible(false);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error de acceso, usuario no registrado");
            }
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error" +e.getMessage());
        }
    }
        
    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); 
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        ExitButton.setBackground(Color.red);
        ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        
    }//GEN-LAST:event_ExitButtonMouseExited

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        ExitButton.setBackground(Color.white);
        ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void EntrBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrBtnMouseEntered
        
    }//GEN-LAST:event_EntrBtnMouseEntered

    private void EntrTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrTxtMouseExited
        EntrBtn.setBackground(new Color(46, 49, 146));
    }//GEN-LAST:event_EntrTxtMouseExited

    private void EntrTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrTxtMouseEntered
        EntrBtn.setBackground(new Color(80, 86, 255));
    }//GEN-LAST:event_EntrTxtMouseEntered

    private void ContraseñatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñatxtActionPerformed

    private void UsertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsertxtMousePressed
        if (Usertxt.getText().equals("Ingrese su nombre de usuario")) {
            Usertxt.setText("");
            Usertxt.setForeground(Color.black);
        }
        if (String.valueOf(Contraseñatxt.getPassword()).isEmpty()) {
            Contraseñatxt.setText("***************");
            Contraseñatxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsertxtMousePressed

    private void ContraseñatxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñatxtMousePressed
        if (String.valueOf(Contraseñatxt.getPassword()).equals("***************")) {
            Contraseñatxt.setText("");
            Contraseñatxt.setForeground(Color.black);
        }
        if (Usertxt.getText().isEmpty()) {
            Usertxt.setText("Ingrese su nombre de usuario");
            Usertxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContraseñatxtMousePressed

    private void registroTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroTxtMouseClicked
        Validacion val = new Validacion();
        val.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registroTxtMouseClicked

    private void EntrTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrTxtMouseClicked
        ValidarUsuario();
    }//GEN-LAST:event_EntrTxtMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseñatxt;
    private javax.swing.JPanel EntrBtn;
    private javax.swing.JLabel EntrTxt;
    private javax.swing.JPanel ExitButton;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JTextField Usertxt;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel registroTxt;
    // End of variables declaration//GEN-END:variables
}
