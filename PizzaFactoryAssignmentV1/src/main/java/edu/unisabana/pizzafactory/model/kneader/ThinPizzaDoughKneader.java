package edu.unisabana.pizzafactory.model.kneader;

public class ThinPizzaDoughKneader implements Kneader{
    public ThinPizzaDoughKneader() {}

    @Override
    public void knead() {
        System.out.println("Kneading thin pizza dough");
    }
}
