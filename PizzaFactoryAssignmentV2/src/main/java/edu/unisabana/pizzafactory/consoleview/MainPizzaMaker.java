
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.exception.InvalidSizeException;
import edu.unisabana.pizzafactory.model.*;
import edu.unisabana.pizzafactory.model.baker.Baker;
import edu.unisabana.pizzafactory.model.baker.PizzaDoughBakerFactory;
import edu.unisabana.pizzafactory.model.kneader.Kneader;
import edu.unisabana.pizzafactory.model.kneader.PizzaDoughKneaderFactory;
import edu.unisabana.pizzafactory.model.molder.Molder;
import edu.unisabana.pizzafactory.model.molder.PizzaDoughMolderFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class MainPizzaMaker {

    public static void main(String[] args){
        try {
            Ingredient[] ingredients = new Ingredient[] {new Ingredient("queso",1),new Ingredient("jamon",2)};

            Size pizzaSize = Size.MEDIAN;

            DoughType doughType = DoughType.WHOLEMEAL;

            Kneader kneader = PizzaDoughKneaderFactory.getKneader(doughType);

            Molder molder = PizzaDoughMolderFactory.getMolder(doughType);

            Baker baker = PizzaDoughBakerFactory.getBaker(doughType);

            kneader.knead();

            if (pizzaSize == Size.SMALL) {
                molder.moldSmall();
            } else if (pizzaSize == Size.MEDIAN) {
                molder.moldMedian();
            } else {
                throw new InvalidSizeException("Size " + pizzaSize + " not supported");
            }

            baker.bake();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
