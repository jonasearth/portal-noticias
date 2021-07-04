/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.ViewChefe.ListaChefes;
import com.devleague.portalnoticias.View.ViewEditor.ListaEditor;
import com.devleague.portalnoticias.View.ViewJornalista.ListaJornalistas;
import com.devleague.portalnoticias.View.ViewRevisor.PageRevisor;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;

/**
 *
 * @author Fnatic
 */
public class Acesso extends javax.swing.JFrame {

    /**
     * Creates new form Acesso
     */
    public Acesso() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        editor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jornalista = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        revisor = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        anunciante = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        mediador = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        chefe = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione o tipo de usuario do sistema");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(202, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(202, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(202, 18));

        jPanel7.setBackground(new java.awt.Color(69, 73, 74));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel7.setForeground(new java.awt.Color(69, 73, 74));

        editor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editor.setText("Editor");
        editor.setToolTipText("");
        editor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editor, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(69, 73, 74));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel8.setForeground(new java.awt.Color(69, 73, 74));

        jornalista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jornalista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jornalista.setText("Jornalista");
        jornalista.setToolTipText("");
        jornalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jornalistaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jornalistaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jornalista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jornalista, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(69, 73, 74));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel9.setForeground(new java.awt.Color(69, 73, 74));

        revisor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        revisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        revisor.setText("Revisor");
        revisor.setToolTipText("");
        revisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                revisorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(revisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(revisor, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(69, 73, 74));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel10.setForeground(new java.awt.Color(69, 73, 74));

        anunciante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anunciante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anunciante.setText("Anunciante");
        anunciante.setToolTipText("");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anunciante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anunciante, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(69, 73, 74));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel11.setForeground(new java.awt.Color(69, 73, 74));

        mediador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mediador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediador.setText("Mediador");
        mediador.setToolTipText("");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mediador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mediador, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(69, 73, 74));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel12.setForeground(new java.awt.Color(69, 73, 74));

        chefe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chefe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chefe.setText("Chefe de Redação");
        chefe.setToolTipText("");
        chefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chefeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chefe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chefe, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(69, 73, 74));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel13.setForeground(new java.awt.Color(69, 73, 74));

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuario");
        usuario.setToolTipText("");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jornalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jornalistaMouseClicked
        this.setVisible(false);
        new ListaJornalistas().setVisible(true);
        
    }//GEN-LAST:event_jornalistaMouseClicked

    private void jornalistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jornalistaMousePressed
            // TODO add your handling code here:
    }//GEN-LAST:event_jornalistaMousePressed

    private void chefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chefeMouseClicked
        this.setVisible(false);
        new ListaChefes().setVisible(true);
    }//GEN-LAST:event_chefeMouseClicked

    private void editorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editorMouseClicked
        this.setVisible(false);
        new ListaEditor().setVisible(true);
    }//GEN-LAST:event_editorMouseClicked

    private void revisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revisorMouseClicked
       this.setVisible(false);
       new PageRevisor().setVisible(true);
    }//GEN-LAST:event_revisorMouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anunciante;
    private javax.swing.JLabel chefe;
    private javax.swing.JLabel editor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jornalista;
    private javax.swing.JLabel mediador;
    private javax.swing.JLabel revisor;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
