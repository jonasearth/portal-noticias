/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewCliente.Tabela;

/**
 *
 * @author David
 */

import com.devleague.portalnoticias.Model.Noticia;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class TabelaNoticias extends AbstractTableModel {

    private final String colunas[] = {"id", "titulo", "categoria"};
    private final ArrayList<Noticia> noticia;

    public final int COLUNA_ID = 0;
    public final int COLUNA_TITULO = 1;
    public final int COLUNA_CATEGORIA = 2;

    public TabelaNoticias(ArrayList<Noticia> noticia) {
        this.noticia = noticia;

    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    @Override
    public int getRowCount() {
        return noticia.size();
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
            case COLUNA_TITULO:
                return String.class;
            case COLUNA_CATEGORIA:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Noticia noticiaAtual = this.noticia.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return noticiaAtual.getId();
            case COLUNA_TITULO:
                return noticiaAtual.getTitulo();
            case COLUNA_CATEGORIA:
                return noticiaAtual.getCategoria();
            default: 
                return "";

        }
    }

}