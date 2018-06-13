package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(double value) {
        return 73.6433;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(double value) {
        return 62.67;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return Рубли.
     */
    public double DollarToRuble(double value) {
        return 0.016;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return Рубли.
     */
    public double EuroToRuble(double value) {
        return 0.0136;
    }

}
