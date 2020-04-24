package com.quantitymeasurement;

public class Quantity {
    public Unit unit;
    public double value;

    // Parameterized Constructor
    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    // Method To Comapre Two Input Quantities
    public boolean compare(Quantity that){
        boolean compareCheck = unit.compare(this,that);
        return compareCheck;
    }
    // Method To Add Two Input Quantities.
    public double add(Quantity quantity){
        double sum = unit.add(this, quantity);
        return sum;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quantity quantity = (Quantity) obj;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }

}
