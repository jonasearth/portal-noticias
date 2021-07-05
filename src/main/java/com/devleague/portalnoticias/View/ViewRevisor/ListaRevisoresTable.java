/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewRevisor;

/**
 *
 * @author Fnatic
 */
import com.devleague.portalnoticias.View.ViewRevisor.*;
import com.devleague.portalnoticias.View.*;
import com.devleague.portalnoticias.Model.Revisor;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ListaRevisoresTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Revisor> revisor;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_SALARIO = 2;

    public ListaRevisoresTable(ArrayList<Revisor> revisor) {
        this.revisor = revisor;
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
        return revisor.size();
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
        Revisor revisor = this.revisor.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return revisor.getId();
            case COLUNA_NOME:
                return revisor.getNome();
            case COLUNA_SALARIO:
                return revisor.getSalario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Revisor revisor = this.revisor.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                revisor.setNome(aValue.toString());
                break;
            case COLUNA_SALARIO:
                if (aValue instanceof Float) {
                    revisor.setSalario((Float)aValue);
                }
                break;
        }
        fireTableDataChanged();
    }
}