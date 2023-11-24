package com.clases;

import javax.swing.JOptionPane;

public class ModGasto extends javax.swing.JFrame {
    Usuario usu;
    Egreso amodif,modif;
    String Categoria, MedioDePago,Entidad;
    Boolean TipoDeCiclo;
    Float Magnitud;
    int NumCuotas;

    
    public ModGasto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setUsuario(Usuario usuario,int NumGasto){
        this.usu = usuario;
        this.amodif = usu.getGasto(NumGasto);
        this.Categoria = amodif.getCategoria();
        this.MedioDePago = amodif.getMedioDePago();
        this.TipoDeCiclo = amodif.getTipoDeCiclo();
        this.Magnitud = amodif.Magnitud;
        this.NumCuotas = amodif.NumCuotas;
        this.Entidad = amodif.getEntidadFinanciera();
    }
    
    public void Setvalores(){
        CatFile.setText(Categoria);
        MedioFile.setText(MedioDePago);
        ValorFile.setText(Magnitud.toString());
        CuotasFile.setText(Integer.toString(NumCuotas));
        EntidadFile.setText(Entidad);
        if(TipoDeCiclo == true) {
            CicloC.setSelected(true);
        } else {
            CicloE.setSelected(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Tittle = new javax.swing.JLabel();
        CatFile = new javax.swing.JTextField();
        MedioFile = new javax.swing.JTextField();
        CicloC = new javax.swing.JRadioButton();
        CicloE = new javax.swing.JRadioButton();
        MedioTxt = new javax.swing.JLabel();
        CatTxt = new javax.swing.JLabel();
        CicloTxt = new javax.swing.JLabel();
        ValorTxt = new javax.swing.JLabel();
        ValorFile = new javax.swing.JTextField();
        CuotasTxt = new javax.swing.JLabel();
        CuotasFile = new javax.swing.JTextField();
        CrearBtn = new javax.swing.JPanel();
        CrearTxt = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JPanel();
        CancelTxt = new javax.swing.JLabel();
        Return = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        EntidadTxt = new javax.swing.JLabel();
        EntidadFile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 153, 153));

        Tittle.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("MODIFICAR GASTO");

        CatFile.setBackground(new java.awt.Color(217, 217, 217));
        CatFile.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        CatFile.setText("Categoria / Tipo");
        CatFile.setToolTipText("");
        CatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatFileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CatFileMousePressed(evt);
            }
        });
        CatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatFileActionPerformed(evt);
            }
        });

        MedioFile.setBackground(new java.awt.Color(217, 217, 217));
        MedioFile.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        MedioFile.setText("Medio de pago");
        MedioFile.setToolTipText("");
        MedioFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedioFileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MedioFileMousePressed(evt);
            }
        });
        MedioFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioFileActionPerformed(evt);
            }
        });

        CicloC.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        CicloC.setText("Continuo");

        CicloE.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        CicloE.setText("Extracurricular");

        MedioTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        MedioTxt.setText("Medio de Pago:");

        CatTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        CatTxt.setText("Categoria / Tipo:");

        CicloTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        CicloTxt.setText("Ciclo del Gasto:");

        ValorTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ValorTxt.setText("Valor (Ingrese un numero):");

        ValorFile.setBackground(new java.awt.Color(217, 217, 217));
        ValorFile.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ValorFile.setText("Valor");
        ValorFile.setToolTipText("");
        ValorFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorFileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ValorFileMousePressed(evt);
            }
        });
        ValorFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFileActionPerformed(evt);
            }
        });

        CuotasTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        CuotasTxt.setText("Numero de cuotas (Ingrese un numero):");

        CuotasFile.setBackground(new java.awt.Color(217, 217, 217));
        CuotasFile.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        CuotasFile.setText("Num cuotas");
        CuotasFile.setToolTipText("");
        CuotasFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuotasFileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuotasFileMousePressed(evt);
            }
        });
        CuotasFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuotasFileActionPerformed(evt);
            }
        });

        CrearBtn.setBackground(new java.awt.Color(118, 209, 190));
        CrearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearBtnMouseClicked(evt);
            }
        });

        CrearTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        CrearTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrearTxt.setText("MODIFICAR");

        javax.swing.GroupLayout CrearBtnLayout = new javax.swing.GroupLayout(CrearBtn);
        CrearBtn.setLayout(CrearBtnLayout);
        CrearBtnLayout.setHorizontalGroup(
            CrearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        CrearBtnLayout.setVerticalGroup(
            CrearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        CancelBtn.setBackground(new java.awt.Color(252, 221, 143));
        CancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelBtnMouseClicked(evt);
            }
        });

        CancelTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        CancelTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelTxt.setText("CANCELAR");

        javax.swing.GroupLayout CancelBtnLayout = new javax.swing.GroupLayout(CancelBtn);
        CancelBtn.setLayout(CancelBtnLayout);
        CancelBtnLayout.setHorizontalGroup(
            CancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CancelTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CancelBtnLayout.setVerticalGroup(
            CancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CancelTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Return.setBackground(new java.awt.Color(255, 153, 153));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnMouseEntered(evt);
            }
        });

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ReturnBonito.png"))); // NOI18N

        javax.swing.GroupLayout ReturnLayout = new javax.swing.GroupLayout(Return);
        Return.setLayout(ReturnLayout);
        ReturnLayout.setHorizontalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        ReturnLayout.setVerticalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        EntidadTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        EntidadTxt.setText("Entidad a la que se realizo el pago:");

        EntidadFile.setBackground(new java.awt.Color(217, 217, 217));
        EntidadFile.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        EntidadFile.setText("Entidad");
        EntidadFile.setToolTipText("");
        EntidadFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntidadFileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntidadFileMousePressed(evt);
            }
        });
        EntidadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntidadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(CrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CicloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuotasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(CicloC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CicloE)
                        .addGap(60, 60, 60))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(CatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CatFile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedioFile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorFile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuotasFile, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntidadFile)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(EntidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)))
                        .addContainerGap())))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CatTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MedioFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CicloTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CicloC)
                    .addComponent(CicloE))
                .addGap(18, 18, 18)
                .addComponent(ValorTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValorFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CuotasTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CuotasFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EntidadTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EntidadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CrearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void CatFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatFileMouseClicked

    }//GEN-LAST:event_CatFileMouseClicked

    private void CatFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatFileMousePressed

    }//GEN-LAST:event_CatFileMousePressed

    private void CatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatFileActionPerformed

    private void MedioFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedioFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioFileMouseClicked

    private void MedioFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedioFileMousePressed

    }//GEN-LAST:event_MedioFileMousePressed

    private void MedioFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioFileActionPerformed

    private void ValorFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFileMouseClicked

    private void ValorFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorFileMousePressed

    }//GEN-LAST:event_ValorFileMousePressed

    private void ValorFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFileActionPerformed

    private void CuotasFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuotasFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CuotasFileMouseClicked

    private void CuotasFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuotasFileMousePressed

    }//GEN-LAST:event_CuotasFileMousePressed

    private void CuotasFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuotasFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuotasFileActionPerformed

    private void CrearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearBtnMouseClicked
        Categoria = CatFile.getText();
        MedioDePago = MedioFile.getText();
        Magnitud = Float.valueOf(ValorFile.getText());
        NumCuotas = Integer.parseInt(CuotasFile.getText());
        Entidad = EntidadFile.getText();
        if(CicloC.isSelected()){
            TipoDeCiclo = true;
            modif= new Egreso(Categoria, MedioDePago, TipoDeCiclo, Magnitud, NumCuotas,amodif.NumRegistro, Entidad);
            int f = amodif.NumRegistro;
            f--;
            usu.ModificarGasto(f, modif);
            JOptionPane.showMessageDialog(null,"Gasto Modificado");
            ListaGastos gastos = new ListaGastos();
            gastos.setUsuarioG(usu);
            gastos.setTotal();
            gastos.setListaG();
            gastos.setVisible(true);
            this.dispose();
        }else if(CicloE.isSelected()){
            TipoDeCiclo = false;
            modif= new Egreso(Categoria, MedioDePago, TipoDeCiclo, Magnitud, NumCuotas,amodif.NumRegistro, Entidad);
            int f = amodif.NumRegistro;
            f--;
            usu.ModificarGasto(f, modif);
            JOptionPane.showMessageDialog(null,"Gasto Modificado");
            ListaGastos gastos = new ListaGastos();
            gastos.setUsuarioG(usu);
            gastos.setTotal();
            gastos.setListaG();
            gastos.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Es necesario definir el ciclo del gasto");
        }     
    }//GEN-LAST:event_CrearBtnMouseClicked

    private void CancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBtnMouseClicked
        ListaGastos menu = new ListaGastos();
        menu.setUsuarioG(usu);
        menu.setTotal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelBtnMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        ListaGastos menu = new ListaGastos();
        menu.setUsuarioG(usu);
        menu.setTotal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

    private void ReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnMouseEntered

    private void EntidadFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntidadFileMouseClicked
        if(EntidadFile.getText().equals("Entidad")){
            EntidadFile.setText("");
        }
    }//GEN-LAST:event_EntidadFileMouseClicked

    private void EntidadFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntidadFileMousePressed
    }//GEN-LAST:event_EntidadFileMousePressed

    private void EntidadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntidadFileActionPerformed
    }//GEN-LAST:event_EntidadFileActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel CancelBtn;
    private javax.swing.JLabel CancelTxt;
    private javax.swing.JTextField CatFile;
    private javax.swing.JLabel CatTxt;
    private javax.swing.JRadioButton CicloC;
    private javax.swing.JRadioButton CicloE;
    private javax.swing.JLabel CicloTxt;
    private javax.swing.JPanel CrearBtn;
    private javax.swing.JLabel CrearTxt;
    private javax.swing.JTextField CuotasFile;
    private javax.swing.JLabel CuotasTxt;
    private javax.swing.JTextField EntidadFile;
    private javax.swing.JLabel EntidadTxt;
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField MedioFile;
    private javax.swing.JLabel MedioTxt;
    private javax.swing.JPanel Return;
    private javax.swing.JLabel Tittle;
    private javax.swing.JTextField ValorFile;
    private javax.swing.JLabel ValorTxt;
    // End of variables declaration//GEN-END:variables
}
