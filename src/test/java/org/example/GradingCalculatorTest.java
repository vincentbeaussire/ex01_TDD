package org.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GradingCalculatorTest {

    private GradingCalculator gradingCalculator;

    @Test
    public void whenScore_95_Presence_90() {
        GradingCalculator a = new GradingCalculator(95, 90);
        assertEquals("A", a.getGrade());
    }

    @Test
    public void whenScore_85_Presence_90() {
        GradingCalculator b = new GradingCalculator(85, 90);
        assertEquals("B", b.getGrade());
    }

    @Test
    public void whenScore_65_Presence_90() {
        GradingCalculator c = new GradingCalculator(65, 90);
        assertEquals("C", c.getGrade());
    }

    @Test
    public void whenScore_95_Presence_65() {
        GradingCalculator b = new GradingCalculator(95, 65);
        assertEquals("B", b.getGrade());
    }

    @Test
    public void whenScore_95_Presence_55() {
        GradingCalculator f = new GradingCalculator(95, 55);
        assertEquals("F", f.getGrade());
    }

    @Test
    public void whenScore_65_Presence_55() {
        GradingCalculator f = new GradingCalculator(65, 55);
        assertEquals("F", f.getGrade());
    }

    @Test
    public void whenScore_50_Presence_90() {
        GradingCalculator f = new GradingCalculator(50, 90);
        assertEquals("F", f.getGrade());
    }
}
