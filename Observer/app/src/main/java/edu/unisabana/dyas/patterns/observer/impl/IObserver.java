package edu.unisabana.dyas.patterns.observer.impl;

/**
 * @author cesarvefe
 
 */
public interface IObserver {
    
    public void notifyObserver(String command, Object source);
}