/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_00;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author fabien
 */
public class FR_240_03_00 extends JFrame{

  
    public FR_240_03_00() {
        JButton monBouton = new JButton("clic");
        add(monBouton);
        
        monBouton.addActionListener( ae-> System.out.println("coucou"));
        
        
        pack();
    }
    public static void appelInterfaceSAM(MonInterfaceSAM i) {
        i.execute();
    }
    
    public static void main(String[] args) {
       appelInterfaceSAM( () -> System.out.println("execution"));
    }
    
}
