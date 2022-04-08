package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert210RblThen3Euro() {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert240RblThen4Dlr() {
        float in = 240;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}