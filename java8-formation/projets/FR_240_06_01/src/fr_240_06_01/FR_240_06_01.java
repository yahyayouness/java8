/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_01;

/**
 *
 * @author fabien
 */
public class FR_240_06_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facture facture = new Facture("2016-01");
        System.out.println("Facture : "+facture);
        System.out.println("reste aujourd'hui "+facture.resteAvantEcheance());
    }
    
}
