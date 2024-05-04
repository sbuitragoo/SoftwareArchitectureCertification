package edu.unisabana.pizzafactory.model.pizzamaker;

import edu.unisabana.pizzafactory.model.Size;

public interface PizzaMaker {
    void makePizza(Size size) throws Exception;
}
