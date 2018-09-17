package ru.job4j.array;

/**
 * Check.
 * Проверяет то, что массив состоит только из true или только из false.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Check {

    /**
     * Проверяет текущее значение массива со следующим.
     *
     * @param data входящий массив состоящий из булевых значений.
     * @return возвращает булево значение.
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
            }
            break;
        }
        return result;
    }
}