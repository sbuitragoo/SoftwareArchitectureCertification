package edu.unisabana.pizzafactory.model.molder;

public class ThinPizzaDoughMolder implements Molder {

    public ThinPizzaDoughMolder() {}

    @Override
    public void moldSmall() {
        System.out.println("Molding a small thin pizza");
    }

    @Override
    public void moldMedian() {
        System.out.println("Molding a median thin pizza");
    }
}
