package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(double value) {
        return value * 0.0138;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(double value) {
        return value * 0.016;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value Доллары.
     * @return Рубли.
     */
    public double DollarToRuble(double value) {
        return value * 62.5346;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value Доллары.
     * @return Рубли.
     */
    public double EuroToRuble(double value) {
        return value * 72.5526;
    }

}
