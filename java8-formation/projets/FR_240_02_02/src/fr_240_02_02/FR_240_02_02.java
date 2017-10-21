/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_02;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author fabien
 */
public class FR_240_02_02 extends JFrame {

    JTextField texte;
    
    public FR_240_02_02 () {
        
        setLayout(new FlowLayout());
        
        texte = new JTextField("Hello Java World");
        add(texte);
        
        JButton clic = new JButton("Clic");
        add(clic);
        
        clic.addActionListener(ae -> texte.setText("Bonjour"));
        
        pack();
    }
    
    public static void main(String[] args) {
        FR_240_02_02 f = new FR_240_02_02();
        f.setVisible(true);
    }
    
}
