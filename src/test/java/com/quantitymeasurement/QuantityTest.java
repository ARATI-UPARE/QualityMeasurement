package com.quantitymeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldReturnEqual() throws QuantityException {
        Quantity feet1=new Quantity(Unit.FEET,0.0);
        Quantity feet2=new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    // TC:1.2
    @Test
    public void givenOf1NullFeetObject_ShouldReturnNotEqual() throws QuantityException {
        Quantity feet=new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet,null);
    }
    // TC:1.3
    @Test
    public void givenOfReferencefeetAndFeet_ShouldReturnEqual() throws QuantityException {
        Quantity feet=new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet,feet);
    }
    //TC:1.4
    @Test
    public void givenStringAndFeet_whenDifferentType_shouldReturnNotEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet, "Type");
    }
    //TC:1.5
    @Test
    public void givenOf0FeetAnd1Feet_whenDifferentValues_ShouldreturnNotEqual() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    // TC:1.6
    @Test
    public void givenOf0InchAnd0Inch_ShouldReturnEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    // TC:1.7
    @Test
    public void givenOf1NullInchObject_ShouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertNotEquals(inch,null);
    }
    // TC:1.8
    @Test
    public void givenOfReferenceInchAndInch_ShouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch,inch);
    }
    //TC:1.9
    @Test
    public void givenInchAndFeet_whenDifferentType_shouldReturnNotEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertNotEquals(feet, inch);
    }
    //TC:1.10
    @Test
    public void givenOf0InchAnd1Inch_whenDifferentValues_ShouldreturnNotEqual() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    //TC:1.11
    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Quantity inch = new Quantity(Unit.INCH,0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.12
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.13
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.14
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.15
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.1
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.2
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.3
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.4
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.5
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.6
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    // TC:3
    @Test
    public void given2InchAnd5CM_shouldReturnEqual() throws QuantityException {
        Quantity cm = new Quantity(Unit.CM, 5.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }
    // TC:4.1
    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = inch1.add(inch2);
        Assert.assertEquals(4.0, sum, 0.0);
    }
    // TC:4.2
    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = feet1.add(inch2);
        Assert.assertEquals(14.0, sum, 0.0);
    }
    // TC:4.3
    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        double sum = feet1.add(feet2);
        Assert.assertEquals(24, sum, 0.0);
    }
    // TC:4.4
    @Test
    public void given2InchAnd2Point5CM_whenAdded_shouldReturnSum() throws QuantityException {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity cm1 = new Quantity(Unit.CM, 2.5);
        double sum = inch1.add(cm1);
        Assert.assertEquals(3, sum, 0.0);
    }
    // TC:5.1
    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() throws QuantityException {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }
    // TC:5.2
    @Test
    public void given1LitreAnd1000MiliLitres_shouldRetunEqual() throws QuantityException {
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(milliLitre);
        Assert.assertTrue(compareCheck);
    }
    // Tc:6.1
    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSumEqualTo() throws QuantityException {
        Quantity gallon = new Quantity(Unit.GALLON, 1);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        double sum = gallon.add(litre);
        Assert.assertEquals(7.57, sum, 0.1);
    }
    // TC:6.2
    @Test
    public void given1LitreAnd1000Ml_whenAdded_shouldReturnSumEqualTo() throws QuantityException {
        Quantity litre = new Quantity(Unit.LITRE, 1);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000);
        double sum = litre.add(milliLitre);
        Assert.assertEquals(2, sum, 0.0);
    }
    //TC:7.1
    @Test
    public void given1KgAnd1000Grams_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity gram = new Quantity(Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }
    //TC:7.2
    @Test
    public void given1TonneAnd1000Kgs_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity tonne = new Quantity(Unit.TONNE, 1.0);
        Quantity kg = new Quantity(Unit.KG, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }
    // TC:7.3
    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnSumEqualTo() throws QuantityException {
        Quantity tonne = new Quantity(Unit.TONNE, 1);
        Quantity grams = new Quantity(Unit.GRAM, 1000);
        double sum = tonne.add(grams);
        Assert.assertEquals(1001, sum, 0.0);
    }
    // TC:8
    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqual() throws QuantityException {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212.0);
        Quantity celsius = new Quantity(Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assert.assertTrue(compareCheck);
    }

    @Test
    // TC: Exception to Handle Negative Value For Comparision
    public void givenNegativeQuantityForLength_shouldThrowException() throws QuantityException{
            Quantity length1 = new Quantity(Unit.FEET, -5.0);
            Quantity length2 = new Quantity(Unit.FEET, -5.0);
            boolean compareCheck = length1.compare(length2);
    }
    @Test
    // TC: Exception to Handle Negative Value For Addition
    public void givenNegativeQuantityForLength_whenAdded_shouldThrowException() throws QuantityException{
        Quantity length1 = new Quantity(Unit.FEET, -5.0);
        Quantity length2 = new Quantity(Unit.FEET, -5.0);
        double compareCheck = length1.add(length2);
    }

    @Test
    // TC: Exception to Handle Different Quantity Type For Addition
    public void givenDifferentQuantityTypes_whenAdded_shouldThrowException() throws QuantityException {
        try {
            Quantity feet = new Quantity(Unit.FEET, 1.0);
            Quantity kg = new Quantity(Unit.KG, 1.0);
            double sum = feet.add(kg);
        }catch (QuantityException e){
            Assert.assertEquals(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, e.type);
        }
    }

    @Test
    // TC: Exception to Handle Different Quantity Type For Comparision
    public void givenDifferentQuantityTypes_whenCompared_shouldThrowException() throws QuantityException{
        try {
            Quantity kg = new Quantity(Unit.KG, 1.0);
            Quantity litre = new Quantity(Unit.LITRE, 1.0);
            boolean compareCheck = kg.compare(litre);
        }catch (QuantityException e){
            Assert.assertEquals(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, e.type);
        }
    }
    @Test
    // TC: Exception to Handle Negative Temperature Value.
    public void givenMinus100CelsiusAndMinus212Fahrenheit_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, -212.0);
        Quantity celsius = new Quantity(Unit.CELSIUS, -100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assert.assertTrue(compareCheck);
    }
    @Test
    // TC: Exception to Prevent Addition of Temperature.
    public void given212FahrenheitAnd100Celsius_whenAdded_shouldThrowException() throws QuantityException {
        try {
            Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212.0);
            Quantity celsius = new Quantity(Unit.CELSIUS, 100.0);
            double sum = fahrenheit.add(celsius);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NEGATIVE_TEMPERATURE, e.type);
        }
    }
 }
