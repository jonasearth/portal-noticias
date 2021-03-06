/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewChefe;

import com.devleague.portalnoticias.Controller.Chefe.CreateChefeController;
import com.devleague.portalnoticias.Controller.Chefe.DeleteChefeController;
import com.devleague.portalnoticias.Controller.Chefe.GetChefeController;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import com.devleague.portalnoticias.Model.Chefe;
import com.devleague.portalnoticias.View.Acesso;
import com.devleague.portalnoticias.View.ViewChefe.Table.ListaChefesTable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 *
 * @author Fnatic
 */
public class ListaChefes extends javax.swing.JFrame {


    /**
     * Creates new form ListaChefes
     */
    public ListaChefes()  {

        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaChefes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeChefe = new javax.swing.JTextField();
        salarioChefe = new javax.swing.JTextField();
        butaoCriarChefe = new javax.swing.JButton();
        excluirChefe = new javax.swing.JButton();
        logarChefe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione o Chefe para entrar");

        listaChefes.setAutoCreateColumnsFromModel(false);
        listaChefes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listaChefes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaChefesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaChefes);

        jPanel1.setMaximumSize(new java.awt.Dimension(300, 65000));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Criar Novo Chefe");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Salario:");

        salarioChefe.setToolTipText("");

        butaoCriarChefe.setText("Registrar");
        butaoCriarChefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoCriarChefeMouseClicked(evt);
            }
        });

        excluirChefe.setText("Excluir Chefe");
        excluirChefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirChefeMouseClicked(evt);
            }
        });

        logarChefe.setText("Logar Chefe");
        logarChefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logarChefeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeChefe)
                            .addComponent(salarioChefe)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butaoCriarChefe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(excluirChefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logarChefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeChefe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarioChefe, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(butaoCriarChefe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(logarChefe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirChefe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("<--");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoCriarChefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCriarChefeMouseClicked

        if(nomeChefe.getText().length() < 3){
            new DialogoMsg("Nome do Chefe precisa ter ao menos 3 caracteres");
            return;
        }
        Pattern pattern = Pattern.compile("\\d+.\\d+");

        if(!pattern.matcher(salarioChefe.getText()).matches()){
            new DialogoMsg("Salario do chefe invalido");
            return;
        }
        try{
            Chefe chefe = new Chefe();
            chefe.setNome(nomeChefe.getText());
            chefe.setSalario(Float.parseFloat(salarioChefe.getText()));
            if(CreateChefeController.add( chefe)){
                table();
            }else{
                new DialogoMsg("N??o foi possivel Criar o chefe");
                return;
            }
        }catch (Exception e){
            new DialogoMsg("Salario do chefe invalido");
            return;
        }





    }//GEN-LAST:event_butaoCriarChefeMouseClicked

    private void excluirChefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirChefeMouseClicked
        try {
            Chefe chefe = GetChefeController.get((UUID) listaChefes.getValueAt(listaChefes.getSelectedRow(), 0));
            if (chefe != null) {
                if (DeleteChefeController.delete( chefe)) {
                    table();
                } else {
                    new DialogoMsg("N??o foi possivel excluir o chefe!");
                }
            } else {
                new DialogoMsg("Chefe n??o encontrado!");
            }
        }catch (Exception e){
            new DialogoMsg("Nenhum Chefe selecionado!");
        }
    }//GEN-LAST:event_excluirChefeMouseClicked

    private void logarChefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logarChefeMouseClicked
        try {
            Chefe chefe = GetChefeController.get( (UUID) listaChefes.getValueAt(listaChefes.getSelectedRow(), 0));
            if (chefe != null) {
                new PageChefeRedacao(chefe).setVisible(true);
                this.setVisible(false);

            } else {
                new DialogoMsg("Chefe n??o encontrado!");
            }
        }catch (Exception e){
            new DialogoMsg("Nenhum Chefe selecionado!");
        }
    }//GEN-LAST:event_logarChefeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new Acesso().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaChefesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaChefesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaChefesMouseClicked



    private void table(){

        ArrayList<Chefe> chefes = GetChefeController.getAll();


        ListaChefesTable tm = new ListaChefesTable(chefes);


        listaChefes = new JTable(tm);
        listaChefes.getColumnModel().getColumn(0).setPreferredWidth(200);
        jScrollPane1.setViewportView(listaChefes);


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoCriarChefe;
    private javax.swing.JButton excluirChefe;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaChefes;
    private javax.swing.JButton logarChefe;
    private javax.swing.JTextField nomeChefe;
    private javax.swing.JTextField salarioChefe;
    // End of variables declaration//GEN-END:variables
}
