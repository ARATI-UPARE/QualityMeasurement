package com.quantitymeasurement;

public class Quantity {
    public Unit unit;
    public double value;
    public String quantityType;

    // Parameterized Constructor
    public Quantity(Unit unit, double value) throws QuantityException {
        try {
            this.unit = unit;
            if (value < 0.0 && !unit.quantityType.equals("temperature")) {
                throw new QuantityException(QuantityException.ExceptionType.NAGATIVE_VALUE, "Negative Quantity Not Allowed");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    // Method To Comapre Two Input Quantities
    public boolean compare(Quantity that)throws QuantityException{
        try {
            if (!this.unit.quantityType.equals(that.unit.quantityType)) {
                throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of Quantities");
            }
            if (this.unit.quantityType.equals("temperature")) {
                throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_TEMPERATURE, "Negative Temperature ");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
        return Double.compare(this.value * this.unit.baseUnitConversion,
                that.value * that.unit.baseUnitConversion) == 0;
    }
    // Method To Add Two Input Quantities.
    public double add(Quantity that) throws QuantityException {
        try {
            if (!this.unit.quantityType.equals(that.unit.quantityType)) {
                throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities");
            }
            if (this.unit.quantityType.equals("temperature")) {
                throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_TEMPERATURE, "Temperature cannot be Added!");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
        return this.value * this.unit.baseUnitConversion +
                that.value * that.unit.baseUnitConversion;
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
