package com.clases;

import javax.swing.JOptionPane;

public class ModIngreso extends javax.swing.JFrame {
    Usuario usu;
    Ingreso amodif,modif;
    String Categoria, MedioDePago;
    Boolean TipoDeCiclo, Tipo;
    Float Magnitud;
    int NumCuotas, NumRegistro;
    
    public ModIngreso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setUsuario(Usuario usuario,int NumIngreso){
        this.usu = usuario;
        this.amodif = usu.getIngreso(NumIngreso);
        Categoria = amodif.getCategoria();
        MedioDePago = amodif.getMedioDePago();
        TipoDeCiclo = amodif.getTipoDeCiclo();
        Tipo = amodif.getIngresoactivoOPasivo();
        Magnitud = amodif.Magnitud;
        NumCuotas = amodif.NumCuotas;
        NumRegistro = amodif.NumRegistro;
    }
    
    public void Setvalores(){
        CatFile.setText(Categoria);
        MedioFile.setText(MedioDePago);
        ValorFile.setText(Magnitud.toString());
        CuotasFile.setText(Integer.toString(NumCuotas));
        if(TipoDeCiclo == true) {
            CicloC.setSelected(true);
        } else {
            CicloE.setSelected(true);
        }
        
        if(Tipo == true) {
            TipoA.setSelected(true);
        } else {
            TipoP.setSelected(true);
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
        TipoP = new javax.swing.JRadioButton();
        TipoTxt = new javax.swing.JLabel();
        TipoA = new javax.swing.JRadioButton();
        CrearBtn = new javax.swing.JPanel();
        CrearTxt = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JPanel();
        CancelTxt = new javax.swing.JLabel();
        Return = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(213, 245, 228));

        Tittle.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("MODIFICAR INGRESO");

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
        CicloTxt.setText("Ciclo del ingreso:");

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

        TipoP.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        TipoP.setText("Pasivo");

        TipoTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TipoTxt.setText("Tipo de ingreso:");

        TipoA.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        TipoA.setText("Activo");

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

        CancelBtn.setBackground(new java.awt.Color(244, 169, 157));
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

        Return.setBackground(new java.awt.Color(213, 245, 228));
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
                                    .addComponent(TipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CicloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BgLayout.createSequentialGroup()
                                        .addComponent(TipoA)
                                        .addGap(113, 113, 113)
                                        .addComponent(TipoP))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(TipoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoA)
                    .addComponent(TipoP))
                .addGap(18, 18, 18)
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
        if(CicloC.isSelected()){
            TipoDeCiclo = true;
            if(TipoA.isSelected()) {
                Tipo = true;
                modif = new Ingreso(Categoria,MedioDePago,TipoDeCiclo,Magnitud,NumCuotas,amodif.getNumRegistro(),Tipo);
                int f = amodif.getNumRegistro();
                f--;
                usu.ModificarIngreso(f,modif);
                JOptionPane.showMessageDialog(null, "Ingreso Modificado");
                ListaIngresos Ingresos = new ListaIngresos();
                Ingresos.setUsuarioI(usu);
                Ingresos.setTotal();
                Ingresos.setLista();
                Ingresos.setVisible(true);
                this.dispose();
            } else if(TipoP.isSelected()) {
                Tipo = false;
                modif = new Ingreso(Categoria,MedioDePago,TipoDeCiclo,Magnitud,NumCuotas,amodif.getNumRegistro(),Tipo);
                int f = amodif.getNumRegistro();
                f--;
                usu.ModificarIngreso(f,modif);
                JOptionPane.showMessageDialog(null, "Ingreso Modificado");
                ListaIngresos Ingresos = new ListaIngresos();
                Ingresos.setUsuarioI(usu);
                Ingresos.setTotal();
                Ingresos.setLista();
                Ingresos.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Es necesario definir el tipo de ingreso");
            }
        }else if(CicloE.isSelected()){
            TipoDeCiclo = false;
            if(TipoA.isSelected()) {
                Tipo = true;
                modif = new Ingreso(Categoria,MedioDePago,TipoDeCiclo,Magnitud,NumCuotas,amodif.getNumRegistro(),Tipo);
                int f = amodif.getNumRegistro();
                f--;
                usu.ModificarIngreso(f,modif);
                JOptionPane.showMessageDialog(null, "Ingreso añadido correctamente");
                ListaIngresos Ingresos = new ListaIngresos();
                Ingresos.setUsuarioI(usu);
                Ingresos.setTotal();
                Ingresos.setLista();
                Ingresos.setVisible(true);
                this.dispose();
            } else if (TipoP.isSelected()) {
                Tipo = false;
                modif = new Ingreso(Categoria,MedioDePago,TipoDeCiclo,Magnitud,NumCuotas,amodif.getNumRegistro(),Tipo);
                int f = amodif.getNumRegistro();
                f--;
                usu.ModificarIngreso(f,modif);
                JOptionPane.showMessageDialog(null, "Ingreso añadido correctamente");
                ListaIngresos Ingresos = new ListaIngresos();
                Ingresos.setUsuarioI(usu);
                Ingresos.setTotal();
                Ingresos.setLista();
                Ingresos.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Es necesario definir el tipo de ingreso");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Es necesario definir el ciclo del ingreso");
        }     
    }//GEN-LAST:event_CrearBtnMouseClicked

    private void CancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBtnMouseClicked
        ListaIngresos Ingresos = new ListaIngresos();
        Ingresos.setUsuarioI(usu);
        Ingresos.setTotal();
        Ingresos.setLista();
        Ingresos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelBtnMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        ListaIngresos Ingresos = new ListaIngresos();
        Ingresos.setUsuarioI(usu);
        Ingresos.setTotal();
        Ingresos.setLista();
        Ingresos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

    private void ReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnMouseEntered

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
            java.util.logging.Logger.getLogger(ModIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModIngreso().setVisible(true);
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
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField MedioFile;
    private javax.swing.JLabel MedioTxt;
    private javax.swing.JPanel Return;
    private javax.swing.JRadioButton TipoA;
    private javax.swing.JRadioButton TipoP;
    private javax.swing.JLabel TipoTxt;
    private javax.swing.JLabel Tittle;
    private javax.swing.JTextField ValorFile;
    private javax.swing.JLabel ValorTxt;
    // End of variables declaration//GEN-END:variables
}
