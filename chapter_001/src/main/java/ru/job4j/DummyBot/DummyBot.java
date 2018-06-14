package ru.job4j.DummyBot;

/**
 * DummyBo.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 14.06.2018
 */

public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {

            rsl = "Привет, умник.";
        }
        else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        else {
            rsl = "Это ставит меня в тупик. Спросите другой вопрос.";

        }

        return rsl;
    }
}