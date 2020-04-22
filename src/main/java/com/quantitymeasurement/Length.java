package com.quantitymeasurement;

import java.util.Objects;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    enum Unit {FEET,INCH};
    private final Unit unit;
    private final double value;

    // Parameterized Constructor
    public Length(Unit unit,double value) {
        this.unit = unit;
        this.value = value;
    }
    // Method To Compare Inch And Feet Values
    public boolean compare(Length that) {
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH)) {
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        }
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value / FEET_TO_INCH, that.value) == 0;
        return this.equals(that);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length length = (Length) obj;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}
