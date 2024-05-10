package edu.unisabana.dyas.patterns.observer.impl;

/**
 * @author cesarvefe
 
 */
public interface IObservable {

    public void addObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyAllObservers(String command, Object source);
}