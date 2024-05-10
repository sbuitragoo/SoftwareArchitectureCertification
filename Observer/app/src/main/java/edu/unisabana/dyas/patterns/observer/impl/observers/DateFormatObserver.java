package edu.unisabana.dyas.patterns.observer.impl.observers;

import java.util.Date;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.IObserver;

/**
 * @author cesarvefe
 
 */
public class DateFormatObserver implements IObserver{

    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("defaultDateFormat")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> DateFormatObserver.dateFormatChange > " 
                    + conf.getDefaultDateFormat().format(new Date()));
        }
    }   
}