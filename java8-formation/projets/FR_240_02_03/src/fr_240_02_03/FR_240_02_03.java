/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_03;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fabien
 */
public class FR_240_02_03 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public FR_240_02_03() {
        
        JLabel texte = new JLabel("Clique la croix pour tuer le process");
        add(texte);
        
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent we) {
                
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
               
            }

            @Override
            public void windowActivated(WindowEvent we) {
              
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
             
            }
        });
        
        pack();
    }
    public static void main(String[] args) {
        //FR_240_02_03 f = new FR_240_02_03();
        //f.setVisible(true);
        
        PersonnePhysique pp = new PersonnePhysique("Fabien Brissonneau");
        System.out.println(pp);
        
        PersonneMorale pm =new PersonneMorale("eixa6", "44219374400011");
        System.out.println(pm);
    }
    
}
