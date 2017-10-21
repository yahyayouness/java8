/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_02;

/**
 *
 * @author fabien
 */
public class FR_240_06_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facture f = new Facture("2016-01");
        System.out.println("Facture "+f);
        
        f.accept(" Le 1 du mois n°1 de l'an 2016");
        System.out.println("Facture "+f);
    }
    
}
