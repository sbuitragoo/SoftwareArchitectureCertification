package edu.unisabana.dyas.patterns.strategy.impl.providers;

import edu.unisabana.dyas.patterns.strategy.impl.IAuthenticationStrategy;
import edu.unisabana.dyas.patterns.strategy.impl.Principal;
import edu.unisabana.dyas.patterns.strategy.util.OnMemoryDataBase;
import edu.unisabana.dyas.patterns.strategy.util.User;

/**
 @author cesarvefe
 
 */
public class OnMemoryAuthenticationProvider implements IAuthenticationStrategy{

    @Override
    public Principal authenticate(String userName, String passwrd) {
        User user = OnMemoryDataBase.findUserByName(userName);
        if(user!=null && user.getPassword().equals(passwrd)){
            return new Principal(user.getUserName(), user.getRol());
        }
        
        return null;
    }
}