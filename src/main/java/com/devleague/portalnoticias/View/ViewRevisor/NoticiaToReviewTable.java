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

import com.devleague.portalnoticias.Controller.Chefe.GetChefeController;
import com.devleague.portalnoticias.Model.Noticia;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class NoticiaToReviewTable extends AbstractTableModel {

    //aqui transformei em coluna cada propriedade de Funcionario
    //que eu quero que seja exibida na tabela
    private String colunas[] = {"id", "titulo", "chefe", "data"};
    private ArrayList<Noticia> noticias;
    private final int COLUNA_ID = 0;
    private final int COLUNA_TITULO = 1;

    public NoticiaToReviewTable(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    

    //retorna se a célula é editável ou não
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    //retorna o total de itens(que virarão linhas) da nossa lista
    @Override
    public int getRowCount() {
        return noticias.size();
    }
    //retorna o total de colunas da tabela
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    //retorna o nome da coluna de acordo com seu indice
    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    //determina o tipo de dado da coluna conforme seu indice
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_ID:
                return String.class;
            case COLUNA_TITULO:
                return String.class;
            default:
                return String.class;
        }
    }

    //preenche cada célula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Noticia noticias = this.noticias.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_ID:
                return noticias.getId();
            case COLUNA_TITULO:
                return noticias.getTitulo();
                
        }
        return null;
    }
    //altera o valor do objeto de acordo com a célula editada
    //e notifica a alteração da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo método é do tipo Object
        //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
        Noticia noticia = this.noticias.get(rowIndex);
        //de acordo com a coluna, ele preenche a célula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
            case COLUNA_ID:
                break;
            case COLUNA_TITULO:
                break;
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }
}