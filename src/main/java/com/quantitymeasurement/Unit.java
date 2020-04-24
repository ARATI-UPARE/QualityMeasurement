package com.quantitymeasurement;

public enum Unit {

    INCH(1.0),
    FEET(12.0),
    YARD(36.0),
    CM(0.4),

    MILLILITRE(0.001),
    LITRE(1.0),
    GALLON(3.78),

    GRAM(0.001),
    KG(1),
    TONNE(1000);

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
    public boolean compare(Weight weight1, Weight weight2) {
        return Double.compare(weight1.value * weight1.unit.baseUnitConversion,
                weight2.value * weight2.unit.baseUnitConversion) == 0;
    }
    public double add(Weight weight1, Weight weight2) {
        return weight1.value * weight1.unit.baseUnitConversion +
                weight2.value * weight2.unit.baseUnitConversion;
    }
}
