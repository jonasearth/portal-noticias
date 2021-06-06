/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewJornalista;

/**
 *
 * @author Fnatic
 */
import com.devleague.portalnoticias.View.*;
import com.devleague.portalnoticias.Model.Jornalista;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ListaJornalistasTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Jornalista> jornalista;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_SALARIO = 2;

    public ListaJornalistasTable(ArrayList<Jornalista> jornalista) {
        this.jornalista = jornalista;
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
        return jornalista.size();
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
        Jornalista jornalista = this.jornalista.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return jornalista.getId();
            case COLUNA_NOME:
                return jornalista.getNome();
            case COLUNA_SALARIO:
                return jornalista.getSalario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Jornalista jornalista = this.jornalista.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                jornalista.setNome(aValue.toString());
                break;
            case COLUNA_SALARIO:
                if (aValue instanceof Float) {
                    jornalista.setSalario((Float)aValue);
                }
                break;
        }
        fireTableDataChanged();
    }
}