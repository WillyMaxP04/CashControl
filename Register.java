package com.clases;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    ArbolBinario arbol;
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void RecibirUsuarios(ArbolBinario arbol){
        this.arbol = arbol;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        InicioBtn = new javax.swing.JPanel();
        IncioTxt = new javax.swing.JLabel();
        RegistroBtn = new javax.swing.JPanel();
        RegistroTxt = new javax.swing.JLabel();
        BgTxt = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        NameTxt = new javax.swing.JTextField();
        MailTxt = new javax.swing.JTextField();
        ConfirmTxt = new javax.swing.JTextField();
        PassTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 252, 228));

        InicioBtn.setBackground(new java.awt.Color(133, 252, 216));
        InicioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioBtnMouseClicked(evt);
            }
        });

        IncioTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IncioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IncioTxt.setText("INICIAR SESIÓN");
        IncioTxt.setMaximumSize(new java.awt.Dimension(130, 60));
        IncioTxt.setMinimumSize(new java.awt.Dimension(130, 60));

        javax.swing.GroupLayout InicioBtnLayout = new javax.swing.GroupLayout(InicioBtn);
        InicioBtn.setLayout(InicioBtnLayout);
        InicioBtnLayout.setHorizontalGroup(
            InicioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IncioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InicioBtnLayout.setVerticalGroup(
            InicioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioBtnLayout.createSequentialGroup()
                .addComponent(IncioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        RegistroBtn.setBackground(new java.awt.Color(128, 206, 184));
        RegistroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroBtnMouseClicked(evt);
            }
        });

        RegistroTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegistroTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistroTxt.setText("REGISTRARSE");

        javax.swing.GroupLayout RegistroBtnLayout = new javax.swing.GroupLayout(RegistroBtn);
        RegistroBtn.setLayout(RegistroBtnLayout);
        RegistroBtnLayout.setHorizontalGroup(
            RegistroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistroTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        RegistroBtnLayout.setVerticalGroup(
            RegistroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegistroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BgTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BgTxt.setText("OR");

        UserTxt.setBackground(new java.awt.Color(217, 217, 217));
        UserTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        UserTxt.setText("Usuario");
        UserTxt.setToolTipText("");
        UserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTxtMousePressed(evt);
            }
        });

        NameTxt.setBackground(new java.awt.Color(217, 217, 217));
        NameTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        NameTxt.setText("Nombre Completo");
        NameTxt.setToolTipText("");
        NameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NameTxtMousePressed(evt);
            }
        });

        MailTxt.setBackground(new java.awt.Color(217, 217, 217));
        MailTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        MailTxt.setText("Correo Electronico");
        MailTxt.setToolTipText("");
        MailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MailTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MailTxtMousePressed(evt);
            }
        });

        ConfirmTxt.setBackground(new java.awt.Color(217, 217, 217));
        ConfirmTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ConfirmTxt.setText("Repite la Contraseña");
        ConfirmTxt.setToolTipText("");
        ConfirmTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfirmTxtMousePressed(evt);
            }
        });

        PassTxt.setBackground(new java.awt.Color(217, 217, 217));
        PassTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        PassTxt.setText("Contraseña");
        PassTxt.setToolTipText("");
        PassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassTxtMousePressed(evt);
            }
        });
        PassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(MailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(ConfirmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMouseClicked

    }//GEN-LAST:event_UserTxtMouseClicked

    private void UserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMousePressed
        if(UserTxt.getText().equals("Usuario")){
            UserTxt.setText("");
            UserTxt.setForeground(Color.black);
        }
        
        
    }//GEN-LAST:event_UserTxtMousePressed

    private void NameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtMouseClicked

    private void NameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameTxtMousePressed
        if(NameTxt.getText().equals("Nombre Completo")){
            NameTxt.setText("");
            NameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_NameTxtMousePressed

    private void MailTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MailTxtMouseClicked

    private void MailTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailTxtMousePressed
        if(MailTxt.getText().equals("Correo Electronico")){
            MailTxt.setText("");
            MailTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_MailTxtMousePressed

    private void ConfirmTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmTxtMouseClicked

    private void ConfirmTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmTxtMousePressed
        if(ConfirmTxt.getText().equals("Repite la Contraseña")){
            ConfirmTxt.setText("");
            ConfirmTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfirmTxtMousePressed

    private void PassTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtMouseClicked

    private void PassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMousePressed
        if(PassTxt.getText().equals("Contraseña")){
            PassTxt.setText("");
            PassTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_PassTxtMousePressed

    private void PassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTxtActionPerformed

    }//GEN-LAST:event_PassTxtActionPerformed

    private void InicioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioBtnMouseClicked
        Login login = new Login();
        login.RecibirUsuarios(arbol);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioBtnMouseClicked

    private void RegistroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroBtnMouseClicked
        //Ver si ese usuario ya existe
        Usuario existente = arbol.buscarUsuarioPorNickname(UserTxt.getText());
        if (existente != null){
            JOptionPane.showMessageDialog(null, "Este usuario ya existe");
        }else{
            //Ver si la contraseña y su confirmacion son iguales
            if(PassTxt.getText().equals(ConfirmTxt.getText())){
                Usuario nuevo = new Usuario(NameTxt.getText(),UserTxt.getText(),MailTxt.getText(),PassTxt.getText());
                arbol.insertar(nuevo);
                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                Login login = new Login();
                login.RecibirUsuarios(arbol);
                login.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_RegistroBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BgTxt;
    private javax.swing.JTextField ConfirmTxt;
    private javax.swing.JLabel IncioTxt;
    private javax.swing.JPanel InicioBtn;
    private javax.swing.JTextField MailTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JPanel RegistroBtn;
    private javax.swing.JLabel RegistroTxt;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}
