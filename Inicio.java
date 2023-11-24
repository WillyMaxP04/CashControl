package com.clases;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Icon = new javax.swing.JLabel();
        BgTxt2 = new javax.swing.JLabel();

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

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Cerdo.png"))); // NOI18N

        BgTxt2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        BgTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BgTxt2.setText("CashControl");

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
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Icon)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(BgTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BgTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioBtnMouseClicked
        ArbolBinario Usuarios = new ArbolBinario();
        Usuario usuario3 = new Usuario("Paula", "Paula", "pbustos323@outlook.com", "ean");
        usuario3.AñadirIngreso("Trabajo 1", "Efectivo",true,2000000f, 1, true);
        usuario3.AñadirIngreso("Arriendos", "Efectivo",true,154000f, 2, false);
        usuario3.AñadirGasto("Servicios","Transaccion", true, 254000f, 1, "Bancolombia");
        usuario3.AñadirGasto("seguro SOAT", "Transaccion", false,200000f, 3, "Bancolombia");
        usuario3.Ahorros.crearMeta(usuario3.calcu.DiferenciaDeValores());
        usuario3.Ahorros.IngresarDinero(690000);
        Usuarios.insertar(usuario3);
        Login login = new Login();
        login.RecibirUsuarios(Usuarios);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioBtnMouseClicked

    private void RegistroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroBtnMouseClicked
        ArbolBinario Usuarios = new ArbolBinario();
        Usuario usuario3 = new Usuario("Paula", "Paula", "pbustos323@outlook.com", "ean");
        usuario3.AñadirIngreso("Trabajo 1", "Efectivo",true,2000000f, 1, true);
        usuario3.AñadirIngreso("Arriendos", "Efectivo",true,154000f,2, false);
        usuario3.AñadirGasto("Servicios","Transaccion", true, 254000f,1, "Bancolombia");
        usuario3.AñadirGasto("seguro SOAT", "Transaccion", false,200000f, 3, "Bancolombia");
        Usuarios.insertar(usuario3);
        Register register = new Register();
        register.RecibirUsuarios(Usuarios);
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel BgTxt;
    private javax.swing.JLabel BgTxt2;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel IncioTxt;
    private javax.swing.JPanel InicioBtn;
    private javax.swing.JPanel RegistroBtn;
    private javax.swing.JLabel RegistroTxt;
    // End of variables declaration//GEN-END:variables
}
