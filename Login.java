package com.clases;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    ArbolBinario usu;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void RecibirUsuarios(ArbolBinario arbol){
        this.usu = arbol;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        InicioBtn = new javax.swing.JPanel();
        IncioTxt = new javax.swing.JLabel();
        RegistroBtn = new javax.swing.JPanel();
        RegistroTxt = new javax.swing.JLabel();
        BgTxt = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        PassTxt = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 252, 228));

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

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Cerdo2.png"))); // NOI18N

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PassTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(InicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(InicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroBtnMouseClicked
        Register r = new Register();
        r.RecibirUsuarios(usu);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroBtnMouseClicked

    private void UserTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMouseClicked

    }//GEN-LAST:event_UserTxtMouseClicked

    private void UserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMousePressed
        if(UserTxt.getText().equals("Usuario")){
            UserTxt.setText("");
            UserTxt.setForeground(Color.black);
        }

    }//GEN-LAST:event_UserTxtMousePressed

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
        //Confirmar si existe el usuario
        Usuario existente = usu.buscarUsuarioPorNickname(UserTxt.getText());
        if(existente == null){
            JOptionPane.showMessageDialog(null, "Este usuario no existe");
        }else{
            if(PassTxt.getText().equals(existente.getClave())){
                Menu menu = new Menu();
                menu.setUsuario(existente);
                menu.SetSaludo();
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Clave/Nombre de usuario incorrecto(s)");
            }
        }
    }//GEN-LAST:event_InicioBtnMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel BgTxt;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel IncioTxt;
    private javax.swing.JPanel InicioBtn;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JPanel RegistroBtn;
    private javax.swing.JLabel RegistroTxt;
    private javax.swing.JTextField UserTxt;
    // End of variables declaration//GEN-END:variables
}
