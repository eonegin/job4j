package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void factorialTest() {
        Factorial a = new Factorial();
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }
}
