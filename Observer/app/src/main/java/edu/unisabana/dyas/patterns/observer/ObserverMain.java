package edu.unisabana.dyas.patterns.observer;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Observable;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.observers.DateFormatObserver;
import edu.unisabana.dyas.patterns.observer.impl.observers.MoneyFormatObserver;

/**
 * @author cesarvefe
 
 */
public class ObserverMain {

    public static void main(String[] args) {
        ConfigurationManager conf = ConfigurationManager.getInstance();
        
        //Se establecen los valores por default.
        conf.setDefaultDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        conf.setMoneyFormat(new DecimalFormat("##.00"));
        System.out.println("Established configuration");
        
        //Se dan de alta lo observers
        DateFormatObserver dateFormatObserver = new DateFormatObserver();
        MoneyFormatObserver moneyFormatObserver = new MoneyFormatObserver();
        conf.addObserver(dateFormatObserver);
        conf.addObserver(moneyFormatObserver);
        System.out.println("");
        
        //Se cambia la fonfiguratión
        conf.setDefaultDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,#00.00"));
        System.out.println("");
        
        //Se realiza otro cambio en la configuración.
        conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy/dd"));
        conf.setMoneyFormat(new DecimalFormat("###,#00"));
        
        conf.removeObserver(dateFormatObserver);
        conf.removeObserver(moneyFormatObserver);
        System.out.println("");
        
        //Se realiza otro cambio en la configuración.
        conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,##0.00"));
    }
}