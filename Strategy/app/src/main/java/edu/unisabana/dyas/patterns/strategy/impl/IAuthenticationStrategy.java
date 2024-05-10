package edu.unisabana.dyas.patterns.strategy.impl;

/**
 @author cesarvefe
 
 */
public interface IAuthenticationStrategy {
    
    public Principal authenticate(String userName, String passwrd);
}