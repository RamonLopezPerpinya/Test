package com.company;

public class Car extends Vehicle{

    protected double gramsCO2;
    protected double engineDisplacement;

    public double getGramsCO2() {
        return gramsCO2;
    }

    public void setGramsCO2(double gramsCO2) {
        this.gramsCO2 = gramsCO2;
    }

    @Override
    public double calculateTaxes(){
        //throw new Exception("Hola Holaaa");
        return 0.0;

    }
}
