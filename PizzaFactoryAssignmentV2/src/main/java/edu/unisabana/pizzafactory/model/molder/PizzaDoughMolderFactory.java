package edu.unisabana.pizzafactory.model.molder;

import edu.unisabana.pizzafactory.exception.InvalidDoughException;
import edu.unisabana.pizzafactory.model.DoughType;

public class PizzaDoughMolderFactory {
    public static Molder getMolder(DoughType doughType) throws InvalidDoughException {
        switch (doughType) {
            case THIN:
                return new ThinPizzaDoughMolder();
            case THICK:
                return new ThickPizzaDoughMolder();
            case WHOLEMEAL:
                return new WholemealPizzaDoughMolder();
            default:
                throw new InvalidDoughException("Dough " + doughType + " not supported");
        }
    }
}
