package ru.lesson.lessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 25.12.2016.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void sub() throws Exception {
        calculator.sub(3, 5);
        Assert.assertEquals(-2, calculator.getResult(), 0);
    }

    @Test
    public void mult() throws Exception {
        calculator.mult(3, 5);
        Assert.assertEquals(15, calculator.getResult(), 0);
    }

    @Test
    public void div() throws Exception {
        calculator.div(3, 1);
        Assert.assertEquals(3, calculator.getResult(), 0);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
        calculator.add(1, 1);
        Assert.assertEquals(2, calculator.getResult(), 0);
    }

}