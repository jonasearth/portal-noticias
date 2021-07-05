/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewMediador.Table;

/**
 *
 * @author David
 */

import com.devleague.portalnoticias.Model.Comentario;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class ListaMediadorTable extends AbstractTableModel {

    private final String colunas[] = {"id", "usuario", "comentario", "estado"};
    private final ArrayList<Comentario> comentario;

    public final int COLUNA_ID = 0;
    public final int COLUNA_USUARIO = 1;
    public final int COLUNA_COMENTARIO = 2;
    public final int COLUNA_ESTADO = 3;

    public ListaMediadorTable(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    @Override
    public int getRowCount() {
        return comentario.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_ID:
                return UUID.class;
            case COLUNA_USUARIO:
                return String.class;
            case COLUNA_COMENTARIO:
                return String.class;
            case COLUNA_ESTADO:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Comentario comentarioAtual = this.comentario.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return comentarioAtual.getId();
            case COLUNA_USUARIO:
                return comentarioAtual.getUsuario();
            case COLUNA_COMENTARIO:
                return comentarioAtual.getConteudo();
            case COLUNA_ESTADO:
                return comentarioAtual.isAprovada();
            default: 
                return null;

        }
    }
    
}