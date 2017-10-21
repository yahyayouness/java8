/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_00;

interface MonInterface {
    void print(String s,String t);
}
/**
 *
 * @author fabien
 */
public class FR_240_02_00 {

    /**
     * @param args the command line arguments
     */

    public static void affiche(MonInterface printer) {  
        printer.print("Coucou","Hello");
    }
    
    public static void main(String[] args) {
        
        affiche( (String x,String y)->  { 
                System.out.println(x) ;
                System.out.println(y) ;
                }
        );
        
        
        affiche(( x, y)-> {
        	System.out.println(x);
        	
        });
        
    }
    
}
