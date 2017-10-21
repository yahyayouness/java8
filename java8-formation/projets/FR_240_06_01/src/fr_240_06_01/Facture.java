/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_01;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
import static java.time.temporal.TemporalAdjusters.lastDayOfYear;
import java.time.temporal.TemporalUnit;


/**
 *
 * @author fabien
 */
public class Facture {
    private String numero;
    private ZonedDateTime date;
    private ZonedDateTime echeance;
    static private Period dureeMax = Period.of(0,2,0);
    
    public Facture(String numero) {
        this.numero = numero;
        date = ZonedDateTime.now();
        echeance = date.plus(dureeMax);
    }
    
    @Override
    public String toString() {
        return "Numero "+numero+" date "+date.toString()+" échéance au "+echeance;
    }

    long resteAvantEcheance() {
        
        return LocalDate.now().until(echeance, DAYS);
        
    }
    
   
}
