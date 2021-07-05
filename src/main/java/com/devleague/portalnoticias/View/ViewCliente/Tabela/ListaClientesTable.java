/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewCliente.Tabela;

/**
 *
 * @author Fnatic
 */
import com.devleague.portalnoticias.View.ViewCliente.*;
import com.devleague.portalnoticias.View.*;
import com.devleague.portalnoticias.Model.Cliente;
import com.devleague.portalnoticias.View.Components.DialogoMsg;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ListaClientesTable extends AbstractTableModel {

    private String colunas[] = {"id", "nome","salario" };
    private ArrayList<Cliente> cliente;
    public final int COLUNA_ID = 0;
    public final int COLUNA_NOME = 1;
    public final int COLUNA_PAGANTE = 2;

    public ListaClientesTable(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
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
        return cliente.size();
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
            case COLUNA_PAGANTE:
                return Boolean.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = this.cliente.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return cliente.getId();
            case COLUNA_NOME:
                return cliente.getNome();
            case COLUNA_PAGANTE:
                return cliente.isPagante();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = this.cliente.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_NOME:
                cliente.setNome(aValue.toString());
                break;
            case COLUNA_PAGANTE:
                    cliente.setPagante((Boolean) aValue);

                break;
        }
        fireTableDataChanged();
    }
}