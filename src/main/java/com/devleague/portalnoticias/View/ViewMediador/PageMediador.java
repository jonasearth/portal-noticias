/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewMediador;

import com.devleague.portalnoticias.Controller.Comentario.CreateComentarioController;
import com.devleague.portalnoticias.Controller.Comentario.GetComentarioController;
import com.devleague.portalnoticias.Controller.Comentario.UpdateComentarioController;
import com.devleague.portalnoticias.Model.Comentario;
import com.devleague.portalnoticias.View.Acesso;
import com.devleague.portalnoticias.View.Components.DialogoMsg;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JTable;

/**
 *
 * @author david
 */
public class PageMediador extends javax.swing.JFrame {

    /**
     * Creates new form PageMediador
     */
    public PageMediador() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMediador = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeJornalista1 = new javax.swing.JTextField();
        salarioJornalista1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        butaoCriarJornalista1 = new javax.swing.JButton();
        logarJornalista1 = new javax.swing.JButton();
        excluirJornalista1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaMediador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "usuario", "comentario"
            }
        ));
        jScrollPane1.setViewportView(tabelaMediador);

        back.setText("<--");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o Mediador para entrar");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Criar Novo Jornalista");

        salarioJornalista1.setToolTipText("");

        jLabel7.setText("Salario:");

        jLabel8.setText("Nome: ");

        butaoCriarJornalista1.setText("Registrar");
        butaoCriarJornalista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoCriarJornalista1MouseClicked(evt);
            }
        });

        logarJornalista1.setText("Logar Jornalista");
        logarJornalista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logarJornalista1MouseClicked(evt);
            }
        });

        excluirJornalista1.setText("Excluir Jornalista");
        excluirJornalista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirJornalista1MouseClicked(evt);
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
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJornalista1)
                                    .addComponent(salarioJornalista1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(butaoCriarJornalista1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(excluirJornalista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logarJornalista1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeJornalista1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salarioJornalista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butaoCriarJornalista1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logarJornalista1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluirJornalista1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
       this.setVisible(false);
       new Acesso().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void butaoCriarJornalista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCriarJornalista1MouseClicked

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
            if(CreateJornalistaController.add(jornalista)){
                table();
            }else{
                new DialogoMsg("Não foi possivel Criar o jornalista");
                return;
            }
        }catch (Exception e){
            new DialogoMsg("Salario do jornalista invalido");
            return;
        }

    }//GEN-LAST:event_butaoCriarJornalista1MouseClicked

    private void logarJornalista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logarJornalista1MouseClicked
        try {
            Jornalista jornalista = GetJornalistaController.get((UUID) listaJornalistas.getValueAt(listaJornalistas.getSelectedRow(), 0));
            if (jornalista != null) {
                new JornalistaFrame(jornalista).setVisible(true);
                this.setVisible(false);

            } else {
                new DialogoMsg("Jornalista não encontrado!");
            }
        }catch (Exception e){
            new DialogoMsg("Nenhum Jornalista selecionado!");
        }
    }//GEN-LAST:event_logarJornalista1MouseClicked

    private void excluirJornalista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirJornalista1MouseClicked
        try {
            Jornalista jornalista = GetJornalistaController.get( (UUID) listaJornalistas.getValueAt(listaJornalistas.getSelectedRow(), 0));
            if (jornalista != null) {
                if (DeleteJornalistaController.delete(jornalista)) {
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
    }//GEN-LAST:event_excluirJornalista1MouseClicked

    private void table(){
//        Aqui deve ser substituido por um controlador

//        CreateComentarioController.add(helperCreateComentario());
        
        ArrayList<Comentario> Comentarios = GetComentarioController.getAll();
        ListaMediadorTable tm = new ListaMediadorTable(Comentarios);
        tabelaMediador = new JTable(tm);
        jScrollPane1.setViewportView(tabelaMediador);
    }
    
    public Comentario helperCreateComentario(){
        String conteudo = "Da dez para gente, fernanda. Pelo amor de deus!!";
        Comentario mockComentario = new Comentario();
        mockComentario.setConteudo(conteudo);
        
        return mockComentario;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton butaoCriarJornalista;
    private javax.swing.JButton butaoCriarJornalista1;
    private javax.swing.JButton excluirJornalista;
    private javax.swing.JButton excluirJornalista1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logarJornalista;
    private javax.swing.JButton logarJornalista1;
    private javax.swing.JTextField nomeJornalista;
    private javax.swing.JTextField nomeJornalista1;
    private javax.swing.JTextField salarioJornalista;
    private javax.swing.JTextField salarioJornalista1;
    private javax.swing.JTable tabelaMediador;
    // End of variables declaration//GEN-END:variables
}
