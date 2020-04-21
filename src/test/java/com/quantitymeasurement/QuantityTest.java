package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2=new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    // TC:1.2
    @Test
    public void givenOf1NullFeetObject_ShouldReturnNotEqual() {
        Feet feet=new Feet(0.0);
        Assert.assertNotEquals(feet,null);
    }
    // TC:1.3
    @Test
    public void givenOfReferencefeetAndFeet_ShouldReturnEqual() {
        Feet feet=new Feet(0.0);
        Assert.assertEquals(feet,feet);
    }
    //TC:1.4
    @Test
    public void givenStringAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(feet, "Type");
    }
    //TC:1.5
    @Test
    public void givenOf0FeetAnd1Feet_whenDifferentValues_ShouldreturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    // TC:1.6
    @Test
    public void givenOf0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }
    // TC:1.7
    @Test
    public void givenOf1NullInchObject_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        Assert.assertNotEquals(inch,null);
    }
    // TC:1.8
    @Test
    public void givenOfReferenceInchAndInch_ShouldReturnEqual() {
        Inch inch = new Inch(0.0);
        Assert.assertEquals(inch,inch);
    }
    //TC:1.9
    @Test
    public void givenInchAndFeet_whenDifferentType_shouldReturnNotEqual() {
        Feet feet = new Feet(0.0);
        Inch inch = new Inch(0.0);
        Assert.assertNotEquals(feet, inch);
    }
    //TC:1.10
    @Test
    public void givenOf0InchAnd1Inch_whenDifferentValues_ShouldreturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
}

