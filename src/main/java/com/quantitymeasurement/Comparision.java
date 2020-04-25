package com.quantitymeasurement;

public class Comparision {
    public Unit unit;
    // Method To Comapre Two Input Quantities
    public static boolean compare(Quantity q1, Quantity q2)throws QuantityException{
        try {
            if(!q1.unit.quantityType.equals(q2.unit.quantityType)){
                throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of Quantities");
            }
        }catch (QuantityException e){
            e.printStackTrace();
        }
            return Double.compare(q1.value * q1.unit.baseUnitConversion,
                    q2.value * q2.unit.baseUnitConversion) == 0;
    }
}
