/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_05;

import java.util.*;
import java.util.function.Consumer;

/**
 *
 * @author fabien
 */
public class Repertoire {
    private List<Fichier> enfants = new ArrayList<>();
    List<Fichier> getEnfants() { return enfants;}
  
    Repertoire(String nom) { this.nom=nom;}
    private String nom;
    String getNom() { return nom;}
    
    void affiche(Consumer<Repertoire> sortie) {
        sortie.accept(this);
    }

    void ajouter(Fichier f1) {
        enfants.add(f1);
    }
}
