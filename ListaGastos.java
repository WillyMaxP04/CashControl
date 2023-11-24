package com.clases;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.*;

public class ListaGastos extends javax.swing.JFrame {
    Usuario usuario;
    int Gastoselect;
    DefaultListModel modelo = new DefaultListModel();
    ArrayList listaG = new ArrayList();
    String NoHay = "Actualmente no hay ningun gasto registrado";
    
    public ListaGastos() {
        initComponents();
        this.setLocationRelativeTo(null);
        jList1.setModel(modelo);
        jList1.setPreferredSize(new Dimension(366, 274)); 
    }
    
    public void setUsuarioG(Usuario usuario){
       this.usuario = usuario;
    }
    
    public void setTotal(){
        TotalTxt.setText("Total: $"+usuario.calcu.SumaGastos(0));
    }
    
    void setListaG() {
        for(int i=0;i<usuario.Gastos.size();i++){
            listaG.add(usuario.LecturaGastos1(i));
            listaG.add(usuario.LecturaGastos2(i));
        }
        
        if (listaG.isEmpty()) {
            listaG.add(NoHay);
        }

        for(int i=0;i<listaG.size();i++){
            modelo.addElement(listaG.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Superior = new javax.swing.JPanel();
        SpueriorTxt = new javax.swing.JLabel();
        Return = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        TotalPanel = new javax.swing.JPanel();
        TotalTxt = new javax.swing.JLabel();
        TittlePanel = new javax.swing.JPanel();
        TittleTxt = new javax.swing.JLabel();
        ModifBtn = new javax.swing.JPanel();
        ModifTxt = new javax.swing.JLabel();
        AddBtn = new javax.swing.JPanel();
        AddTxt = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JPanel();
        DeleteTxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(213, 245, 228));

        Superior.setBackground(new java.awt.Color(255, 153, 153));

        SpueriorTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        SpueriorTxt.setForeground(new java.awt.Color(73, 94, 107));
        SpueriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpueriorTxt.setText("Gestión de gastos");

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
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SuperiorLayout = new javax.swing.GroupLayout(Superior);
        Superior.setLayout(SuperiorLayout);
        SuperiorLayout.setHorizontalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpueriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuperiorLayout.setVerticalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpueriorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TotalPanel.setBackground(new java.awt.Color(244, 169, 157));

        TotalTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        TotalTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalTxt.setText("Total: $____");

        javax.swing.GroupLayout TotalPanelLayout = new javax.swing.GroupLayout(TotalPanel);
        TotalPanel.setLayout(TotalPanelLayout);
        TotalPanelLayout.setHorizontalGroup(
            TotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TotalPanelLayout.setVerticalGroup(
            TotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TotalTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        TittlePanel.setBackground(new java.awt.Color(244, 169, 157));
        TittlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TittlePanelMouseClicked(evt);
            }
        });

        TittleTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        TittleTxt.setForeground(new java.awt.Color(73, 94, 107));
        TittleTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleTxt.setText("Lista de gastos");

        javax.swing.GroupLayout TittlePanelLayout = new javax.swing.GroupLayout(TittlePanel);
        TittlePanel.setLayout(TittlePanelLayout);
        TittlePanelLayout.setHorizontalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittlePanelLayout.createSequentialGroup()
                .addComponent(TittleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TittlePanelLayout.setVerticalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TittleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        ModifBtn.setBackground(new java.awt.Color(255, 228, 155));

        ModifTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        ModifTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModifTxt.setText("Modificar");
        ModifTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ModifBtnLayout = new javax.swing.GroupLayout(ModifBtn);
        ModifBtn.setLayout(ModifBtnLayout);
        ModifBtnLayout.setHorizontalGroup(
            ModifBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModifTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        ModifBtnLayout.setVerticalGroup(
            ModifBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModifTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        AddTxt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        AddTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddTxt.setText("+");

        javax.swing.GroupLayout AddBtnLayout = new javax.swing.GroupLayout(AddBtn);
        AddBtn.setLayout(AddBtnLayout);
        AddBtnLayout.setHorizontalGroup(
            AddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        AddBtnLayout.setVerticalGroup(
            AddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DeleteBtn.setBackground(new java.awt.Color(244, 169, 157));
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        DeleteTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        DeleteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteTxt.setText("Eliminar");

        javax.swing.GroupLayout DeleteBtnLayout = new javax.swing.GroupLayout(DeleteBtn);
        DeleteBtn.setLayout(DeleteBtnLayout);
        DeleteBtnLayout.setHorizontalGroup(
            DeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteBtnLayout.createSequentialGroup()
                .addComponent(DeleteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        DeleteBtnLayout.setVerticalGroup(
            DeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jList1.setBackground(new java.awt.Color(252, 221, 143));
        jList1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jList1.setAutoscrolls(false);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(ModifBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TittlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TittlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifTxtMouseClicked
        if(!listaG.isEmpty()) {
            Gastoselect = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de registro del ingreso a modificar:"));
            Gastoselect--;
            ModGasto modificar = new ModGasto();
            modificar.setUsuario(usuario,Gastoselect);
            modificar.Setvalores();
            modificar.setVisible(true);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null,"Aun no hay ingresos registrados");
        }
    }//GEN-LAST:event_ModifTxtMouseClicked

    private void TittlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TittlePanelMouseClicked

    }//GEN-LAST:event_TittlePanelMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        AddGasto añadir = new AddGasto();
        añadir.setUsuario(usuario);
        añadir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseEntered
    }//GEN-LAST:event_ReturnMouseEntered

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        Menu menu = new Menu();
        menu.setUsuario(usuario);
        menu.SetSaludo();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(usuario.calcu.contG != 0) {
        Gastoselect = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del ingreso que desea modificar:"));
        usuario.EliminarIngreso(Gastoselect);
        JOptionPane.showMessageDialog(null,"Ingreso eliminado");
        //SetLista();
        } else{
            JOptionPane.showMessageDialog(null,"Aun no hay ingresos registrados");
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaGastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBtn;
    private javax.swing.JLabel AddTxt;
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel DeleteBtn;
    private javax.swing.JLabel DeleteTxt;
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel ModifBtn;
    private javax.swing.JLabel ModifTxt;
    private javax.swing.JPanel Return;
    private javax.swing.JLabel SpueriorTxt;
    private javax.swing.JPanel Superior;
    private javax.swing.JPanel TittlePanel;
    private javax.swing.JLabel TittleTxt;
    private javax.swing.JPanel TotalPanel;
    private javax.swing.JLabel TotalTxt;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
