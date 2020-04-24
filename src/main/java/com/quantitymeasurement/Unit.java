package com.quantitymeasurement;

public enum Unit {
    // BaseUnit Inch For Length
    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.4),

    // BaseUnit Litre For Volume
    MILLILITRE(0.001),
    LITRE(1.0),
    GALLON(3.78),

    // BaseUnit KG For Mass
    GRAM(0.001),
    KG(1),
    TONNE(1000),

    // BaseUnit Fahrenheit For Temperature
    FAHRENHEIT(1.0),
    CELSIUS(2.12);

    public double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }

    // Method To Comapare Two Quantities
    public boolean compare(Quantity quantity1, Quantity quantity2) {
        return Double.compare(quantity1.value * quantity1.unit.baseUnitConversion,
                quantity2.value * quantity2.unit.baseUnitConversion) == 0;
    }
    // Method To Add Two Length
    public double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.value * quantity1.unit.baseUnitConversion +
                quantity2.value * quantity2.unit.baseUnitConversion;
    }
}
