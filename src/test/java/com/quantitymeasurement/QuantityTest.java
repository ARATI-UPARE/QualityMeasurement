package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1=new Length(Length.Unit.FEET,0.0);
        Length feet2=new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    // TC:1.2
    @Test
    public void givenOf1NullFeetObject_ShouldReturnNotEqual() {
        Length feet=new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(feet,null);
    }
    // TC:1.3
    @Test
    public void givenOfReferencefeetAndFeet_ShouldReturnEqual() {
        Length feet=new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet,feet);
    }
    //TC:1.4
    @Test
    public void givenStringAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(feet, "Type");
    }
    //TC:1.5
    @Test
    public void givenOf0FeetAnd1Feet_whenDifferentValues_ShouldreturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    // TC:1.6
    @Test
    public void givenOf0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    // TC:1.7
    @Test
    public void givenOf1NullInchObject_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Assert.assertNotEquals(inch,null);
    }
    // TC:1.8
    @Test
    public void givenOfReferenceInchAndInch_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch,inch);
    }
    //TC:1.9
    @Test
    public void givenInchAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Length inch = new Length(Length.Unit.INCH,0.0);
        Assert.assertNotEquals(feet, inch);
    }
    //TC:1.10
    @Test
    public void givenOf0InchAnd1Inch_whenDifferentValues_ShouldreturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    //TC:1.11
    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Length inch = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.12
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.13
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    //TC:1.14
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 12.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.15
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 12.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    //TC:1.16
    @Test
    public void given3FeetInchAnd1Yard_shouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
}

