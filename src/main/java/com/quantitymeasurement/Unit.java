package com.quantitymeasurement;

public enum Unit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.4);

    public double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }

    // Method To Comapare length
    public boolean compare(Length l1,Length l2) {
        return Double.compare(l1.value * l1.unit.baseUnitConversion,
                              l2.value * l2.unit.baseUnitConversion) == 0;
    }
    // Method To Add Two Length
    public double add(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnitConversion +
                length2.value * length2.unit.baseUnitConversion;
    }
}
