/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_02;

import java.util.function.UnaryOperator;

/**
 *
 * @author fabien
 */
public class Facture {
    
    private String  numero;
    
    Facture (String numero) {
        this.numero=numero;
    }
    String getNumero(){
        return numero;
    }
    void increment(UnaryOperator<String> inc) {
        numero = inc.apply(numero);
    }
}
