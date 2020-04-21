package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    // TC:1.1
    @Test
    public void givenOf0FeetAnd0Feet_ShouldreturnEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2=new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void givenOf0FeetAnd1Feet_ShouldreturnNotEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2=new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
}
