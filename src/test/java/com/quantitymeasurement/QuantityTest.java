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
        boolean compareCheck = Comparision.compare(feet,inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.12
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Comparision.compare(feet,inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.13
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Comparision.compare(inch,feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.14
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Comparision.compare(inch,feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.15
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Comparision.compare(feet,inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.1
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = Comparision.compare(yard,feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.2
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Comparision.compare(yard,feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.3
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = Comparision.compare(yard,inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.4
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = Comparision.compare(yard,inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.5
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = Comparision.compare(inch,yard);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.6
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() throws QuantityException {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = Comparision.compare(yard,feet);
        Assert.assertTrue(compareCheck);
    }
    // TC:3
    @Test
    public void given2InchAnd5CM_shouldReturnEqual() throws QuantityException {
        Quantity cm = new Quantity(Unit.CM, 5.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        boolean compareCheck = Comparision.compare(inch,cm);
        Assert.assertTrue(compareCheck);
    }
    // TC:4.1
    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSumEqualTo0Point33Feet() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.FEET,0.33);
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        Quantity sum = Addition.add(inch1,inch2,Unit.FEET);
        Assert.assertEquals(expectedType,sum);
    }
    // TC:4.2
    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSumEqualTo1Point16Feet() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.FEET,1.16);
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        Quantity sum = Addition.add(feet1,inch2,Unit.FEET);
        Assert.assertEquals(expectedType, sum);
    }
    // TC:4.3
    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSumEqualTo60Cm() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.CM,60);
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        Quantity sum = Addition.add(feet1,feet2,Unit.CM);
        Assert.assertEquals(expectedType, sum);
    }
    // TC:4.4
    @Test
    public void given2InchAnd2Point5CM_whenAdded_shouldReturnSumEqualTo30Cm() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.CM,7.5);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity cm = new Quantity(Unit.CM, 2.5);
        Quantity sum = Addition.add(inch,cm,Unit.CM);
        Assert.assertEquals(expectedType, sum);
    }
    // TC:5.1
    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() throws QuantityException {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = Comparision.compare(gallon,litre);
        Assert.assertTrue(compareCheck);
    }
    // TC:5.2
    @Test
    public void given1LitreAnd1000MiliLitres_shouldRetunEqual() throws QuantityException {
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000.0);
        boolean compareCheck = Comparision.compare(litre,milliLitre);
        Assert.assertTrue(compareCheck);
    }
    // Tc:6.1
    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSumEqualTo2Gallons() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.GALLON,2.0);
        Quantity gallon = new Quantity(Unit.GALLON, 1);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        Quantity sum = Addition.add(gallon,litre,Unit.GALLON);
        Assert.assertEquals(expectedType,sum);
    }
    // TC:6.2
    @Test
    public void given1LitreAnd1000Ml_whenAdded_shouldReturnSumEqualTo2000MilliLitre() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.MILLILITRE,2000);
        Quantity litre = new Quantity(Unit.LITRE, 1);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000);
        Quantity sum = Addition.add(litre,milliLitre,Unit.MILLILITRE);
        Assert.assertEquals(expectedType, sum);
    }
    //TC:7.1
    @Test
    public void given1KgAnd1000Grams_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity gram = new Quantity(Unit.GRAM, 1000.0);
        boolean compareCheck = Comparision.compare(kg,gram);
        Assert.assertTrue(compareCheck);
    }
    //TC:7.2
    @Test
    public void given1TonneAnd1000Kgs_whenCompared_shouldReturnSumEqual() throws QuantityException {
        Quantity tonne = new Quantity(Unit.TONNE, 1.0);
        Quantity kg = new Quantity(Unit.KG, 1000.0);
        boolean compareCheck = Comparision.compare(tonne,kg);
        Assert.assertTrue(compareCheck);
    }
    // TC:7.3
    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnSumEqualTo1Tonnes() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.TONNE,1.001);
        Quantity tonne = new Quantity(Unit.TONNE, 1);
        Quantity grams = new Quantity(Unit.GRAM, 1000);
        Quantity sum = Addition.add(tonne,grams,Unit.TONNE);
        Assert.assertEquals(expectedType, sum);
    }
    // TC:8
    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqual() throws QuantityException {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212.0);
        Quantity celsius = new Quantity(Unit.CELSIUS, 100.0);
        boolean compareCheck = Comparision.compare(fahrenheit,celsius);
        Assert.assertTrue(compareCheck);
    }

    @Test
    // TC: Exception to Handle Negative Value For Comparision
    public void givenNegativeQuantityForLength_shouldThrowException() throws QuantityException{
        Quantity length1 = new Quantity(Unit.FEET, -5.0);
        Quantity length2 = new Quantity(Unit.FEET, -5.0);
        boolean compareCheck = Comparision.compare(length1,length2);
    }
    @Test
    // TC: Exception to Handle Negative Value For Addition
    public void givenNegativeQuantityForLength_whenAdded_shouldThrowException() throws QuantityException{
        Quantity expectedType = new Quantity(Unit.FEET,10);
        Quantity length1 = new Quantity(Unit.FEET, -5.0);
        Quantity length2 = new Quantity(Unit.FEET, -5.0);
        Quantity sum = Addition.add(length1,length2,Unit.FEET);
    }

    @Test
    // TC: Exception to Handle Different Quantity Type For Addition
    public void givenDifferentQuantityTypes_whenAdded_shouldThrowException() throws QuantityException {
        Quantity expectedType = new Quantity(Unit.KG,10);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity sum = Addition.add(feet,kg,Unit.KG);
    }

    @Test
    // TC: Exception to Handle Different Quantity Type For Comparision
    public void givenDifferentQuantityTypes_whenCompared_shouldThrowException() throws QuantityException{
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        boolean compareCheck = Comparision.compare(kg,litre);
        Assert.assertTrue(compareCheck);
    }
    @Test
    // TC: Exception to Handle Negative Temperature Value.
    public void givenMinus100CelsiusAndMinus212Fahrenheit_whenCompared_shouldReturnEqual() throws QuantityException {
        Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, -212.0);
        Quantity celsius = new Quantity(Unit.CELSIUS, -100.0);
        boolean compareCheck = Comparision.compare(fahrenheit,celsius);
        Assert.assertTrue(compareCheck);
    }
    @Test
    // TC: Exception to Prevent Addition of Temperature.
    public void given212FahrenheitAnd100Celsius_whenAdded_shouldThrowException() throws QuantityException {
        try {
            Quantity expectedType = new Quantity(Unit.CELSIUS, 10);
            Quantity fahrenheit = new Quantity(Unit.FAHRENHEIT, 212.0);
            Quantity celsius = new Quantity(Unit.CELSIUS, 100.0);
            Quantity sum = Addition.add(fahrenheit, celsius, Unit.CELSIUS);
        }catch (QuantityException e){
            e.printStackTrace();
        }
    }
 }
