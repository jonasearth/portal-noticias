package com.devleague.portalnoticias.View.Components;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class DialogoMsg {
    /**
     * @param dimentions width height
     */
    public DialogoMsg(String msg, Integer... dimentions){
        Integer w = dimentions.length > 0 ? dimentions[0] : 400;
        Integer h = dimentions.length > 1 ? dimentions[1] : 100;
        JDialog dialogoError;
        dialogoError = new javax.swing.JDialog();
        dialogoError.setLocationRelativeTo(null);
        Dimension d = new Dimension();
        d.setSize(w, h);
        dialogoError.setMinimumSize(d);
        JLabel new_text = new JLabel(msg);
        new_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_text.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        dialogoError.add(new_text);
        dialogoError.setVisible(true);
    }
}
