
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.exception.InvalidDoughException;
import edu.unisabana.pizzafactory.model.*;
import edu.unisabana.pizzafactory.model.pizzamaker.PizzaMaker;
import edu.unisabana.pizzafactory.model.pizzamaker.PizzaMakerFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Buitrago
 */
public class MainPizzaMaker {

    public static void main(String[] args){
        try {
            Ingredient[] ingredients = new Ingredient[] {new Ingredient("queso",1),new Ingredient("jamon",2)};

            PizzaMaker pizzaMaker = PizzaMakerFactory.getPizzaMaker(DoughType.THIN);

            pizzaMaker.makePizza(Size.MEDIAN);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
