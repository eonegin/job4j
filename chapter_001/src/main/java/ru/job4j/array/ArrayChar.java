package ru.job4j.array;

/**
 * ArrayChar.
 * Обертка над строкой.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */
public class ArrayChar {

    /** Contains data array
     *
     */
    private char[] data;

    /**
     * ArrayChar. Преобразование строки в массив.
     *
     * @param line - String.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

