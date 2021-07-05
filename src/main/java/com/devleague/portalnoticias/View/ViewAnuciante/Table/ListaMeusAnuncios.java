package com.devleague.portalnoticias.View.ViewAnuciante.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */

import com.devleague.portalnoticias.Model.Anuncio;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class ListaMeusAnuncios extends AbstractTableModel {

    private final String colunas[] = {"id", "meio", "clicks", "views", "exemplares vendidos"};
    private final ArrayList<Anuncio> anuncio;

    public final int COLUNA_ID = 0;
    public final int COLUNA_MEIO = 1;   
    public final int COLUNA_CLICKS = 2;
    public final int COLUNA_VIEWS = 3;
    public final int COLUNA_EXEMPLARES_VENDIDOS = 4;    

    public ListaMeusAnuncios(ArrayList<Anuncio> anuncio) {
        this.anuncio = anuncio;
    }

    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    @Override
    public int getRowCount() {
        return anuncio.size();
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
            case COLUNA_MEIO:
                return String.class;
            case COLUNA_CLICKS:
                return String.class;
            case COLUNA_VIEWS:
                return String.class;                
            case COLUNA_EXEMPLARES_VENDIDOS:
                return String.class;                  
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anuncio anuncioAtual = this.anuncio.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return anuncioAtual.getId();
            case COLUNA_MEIO:
                return anuncioAtual.getMeio();
            case COLUNA_CLICKS:
                return anuncioAtual.getClicks();
            case COLUNA_VIEWS:
                return anuncioAtual.getViews();                
            case COLUNA_EXEMPLARES_VENDIDOS:
                return anuncioAtual.getExemplaresEntregues();                 
            default:
                return null;
        }
    }
    
}