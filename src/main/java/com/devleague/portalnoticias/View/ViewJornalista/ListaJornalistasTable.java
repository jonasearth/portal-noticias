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
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ListaJornalistasTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome", };
    private ArrayList<Jornalista> jornalista;
    private final int COLUNA_ID = 0;
    private final int COLUNA_NOME = 1;

    public ListaJornalistasTable(ArrayList<Jornalista> jornalista) {
        this.jornalista = jornalista;
    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
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
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Jornalista noticia = this.jornalista.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                break;
        }
        fireTableDataChanged();
    }
}