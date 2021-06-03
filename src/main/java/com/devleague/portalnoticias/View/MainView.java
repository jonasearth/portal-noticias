package com.devleague.portalnoticias.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    public JButton btn_msg;
    public JPanel panel_main;
    private JTextField autor;
    private JTextArea conteudo;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public MainView() {
        btn_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });
    }
}
