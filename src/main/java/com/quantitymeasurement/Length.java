package com.quantitymeasurement;

public class Length {
    public Unit unit;
    public double value;

    // Parameterized Constructor
    public Length(Unit unit,double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that){
        boolean compareCheck = unit.compare(this,that);
        return compareCheck;
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
