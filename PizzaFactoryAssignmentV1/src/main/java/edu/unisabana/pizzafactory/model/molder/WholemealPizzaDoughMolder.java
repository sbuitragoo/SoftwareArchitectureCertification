package edu.unisabana.pizzafactory.model.molder;

public class WholemealPizzaDoughMolder implements Molder {

    public WholemealPizzaDoughMolder() {}

    @Override
    public void moldSmall() {
        System.out.println("Molding a small wholemeal pizza");
    }

    @Override
    public void moldMedian() {
        System.out.println("Molding a median wholemeal pizza");
    }
}
