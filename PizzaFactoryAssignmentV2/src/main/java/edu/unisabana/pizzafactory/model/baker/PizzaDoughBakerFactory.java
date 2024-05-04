package edu.unisabana.pizzafactory.model.baker;

import edu.unisabana.pizzafactory.exception.InvalidDoughException;
import edu.unisabana.pizzafactory.model.DoughType;

public class PizzaDoughBakerFactory {
    public static Baker getBaker(DoughType doughType) throws InvalidDoughException {
        switch (doughType) {
            case THIN:
                return new ThinPizzaDoughBaker();
            case THICK:
                return new ThickPizzaDoughBaker();
            case WHOLEMEAL:
                return new WholemealPizzaDoughBaker();
            default:
                throw new InvalidDoughException("Dough " + doughType + " not supported");
        }
    }
}
