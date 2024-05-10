package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.IObserver;

/**
 * @author cesarvefe
 
 */
public class MoneyFormatObserver implements IObserver{
    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("moneyFormat")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> MoneyFormatObserver.moneyFormatChange > " 
                    + conf.getMoneyFormat().format(1.11));
        }
    }
}