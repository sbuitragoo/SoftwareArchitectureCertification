package edu.unisabana.pizzafactory.model.baker;

public class WholemealPizzaDoughBaker implements Baker{

    public WholemealPizzaDoughBaker() {}

    @Override
    public void bake() {
        System.out.println("Baking wholemeal pizza dough");
    }
}
