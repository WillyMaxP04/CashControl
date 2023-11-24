package com.clases;

import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.block.BlockBorder;
import org.jfree.data.general.DefaultPieDataset;

public final class AhorroCreado extends javax.swing.JFrame {
    Usuario usuario;
    float ahorrado,restante,Meta;
    float a,r;
    
    public AhorroCreado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.chart1();
        this.EditValores();
    }
    
    public void obtenerUsuario(Usuario usuario){
        this.usuario = usuario;
        ahorrado = usuario.Ahorros.getYaAhorrado();
        Meta = usuario.Ahorros.getMetaAhorro();
        restante = usuario.Ahorros.PorcentajeHaAhorrar();
        a = (ahorrado/Meta)*100;
        r = 100 - a;
    }
    
    public void chart1() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Restante", 60);
        dataset.setValue("Ahorrado",40);  
        JFreeChart chart1 = ChartFactory.createPieChart("Porcentaje Ahorrado", dataset, true, true, false);

        JPanel panelChart1 = new ChartPanel(chart1);
        panelChart1.setPreferredSize(new Dimension(395, 395)); 

        chart1.getPlot().setBackgroundPaint(new Color(213,245,228));
        chart1.getPlot().setOutlinePaint(new Color(213,245,228));

        PnlChart1.setLayout(new FlowLayout(FlowLayout.CENTER));
        PnlChart1.add(panelChart1);
    }

    public void EditValores(){
        AhorradoTxt.setText("Total ahorrado: $" + ahorrado);
        FaltaTxt.setText("Cantidad restante: $" + restante);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Return = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        FaltaFile = new javax.swing.JPanel();
        FaltaTxt = new javax.swing.JLabel();
        AhorradoFile = new javax.swing.JPanel();
        AhorradoTxt = new javax.swing.JLabel();
        SpueriorTxt = new javax.swing.JLabel();
        CatTxt = new javax.swing.JLabel();
        CatFile = new javax.swing.JTextField();
        PnlChart1 = new javax.swing.JPanel();
        InsertBtn = new javax.swing.JPanel();
        InsertTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(213, 245, 228));

        Return.setBackground(new java.awt.Color(213, 245, 226));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnMouseEntered(evt);
            }
        });

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ReturnBonito.png"))); // NOI18N

        javax.swing.GroupLayout ReturnLayout = new javax.swing.GroupLayout(Return);
        Return.setLayout(ReturnLayout);
        ReturnLayout.setHorizontalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );
        ReturnLayout.setVerticalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        FaltaFile.setBackground(new java.awt.Color(118, 209, 190));

        FaltaTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        FaltaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FaltaTxt.setText("Cantidad restante: $_____");

        javax.swing.GroupLayout FaltaFileLayout = new javax.swing.GroupLayout(FaltaFile);
        FaltaFile.setLayout(FaltaFileLayout);
        FaltaFileLayout.setHorizontalGroup(
            FaltaFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FaltaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FaltaFileLayout.setVerticalGroup(
            FaltaFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaltaFileLayout.createSequentialGroup()
                .addComponent(FaltaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AhorradoFile.setBackground(new java.awt.Color(255, 228, 155));

        AhorradoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AhorradoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AhorradoTxt.setText("Total ahorrado: $_____");

        javax.swing.GroupLayout AhorradoFileLayout = new javax.swing.GroupLayout(AhorradoFile);
        AhorradoFile.setLayout(AhorradoFileLayout);
        AhorradoFileLayout.setHorizontalGroup(
            AhorradoFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AhorradoFileLayout.createSequentialGroup()
                .addComponent(AhorradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        AhorradoFileLayout.setVerticalGroup(
            AhorradoFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AhorradoFileLayout.createSequentialGroup()
                .addComponent(AhorradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SpueriorTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        SpueriorTxt.setForeground(new java.awt.Color(73, 94, 107));
        SpueriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpueriorTxt.setText("Meta de ahorro");

        CatTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        CatTxt.setText("Introducir dinero en la meta:");

        CatFile.setBackground(new java.awt.Color(217, 217, 217));
        CatFile.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        CatFile.setText("Introduce una cifra");
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

        javax.swing.GroupLayout PnlChart1Layout = new javax.swing.GroupLayout(PnlChart1);
        PnlChart1.setLayout(PnlChart1Layout);
        PnlChart1Layout.setHorizontalGroup(
            PnlChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        PnlChart1Layout.setVerticalGroup(
            PnlChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        InsertBtn.setBackground(new java.awt.Color(133, 252, 216));
        InsertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertBtnMouseClicked(evt);
            }
        });

        InsertTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        InsertTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertTxt.setText("INSERTAR");

        javax.swing.GroupLayout InsertBtnLayout = new javax.swing.GroupLayout(InsertBtn);
        InsertBtn.setLayout(InsertBtnLayout);
        InsertBtnLayout.setHorizontalGroup(
            InsertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InsertTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        InsertBtnLayout.setVerticalGroup(
            InsertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InsertTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpueriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(PnlChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AhorradoFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FaltaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpueriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(FaltaFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(AhorradoFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CatTxt)
                .addGap(12, 12, 12)
                .addComponent(CatFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        Menu menu = new Menu();
        menu.setUsuario(usuario);
        menu.SetSaludo();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

    private void ReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseEntered

    }//GEN-LAST:event_ReturnMouseEntered

    private void CatFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatFileMouseClicked

    }//GEN-LAST:event_CatFileMouseClicked

    private void CatFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatFileMousePressed
        if(CatFile.getText().equals("Introduce una cifra")){
            CatFile.setText("");
        }
    }//GEN-LAST:event_CatFileMousePressed

    private void CatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatFileActionPerformed
    }//GEN-LAST:event_CatFileActionPerformed

    private void InsertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertBtnMouseClicked
        usuario.Ahorros.IngresarDinero(Float.parseFloat(CatFile.getText()));
        JOptionPane.showMessageDialog(null, "Dinero agregado correctamente");
        CatFile.setText("Introduce una cifra");
        
        if(usuario.Ahorros.getYaAhorrado() >= usuario.Ahorros.getMetaAhorro()) {
            JOptionPane.showMessageDialog(null,"Enhorabuena, completaste tu meta de ahorro, presiona meta de ahorro para obtenere una nueva");
            usuario.Ahorros.ResetValores();
            Menu menu = new Menu();
            menu.setUsuario(usuario);
            menu.SetSaludo();
            menu.setVisible(true);
            this.dispose();
        } 
        this.obtenerUsuario(usuario);
        this.EditValores();    
    }//GEN-LAST:event_InsertBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AhorroCreado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AhorradoFile;
    private javax.swing.JLabel AhorradoTxt;
    private javax.swing.JPanel Bg;
    private javax.swing.JTextField CatFile;
    private javax.swing.JLabel CatTxt;
    private javax.swing.JPanel FaltaFile;
    private javax.swing.JLabel FaltaTxt;
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel InsertBtn;
    private javax.swing.JLabel InsertTxt;
    private javax.swing.JPanel PnlChart1;
    private javax.swing.JPanel Return;
    private javax.swing.JLabel SpueriorTxt;
    // End of variables declaration//GEN-END:variables
}

/*
DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Restante", x);
        dataset.setValue("Ahorrado",y);  
        JFreeChart chart1 = ChartFactory.createPieChart("Porcentaje Ahorrado", dataset, false, true, false);

        ChartPanel panelChart1 = new ChartPanel(chart1);
        panelChart1.setPreferredSize(new Dimension(395, 395)); 
        panelChart1.setMouseWheelEnabled(true);
        
        chart1.getPlot().setBackgroundPaint(new Color(213,245,228));
        chart1.getPlot().setOutlinePaint(new Color(213,245,228));
        chart1.getLegend().setBorder(BlockBorder.NONE);

        PnlChart1.setLayout(new FlowLayout(FlowLayout.CENTER));
        PnlChart1.add(panelChart1,BorderLayout.NORTH);  
        
        pack();
        repaint();
*/