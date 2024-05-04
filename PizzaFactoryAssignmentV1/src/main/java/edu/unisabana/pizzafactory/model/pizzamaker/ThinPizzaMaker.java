package edu.unisabana.pizzafactory.model.pizzamaker;

import edu.unisabana.pizzafactory.exception.InvalidSizeException;
import edu.unisabana.pizzafactory.model.Size;
import edu.unisabana.pizzafactory.model.baker.ThinPizzaDoughBaker;
import edu.unisabana.pizzafactory.model.kneader.ThinPizzaDoughKneader;
import edu.unisabana.pizzafactory.model.molder.ThinPizzaDoughMolder;

public class ThinPizzaMaker implements PizzaMaker{
    public ThinPizzaMaker() {}

    @Override
    public void makePizza(Size size) throws Exception {
        ThinPizzaDoughKneader thinPizzaDoughKneader = new ThinPizzaDoughKneader();
        ThinPizzaDoughMolder thinPizzaDoughMolder = new ThinPizzaDoughMolder();
        ThinPizzaDoughBaker thinPizzaDoughBaker = new ThinPizzaDoughBaker();

        thinPizzaDoughKneader.knead();

        if (size == Size.SMALL) {
            thinPizzaDoughMolder.moldSmall();
        } else if (size == Size.MEDIAN) {
            thinPizzaDoughMolder.moldMedian();
        } else {
            throw new InvalidSizeException("Size " + size + " not supported");
        }

        thinPizzaDoughBaker.bake();
    }
}
