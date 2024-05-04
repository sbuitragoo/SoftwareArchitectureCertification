package edu.unisabana.pizzafactory.model.pizzamaker;

import edu.unisabana.pizzafactory.exception.InvalidSizeException;
import edu.unisabana.pizzafactory.model.Size;
import edu.unisabana.pizzafactory.model.baker.WholemealPizzaDoughBaker;
import edu.unisabana.pizzafactory.model.kneader.WholemealPizzaDoughKneader;
import edu.unisabana.pizzafactory.model.molder.WholemealPizzaDoughMolder;

public class WholemealPizzaMaker implements PizzaMaker{
    public WholemealPizzaMaker() {}

    @Override
    public void makePizza(Size size) throws Exception {
        WholemealPizzaDoughKneader wholemealPizzaDoughKneader = new WholemealPizzaDoughKneader();
        WholemealPizzaDoughMolder wholemealPizzaDoughMolder = new WholemealPizzaDoughMolder();
        WholemealPizzaDoughBaker wholemealPizzaDoughBaker = new WholemealPizzaDoughBaker();

        wholemealPizzaDoughKneader.knead();

        if (size == Size.SMALL) {
            wholemealPizzaDoughMolder.moldSmall();
        } else if (size == Size.MEDIAN) {
            wholemealPizzaDoughMolder.moldMedian();
        } else {
            throw new InvalidSizeException("Size " + size + " not supported");
        }

        wholemealPizzaDoughBaker.bake();
    }
}
