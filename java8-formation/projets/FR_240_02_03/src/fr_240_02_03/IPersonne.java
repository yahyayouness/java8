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
public interface IPersonne {
    String getNom();
    default String getSiret() { return "Pas de Siret";}
}
