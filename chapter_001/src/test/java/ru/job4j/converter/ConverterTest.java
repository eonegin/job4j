package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void rubleToDollarTest() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(1);
        assertThat(result, is(0.016));
    }

    @Test
    public void rubleToEuroTest() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(1);
        assertThat(result, is(0.0138));
    }

    @Test
    public void euroToRubleTest() {
        Converter converter = new Converter();
        double result = converter.euroToRuble(1);
        assertThat(result, is(72.5526));
    }

    @Test
    public void dollarToRubleTest() {
        Converter converter = new Converter();
        double result = converter.dollarToRuble(1);
        assertThat(result, is(62.5346));
    }
}