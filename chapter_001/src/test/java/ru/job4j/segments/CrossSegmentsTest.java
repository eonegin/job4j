package ru.job4j.segments;

import org.junit.Test;
import ru.job4j.segments.CrossSegments;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CrossSegmentsTest {
    @Test
    public void crossTestCInAb() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(1, 4,3,5);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    @Test
    public void crossTestCRavnB() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(1, 4,4,7);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    @Test
    public void crossTestCRavnA() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(1, 4,1,7);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    @Test
    public void crossTestDInAb() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(2, 4,1,3);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    @Test
    public void crossTestDRavnB() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(2, 4,1,4);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    @Test
    public void crossTestNegative() {
        CrossSegments cross = new CrossSegments();
        boolean result = CrossSegments.segments(2, 7,8,10);
        boolean expect = false;
        assertThat(result, is(expect));
    }


}
