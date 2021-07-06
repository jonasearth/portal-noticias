/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewMediador;

/**
 *
 * @author David
 */

import com.devleague.portalnoticias.Model.Mediador;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class ListaMediadoresTable extends AbstractTableModel {

    private final String colunas[] = {"id", "nome", "salario"};
    private final ArrayList<Mediador> mediador;

    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_SALARIO = 2;

    public ListaMediadoresTable(ArrayList<Mediador> mediador) {
        this.mediador = mediador;
    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    @Override
    public int getRowCount() {
        return mediador.size();
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
            case COLUNA_SALARIO:
                return String.class;                
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mediador mediadorAtual = this.mediador.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return mediadorAtual.getId();
            case COLUNA_NOME:
                return mediadorAtual.getNome();
            case COLUNA_SALARIO:
                return mediadorAtual.getSalario();                
            default: 
                return null;

        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Mediador mediadorAtual = this.mediador.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                mediadorAtual.setNome(aValue.toString());
                break;
            case COLUNA_SALARIO:
                if (aValue instanceof Float) {
                    mediadorAtual.setSalario((Float)aValue);
                }
                break;
        }
        fireTableDataChanged();
    }
    
}