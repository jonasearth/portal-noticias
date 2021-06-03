package com.devleague.portalnoticias.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CreateNoticia {
    public JButton btnMsg;
    public JPanel panelMain;
    private JTextField autor;
    private JTextArea conteudo;
    private JComboBox categoria;

    public CreateNoticia() {
        btnMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Noticia criada com sucesso!");
            }
        });
    }
}
