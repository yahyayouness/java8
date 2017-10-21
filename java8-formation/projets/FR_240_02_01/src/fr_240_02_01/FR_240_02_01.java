/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author fabien
 */
class MaClasseDeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
       System.out.println("Clique moi a fonctionnéé");
    }
    
}
public class FR_240_02_01 extends JFrame{

    public FR_240_02_01 () {
        
        JButton monButton = new JButton("Clique moi");
        add(monButton);
        
        //MaClasseDeListener monListener  = new MaClasseDeListener();
        
        monButton.addActionListener(actionEvent -> System.out.println("Clique moi a fonctionné"));
        
        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FR_240_02_01 f = new FR_240_02_01();
        f.setVisible(true);
    }
    
}
