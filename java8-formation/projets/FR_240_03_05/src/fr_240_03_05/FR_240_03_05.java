/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_05;

/**
 *
 * @author fabien
 */
public class FR_240_03_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Repertoire d1 = new Repertoire("dir");
        Fichier f1 = new Fichier("data.txt");
        d1.ajouter(f1);
        
        d1.affiche((Repertoire r)-> {
            System.out.println("DOSSIER : "+r.getNom());
            for(Fichier f : r.getEnfants()) {
                f.affiche(e -> System.out.println("  " + e.getNom()));
            }
        });
        
        //f1.affiche(f -> System.out.println(f.getNom()));
        
    }
    
}
