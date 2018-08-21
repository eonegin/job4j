package ru.job4j.calculator;

/**
 * Calculator.
 * Элементарный калькулятор.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Calculator {

    /**
     * Contains result of add, substract, div or multiple
     */
    double result;

    /**
     * Сложение.
     *
     * @param first 1-ое слагаемое.
     * @param second 2-ое слагаемое.
     */

    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание.
     *
     * @param first уменьшаемо.
     * @param second вычитаемое.
     */

    void substract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Вычитание.
     *
     * @param first делимое.
     * @param second делитель.
     */

    void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение.
     *
     * @param first 1-ый множитель.
     * @param second 2-ой множитель.
     */

    void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Умножение.
     *
     * @return возвращает результат в зависимости от выбранной операции
     */

    double getResult() {
        return this.result;
    }
}
