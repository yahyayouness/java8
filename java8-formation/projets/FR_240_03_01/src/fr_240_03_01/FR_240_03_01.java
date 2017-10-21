/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_01;

/**
 *
 * @author fabien
 */
public class FR_240_03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        declencheExecution(()-> System.out.println("Execution"));
        
        MonInterface maFonction = () -> System.out.println("Execution retardée");
        
        maFonction.execute();
//        
        MaClasse monObjet = new MaClasse();
//        
        maFonction = monObjet::execute;
//       
        maFonction.execute();
//        
        declencheExecution(monObjet::execute);
    }
    
    public static void declencheExecution(MonInterface mi) {
        mi.execute();
    }
    
}
