/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_02;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author fabien
 */
public class Client {
    private String nom;
    private Facture facture;
    
    Client(String nom) {
        this.nom = nom;
    }
    
    void setFacture(Facture f) {
        this.facture=f;
    }
    
    String getNom() { return nom;}
    String rendre(Function<Client,String> rendu) {
        return rendu.apply(this);
    }
    
    String lie(BiFunction<Client,Facture,String> liaison) {
        return liaison.apply(this, facture);
    }
}
