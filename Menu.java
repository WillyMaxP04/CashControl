package com.clases;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    Usuario usuario;
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setUsuario(Usuario usuario){
       this.usuario = usuario;
    } 
    
    public void SetSaludo (){
        UserHi.setText("Hello, "+usuario.getNombre());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        MenuTxt = new javax.swing.JLabel();
        ProfileIcon = new javax.swing.JLabel();
        NameTxt = new javax.swing.JLabel();
        NameTxt2 = new javax.swing.JLabel();
        UserHi = new javax.swing.JLabel();
        AhorroBtn = new javax.swing.JPanel();
        AhorroTxt = new javax.swing.JLabel();
        IngreBtn = new javax.swing.JPanel();
        IngreTxt = new javax.swing.JLabel();
        GastoBtn = new javax.swing.JPanel();
        GastoTxt = new javax.swing.JLabel();
        DashBoardBtn = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(213, 245, 228));

        MenuTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        MenuTxt.setForeground(new java.awt.Color(73, 94, 107));
        MenuTxt.setText("MENU");

        ProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Profile.png"))); // NOI18N

        NameTxt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        NameTxt.setForeground(new java.awt.Color(73, 94, 107));
        NameTxt.setText("CashControl");

        NameTxt2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        NameTxt2.setText("____________________________________");

        UserHi.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        UserHi.setForeground(new java.awt.Color(73, 94, 107));
        UserHi.setText("Hello ____");

        AhorroBtn.setBackground(new java.awt.Color(255, 228, 155));
        AhorroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AhorroBtnMouseClicked(evt);
            }
        });

        AhorroTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        AhorroTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AhorroTxt.setText("Meta de Ahorro");

        javax.swing.GroupLayout AhorroBtnLayout = new javax.swing.GroupLayout(AhorroBtn);
        AhorroBtn.setLayout(AhorroBtnLayout);
        AhorroBtnLayout.setHorizontalGroup(
            AhorroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AhorroTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AhorroBtnLayout.setVerticalGroup(
            AhorroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AhorroBtnLayout.createSequentialGroup()
                .addComponent(AhorroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        IngreBtn.setBackground(new java.awt.Color(118, 209, 190));
        IngreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngreBtnMouseClicked(evt);
            }
        });

        IngreTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        IngreTxt.setForeground(new java.awt.Color(246, 245, 243));
        IngreTxt.setText("        Lista de Ingresos");

        javax.swing.GroupLayout IngreBtnLayout = new javax.swing.GroupLayout(IngreBtn);
        IngreBtn.setLayout(IngreBtnLayout);
        IngreBtnLayout.setHorizontalGroup(
            IngreBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngreBtnLayout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(IngreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IngreBtnLayout.setVerticalGroup(
            IngreBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        GastoBtn.setBackground(new java.awt.Color(244, 169, 157));
        GastoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GastoBtnMouseClicked(evt);
            }
        });

        GastoTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        GastoTxt.setForeground(new java.awt.Color(246, 245, 243));
        GastoTxt.setText("        Lista de Gastos");

        javax.swing.GroupLayout GastoBtnLayout = new javax.swing.GroupLayout(GastoBtn);
        GastoBtn.setLayout(GastoBtnLayout);
        GastoBtnLayout.setHorizontalGroup(
            GastoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GastoBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GastoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GastoBtnLayout.setVerticalGroup(
            GastoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GastoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        DashBoardBtn.setBackground(new java.awt.Color(118, 209, 190));

        javax.swing.GroupLayout DashBoardBtnLayout = new javax.swing.GroupLayout(DashBoardBtn);
        DashBoardBtn.setLayout(DashBoardBtnLayout);
        DashBoardBtnLayout.setHorizontalGroup(
            DashBoardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashBoardBtnLayout.setVerticalGroup(
            DashBoardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(NameTxt2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MenuTxt)
                                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProfileIcon))
                            .addComponent(UserHi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AhorroBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngreBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GastoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DashBoardBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProfileIcon)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(MenuTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameTxt)))
                .addGap(1, 1, 1)
                .addComponent(NameTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserHi)
                .addGap(18, 18, 18)
                .addComponent(AhorroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GastoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IngreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashBoardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void IngreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreBtnMouseClicked
        ListaIngresos Ingresos = new ListaIngresos();
        Ingresos.setUsuarioI(usuario);
        Ingresos.setTotal();
        Ingresos.setLista();
        Ingresos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngreBtnMouseClicked

    private void GastoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GastoBtnMouseClicked
        ListaGastos gastos = new ListaGastos();
        gastos.setUsuarioG(usuario);
        gastos.setTotal();
        gastos.setListaG();
        gastos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GastoBtnMouseClicked

    private void AhorroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AhorroBtnMouseClicked
        if(usuario.Ahorros.getMetaAhorro() == 0) {
            usuario.EstablecerMeta();
            JOptionPane.showMessageDialog(null,"Nueva meta de ahorro de: $"+usuario.Ahorros.getMetaAhorro()+". Creada a partir de tu información actual.");
        }
        
        AhorroCreado ahorros = new AhorroCreado();
        ahorros.obtenerUsuario(usuario);
        ahorros.EditValores();
        ahorros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AhorroBtnMouseClicked
 
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AhorroBtn;
    private javax.swing.JLabel AhorroTxt;
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel DashBoardBtn;
    private javax.swing.JPanel GastoBtn;
    private javax.swing.JLabel GastoTxt;
    private javax.swing.JPanel IngreBtn;
    private javax.swing.JLabel IngreTxt;
    private javax.swing.JLabel MenuTxt;
    private javax.swing.JLabel NameTxt;
    private javax.swing.JLabel NameTxt2;
    private javax.swing.JLabel ProfileIcon;
    private javax.swing.JLabel UserHi;
    // End of variables declaration//GEN-END:variables
}
