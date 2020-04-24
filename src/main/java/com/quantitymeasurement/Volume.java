package com.quantitymeasurement;

public class Volume {
    public Unit unit;
    public double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume volume) {
        boolean compareCheck = unit.compare(this, volume);
        return compareCheck;
    }
    public double add(Volume volume) {
        double sum = unit.add(this,volume);
        return sum;
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
