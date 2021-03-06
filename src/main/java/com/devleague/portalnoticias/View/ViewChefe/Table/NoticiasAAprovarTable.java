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

import com.devleague.portalnoticias.Controller.Jornalista.GetJornalistaController;
import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.UUID;

public class NoticiasAAprovarTable extends AbstractTableModel {

    private String colunas[] = {"id", "Titulo","Jornalista" };
    private ArrayList<Noticia> noticia;

    public final int COLUNA_ID = 0;
    public final int COLUNA_TITULO = 1;
    public final int COLUNA_JORNALISTA = 2;

    public NoticiasAAprovarTable(ArrayList<Noticia> noticia) {
        this.noticia = noticia;

    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      return false;
    }

    @Override
    public int getRowCount() {
        return noticia.size();
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
            case COLUNA_TITULO:
                return String.class;
            case COLUNA_JORNALISTA:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Noticia noticia = this.noticia.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return noticia.getId();
            case COLUNA_TITULO:
                return noticia.getTitulo();
            case COLUNA_JORNALISTA:
                try {
                    String nome = GetJornalistaController.get(noticia.getAtribuidoA()).getNome();
                    return nome;
                }catch (Exception e){
                    return "Jornalista n??o encontrado!";
                }

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Noticia noticia = this.noticia.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_TITULO:
                noticia.setTitulo(aValue.toString());
                break;
            case COLUNA_JORNALISTA:
                break;
        }
        fireTableDataChanged();
    }
}