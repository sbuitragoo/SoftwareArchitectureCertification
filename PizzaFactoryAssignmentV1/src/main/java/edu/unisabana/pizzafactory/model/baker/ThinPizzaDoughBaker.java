package edu.unisabana.pizzafactory.model.baker;

public class ThinPizzaDoughBaker implements Baker{

    public ThinPizzaDoughBaker() {}

    @Override
    public void bake() {
        System.out.println("Baking thin pizza dough");
    }
}
