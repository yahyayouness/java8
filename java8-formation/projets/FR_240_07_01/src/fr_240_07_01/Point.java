/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_07_01;

import java.util.concurrent.locks.StampedLock;

/**
 *
 * @author fabien
 */
public class Point {
    private double x,y;
    private final StampedLock sl = new StampedLock();
    
    
    void move(double dx, double dy) {
        long stamp = sl.writeLock();
        
        try {
            x+=dx;
            y+=dy;
        }
        finally {
            sl.unlockWrite(stamp);
        }
    }
    
    double distance() {
        long stamp =sl.tryOptimisticRead();
        double cx=x, cy=y;
        if(!sl.validate(stamp)) {
            stamp = sl.readLock();
            try { 
                cx=x;
                cy=y;
            }
            finally {
                sl.unlockRead(stamp);
            }
        }
        
        
        return Math.sqrt(cx*cx+cy*cy);
    }
    
}
