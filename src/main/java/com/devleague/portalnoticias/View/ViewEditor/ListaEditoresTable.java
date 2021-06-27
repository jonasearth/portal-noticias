/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewEditor;

/**
 *
 * @author Fnatic
 */

import com.devleague.portalnoticias.Model.Editor;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListaEditoresTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Editor> editor;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_SALARIO = 2;

    public ListaEditoresTable(ArrayList<Editor> editor) {
        this.editor = editor;
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
        return editor.size();
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
        Editor editor = this.editor.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return editor.getId();
            case COLUNA_NOME:
                return editor.getNome();
            case COLUNA_SALARIO:
                return editor.getSalario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Editor editor = this.editor.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                editor.setNome(aValue.toString());
                break;
            case COLUNA_SALARIO:
                if (aValue instanceof Float) {
                    editor.setSalario((Float)aValue);
                }
                break;
        }
        fireTableDataChanged();
    }
}