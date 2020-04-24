package com.quantitymeasurement;

public enum Unit {
    // BaseUnit Inch For Length
    INCH(1.0,"length"),
    FEET(12.0,"length"),
    YARD(36.0,"length"),
    CM(0.4,"length"),

    // BaseUnit Litre For Volume
    MILLILITRE(0.001, "volume"),
    LITRE(1.0, "volume"),
    GALLON(3.78, "volume"),

    // BaseUnit KG For Mass
    GRAM(0.001, "mass"),
    KG(1, "mass"),
    TONNE(1000, "mass"),

    // BaseUnit Fahrenheit For Temperature
    FAHRENHEIT(1.0, "temperature"),
    CELSIUS(2.12, "temperature");

    public double baseUnitConversion;
    public String quantityType;

    Unit(double baseUnitConversion, String quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

}
