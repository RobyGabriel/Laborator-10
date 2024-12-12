package com.mycompany.lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interfata extends JFrame{
     public Interfata(){
        JFrame fereastra = new JFrame("Interfata");
        fereastra.setSize(400, 300);
        fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fereastra.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
         JButton buton = new JButton("Apasa-ma");
        buton.setBounds(150, 120, 100, 40);

        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fereastra, "Butonul a fost apasat!");
            }
        });

        fereastra.add(buton);

        fereastra.setVisible(true);
    }
}
