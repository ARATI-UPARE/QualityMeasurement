package com.quantitymeasurement;

public class QuantityException extends Exception{

    ExceptionType type;

    public enum ExceptionType{
        NAGATIVE_VALUE,
        DIFFERENT_QUANTITY_TYPE,
        NEGATIVE_TEMPERATURE;
    }

    public QuantityException(ExceptionType nagativeValue, String negative_input) {
        super(negative_input);
        this.type = nagativeValue;
    }
}
