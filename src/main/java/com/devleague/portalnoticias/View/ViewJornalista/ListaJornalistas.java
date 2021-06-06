/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewJornalista;

import com.devleague.portalnoticias.Controller.Jornalista.CreateJornalistaController;
import com.devleague.portalnoticias.Controller.Jornalista.DeleteJornalistaController;
import com.devleague.portalnoticias.Controller.Jornalista.GetJornalistaController;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import com.devleague.portalnoticias.Model.Jornalista;
import com.devleague.portalnoticias.View.Acesso;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 *
 * @author Fnatic
 */
public class ListaJornalistas extends javax.swing.JFrame {


    public DB db;
    /**
     * Creates new form ListaJornalistas
     */
    public ListaJornalistas(DB db)  {

        this.db = db;
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
        listaJornalistas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeJornalista = new javax.swing.JTextField();
        salarioJornalista = new javax.swing.JTextField();
        butaoCriarJornalista = new javax.swing.JButton();
        excluirJornalista = new javax.swing.JButton();
        logarJornalista = new javax.swing.JButton();
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
        jLabel1.setText("Selecione o Jornalista para entrar");

        listaJornalistas.setAutoCreateColumnsFromModel(false);
        listaJornalistas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(listaJornalistas);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Criar Novo Jornalista");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Salario:");

        salarioJornalista.setToolTipText("");

        butaoCriarJornalista.setText("Registrar");
        butaoCriarJornalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoCriarJornalistaMouseClicked(evt);
            }
        });

        excluirJornalista.setText("Excluir Jornalista");
        excluirJornalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirJornalistaMouseClicked(evt);
            }
        });

        logarJornalista.setText("Logar Jornalista");
        logarJornalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logarJornalistaMouseClicked(evt);
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
                            .addComponent(nomeJornalista, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(salarioJornalista)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butaoCriarJornalista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(excluirJornalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logarJornalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(nomeJornalista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarioJornalista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(butaoCriarJornalista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logarJornalista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirJornalista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoCriarJornalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCriarJornalistaMouseClicked

        if(nomeJornalista.getText().length() < 3){
            new DialogoMsg("Nome do Jornalista precisa ter ao menos 3 caracteres");
            return;
        }
        Pattern pattern = Pattern.compile("\\d+.\\d+");

        if(!pattern.matcher(salarioJornalista.getText()).matches()){
            new DialogoMsg("Salario do jornalista invalido");
            return;
        }
        try{
            Jornalista jornalista = new Jornalista();
            jornalista.setNome(nomeJornalista.getText());
            jornalista.setSalario(Float.parseFloat(salarioJornalista.getText()));
            if(CreateJornalistaController.add(db, jornalista)){
                table();
            }else{
                new DialogoMsg("Não foi possivel Criar o jornalista");
                return;
            }
        }catch (Exception e){
            new DialogoMsg("Salario do jornalista invalido");
            return;
        }





    }//GEN-LAST:event_butaoCriarJornalistaMouseClicked

    private void excluirJornalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirJornalistaMouseClicked
        try {
            Jornalista jornalista = GetJornalistaController.get(db, (UUID) listaJornalistas.getValueAt(listaJornalistas.getSelectedRow(), 0));
            if (jornalista != null) {
                if (DeleteJornalistaController.delete(db, jornalista)) {
                    table();
                } else {
                    new DialogoMsg("Não foi possivel excluir o jornalista!");
                }
            } else {
                new DialogoMsg("Jornalista não encontrado!");
            }
        }catch (Exception e){
            new DialogoMsg("Nenhum Jornalista selecionado!");
        }
    }//GEN-LAST:event_excluirJornalistaMouseClicked

    private void logarJornalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logarJornalistaMouseClicked
        try {
            Jornalista jornalista = GetJornalistaController.get(db, (UUID) listaJornalistas.getValueAt(listaJornalistas.getSelectedRow(), 0));
            if (jornalista != null) {
                new JornalistaFrame(db, jornalista).setVisible(true);
                this.setVisible(false);

            } else {
                new DialogoMsg("Jornalista não encontrado!");
            }
        }catch (Exception e){
            new DialogoMsg("Nenhum Jornalista selecionado!");
        }
    }//GEN-LAST:event_logarJornalistaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new Acesso(db).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed



    private void table(){

        ArrayList<Jornalista> jornalistas = GetJornalistaController.getAll(this.db);


        ListaJornalistasTable tm = new ListaJornalistasTable(jornalistas);


        listaJornalistas = new JTable(tm);
        listaJornalistas.getColumnModel().getColumn(0).setPreferredWidth(200);
        jScrollPane1.setViewportView(listaJornalistas);


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoCriarJornalista;
    private javax.swing.JButton excluirJornalista;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaJornalistas;
    private javax.swing.JButton logarJornalista;
    private javax.swing.JTextField nomeJornalista;
    private javax.swing.JTextField salarioJornalista;
    // End of variables declaration//GEN-END:variables
}
