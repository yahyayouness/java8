/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_02;

/**
 *
 * @author fabien
 */
public class FR_240_03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Interface Function<T,R>
        
        Client monClient = new Client("Fabien");
        
        String str = monClient.rendre((Client c)-> { return c.getNom();});
        
        System.out.println("Le client est rendu  : "+str);
        
        str = monClient.rendre((Client c)-> { return "<b>"+c.getNom()+"</b>";});
        
        System.out.println("Le client est rendu  : "+str);
        
        Facture f = new Facture("2016-01");
        System.out.println("Facture initiale : "+f.getNumero());
        f.increment(s ->  {return s+"1";});
        System.out.println("Facture finale : "+f.getNumero());
        
        
        monClient.setFacture(f);
        String resultat = monClient.lie((Client c, Facture ff) -> {return c.getNom()+" " + ff.getNumero();});
        System.out.println("Résultat "+resultat);
    }
    
}
