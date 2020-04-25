package com.quantitymeasurement;

public class Quantity {
    public Unit unit;
    public double value;
    public Addition add;
    public Comparision compare;

    // Parameterized Constructor
    public Quantity(Unit unit, double value) throws QuantityException {
        this.unit = unit;
        try {
            if (value < 0.0 && !unit.quantityType.equals(QuantityType.TEMPERATURE) ) {
                throw new QuantityException(QuantityException.ExceptionType.NAGATIVE_VALUE, "Negative Quantity Not Allowed");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quantity quantity = (Quantity) obj;
        return Math.abs(quantity.value - value) <= 0.02 && unit == quantity.unit;
    }

}
