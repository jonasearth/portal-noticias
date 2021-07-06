/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewAnuciante;

/**
 *
 * @author Fnatic
 */

import com.devleague.portalnoticias.Model.Anunciante;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListaAnunciantesTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Anunciante> anunciante;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;

    public ListaAnunciantesTable(ArrayList<Anunciante> anunciante) {
        this.anunciante = anunciante;
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
        return anunciante.size();
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
                return String.class;
            case COLUNA_NOME:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anunciante anunciante = this.anunciante.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return anunciante.getId();
            case COLUNA_NOME:
                return anunciante.getNome();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Anunciante anunciante = this.anunciante.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                anunciante.setNome(aValue.toString());
                break;
        }
        fireTableDataChanged();
    }
}