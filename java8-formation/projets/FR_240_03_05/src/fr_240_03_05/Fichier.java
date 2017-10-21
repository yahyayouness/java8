/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_05;

import java.util.function.Consumer;

/**
 *
 * @author fabien
 */
public class Fichier {
    
    Fichier(String nom) { this.nom= nom;}
    private String nom;
    String getNom() { return nom;}
    
    void affiche(Consumer<Fichier> sortie) {
        sortie.accept(this);
    }
}
