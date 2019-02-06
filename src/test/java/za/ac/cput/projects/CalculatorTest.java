package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.add(2,3));

    }

    public void mult(){

    }
}
