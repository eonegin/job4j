package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void loopTest() {
        Counter a = new Counter();
        int result = Counter.add(2, 10);
        assertThat(result, is(30));
    }

}
