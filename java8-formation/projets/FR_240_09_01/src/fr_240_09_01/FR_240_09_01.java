/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_09_01;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author fabien
 */
public class FR_240_09_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ScriptException {
       
        ScriptEngineManager em = new ScriptEngineManager();
        
        ScriptEngine moteur = em.getEngineByName("nashorn");
        
        moteur.eval("function somme(a,b) { return a+b;}");
        System.out.println(moteur.eval("somme(1,2);"));
        
    }
    
}
