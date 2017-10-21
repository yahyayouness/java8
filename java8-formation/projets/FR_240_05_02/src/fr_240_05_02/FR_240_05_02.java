/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author fabien
 */
public class FR_240_05_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Facture> factures = new ArrayList<Facture>();
        factures.add(new Facture("2016-01-01",4567.76, "Fabien Ets"));
        factures.add(new Facture("2015-01-01",467.76, "Fabien Ets"));
        factures.add(new Facture("2015-06-01",457.76, "Rasori"));
        factures.add(new Facture("2015-08-01",567.76, "Rasori"));
        factures.add(new Facture("2016-01-01",124567.76, "Prefe"));
        factures.add(new Facture("2016-01-01",42567.76, "Cliejt"));
        
        
        factures.stream().forEach(s->System.out.println(s));
        factures.stream().filter(f -> f.getTotal()<500).forEach(System.out::println);
        factures.stream().map(f -> f.getTotal()).filter(d -> d<10000).forEach(System.out::println);
        Optional resultat = factures.stream().map(f -> f.getTotal()).filter(d -> d<10000).reduce(Double::sum);
        System.out.println("Total "+resultat.get());
        
    }
    
}
