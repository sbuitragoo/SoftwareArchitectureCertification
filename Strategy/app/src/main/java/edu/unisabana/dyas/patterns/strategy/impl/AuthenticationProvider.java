package edu.unisabana.dyas.patterns.strategy.impl;

/**
 @author cesarvefe
 
 */
public class AuthenticationProvider {
    private IAuthenticationStrategy authenticationStrategy;
    
    public void setAuthenticationStrategy(IAuthenticationStrategy strategy){
        this.authenticationStrategy = strategy;
    }
    
    public Principal authenticate(String userName, String password){
        if(authenticationStrategy==null){
            throw new RuntimeException("Strategy not found");
        }
        return authenticationStrategy.authenticate(userName, password);
    }
}