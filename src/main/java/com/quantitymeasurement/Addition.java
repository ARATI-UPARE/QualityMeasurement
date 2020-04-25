package com.quantitymeasurement;

public class Addition {

    public Unit unit;
    public static Quantity add(Quantity q1, Quantity q2,Unit unitType) throws QuantityException {
        try {
            if (!q1.unit.quantityType.equals(q2.unit.quantityType)) {
                throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities");
            }
            if (q1.unit.quantityType.equals(QuantityType.TEMPERATURE)) {
                throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_TEMPERATURE, "Temperature cannot be Added!");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
        double sum = q1.value * q1.unit.baseUnitConversion +
                     q2.value * q2.unit.baseUnitConversion;
        double unitTypeValue = (sum/unitType.baseUnitConversion);
        return new Quantity(unitType,unitTypeValue);
    }
}
