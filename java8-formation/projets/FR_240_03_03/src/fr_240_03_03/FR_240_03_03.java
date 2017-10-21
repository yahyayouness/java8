/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_03;

import java.util.List;

/**
 *
 * @author fabien
 */
public class FR_240_03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Catalogue cat = new Catalogue();
       cat.ajoute(new Article("Bouteille",10));
       cat.ajoute(new Article("Sandwich",5));
       cat.ajoute(new Article("Cahier",2));
       
       List<Article> resultat = cat.rechercheArticlePrix(a -> {return a.getPrix()<6;});
        
       for(Article i : resultat) {
           System.out.println("Article "+i.getNom());
       }
    }
    
}
