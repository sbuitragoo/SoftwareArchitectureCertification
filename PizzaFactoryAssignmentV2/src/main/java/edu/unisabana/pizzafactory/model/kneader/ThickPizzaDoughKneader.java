package edu.unisabana.pizzafactory.model.kneader;

public class ThickPizzaDoughKneader implements Kneader{
    public ThickPizzaDoughKneader() {}

    @Override
    public void knead() {
        System.out.println("Kneading thick pizza dough");
    }
}
