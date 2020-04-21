package com.quantitymeasurement;

import java.util.Objects;

public class Length {

    enum Unit {FEET,INCH};
    private final Unit unit;
    private final double value;

    public Length(Unit unit,double value) {
        this.unit = unit;
        this.value = value;
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
