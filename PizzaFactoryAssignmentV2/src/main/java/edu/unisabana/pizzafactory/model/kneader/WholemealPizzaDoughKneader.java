package edu.unisabana.pizzafactory.model.kneader;

public class WholemealPizzaDoughKneader implements Kneader{
    public WholemealPizzaDoughKneader() {}

    @Override
    public void knead() {
        System.out.println("Kneading wholemeal pizza dough");
    }
}
