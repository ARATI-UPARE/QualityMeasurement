package com.quantitymeasurement;

public class Feet {
    public double value;
    // Parameterized Constructor
    public Feet(Double value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass()!= obj.getClass())return false;
        Feet feet=(Feet)obj;
        return Double.compare(feet.value,value)==0;
    }
}

