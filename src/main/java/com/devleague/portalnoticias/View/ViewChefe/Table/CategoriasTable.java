/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewChefe.Table;

/**
 *
 * @author Fnatic
 */

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class CategoriasTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome" };
    private ArrayList<Categoria> categoria;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;

    public CategoriasTable(ArrayList<Categoria> categoria) {
        this.categoria = categoria;

    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public int getRowCount() {
        return categoria.size();
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
            case COLUNA_NOME:
                return String.class;

            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categoria categoria = this.categoria.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return categoria.getId();
            case COLUNA_NOME:
                return categoria.getNome();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Categoria categoria = this.categoria.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                categoria.setNome(aValue.toString());
                break;

        }
        fireTableDataChanged();
    }
}