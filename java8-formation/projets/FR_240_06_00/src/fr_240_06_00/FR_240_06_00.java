/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_00;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 *
 * @author fabien
 */
public class FR_240_06_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDateTime tp = LocalDateTime.now();
        LocalTime lt = LocalTime.of(12, 12);
        
        tp.minusMinutes(12);
        
        ZoneId zid = ZoneId.of("Europe/Paris");
        ZonedDateTime zd = ZonedDateTime.of(tp, zid);
        
        Period p = Period.of(1, 0, 0);
       
        LocalDate ld = LocalDate.now();
        ld.plus(p);
        
        Chronology dt = Chronology.ofLocale(Locale.FRENCH);
        ChronoLocalDate cld = dt.dateNow();
        int annee = cld.get(ChronoField.YEAR);
        
        cld = JapaneseDate.now();
        annee = cld.get(ChronoField.YEAR);
        
     }
    
}
