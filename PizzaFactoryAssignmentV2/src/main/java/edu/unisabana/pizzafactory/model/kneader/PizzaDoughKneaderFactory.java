package edu.unisabana.pizzafactory.model.kneader;

import edu.unisabana.pizzafactory.exception.InvalidDoughException;
import edu.unisabana.pizzafactory.model.DoughType;

public class PizzaDoughKneaderFactory {
    public static Kneader getKneader(DoughType doughType) throws InvalidDoughException {
        switch (doughType) {
            case THIN:
                return new ThinPizzaDoughKneader();
            case THICK:
                return new ThickPizzaDoughKneader();
            case WHOLEMEAL:
                return new WholemealPizzaDoughKneader();
            default:
                throw new InvalidDoughException("Dough " + doughType + " not supported");
        }
    }
}
