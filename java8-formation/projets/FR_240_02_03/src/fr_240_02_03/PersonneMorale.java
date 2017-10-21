/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_03;

/**
 *
 * @author fabien
 */
public class PersonneMorale implements IPersonne{
    private String raisonsociale;
    private String SIRET;
    
    @Override
    public String getNom() {
        return raisonsociale;
    }

    @Override
    public String getSiret() {
        return SIRET;
    }
    
    public PersonneMorale(String nom, String siret){
        this.raisonsociale = nom;
        this.SIRET = siret;
    }
    
    @Override 
    public String toString() {
        return raisonsociale+" "+SIRET;
    }
}
