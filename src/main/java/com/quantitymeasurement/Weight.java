package com.quantitymeasurement;

public class Weight {
    public double value;
    public Unit unit;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight Weight) {
        boolean compareCheck = unit.compare( this, Weight);
        return compareCheck;
    }

    public double add(Weight Weight) {
        double sum = unit.add(this, Weight);
        return sum;
    }
}
