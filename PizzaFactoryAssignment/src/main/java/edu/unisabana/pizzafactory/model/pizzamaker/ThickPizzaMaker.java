package edu.unisabana.pizzafactory.model.pizzamaker;

import edu.unisabana.pizzafactory.exception.InvalidSizeException;
import edu.unisabana.pizzafactory.model.Size;
import edu.unisabana.pizzafactory.model.baker.ThickPizzaDoughBaker;
import edu.unisabana.pizzafactory.model.kneader.ThickPizzaDoughKneader;
import edu.unisabana.pizzafactory.model.molder.ThickPizzaDoughMolder;

public class ThickPizzaMaker implements PizzaMaker{
    public ThickPizzaMaker() {}

    @Override
    public void makePizza(Size size) throws Exception {
        ThickPizzaDoughKneader thickPizzaDoughKneader = new ThickPizzaDoughKneader();
        ThickPizzaDoughMolder thickPizzaDoughMolder = new ThickPizzaDoughMolder();
        ThickPizzaDoughBaker thickPizzaDoughBaker = new ThickPizzaDoughBaker();

        thickPizzaDoughKneader.knead();

        if (size == Size.SMALL) {
            thickPizzaDoughMolder.moldSmall();
        } else if (size == Size.MEDIAN) {
            thickPizzaDoughMolder.moldMedian();
        } else {
            throw new InvalidSizeException("Size " + size + " not supported");
        }

        thickPizzaDoughBaker.bake();
    }
}
