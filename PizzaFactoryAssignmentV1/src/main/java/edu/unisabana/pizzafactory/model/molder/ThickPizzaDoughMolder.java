package edu.unisabana.pizzafactory.model.molder;

public class ThickPizzaDoughMolder implements Molder {
    public ThickPizzaDoughMolder() {}

    @Override
    public void moldSmall() {
        System.out.println("Molding a small thick pizza");
    }

    @Override
    public void moldMedian() {
        System.out.println("Molding a median thick pizza");
    }
}
