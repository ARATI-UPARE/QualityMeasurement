package com.quantitymeasurement;

import java.util.Objects;

public class Inch {
    public final double value;
    public Inch(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inch inch = (Inch) obj;
        return Double.compare(inch.value, value) == 0;
    }
}
