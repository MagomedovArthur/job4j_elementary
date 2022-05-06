package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2to11Then11() {
        int left = 2;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOF1And0And3Then3() {
        int first = 1;
        int second = 0;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOf19And23and22Then23() {
        int first = 19;
        int second = 23;
        int third = 22;
        int result = Max.max(first, second, third);
        int expected = 23;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOf19And23and22And66Then66() {
        int first = 19;
        int second = 23;
        int third = 22;
        int fourth = 66;
        int result = Max.max(first, second, third, fourth);
        int expected = 66;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOf19And23and22And6Then23() {
        int first = 19;
        int second = 23;
        int third = 22;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 23;
        Assert.assertEquals(result, expected);
    }
}