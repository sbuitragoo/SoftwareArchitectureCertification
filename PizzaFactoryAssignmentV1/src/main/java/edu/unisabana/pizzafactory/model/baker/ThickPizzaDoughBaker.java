package edu.unisabana.pizzafactory.model.baker;

public class ThickPizzaDoughBaker implements Baker{
    public ThickPizzaDoughBaker() {}

    @Override
    public void bake() {
        System.out.println("Baking thick pizza dough");
    }
}
