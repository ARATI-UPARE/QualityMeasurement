package com.quantitymeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity feet1=new Quantity(Unit.FEET,0.0);
        Quantity feet2=new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    // TC:1.2
    @Test
    public void givenOf1NullFeetObject_ShouldReturnNotEqual() {
        Quantity feet=new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet,null);
    }
    // TC:1.3
    @Test
    public void givenOfReferencefeetAndFeet_ShouldReturnEqual() {
        Quantity feet=new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet,feet);
    }
    //TC:1.4
    @Test
    public void givenStringAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet, "Type");
    }
    //TC:1.5
    @Test
    public void givenOf0FeetAnd1Feet_whenDifferentValues_ShouldreturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    // TC:1.6
    @Test
    public void givenOf0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    // TC:1.7
    @Test
    public void givenOf1NullInchObject_ShouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertNotEquals(inch,null);
    }
    // TC:1.8
    @Test
    public void givenOfReferenceInchAndInch_ShouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch,inch);
    }
    //TC:1.9
    @Test
    public void givenInchAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertNotEquals(feet, inch);
    }
    //TC:1.10
    @Test
    public void givenOf0InchAnd1Inch_whenDifferentValues_ShouldreturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    //TC:1.11
    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Quantity inch = new Quantity(Unit.INCH,0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.12
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.13
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.14
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.15
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.1
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.2
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.3
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.4
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.5
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.6
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    // TC:3
    @Test
    public void given2InchAnd5CM_shouldReturnEqual() {
        Quantity cm = new Quantity(Unit.CM, 5.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }
    // TC:4.1
    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSum() {
        Quantity inch1 = new Quantity(Unit.INCH, 2);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = inch1.add(inch2);
        Assert.assertEquals(4.0, sum, 0.0);
    }
    // TC:4.2
    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSum() {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity inch2 = new Quantity(Unit.INCH, 2);
        double sum = feet1.add(inch2);
        Assert.assertEquals(14.0, sum, 0.0);
    }
    // TC:4.3
    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSum() {
        Quantity feet1 = new Quantity(Unit.FEET, 1);
        Quantity feet2 = new Quantity(Unit.FEET, 1);
        double sum = feet1.add(feet2);
        Assert.assertEquals(24, sum, 0.0);
    }
    // TC:4.4
    @Test
    public void given2InchAnd2Point5CM_whenAdded_shouldReturnSum() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity cm1 = new Quantity(Unit.CM, 2.5);
        double sum = inch1.add(cm1);
        Assert.assertEquals(3, sum, 0.0);
    }
    // TC:5.1
    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }
    // TC:5.2
    @Test
    public void given1LitreAnd1000MiliLitres_shouldRetunEqual() {
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(milliLitre);
        Assert.assertTrue(compareCheck);
    }
    // Tc:6.1
    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSumEqualTo() {
        Quantity gallon = new Quantity(Unit.GALLON, 1);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        double sum = gallon.add(litre);
        Assert.assertEquals(7.57, sum, 0.1);
    }
    // TC:6.2
    @Test
    public void given1LitreAnd1000Ml_whenAdded_shouldReturnSumEqualTo() {
        Quantity litre = new Quantity(Unit.LITRE, 1);
        Quantity milliLitre = new Quantity(Unit.MILLILITRE, 1000);
        double sum = litre.add(milliLitre);
        Assert.assertEquals(2, sum, 0.0);
    }
    //TC:7.1
    @Test
    public void given1KgAnd1000Grams_whenCompared_shouldReturnEqual() {
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity gram = new Quantity(Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }
    //TC:7.2
    @Test
    public void given1TonneAnd1000Kgs_whenCompared_shouldReturnEqual() {
        Quantity tonne = new Quantity(Unit.TONNE, 1.0);
        Quantity kg = new Quantity(Unit.KG, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnSumEqualTo() {
        Quantity tonne = new Quantity(Unit.TONNE, 1);
        Quantity grams = new Quantity(Unit.GRAM, 1000);
        double sum = tonne.add(grams);
        Assert.assertEquals(1001, sum, 0.0);
    }
 }
