/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_03;

import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author fabien
 */
public class Catalogue {
    List<Article> lesArticles = new ArrayList<Article>();
    
    void ajoute(Article art) {
        lesArticles.add(art);
    }
    
    List<Article> rechercheArticlePrix(Predicate<Article> f) {
        
        List<Article> retval = new ArrayList<Article>();
        
        for(Article a : lesArticles) {
            if(f.test(a)) {
                retval.add(a);
            }
        }
        
        return retval;
    }
}
