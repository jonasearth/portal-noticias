/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewChefe;

/**
 *
 * @author Fnatic
 */
import com.devleague.portalnoticias.View.ViewChefe.*;
import com.devleague.portalnoticias.View.*;
import com.devleague.portalnoticias.Model.Chefe;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ListaChefesTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Chefe> chefe;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_SALARIO = 2;

    public ListaChefesTable(ArrayList<Chefe> chefe) {
        this.chefe = chefe;
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
        return chefe.size();
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
            case COLUNA_SALARIO:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chefe chefe = this.chefe.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return chefe.getId();
            case COLUNA_NOME:
                return chefe.getNome();
            case COLUNA_SALARIO:
                return chefe.getSalario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Chefe chefe = this.chefe.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                chefe.setNome(aValue.toString());
                break;
            case COLUNA_SALARIO:
                if (aValue instanceof Float) {
                    chefe.setSalario((Float)aValue);
                }
                break;
        }
        fireTableDataChanged();
    }
}