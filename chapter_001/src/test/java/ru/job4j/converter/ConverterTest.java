package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void RubleToDollarTest() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(1);
        assertThat(result, is(0.016));
    }

    @Test
    public void RubleToEuroTest() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(1);
        assertThat(result, is(0.0138));
    }

    @Test
    public void EuroToRubleTest() {
        Converter converter = new Converter();
        double result = converter.EuroToRuble(1);
        assertThat(result, is(72.5526));
    }

    @Test
    public void DollarToRubleTest() {
        Converter converter = new Converter();
        double result = converter.DollarToRuble(1);
        assertThat(result, is(62.5346));
    }
}