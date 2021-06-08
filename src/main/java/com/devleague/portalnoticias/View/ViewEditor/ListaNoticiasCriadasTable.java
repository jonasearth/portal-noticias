/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devleague.portalnoticias.View.ViewEditor;

/**
 *
 * @author david
 */
import com.devleague.portalnoticias.Model.Noticia;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class ListaNoticiasCriadasTable extends AbstractTableModel{
   private final String colunas[] = {"id", "noticia", "jornalista"};
   private final ArrayList<Noticia> noticias;
    public final int COLUNA_ID = 0;
    public final int COLUNA_TITULO = 1;
    public final int COLUNA_JORNALISTA = 2;

    public ListaNoticiasCriadasTable(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
    }

    @Override
    public int getRowCount() {
        return noticias.size();
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
        Noticia noticia = this.noticias.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                return noticia.getId();
            case COLUNA_TITULO:
                return noticia.getTitulo();
            case COLUNA_JORNALISTA:
                return noticia.getAuthor();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Noticia noticia = this.noticias.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_TITULO:
                break;
            case COLUNA_JORNALISTA:
                break;
        }
        fireTableDataChanged();
    }
}
