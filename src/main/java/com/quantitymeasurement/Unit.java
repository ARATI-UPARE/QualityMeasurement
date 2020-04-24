package com.quantitymeasurement;

public enum Unit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.4),
    // 1Litre=1000ml,1gallon=3780ml
    MILLILITRE(1),
    LITRE(1000),
    GALLON(3780);

    public double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }

    // Method To Comapare length
    public boolean compare(Length l1,Length l2) {
        return Double.compare(l1.value * l1.unit.baseUnitConversion,
                              l2.value * l2.unit.baseUnitConversion) == 0;
    }
    // Method To Compare Volume
    public boolean compare(Volume v1, Volume v2){
        return Double.compare(v1.value * v1.unit.baseUnitConversion,
                v2.value * v2.unit.baseUnitConversion) == 0;
    }
    // Method To Add Two Length
    public double add(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnitConversion +
                length2.value * length2.unit.baseUnitConversion;
    }
    public double add(Volume v1, Volume v2) {
        return v1.value * v1.unit.baseUnitConversion +
                v2.value * v2.unit.baseUnitConversion;
    }
}
