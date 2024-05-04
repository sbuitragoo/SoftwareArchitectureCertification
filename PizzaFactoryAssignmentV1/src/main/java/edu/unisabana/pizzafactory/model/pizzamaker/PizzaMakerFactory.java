package edu.unisabana.pizzafactory.model.pizzamaker;

import edu.unisabana.pizzafactory.exception.InvalidDoughException;
import edu.unisabana.pizzafactory.model.DoughType;

public class PizzaMakerFactory {
    public static PizzaMaker getPizzaMaker(DoughType doughType) throws InvalidDoughException {
        switch (doughType) {
            case THIN:
                return new ThinPizzaMaker();
            case THICK:
                return new ThickPizzaMaker();
            case WHOLEMEAL:
                return new WholemealPizzaMaker();
            default:
                throw new InvalidDoughException("Dough " + doughType + " not supported");
        }
    }
}
