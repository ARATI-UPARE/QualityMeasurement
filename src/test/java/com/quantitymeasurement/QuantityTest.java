package com.quantitymeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1=new Length(Unit.FEET,0.0);
        Length feet2=new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    // TC:1.2
    @Test
    public void givenOf1NullFeetObject_ShouldReturnNotEqual() {
        Length feet=new Length(Unit.FEET,0.0);
        Assert.assertNotEquals(feet,null);
    }
    // TC:1.3
    @Test
    public void givenOfReferencefeetAndFeet_ShouldReturnEqual() {
        Length feet=new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet,feet);
    }
    //TC:1.4
    @Test
    public void givenStringAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET,0.0);
        Assert.assertNotEquals(feet, "Type");
    }
    //TC:1.5
    @Test
    public void givenOf0FeetAnd1Feet_whenDifferentValues_ShouldreturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    // TC:1.6
    @Test
    public void givenOf0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    // TC:1.7
    @Test
    public void givenOf1NullInchObject_ShouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH,0.0);
        Assert.assertNotEquals(inch,null);
    }
    // TC:1.8
    @Test
    public void givenOfReferenceInchAndInch_ShouldReturnEqual() {
        Length inch = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch,inch);
    }
    //TC:1.9
    @Test
    public void givenInchAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET,0.0);
        Length inch = new Length(Unit.INCH,0.0);
        Assert.assertNotEquals(feet, inch);
    }
    //TC:1.10
    @Test
    public void givenOf0InchAnd1Inch_whenDifferentValues_ShouldreturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    //TC:1.11
    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Length feet = new Length(Unit.FEET,0.0);
        Length inch = new Length(Unit.INCH,0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.12
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.13
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.14
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.15
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.1
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.2
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.3
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:2.4
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.5
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }
    //TC:2.6
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    // TC:3
    @Test
    public void given2InchAnd5CM_shouldReturnEqual() {
        Length cm = new Length(Unit.CM, 5.0);
        Length inch = new Length(Unit.INCH, 2.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }
    // TC:4.1
    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnSum() {
        Length inch1 = new Length(Unit.INCH, 2);
        Length inch2 = new Length(Unit.INCH, 2);
        double sum = inch1.add(inch2);
        Assert.assertEquals(4.0, sum, 0.0);
    }
    // TC:4.2
    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnSum() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length inch2 = new Length(Unit.INCH, 2);
        double sum = feet1.add(inch2);
        Assert.assertEquals(14.0, sum, 0.0);
    }
    // TC:4.3
    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnSum() {
        Length feet1 = new Length(Unit.FEET, 1);
        Length feet2 = new Length(Unit.FEET, 1);
        double sum = feet1.add(feet2);
        Assert.assertEquals(24, sum, 0.0);
    }
    // TC:4.4
    @Test
    public void given2InchAnd2Point5CM_whenAdded_shouldReturnSum() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length cm1 = new Length(Unit.CM, 2.5);
        double sum = inch1.add(cm1);
        Assert.assertEquals(3, sum, 0.0);
    }
    // TC:5.1
    @Test
    public void given1GallonAnd3Point78litres_whenCompared_shouldRetunEqual() {
        Volume gallon = new Volume(Unit.GALLON, 1.0);
        Volume litre = new Volume(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }
    // TC:5.2
    @Test
    public void given1LitreAnd1000MiliLitres_shouldRetunEqual() {
        Volume litre = new Volume(Unit.LITRE, 1.0);
        Volume milliLitre = new Volume(Unit.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(milliLitre);
        Assert.assertTrue(compareCheck);
    }
    // Tc:6.1
    @Test
    public void given1GallonAnd3Point78Litre_whenAdded_shouldReturnSumEqualTo() {
        Volume gallon = new Volume(Unit.GALLON, 1);
        Volume litre = new Volume(Unit.LITRE, 3.78);
        double sum = gallon.add(litre);
        Assert.assertEquals(7.57, sum, 0.0);
    }
    // Tc:6.2
    @Test
    public void given1LitreAnd1000Ml_whenAdded_shouldReturnSumEqualTo() {
        Volume litre = new Volume(Unit.LITRE, 1);
        Volume milliLitre = new Volume(Unit.MILLILITRE, 1000);
        double sum = litre.add(milliLitre);
        Assert.assertEquals(2, sum, 0.0);
    }
 }
