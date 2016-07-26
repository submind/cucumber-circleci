package com.aceonion.caculator;


import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by submind on 7/25/16.
 */
public class DateCalculatorTest {

    @Test
    public void isDateInThePastTest() {
        DateCalculator dc = new DateCalculator(new Date());

        assertEquals("no", dc.isDateInThePast(new Date()));
    }

}