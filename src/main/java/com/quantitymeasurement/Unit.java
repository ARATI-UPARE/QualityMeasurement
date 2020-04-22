package com.quantitymeasurement;

public enum Unit {

    INCH(1.0), FEET(12.0), YARD(36.0);

    public double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }
    public boolean compare(Length l1,Length l2) {
        return Double.compare(l1.value * l1.unit.baseUnitConversion,
                              l2.value * l2.unit.baseUnitConversion) == 0;
    }
}
